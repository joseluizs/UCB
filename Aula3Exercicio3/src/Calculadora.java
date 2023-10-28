/*
 * Sintese
 * Objetivo: É criar uma calculadora com as operações: adição, subtração, divisão, multiplicação e expoente
 * Entrada: dois valores double e o operador.
 * Saída: o resultado da operação*/

public class Calculadora {

	public static void main(String[] args) {

		double v1 = Leitor.lerDouble("Informe o 1º valor: ");
		char operador = Leitor.lerCaractere("Informe o operador: ");
		double v2 = Leitor.lerDouble("Informe o 2º valor: ");		
		double resultado = Matematica.calcular(v1, operador, v2);
		//Impressora.print(v1, operador, v2, resultado);
		Impressora.printPane(v1, operador, v2, resultado);

	}

	
}
