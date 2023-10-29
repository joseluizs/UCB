/*
 * Crie um programa que seja uma calculadora, a partir de todos os conceitos que você aprendeu. 
 * Sua solução deve ter uma classe chamada Calculadora, que terá três atributos (dois operandos e um operador) 
 * e quatro métodos (que fazem as operações básicas: soma, subtração, multiplicação e divisão), que retornarão 
 * os resultados. 
 * Crie as leituras do usuário e faça a apresentação devida.
 * */

package atividade1;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro operando: ");
        double operando1 = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        System.out.print("Digite o segundo operando: ");
        double operando2 = sc.nextDouble();

        Calculadora calculadora = new Calculadora(operando1, operando2, operador);

        double resultado = 0.0;

        switch (operador) {
            case '+':
                resultado = calculadora.calcularSoma();
                break;
            case '-':
                resultado = calculadora.calcularSubtracao();
                break;
            case '*':
                resultado = calculadora.calcularMultiplicacao();
                break;
            case '/':
                resultado = calculadora.calcularDivisao();
                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }

        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }

        sc.close();
    }

}
