/*
 * Implemente um programa em Java que receba a temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit. 
 * A fórmula de conversão é: FAR = (9 * CEL + 160) / 5, sendo FAR a temperatura em Fahrenheit e CEL em Celsius. 
 * Esta conversão deve ser feita por meio de um método com a seguinte 
 * assinatura: public static double fahrenheit(double celsius). 
 * O método deve receber a temperatura em Celsius e retornar em Fahrenheit.
 * */

package atividade2;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = fahrenheit(celsius);

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        sc.close();
    }

    // Método para converter Celsius em Fahrenheit
    public static double fahrenheit(double celsius) {
        // Aplicando a fórmula de conversão
        double fahrenheit = (9 * celsius + 160) / 5;
        return fahrenheit;
    }
}
