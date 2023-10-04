package teste1;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Cadastro {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

			// Campo de login
		System.out.print("Digite o e-mail de login: ");
		String email = scanner.nextLine();
		if (!validarEmail(email)) {
			System.out.println("O e-mail digitado não é válido.");
			return;
		}
			// Campo de senha
		System.out.print("Digite a senha (6 a 8 dígitos numéricos): ");
		String senha = scanner.nextLine();
		if (!validarSenha(senha)) {
			System.out.println("A senha digitada não é válida.");
			return;
		}
			//Campo de confirmação de senha
		System.out.print("Digite novamente a senha: ");
		String confirmacaoSenha = scanner.nextLine();
		if (!senha.equals(confirmacaoSenha)) {
			System.out.println("As senhas digitadas não coincidem.");
			return;
		}

		//Se todas as condições de entrada forem atendidas, exibe uma mensagem de sucesso
		System.out.println("Cadastro realizado com sucesso!");
	}
	
		//Função para validar o e-mail
	public static boolean validarEmail(String email) {
		//verifica se o email é válido (Ex.: teste@gmail.com)
		String regex =  "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$";
		return Pattern.matches(regex, email);
	}
		//Função para validar a senha
	public static boolean validarSenha(String senha) {
		//Verifica se a senha contém apenas números e tem entre 6 e 8 dígitos
		return senha.matches("\\d{6,8}");
	}
}

