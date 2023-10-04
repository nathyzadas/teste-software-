package teste1;

import java.util.Scanner;

public class ProgramaIdade {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //armazena na variável
		System.out.print("Digite a idade: ");
		
		if(scanner.hasNextInt()) {
			
			int idade = scanner.nextInt();
			
			if(idade >= 18) {
				System.out.print("Idade permitida");
				
			}else {
				System.out.println("Idade não permitida");
			}
			
		}else {
			System.out.println("Idade não é um número inteiro");
		}
		
scanner.close();
		
	}
}

