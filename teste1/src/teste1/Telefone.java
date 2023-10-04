package teste1;

import java.util.Scanner;


public class Telefone {
	
	public static void main(String[] args) {
		
		int quantidadeMinimaDigitos = 8;
		int quantidadeMaximaDigitos = 11;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número de telefone: ");
		String telefone = scanner.nextLine();
		
		telefone = telefone.replaceAll("[^0-9]", "");	//remove todos os caracteres
		
		int quantidadeDigitos = telefone.length();
		
		if(quantidadeDigitos < quantidadeMinimaDigitos || quantidadeDigitos > quantidadeMaximaDigitos) {
			System.out.println("Número de telefone inválido");
			
		}else {
			System.out.println("Número de telefone válido");
		}
	}

}
