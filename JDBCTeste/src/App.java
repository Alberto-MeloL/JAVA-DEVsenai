import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            Statement s;
            String usuario = "postgres";
            String senha = "postgres";
            String url = "jdbc:postgresql://localhost:5432/postgres";
            // se fosse outro banco seria mysql://localhost ou ip/nomde banco de dados
            Connection c = DriverManager.getConnection(url, usuario, senha);// sempre a mesma ordem
            // banco de redundancia
            // f=forma automatica de add id e exibir
            // tem baixar o drive

            // dall
            s = c.createStatement();
            s.executeQuery("INSERT INTO CONTATO VALUES('295', 'Albertoo0', 'alberto@gmail.com')");

            c.close();// fecha a conexão
        } catch (Exception e) {
            System.out.printf("Erro" + e.getMessage());
            //https://pt.stackoverflow.com/questions/190937/laravel-5-como-conectar-v%C3%A1rios-databases-ao-mesmo-tempo
        }
    }
}
