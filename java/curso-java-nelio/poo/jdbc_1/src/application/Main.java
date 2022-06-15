package application;

import java.sql.Connection;

import db.DB;

public class Main {

	public static void main(String[] args) {
		
		// abrindo conexao, e todo aquele trabalho sujo de conectar
		// esta reservado na classe DB
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}
}