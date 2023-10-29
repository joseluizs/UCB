package atividade3;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media = (nota1 + nota2) / 2;
    }
    
    public static double calcularMediaTurma(ArrayList<Aluno> turma) {
        double somaNotas = 0.0;

        for (Aluno aluno : turma) {
            somaNotas += aluno.getMedia();
        }

        if (turma.size() > 0) {
            return somaNotas / turma.size();
        } else {
            return 0.0;
        }
    }
}