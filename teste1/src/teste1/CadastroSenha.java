package teste1;

import java.util.Scanner;

public class CadastroSenha {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite sua senha: ");
		String senha = scanner.nextLine();
		
		if (senha.length() >= 5 && senha.length() <=10) {
			System.out.println("Senha Válida!");
			
		}else if(senha.length() < 5) {
			System.out.println("Senha mínima de 5 caracteres não atingida");
		
		}else if(senha.length() == 4) {
			System.out.println("Senha mínima -1 caractere. Senha inválida");
		
		}else if(senha.length() == 11) {
			System.out.println("Senha máxima +1 caractere. Senha inválida");
		
		}else {
			System.out.println("Senha máxima de 10 caracteres excedida.");
		}
	}

}
