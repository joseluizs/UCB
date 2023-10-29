package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Professor> professores = new ArrayList<Professor>();

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o nome do professor: ");
            String nome = sc.nextLine();

            System.out.print("Digite o CPF do professor: ");
            String cpf = sc.nextLine();

            System.out.print("Digite a titulação do professor (Doutor, Mestre, Graduado): ");
            String titulacao = sc.nextLine();

            System.out.print("Digite o salário do professor: ");
            double salario = sc.nextDouble();
            sc.nextLine(); // Limpar o buffer

            Professor professor = new Professor(nome, cpf, titulacao, salario);
            professores.add(professor);

            System.out.print("Deseja adicionar mais um professor? (S/N): ");
            String resposta = sc.nextLine();
            continuar = resposta.equalsIgnoreCase("S");
        }

        double totalArrecadado = calcularTotalArrecadado(professores);
        int quantidadeMestres = contarMestres(professores);

        System.out.println("\nTotal arrecadado pelo sindicato: R$ " + totalArrecadado);
        System.out.println("Quantidade de professores com titulação de Mestre: " + quantidadeMestres);

        sc.close();
    }

    public static double calcularTotalArrecadado(ArrayList<Professor> professores) {
        double totalArrecadado = 0.0;

        for (Professor professor : professores) {
            totalArrecadado += professor.calcularContribuicao();
        }

        return totalArrecadado;
    }

    public static int contarMestres(ArrayList<Professor> professores) {
        int quantidadeMestres = 0;

        for (Professor professor : professores) {
            if (professor.getTitulacao().equalsIgnoreCase("Mestre")) {
                quantidadeMestres++;
            }
        }

        return quantidadeMestres;
    }
}