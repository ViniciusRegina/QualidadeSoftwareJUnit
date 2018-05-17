package br.calculadora.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaCalculadora {

	@Test
	public void quando_passar_duas_parcelas_retorna_soma() {
		//cenario
		int a = 4;
		int b = 5;
		Calculadora umaCalculadora = new Calculadora();
		//acao
		int resultadoObtido = umaCalculadora.soma(a, b);
		//verificacao
		assertEquals(a + b, resultadoObtido);
	}
	
	@Test
	public void quando_passar_duas_parcelas_retorna_mult() {
		//cenario
		int a = 4;
		int b = 5;
		Calculadora umaCalculadora = new Calculadora();
		//acao
		int resultadoObtido = umaCalculadora.mult(a, b);
		//verificacao
		assertEquals(a * b, resultadoObtido);
	}
	
	@Test
	public void quando_passar_duas_parcelas_retorna_sub() {
		//cenario
		int a = 4;
		int b = 5;
		Calculadora umaCalculadora = new Calculadora();
		//acao
		int resultadoObtido = umaCalculadora.sub(a, b);
		//verificacao
		assertEquals(a - b, resultadoObtido);
	}
	
	@Test
	public void quando_passar_duas_parcelas_retorna_div() {
		//cenario
		int a = 4;
		int b = 5;
		Calculadora umaCalculadora = new Calculadora();
		//acao
		int resultadoObtido = umaCalculadora.div(a, b);
		//verificacao
		assertEquals(a / b, resultadoObtido);
	}
	
	@Test
	public void quando_passar_duas_parcelas_retorna_somaString() {
		//cenario
		String a = "4";
		String b = "5";
		Calculadora umaCalculadora = new Calculadora();
		//acao
		int resultadoObtido = umaCalculadora.somaS(a, b);
		//verificacao
		assertEquals(9, resultadoObtido);
	}
	
	@Test
	public void quando_passar_duas_parcelas_retorna_somaString2() {
		//cenario
		String a = "4";
		String b = "5";
		Calculadora umaCalculadora = new Calculadora();
		try {
			umaCalculadora.soma2(a, b);
		}catch (Exception e) {
			assertEquals("valor invalido", e.getMessage());
		}
		
	}
	
	

}


