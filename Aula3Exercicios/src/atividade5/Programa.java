/*
 * Você deve fazer a implementação de uma classe chamada MyMath.java, 
 * que deverá ter quatro métodos conforme a listagem a seguir:
	Receber um número inteiro como argumento e calcular o fatorial.
	Receber dois valores como argumento e retornar o número que for maior.
	Receber um valor inteiro como argumento e retornar se ele é um número par. (retorne true ou false)
	Receber um número inteiro e retornar se ele é um número primo matemático (desafio).
	Faça um programa principal para testar sua classe implementada com valores atribuídos a sua escolha.
	*/

package atividade5;

import java.util.Scanner;

public class Programa {

	// Método para calcular o fatorial de um número inteiro
    public static long calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O fatorial não está definido para números negativos.");
        }
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    // Método para retornar o número maior entre dois valores
    public static int numeroMaior(int a, int b) {
        return Math.max(a, b);
    }

    // Método para verificar se um número inteiro é par
    public static boolean ehNumeroPar(int num) {
        return num % 2 == 0;
    }

    // Método para verificar se um número inteiro é um número primo matemático
    public static boolean ehNumeroPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    	
    	Scanner sc  = new Scanner(System.in);
    	
    	System.out.println("Digite o 1º número");
    	int numero1 = sc.nextInt();
        System.out.println("Digite o 2º número");
        int numero2 = sc.nextInt();

        // Testando o cálculo do fatorial
        System.out.println("Fatorial de " + numero1 + " é: " + calcularFatorial(numero1));

        // Testando o número maior entre dois valores
        System.out.println("O número maior entre " + numero1 + " e " + numero2 + " é: " + numeroMaior(numero1, numero2));

        // Testando se um número é par
        System.out.println("O número " + numero1 + " é par? " + ehNumeroPar(numero1));

        // Testando se um número é primo
        System.out.println("O número " + numero2 + " é primo? " + ehNumeroPrimo(numero2));
        sc.close();
    }
}