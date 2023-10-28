/*
 * Escreva um programa Java que lê um valor n inteiro e positivo e que calcule a seguinte soma por 
 * meio de um método chamado somar S: S:= 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
 * */

package atividade6;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro e positivo n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("O valor de 'n' deve ser inteiro e positivo.");
        } else {
            double resultado = somarS(n);
            System.out.println("O resultado da soma é: " + resultado);
        }

        sc.close();
    }

    // Método para calcular a soma S
    public static double somarS(int n) {
        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }

        return soma;
    }
}