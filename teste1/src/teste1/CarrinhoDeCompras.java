package teste1;

import java.util.Scanner;

public class CarrinhoDeCompras {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de itens no carrinho:");
		int quantidadeItens = scanner.nextInt();
		
		if(quantidadeItens > 1 && quantidadeItens < 1000) {
			System.out.print("Quantidade de itens válida!");
			
		}else {
			System.out.print("Quantidade de itens inválida");
		}
	}

}
