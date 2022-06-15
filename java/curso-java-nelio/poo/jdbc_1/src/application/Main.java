package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;

public class Main {

	public static void main(String[] args) {
		
		// inserir dados do banco
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		
		// preparar para inserir os dados
		PreparedStatement ps = null;
		
		try {
			conn = DB.getConnection();
			
			ps = conn.prepareStatement(
					"INSERT INTO seller " 
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES (?, ?, ?, ?, ?)", 
					Statement.RETURN_GENERATED_KEYS // retorna o id da nova linha criada
					);
			
			// substituir os place holders por seus valores
			// 1 arg: index do placeholder, 2 arg: valor
			ps.setString(1, "Carl purple");
			ps.setString(2, "carl@gmail.com");
			ps.setDate(3, new java.sql.Date(formater.parse("22/04/1985").getTime()));
			ps.setDouble(4, 3000.0);
			ps.setInt(5, 4);
			
			// ver quantas linhas foram atualizadas / inseridas
			int rowsAffected = ps.executeUpdate();
			
			// pode ter mais de um valor, no caso foi inserido apenas 1
			// mas se for mais imprime todos
			if (rowsAffected > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				while (rs.next()) {
					// vai ser criada uma tabela auxiliar com apenas 1 coluna com os ids
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			}
			else {
				System.out.println("No rows affected!");
			}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
	}
}