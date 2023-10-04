package teste1;

import org.junit.Assert;
import org.junit.Test;

public class Teste1 {

	@Test
	public void test1soma() {
		//classe 
		Calculadora calculadora = new Calculadora();
		int numero1 = 10;
		int numero2 = 50;
		int numeroesperado = 40;
		int resultado = calculadora.soma(numero1,  numero2);
		
		Assert.assertEquals(numeroesperado, resultado);
		// Esta linha está igualando a variável "numeroesperado" com a variável "resultado"
	}

}
