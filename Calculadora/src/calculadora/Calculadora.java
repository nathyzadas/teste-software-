package calculadora;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Calculadora {
@Test
public void testesoma() {
Calculadora calculadora = new Calculadora();
int resultado = calculadora.soma(2, 3);
assertEquals(5, resultado);
}

private int soma(int i, int j) {
	// TODO Auto-generated method stub
	return i + j;
}
}