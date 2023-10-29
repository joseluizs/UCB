package atividade4;

public class Professor {
    private String nome;
    private String cpf;
    private String titulacao;
    private double salario;

    public Professor(String nome, String cpf, String titulacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.titulacao = titulacao;
        this.salario = salario;
    }

    public double calcularContribuicao() {
        double percentual = 0.0;

        if (titulacao.equalsIgnoreCase("Doutor")) {
            percentual = 0.016;
        } else if (titulacao.equalsIgnoreCase("Mestre")) {
            percentual = 0.014;
        } else if (titulacao.equalsIgnoreCase("Graduado")) {
            percentual = 0.012;
        }

        return salario * percentual;
    }

    public String getTitulacao() {
        return titulacao;
    }
}
