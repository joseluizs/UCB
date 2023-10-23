package atividade5;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maiorValor = Integer.MIN_VALUE;
		int menorValor = Integer.MAX_VALUE;
		double somaValores = 0;
		int quantidadeNumeros = 500;

		for (int i = 0; i < quantidadeNumeros; i++) {
			System.out.println("Digite o valor " + (i + 1) + ":");
			int valorAtual = sc.nextInt();

			if (valorAtual > maiorValor) {
				maiorValor = valorAtual;
			}

			if (valorAtual < menorValor) {
				menorValor = valorAtual;
			}

			somaValores += valorAtual;
		}

		double mediaValores = somaValores / quantidadeNumeros;

		System.out.println("Resultado da análise:");
		System.out.println("Maior valor: " + maiorValor);
		System.out.println("Menor valor: " + menorValor);
		System.out.println("Média dos valores: " + mediaValores);
		sc.close();
	}

}
