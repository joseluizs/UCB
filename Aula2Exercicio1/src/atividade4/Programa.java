package atividade4;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroDePessoas = 10;
		int contadorPessoasMaisDe50 = 0;
		double somaAlturasMaisDe50 = 0;

		for (int i = 1; i <= numeroDePessoas; i++) {
			System.out.print("Digite a idade da pessoa " + i + ": ");
			int idade = sc.nextInt();

			System.out.print("Digite a altura (em metros) da pessoa " + i + ": ");
			double altura = sc.nextDouble();

			if (idade > 50) {
				contadorPessoasMaisDe50++;
				somaAlturasMaisDe50 += altura;
			}
		}

		sc.close();

		if (contadorPessoasMaisDe50 > 0) {
			double mediaAlturasMaisDe50 = somaAlturasMaisDe50 / contadorPessoasMaisDe50;
			System.out.println("Média das alturas das pessoas com mais de 50 anos: " + mediaAlturasMaisDe50 + " metros");
		} else {
			System.out.println("Nenhuma pessoa com mais de 50 anos foi registrada.");
		}
	}
}
