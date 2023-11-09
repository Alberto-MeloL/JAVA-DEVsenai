package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDAO {
    // Manipula as conexões com o banco de dados(gerencia a conexão com o SQL)
    // Atributo

    private Connection connection;

    // Cria um objeto da ConnectionFactory, para conectar (injetar coódigos sql)
    public ConnectionDAO() {
        this.connection = ConnectionFactory.getConnection();

    }

    // Métodos
    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS MINHA_TABELA (ID SERIAL PRIMARY KEY,NOME VARCHAR(255),EMAIL VARCHAR(255))";
        try (Statement stmt = this.connection.createStatement()) { // Ejetor SQL
            stmt.execute(sql); // Executa o código
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection); // Fecha a conexão de qualquer jeito(dando catch ou não)
        }
    }

    public void apagarTabela() {
        String sql = "DROP TABLE MINHA_TABELA";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabela apagada com sucesso.");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao apagar tabela.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void inserir(String nome, String email) throws SQLException {
        String sql = "INSERT INTO MINHA_TABELA (NOME, EMAIL) VALUES (?, ?)";// Cria o código
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection, stmt);
        }
    }

    public void buscarPorId(int id) {
        String sql = "SELECT * FROM MINHA_TABELA WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int idBuscado = resultSet.getInt("ID");
                String nomeBuscado = resultSet.getString("NOME");
                String emailBuscado = resultSet.getString("EMAIL");
                System.out.println("o Resultado da busca é id " + idBuscado + " nome " +

                        nomeBuscado + " email " + emailBuscado);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }
}
/*
 * 1-DriveManager(busca o drive, executa o getConnection para criar a
 * Connection)
 * 2-Conecta(erl, usuario, senha), permite código sql(Injeta o sql)
 * 3-Fecha o banco de dados
 * 
 * Ou seja
 * 
 * 1-Abre conexão
 * 2-Executa o código
 * 3-Fecha conexão
 * 
 * ver em PHP,JS(Windowns e Linux)
 * 
 * Pesquisar
 * 
 * o usuarioa administrador obtem todos os apps istalados em outros usuarios?
 * chave surrogada
 * https://developer.mozilla.org/pt-BR/docs/Web/CSS/cursor
 * https://spring.io/
 */