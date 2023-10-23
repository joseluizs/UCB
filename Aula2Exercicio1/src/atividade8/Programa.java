package atividade8;

import java.util.Scanner;

public class Programa {

	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalValores = 5000;
        int[] valores = new int[totalValores];
        int somaValores = 0;
        int countImpares = 0;

        for (int i = 0; i < totalValores; i++) {
            int valor;

            do {
                System.out.print("Digite um valor não negativo: ");
                valor = sc.nextInt();
            } while (valor < 0);

            valores[i] = valor;
            somaValores += valor;

            if (valor % 2 != 0) {
                countImpares++;
            }
        }

        sc.close();

        double mediaValores = (double) somaValores / totalValores;

        System.out.println("Média dos valores: " + mediaValores);
        System.out.println("Quantidade de valores ímpares: " + countImpares);
        System.out.println("Valores informados:");

        for (int i = 0; i < totalValores; i++) {
            System.out.println(valores[i]);
        }
    }
}


