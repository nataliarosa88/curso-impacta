package Exemplos.Cap_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexaoJDBC {
	static String url = "jdbc:mysql://localhost/...";
	static String user = "usuario";
	static String password = "senha";

	public static void main(String[] args) {
		openDB();
	}

	public static void openDB() {
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from tabela");) {
			System.out.println("\nConex�o estabelecida com sucesso!\n");

		} catch (SQLException e) {
			System.out.println("\nN�o foi poss�vel estabelecer conex�o" + e
					+ "\n");
			System.exit(1);
		}
	}

}
