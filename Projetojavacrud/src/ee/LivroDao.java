package ee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ee.Livro;

public class LivroDao {
    //Conexão com o banco de dados

	private static final String URL = "jdbc:mysql://localhost:3306/livros";
	private static final String USUARIO = "root";
	private static final String SENHA = "";

	public int cadastrarLivro(Livro livro) {
	    int id = 0;
	    try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)) {
	        String sql = "INSERT INTO livros (titulo, autor, ano) VALUES (?, ?, ?)";
	        PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
	        stmt.setString(1, livro.getTitulo()); // Define o título do livro no statement
	        stmt.setString(2, livro.getAutor()); // Define o autor do livro no statement
	        stmt.setInt(3, livro.getAno()); // Define o ano do livro no statement
	        stmt.executeUpdate(); // Executa o insert no banco de dados

	        ResultSet rs = stmt.getGeneratedKeys(); // Obtém as chaves geradas (neste caso, o ID)
	        if (rs.next()) {
	            id = rs.getInt(1); // Obtém o ID gerado
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return id; // Retorna o ID gerado
	}

	public void editarLivro(Livro livro) {
	    try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)) {
	        String sql = "UPDATE livros SET titulo = ?, autor = ?, ano = ? WHERE id = ?";
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        stmt.setString(1, livro.getTitulo()); // Define o novo título do livro no statement
	        stmt.setString(2, livro.getAutor()); // Define o novo autor do livro no statement
	        stmt.setInt(3, livro.getAno()); // Define o novo ano do livro no statement
	        stmt.setInt(4, livro.getId()); // Define o ID do livro no statement
	        stmt.executeUpdate(); // Executa o update no banco de dados
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	public void excluirLivro(int id) {
	    try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)) {
	        String sql = "DELETE FROM livros WHERE id = ?";
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        stmt.setInt(1, id); // Define o ID do livro a ser excluído no statement
	        stmt.executeUpdate(); // Executa o delete no banco de dados
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	public Livro buscarLivroPorId(int id) {
	    Livro livro = null;
	    try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)) {
	        String sql = "SELECT * FROM livros WHERE id = ?";
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        stmt.setInt(1, id); // Define o ID do livro a ser buscado no statement
	        ResultSet rs = stmt.executeQuery(); // Executa a query no banco de dados
	        if (rs.next()) {
	            livro = new Livro();
	            livro.setId(rs.getInt("id")); // Obtém o ID do livro
	            livro.setTitulo(rs.getString("titulo")); // Obtém o título do livro
	            livro.setAutor(rs.getString("autor")); // Obtém o autor do livro
	            livro.setAno(rs.getInt("ano")); // Obtém o ano do livro
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return livro; // Retorna o livro encontrado ou null se não encontrado
	}
	}