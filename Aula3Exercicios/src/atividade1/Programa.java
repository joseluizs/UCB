/*
 *Implemente um programa em Java que calcule o juro de uma dívida que você contraiu no mês passado no 
 *crediário de uma loja. A taxa de juros mensal e o valor da dívida serão fornecidos pelo usuário. 
 *A dívida deve ser calculada por método criado por você chamado: calcularDivida e deve receber como 
 *parâmetro os valores necessários para o cálculo e retornar a referida dívida. 
 */


package atividade1;

import java.util.Scanner;

public class Programa {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o valor da dívida: ");
	        double valorDivida = sc.nextDouble();

	        System.out.print("Digite a taxa de juros mensal (em decimal): ");
	        double taxaJuros = sc.nextDouble();

	        double dividaComJuros = calcularDivida(valorDivida, taxaJuros);

	        System.out.println("O valor da dívida com juros é: " + dividaComJuros);

	        sc.close();
	    }

	    // Método para calcular a dívida com juros
	    public static double calcularDivida(double valorDivida, double taxaJuros) {
	        // Fórmula para calcular a dívida com juros
	        double dividaComJuros = valorDivida * (1 + taxaJuros);
	        return dividaComJuros;
	    }
	}