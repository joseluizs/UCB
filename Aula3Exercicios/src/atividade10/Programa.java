/*
 * Um piloto tem nome, escuderia e tempo de volta (em minutos apenas não pode ser menor que 1 nem maior que 60). 
 * Faça um programa Java que receba os dados dos pilotos de uma corrida. Ao final mostre o seguinte:
 * O piloto mais rápido.
 * O piloto mais lento.
 * A média dos tempos.
 * DESAFIO: todos os pilotos ordenados pelo tempo. (Use o bubblesort)
 * 
 * */


package atividade10;

import java.util.Scanner;


class Piloto {
    String nome;
    String escuderia;
    int tempoVolta;

    Piloto(String nome, String escuderia, int tempoVolta) {
        this.nome = nome;
        this.escuderia = escuderia;
        this.tempoVolta = tempoVolta;
    }
}

public class Programa {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos pilotos participaram da corrida? ");
        int numPilotos = scanner.nextInt();

        Piloto[] pilotos = new Piloto[numPilotos];

        for (int i = 0; i < numPilotos; i++) {
            System.out.println("Digite os dados do piloto " + (i + 1) + ":");
            System.out.print("Nome do piloto: ");
            String nome = scanner.next();

            System.out.print("Escuderia: ");
            String escuderia = scanner.next();

            int tempoVolta;
            do {
                System.out.print("Tempo de volta (em minutos, entre 1 e 60): ");
                tempoVolta = scanner.nextInt();
            } while (tempoVolta < 1 || tempoVolta > 60);

            pilotos[i] = new Piloto(nome, escuderia, tempoVolta);
        }

        // Encontrar o piloto mais rápido e o mais lento
        Piloto maisRapido = pilotos[0];
        Piloto maisLento = pilotos[0];
        int somaTempos = pilotos[0].tempoVolta;

        for (int i = 1; i < numPilotos; i++) {
            Piloto piloto = pilotos[i];

            if (piloto.tempoVolta < maisRapido.tempoVolta) {
                maisRapido = piloto;
            }

            if (piloto.tempoVolta > maisLento.tempoVolta) {
                maisLento = piloto;
            }

            somaTempos += piloto.tempoVolta;
        }

        // Calcular a média dos tempos
        double mediaTempos = (double) somaTempos / numPilotos;

        // Ordenar os pilotos pelo tempo usando o algoritmo Bubble Sort
        for (int i = 0; i < numPilotos - 1; i++) {
            for (int j = 0; j < numPilotos - i - 1; j++) {
                if (pilotos[j].tempoVolta > pilotos[j + 1].tempoVolta) {
                    Piloto temp = pilotos[j];
                    pilotos[j] = pilotos[j + 1];
                    pilotos[j + 1] = temp;
                }
            }
        }

        System.out.println("Piloto mais rápido: " + maisRapido.nome);
        System.out.println("Piloto mais lento: " + maisLento.nome);
        System.out.println("Média dos tempos: " + mediaTempos);

        System.out.println("Pilotos ordenados pelo tempo:");
        for (Piloto piloto : pilotos) {
            System.out.println(piloto.nome + " - " + piloto.tempoVolta + " minutos");
        }

        scanner.close();
    }
}