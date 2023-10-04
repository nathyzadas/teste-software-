package teste1;

public class MegaSena {
	
	public static void main(String[] args) {
		
		int[] vetorValido = {12, 56, 40, 33, 56, 20};
		int[] vetorInvalidoMenosElementos = {12, 56, 40, 33, 20, 30};
		int[] vetorInvalidoMaisElementos = {11, 12, 56, 40, 33, 56};
		
		System.out.println("Vetor Válido:"+ valida(vetorValido)); //retorna o que foi dito anteriormente
		System.out.println("Vetor Inválido (menos elementos) " + valida(vetorInvalidoMenosElementos));
		System.out.println("Vetor Inválido (mais elementos) " + valida(vetorInvalidoMaisElementos));
	}
	
	public static boolean valida(int[] vetor) {
		if(vetor.length == 6) {
			return true;
			
		}else {
			return false;
		}
	}

}
