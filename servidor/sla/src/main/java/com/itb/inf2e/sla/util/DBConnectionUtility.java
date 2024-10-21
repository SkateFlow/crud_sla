package com.itb.inf2e.sla.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtility {

    private static final String JDBC_URL = "jdbc:sqlserver://localhost:1433;databaseName=bd_grupo3_2em";
    private static final String USER = "seu_usuario"; // substitua pelo seu usuário
    private static final String PASSWORD = "sua_senha"; // substitua pela sua senha

    // Método para obter a conexão com o banco de dados
    public static Connection getDBConnection() throws SQLException {
        try {
            // Registrar o driver JDBC do SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC do SQL Server não encontrado.");
            e.printStackTrace();
        }
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }
}
