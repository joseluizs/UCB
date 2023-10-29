package atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> turma = new ArrayList<Aluno>();

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Digite a primeira nota: ");
            double nota1 = sc.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = sc.nextDouble();
            sc.nextLine(); // Limpar o buffer

            Aluno aluno = new Aluno(nome, nota1, nota2);
            turma.add(aluno);

            System.out.print("Deseja adicionar mais um aluno? (S/N): ");
            String resposta = sc.nextLine();
            continuar = resposta.equalsIgnoreCase("S");
        }

        double mediaTurma = Aluno.calcularMediaTurma(turma);
        int quantidadeAlunos = turma.size();

        System.out.println("\nMédia da turma: " + mediaTurma);
        System.out.println("Quantidade de alunos informados: " + quantidadeAlunos);

        sc.close();
    }

}
