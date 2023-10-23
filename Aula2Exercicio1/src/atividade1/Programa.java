/*
 * Sintese:
 * Objetivo: Fazer a leitura dos dados e apresentar o resultado 
 * Entradas: salário de um professor, idade de uma criança, plano de saúde ou não, casada (c) 
 * ou solteira (s) e nome de um aluno.
 * Saidas: Exemplo: "O nome informado foi: João Silveira Neto".
 * */

package atividade1;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o sálario do professor");
		double salarioProfessor = sc.nextDouble();

		System.out.println("Digite a idade da criança");
		int idadeCrianca = sc.nextInt();

		System.out.println("O servidor público tem plano de saúde? (s/n)");
		char planoSaude = sc.next().charAt(0);

		System.out.println("A pessoa é casada (c) ou solteira (s)?");
		char estadoCivil = sc.next().charAt(0);

		System.out.println("Digite o nome do aluno");
		String nomeAluno = sc.nextLine();

		System.out.println("Salário do professor: " + salarioProfessor);
		System.out.println("Idade da criança: " + idadeCrianca);
		System.out.println("Servidor público tem plano de saúde? " + (planoSaude == 's' ? "Sim" : "Não"));
		System.out.println("Estado civil: " + (estadoCivil == 'c' ? "Casado" : "Solteiro"));
		System.out.println("Nome do aluno: " + nomeAluno);

		sc.close();
	}

}
