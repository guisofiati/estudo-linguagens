package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Main {

	public static void main(String[] args) {
		
		// transcao segura de dados do banco
		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			
			// nao vai confirmar as operacoes automaticamente, so quando for requerido
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int row1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2000 WHERE DepartmentId = 1");
			
// 			Erro fake para verificar a consistencia			
//			int x = 1;
//			if (x < 2) {
//				throw new SQLException("Fake error");
//			}
			
			int row2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3000 WHERE DepartmentId = 2");
			
			// agora operacoes podem ser executadas
			// ou executa tudo ou nada e executado
			conn.commit();
			
			System.out.println("row1 = " + row1);
			System.out.println("row2 = " + row2);
		}
		catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transcation rolled back! Caused by: " + e.getMessage());
			} catch (SQLException err) {
				throw new DbException("Rollback error! Caused by: " + err.getMessage());
			}
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}