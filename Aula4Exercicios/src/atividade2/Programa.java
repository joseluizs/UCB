package atividade2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        // Apresente a string em caixa alta
        String caixaAlta = frase.toUpperCase();
        System.out.println("Em caixa alta: " + caixaAlta);

        // Apresente a string em caixa baixa
        String caixaBaixa = frase.toLowerCase();
        System.out.println("Em caixa baixa: " + caixaBaixa);

        // Apresente a quantidade de caracteres na string
        int quantidadeCaracteres = frase.length();
        System.out.println("Quantidade de caracteres: " + quantidadeCaracteres);

        // Verifique se a frase é igual a "Eu estou estudando Java"
        boolean igualAEstudandoJava = frase.equals("Eu estou estudando Java");
        System.out.println("A frase é igual a 'Eu estou estudando Java'? " + igualAEstudandoJava);

        // Apresente a quantidade de palavras na frase
        String[] palavras = frase.split(" "); // Dividir a frase em palavras com base no espaço
        int quantidadePalavras = palavras.length;
        System.out.println("Quantidade de palavras na frase: " + quantidadePalavras);

        sc.close();
    }

}
