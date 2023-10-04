package ee;

import java.util.Scanner;

public class LivroTest {

	public static void main(String[] args) {
	    LivroDao livroDao = new LivroDao(); // Cria uma instância do LivroDao

	    Scanner scanner = new Scanner(System.in); // Cria um Scanner para leitura de entrada

	    System.out.println("Cadastro de Livro");
	    System.out.print("Digite o título do livro: ");
	    String titulo = scanner.nextLine(); // Lê o título do livro
	    System.out.print("Digite o autor do livro: ");
	    String autor = scanner.nextLine(); // Lê o autor do livro
	    System.out.print("Digite o ano do livro: ");
	    int ano = scanner.nextInt(); // Lê o ano do livro
	    scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

	    Livro livro = new Livro(titulo, autor, ano); // Cria um novo livro com os dados informados
	    int id = livroDao.cadastrarLivro(livro); // Cadastra o livro no LivroDao e recebe o ID retornado
	    System.out.println("Livro cadastrado - ID: " + id + " - " + livro);

	    System.out.println("Digite o ID do livro a ser editado: ");
	    id = scanner.nextInt(); // Lê o ID do livro a ser editado
	    scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()
	    Livro livroRecuperado = livroDao.buscarLivroPorId(id); // Busca o livro pelo ID no LivroDao
	    if (livroRecuperado != null) {
	        System.out.println("Livro recuperado: " + livroRecuperado);
	        System.out.println("Digite o novo título do livro: ");
	        titulo = scanner.nextLine(); // Lê o novo título do livro
	        System.out.println("Digite o novo autor do livro: ");
	        autor = scanner.nextLine(); // Lê o novo autor do livro
	        System.out.println("Digite o novo ano do livro: ");
	        ano = scanner.nextInt(); // Lê o novo ano do livro
	        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()
	        livroRecuperado.setTitulo(titulo); // Atualiza o título do livro recuperado
	        livroRecuperado.setAutor(autor); // Atualiza o autor do livro recuperado
	        livroRecuperado.setAno(ano); // Atualiza o ano do livro recuperado
	        livroDao.editarLivro(livroRecuperado); // Edita o livro no LivroDao
	        livroRecuperado = livroDao.buscarLivroPorId(id); // Busca o livro novamente pelo ID
	        System.out.println("Livro atualizado: " + livroRecuperado);
	    } else {
	        System.out.println("Livro não encontrado.");
	    }

	    System.out.println("Digite o ID do livro a ser excluído: ");
	    id = scanner.nextInt(); // Lê o ID do livro a ser excluído
	    scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()
	    livroDao.excluirLivro(id); // Exclui o livro pelo ID no LivroDao
	    livroRecuperado = livroDao.buscarLivroPorId(id); // Busca o livro novamente pelo ID
	    if (livroRecuperado == null) {
	        System.out.println("Livro excluído com sucesso.");
	    } else {
	        System.out.println("Falha ao excluir o livro.");
	    }

	    scanner.close(); // Fecha o Scanner
	}
	}