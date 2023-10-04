package teste1;

import java.util.ArrayList;

public class Conjunto {
	
	public static void main(String[] args) {
		ArrayList<Integer> conjunto = new ArrayList<>();
		
		
		
	//Conjunto vazio
		
		boolean conjuntoVazio = conjunto.isEmpty();
		System.out.println("O conjunto está vazio: " + conjuntoVazio);
	
		//Conjunto vazio - 1
	if (!conjunto.isEmpty()) {		//se  comjunto está vazio
		conjunto.remove(conjunto.size()- 1);
	}
	
		System.out.println("O conjunto está negativo: " + conjuntoVazio);
		
		//Conjunto cheio
		
		conjunto.add(1);
		conjunto.add(2);
		conjunto.add(3);
		
		boolean conjuntoCheio = conjunto.size() == 3;
		System.out.println("O conjunto está cheio: " + conjuntoCheio);
		
		//Conjunto cheio + 1
		
		conjunto.add(4);
		conjuntoCheio = conjunto.size() == 3;
		System.out.println("O conjunto possui 3 elementos: " + conjuntoCheio);
	}
}
