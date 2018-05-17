package br.calculadora.modelo;

public class Calculadora {

	public int somaS(String a, String b) {
		// TODO Auto-generated method stub
		int parcela1 = Integer.parseInt(a);
		int parcela2 = Integer.parseInt(b);
		return parcela1 + parcela2;
	}
	public int mult(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	public int soma(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	
	public int soma2(String a, String b) {
		int parcela1 = 0;
		int parcela2 = 0;
		if (a == "") {
			throw new RuntimeException("valor invalido");
			
		}else {
			parcela1 = Integer.parseInt(a);
			parcela2 = Integer.parseInt(b);
		}
		return parcela1 + parcela2;
		
	}


}
