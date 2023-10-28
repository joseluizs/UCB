/*
 * Você deve implementar uma calculadora. O usuário informará um valor, um operador e outro valor. 
 * Execute a operação e apresente o resultado. Faça uso do maior número de métodos que conseguir visualizar 
 * (na entrada de dados, nas operações). 
 * As operações disponíveis para esta calculadora são: adicionar, subtrair, dividir, multiplicar e expoente. 
 * Para o cálculo do expoente, pesquise no hiperlink.
 * */

package atividade3;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /, ^): ");
        char operador = sc.next().charAt(0);

        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        double resultado = realizarCalculo(valor1, operador, valor2);

        System.out.println("O resultado da operação é: " + resultado);

        sc.close();
    }

    // Método para realizar cálculos com base no operador
    public static double realizarCalculo(double valor1, char operador, double valor2) {
        switch (operador) {
            case '+':
                return somar(valor1, valor2);
            case '-':
                return subtrair(valor1, valor2);
            case '*':
                return multiplicar(valor1, valor2);
            case '/':
                return dividir(valor1, valor2);
            case '^':
                return elevarPotencia(valor1, valor2);
            default:
                System.out.println("Operador inválido");
                return Double.NaN;
        }
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Divisão por zero não é permitida");
            return Double.NaN;
        }
        return a / b;
    }

    public static double elevarPotencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}