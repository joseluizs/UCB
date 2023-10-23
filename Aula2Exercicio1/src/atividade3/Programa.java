package atividade3;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = sc.nextLine();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Digite o total de vendas efetuadas no mês: ");
        double totalVendas = sc.nextDouble();

        sc.close();

        // Calculando a comissão (15% das vendas)
        double comissao = 0.15 * totalVendas;

        // Calculando o salário total
        double salarioTotal = salarioFixo + comissao;

        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Salário no final do mês: R$ " + salarioTotal);
    }
}
