package ee;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.AfterClass;

public class LivrosJunity {

	private LivroDao livroDao;

	// Método executado antes de cada teste
	@Before
	public void setUp() {
	    livroDao = new LivroDao(); // Cria uma instância do LivroDao
	}

	// Teste de cadastro de livro
	@Test
	public void testCadastroLivro() {
	    // Cria um novo livro com título, autor e ano
	    Livro livro = new Livro("Livro 1", "Autor 1", 2021);

	    // Cadastra o livro no LivroDao e recebe o ID retornado
	    int id = livroDao.cadastrarLivro(livro);

	    // Busca o livro cadastrado pelo ID
	    Livro livroRecuperado = livroDao.buscarLivroPorId(id);

	    // Verifica se o livro recuperado não é nulo
	    assertNotNull(livroRecuperado);

	    // Verifica se o título do livro recuperado é "Livro 1"
	    assertEquals("Livro 1", livroRecuperado.getTitulo());

	    // Verifica se o autor do livro recuperado é "Autor 1"
	    assertEquals("Autor 1", livroRecuperado.getAutor());

	    // Verifica se o ano do livro recuperado é 2021
	    assertEquals(2021, livroRecuperado.getAno());
	}

	// Teste de edição de livro
	@Test
	public void testEditarLivro() {
	    // Cria um novo livro com título, autor e ano
	    Livro livro = new Livro("Livro 2", "Autor 2", 2022);

	    // Cadastra o livro no LivroDao e recebe o ID retornado
	    int id = livroDao.cadastrarLivro(livro);

	    // Busca o livro cadastrado pelo ID
	    Livro livroRecuperado = livroDao.buscarLivroPorId(id);

	    // Verifica se o livro recuperado não é nulo
	    assertNotNull(livroRecuperado);

	    // Altera o título, autor e ano do livro recuperado
	    livroRecuperado.setTitulo("Livro 2 (Editado)");
	    livroRecuperado.setAutor("Autor 2 (Editado)");
	    livroRecuperado.setAno(2023);

	    // Edita o livro no LivroDao
	    livroDao.editarLivro(livroRecuperado);

	    // Busca o livro novamente pelo ID
	    Livro livroAtualizado = livroDao.buscarLivroPorId(id);

	    // Verifica se o livro atualizado não é nulo
	    assertNotNull(livroAtualizado);

	    // Verifica se o título do livro atualizado é "Livro 2 (Editado)"
	    assertEquals("Livro 2 (Editado)", livroAtualizado.getTitulo());

	    // Verifica se o autor do livro atualizado é "Autor 2 (Editado)"
	    assertEquals("Autor 2 (Editado)", livroAtualizado.getAutor());

	    // Verifica se o ano do livro atualizado é 2023
	    assertEquals(2023, livroAtualizado.getAno());
	}

	// Teste de exclusão de livro
	@Test
	public void testExcluirLivro() {
	    // Cria um novo livro com título, autor e ano
	    Livro livro = new Livro("Livro 3", "Autor 3", 2023);

	    // Cadastra o livro no LivroDao e recebe o ID retornado
	    int id = livroDao.cadastrarLivro(livro);

	    // Busca o livro cadastrado pelo ID
	    Livro livroRecuperado = livroDao.buscarLivroPorId(id);

	    // Verifica se o livro recuperado não é nulo
	    assertNotNull(livroRecuperado);

	    // Exclui o livro pelo ID
	    livroDao.excluirLivro(id);

	    // Busca o livro novamente pelo ID
	    Livro livroExcluido = livroDao.buscarLivroPorId(id);

	    // Verifica se o livro excluído é nulo
	    assertNull(livroExcluido);
	}
	}