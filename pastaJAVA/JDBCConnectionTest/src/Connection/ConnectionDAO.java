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
        // Pois sempre que for instanciar objeto tenho que ter a conexão
        this.connection = ConnectionFactory.getConnection();

    }

    // Métodos
    public void criaTabela() {
        // Não importa se esta em maiúscolo, pois sera criado em minúsculo
        // Id numérico e auto-incremental
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
        // tomar cuidado ao apagar informações do banco, pois se eu apaguei o id 1 por
        // exemplo, e adicionar outra no mesmo id ele sera adicionado, caso não seja um
        // id específico sera auto-incremento
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
            stmt.setString(1, nome);// Primeira exclamação, não começa do zero pois e em sql
            stmt.setString(2, email);// Segunda exclamação
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection, stmt);
        }
    }

    public void buscarPorId(int id) {
        // No banco de dados o primeiro indíce é 1
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

    public void apagarID(int id) {
        // Define a instrução SQL parametrizada para apagar dados por ID
        String sql = "DELETE FROM Minha_Tabela WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate(); // Executa a instrução SQL
            System.out.println("Dado apagado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void atualizarID(int id, String novoNome, String novoEmail) {
        // Define a instrução SQL parametrizada para atualizar dados por ID
        String sql = "UPDATE MINHA_TABELA SET nome = ?, email = ? WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, novoNome);
            stmt.setString(2, novoEmail);
            stmt.setInt(3, id);
            stmt.executeUpdate(); // Executa a instrução SQL
            System.out.println("Dados atualizados com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void listarTodos() {
        ResultSet rs = null;
        // Define a instrução SQL para selecionar todos os registros da tabela
        String sql = "SELECT * FROM minha_tabela";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        rs = stmt.executeQuery(); // Executa a consulta e obtém resultados
        while (rs.next()) {
        System.out.println("id : " + rs.getInt("id") +
        " nome: " + rs.getString("nome") +
        " email: " + rs.getString("email"));
        
        }
        } catch (SQLException ex) {
        System.out.println(ex);
        } finally {
        ConnectionFactory.closeConnection(connection);
        }
        }
}
/*javafx se compra numero++ func desconto = numerocom tal % tkct liberado em produtos, ter filtros */
/*Pedir para confirmar em primarykeys, ver criptografias*/
/*
 * 1-DriveManager(busca o drive, executa o getConnection para criar a
 * Connection)
 * 2-Conecta(erl, usuario, senha), permite código sql(Injeta o sql)
 * 3-Fecha o banco de dados
 * 
 * Ou seja
 * 
 * 0-Antes da conexão precisa verificar se tenho o drive(ou uma arquitetura de
 * dependência(maven))
 * 1-Abre conexão-----------
 * 2-Executa o código |->SEMPRE, pois é seguro, e não ocupa memória(uso
 * desnecessário)caso não estiver usando
 * 3-Fecha conexão----------
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