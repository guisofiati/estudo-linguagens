package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao {
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {
		try {
			ps = conn.prepareStatement("INSERT INTO department (Name) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, obj.getName());
			
			int rowsAffected = ps.executeUpdate();
			
			if (rowsAffected > 0) {
				rs = ps.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				else {
					throw new DbException("Unexpected error insert new department.");
				}
			}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(ps);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public void update(Department obj) {
		try {
			ps = conn.prepareStatement("UPDATE department SET Name = ? WHERE Id = ?");
			
			ps.setString(1, obj.getName());
			ps.setInt(2, obj.getId());
			
			ps.executeUpdate();
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(ps);
		}
	}

	@Override
	public void deleteById(Integer id) {
		try {
			ps = conn.prepareStatement("DELETE FROM department WHERE Id = ?");
			
			ps.setInt(1, id);
			
			int rowsAffected = ps.executeUpdate();
			
			if (rowsAffected == 0) {
				throw new DbException("Id does not exists.");
			}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(ps);
		}
	}

	@Override
	public Department findById(Integer id) {
		try {
			ps = conn.prepareStatement("SELECT * FROM department WHERE Id = ?");
			
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				Department dep = instantiateDepartment(rs);
				return dep;
			}
			else {
				return null;
			}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(ps);
			DB.closeResultSet(rs);
		}
	}


	@Override
	public List<Department> findAll() {
		try {
			ps = conn.prepareStatement("SELECT * FROM department ORDER BY Name");
			
			rs = ps.executeQuery();
			
			List<Department> departments = new ArrayList<>();
			
			while (rs.next()) {
				Department dep = instantiateDepartment(rs);
				departments.add(dep);
			}
			
			return departments;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(ps);
			DB.closeResultSet(rs);
		}
	}
	
	private Department instantiateDepartment(ResultSet rs) throws SQLException {
		Department dep = new Department();
		dep.setId(rs.getInt("Id"));
		dep.setName(rs.getString("Name"));
		return dep;
	}
}