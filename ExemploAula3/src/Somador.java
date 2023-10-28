/*
 * Sintese
 * Objetivo: é receber dois valores e realizar a soma por meio de método e apresentar
 * Entrada: não se aplica. Será por atribuição
 * Saída: o resultado de retorno do método*/

public class Somador {
	
	public static void main(String[] args) {
		double n1 = 10.0;
		double n2 = 12.0;
		double retorno = somar(n1, n2);
		
		System.out.println("O valor retornado pelo método é: " + retorno);
		
	}
	
	
	/*
	 * Objetivo do método: receber dois valores
	 * retorno: a soma de 2 valores*/
	public static double somar(double param1, double param2) {
		return param1 + param2;
	}

}
