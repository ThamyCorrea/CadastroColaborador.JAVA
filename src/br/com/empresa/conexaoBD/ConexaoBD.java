package br.com.empresa.conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
	
	public static Connection obterConexao() {
		Connection conexao = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "sys as sysdba", "9090");
			
			System.out.println("Conectou");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}

}
