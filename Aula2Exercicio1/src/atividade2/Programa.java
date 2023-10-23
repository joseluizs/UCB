package atividade2;

import java.util.Scanner;

public class Programa {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Digite a taxa de juros mensal (em porcentagem):");
	        double taxaDeJuros = sc.nextDouble();

	        System.out.println("Digite o valor da dívida:");
	        double valorDaDivida = sc.nextDouble();

	        double juros = valorDaDivida * taxaDeJuros / 100;

	        System.out.println("O juros de uma dívida no mês passado no crediário de uma loja é: " + juros);

	        sc.close();
	}
}
