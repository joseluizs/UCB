/*
 * Crie uma entidade aluno, com nome e duas notas. Receba do usuário os dados deste aluno e, na sequência, 
 * apresente todos os dados deste aluno. Apresente também a média dele e se está aprovado ou reprovado. 
 * Crie o maior número de métodos que conseguir visualizar.
 * */


package atividade8;

import java.util.Scanner;

public class Programa {
	
	class Aluno{
		
		String nome;
		double nota1;
		double nota2;
		
		public Aluno(String nome, double nota1,	double nota2) {
			this.nome = nome;
			this.nota1 = nota1;
			this.nota2 = nota2;
		}
		
		public double media() {
			return (nota1 + nota2) / 2;
		}
		
		public String estaAprovado() {
			return media() >= 6.0 ? "Aprovado" : "Reprovado"; 
		}
		
		public void print() {
			System.out.println("Nome: " + nome);
	        System.out.println("Nota 1: " + nota1);
	        System.out.println("Nota 2: " + nota2);
	        System.out.println("Média: " + media());
	        System.out.println("Situação: " +  estaAprovado());
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite a 1ª nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a 2ª nota: ");
		double nota2 = sc.nextDouble();
		
		Aluno aluno = new Programa(). new Aluno(nome, nota1, nota2);
		aluno.print();
		
		sc.close();
	}

}
