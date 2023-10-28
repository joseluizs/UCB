/*
 * Uma escola deseja fazer um cadastro dos seus alunos. Um aluno possui nome, matrícula e situação, 
 * que pode ser regular ou bolsista. O usuário informará quantos alunos existem em uma turma. 
 * Você receberá os dados de todos os alunos e, na sequência, você deve apresentar todos os alunos informados, 
 * a quantidade de alunos regulares que existe e a quantidade de alunos bolsistas.
 * */

package atividade9;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos na turma? ");
        int numAlunos = sc.nextInt();

        // Arrays para armazenar os dados dos alunos
        String[] nomes = new String[numAlunos];
        int[] matriculas = new int[numAlunos];
        String[] situacoes = new String[numAlunos]; // Pode ser "regular" ou "bolsista"

        // Variáveis para contar alunos regulares e bolsistas
        int regulares = 0;
        int bolsistas = 0;

        // Coletar dados dos alunos
        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite os dados do aluno " + (i + 1) + ":");
            sc.nextLine(); // Limpar o buffer
            System.out.print("Nome do aluno: ");
            nomes[i] = sc.nextLine();
            System.out.print("Matrícula: ");
            matriculas[i] = sc.nextInt();
            System.out.print("Situação (regular ou bolsista): ");
            situacoes[i] = sc.next().toLowerCase();

            // Verificar se o aluno é regular ou bolsista e atualizar as contagens
            if (situacoes[i].equals("regular")) {
                regulares++;
            } else if (situacoes[i].equals("bolsista")) {
                bolsistas++;
            }
        }

        // Apresentar a lista de alunos
        System.out.println("\nLista de Alunos:");
        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Matrícula: " + matriculas[i]);
            System.out.println("Situação: " + situacoes[i]);
            System.out.println();
        }

        // Apresentar a contagem de alunos regulares e bolsistas
        System.out.println("Quantidade de Alunos Regulares: " + regulares);
        System.out.println("Quantidade de Alunos Bolsistas: " + bolsistas);

        sc.close();
    }
}