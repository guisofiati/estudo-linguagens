package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Main {

	public static void main(String[] args) {
		
		// recupearar dados do banco
		
		Connection conn = null;
		
		// recursos nao gerenciados pela jvm pois sao externos, recomendavel fecha-los manualmente
		// para evitar possiveis vazamentos de memoria
		Statement st = null;
		ResultSet rs = null;
		
		try {
			// tentar conexao com o banco
			conn = DB.getConnection();
			
			// permitir inserir um comando sql
			st = conn.createStatement();
			
			// resultado armazenado na variavel rs do tipo ResultSet
			rs = st.executeQuery("SELECT * FROM department");
			
			// retorna false se for a ultima linha 
			while (rs.next()) {
				// verificar o tipo de dado da coluna e chamar a funcao get
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			// como podem gerar tambem execoes e nao ter que ficar adicionando mais try catch
			// fica mais viavel criar metodos estaticos na classe DB
			//rs.close();
			//st.close();
			DB.closeStatement(st);
			DB.closeResultSet(rs);
			DB.closeConnection();
		}
	}
}