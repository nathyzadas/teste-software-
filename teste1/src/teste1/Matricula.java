package teste1;

import java.util.Scanner;

public class Matricula {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a matrícula: ");
		
		String Matricula = scanner.nextLine();
		boolean validarMatricula = validarMatricula(Matricula);
		
		if(validarMatricula) {
			System.out.println("A matrícula "+ Matricula + " é válida");
			
		}else {
			System.out.println("A matrícula "+ Matricula + " é inválida");
		}
	}
	
	public static boolean validarMatricula(String Matricula) {
		if(Matricula.startsWith("MT")) {		//caso a matrícula comece com MT, o resultado será válido
			return true;
		}else {
			return false;
		}
	}

}
