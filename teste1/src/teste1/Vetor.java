package teste1;

public class Vetor {
	
	public static void main(String[] args) {
		int[] vetor5 = {1, 2, 3, 4, 5};
		int[] vetor4 = {1, 2, 3, 4};
		int[] vetor6 = {1, 2, 3, 4, 5, 6};
		
		System.out.println("Teste vetor de 4 caracteres: ");
		for(int i = 0; i < vetor4.length; i++) {
		System.out.println(vetor4[i]);
		}
		System.out.println("*Este Vetor é Inválido*");
		System.out.println();
	
		System.out.println("Teste vetor de 5 caracteres: ");
		for(int i = 0; i < vetor5.length; i++) {
		System.out.println(vetor5[i]);
		}
		System.out.println("*Este Vetor é Válido*");
		System.out.println();
		
		System.out.println("Teste vetor de 6 caracteres: ");
		for(int i = 0; i < vetor6.length; i++) {
		System.out.println(vetor6[i]);
		}
		System.out.println("*Este Vetor é Inválido*");
		System.out.println();
}
	
	public static boolean valida(int[] vetor) {
		if(vetor.length == 5) {
			return true;
			
		}else {
			return false;
		}
	}
}