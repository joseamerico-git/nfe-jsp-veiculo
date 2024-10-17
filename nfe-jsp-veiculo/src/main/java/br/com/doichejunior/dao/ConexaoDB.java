package br.com.doichejunior.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

	public Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp?user=root&password=root");

			System.out.println("Conectado!");

			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return connection;
	}

}