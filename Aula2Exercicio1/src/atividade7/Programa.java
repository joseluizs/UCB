package atividade7;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite o nome do estudante: ");
            String nomeEstudante = sc.next();

            double nota1, nota2;
            do {
                System.out.print("Digite a primeira nota (entre 0 e 10): ");
                nota1 = sc.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.print("Digite a segunda nota (entre 0 e 10): ");
                nota2 = sc.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            // Calculando a média das notas
            double media = (nota1 + nota2) / 2;

            System.out.println("Nome do estudante: " + nomeEstudante);
            System.out.println("Primeira nota: " + nota1);
            System.out.println("Segunda nota: " + nota2);
            System.out.println("Média: " + media);

            // Verificando se o estudante está aprovado ou reprovado
            if (media >= 7.0) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }

            System.out.print("Deseja continuar (S-Sim ou N-Não)? ");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        sc.close();
	}

}
