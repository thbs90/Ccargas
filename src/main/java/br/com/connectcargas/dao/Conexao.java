package br.com.connectcargas.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
	
	public Connection connection;

	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/connectcargas", "root", "");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}
	
	public Connection getConnection() {
		if (this.connection == null) {
			connect();
		}
		return connection;
	}
}
