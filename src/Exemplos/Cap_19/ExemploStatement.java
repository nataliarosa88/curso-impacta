package Exemplos.Cap_19;

import java.sql.*;

public class ExemploStatement {

    public static void main(String[] args) {
        
        try {

        	Connection cn = DriverManager.getConnection(
        						"jdbc:mysql://localhost:3306/impacta", "root", "impacta");
            
        	Statement st = cn.createStatement();
            
            st.executeUpdate("UPDATE tab_func SET salario = salario + 200");
            System.out.println("Sal�rios aumentados com sucesso.");

            st.close();
            cn.close();
            System.out.println("Conex�o encerrada.");
            
        } catch (SQLException e) {
            System.out.println("Falha ao realizar a opera��o.");
            e.printStackTrace();
        }
    }
}
