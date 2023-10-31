package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * ConnectionFactory
 */
public class ConnectionFactory {

    // Atributos

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "postgres";

    // Métodos

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados " + e.getMessage());
        }
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }

    public static void closeConnection(PreparedStatement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement stmt) {
        try {
            if (stmt != null && stmt != null) {
                stmt.close();
                connection.close();
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}