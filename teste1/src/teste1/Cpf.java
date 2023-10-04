package teste1;

import java.util.Scanner;


public class Cpf {
	
public static void main(String[] args) {
		
		int quantidadeMinimaDigitos = 11;
		int quantidadeMaximaDigitos = 11;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número do CPF: ");
		String cpf = scanner.nextLine();
		
		cpf = cpf.replaceAll("[^0-9]", "");	//remove todos os caracteres não numéricos
		
		int quantidadeDigitos = cpf.length();
		
		if(quantidadeDigitos < quantidadeMinimaDigitos || quantidadeDigitos > quantidadeMaximaDigitos) {
			System.out.println("Número de CPF inválido");
			
		}else {
			System.out.println("Número de CPF válido");
		}
	}

}
