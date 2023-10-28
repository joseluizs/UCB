/*
 * Implemente um programa em Java que calcule o somatório de um número inteiro positivo recebido pelo usuário 
 * (efetue a validação para garantir esta premissa). Um método chamado somatório deve ser criado por você. 
 * Como parâmetro, ele deve receber um número, e o retorno deve ser a soma de todos os números anteriores até o zero.
 *  Por exemplo: se for passado 3 para o método, deve retornar a soma de 0 + 1 + 2 + 3.
 *  */

package atividade4;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = sc.nextInt();
        } while (numero < 0);

        int resultado = somatorio(numero);

        System.out.println("O somatório de " + numero + " é: " + resultado);

        sc.close();
    }

    // Método para calcular o somatório
    public static int somatorio(int numero) {
        if (numero == 0) {
            return 0; // O somatório de 0 é 0.
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}