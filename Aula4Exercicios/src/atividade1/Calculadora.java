package atividade1;

public class Calculadora {
    private double operando1;
    private double operando2;
    private char operador;

    public Calculadora(double operando1, double operando2, char operador) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.operador = operador;
    }

    public double calcularSoma() {
        return operando1 + operando2;
    }

    public double calcularSubtracao() {
        return operando1 - operando2;
    }

    public double calcularMultiplicacao() {
        return operando1 * operando2;
    }

    public double calcularDivisao() {
        if (operando2 != 0) {
            return operando1 / operando2;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN; // Retorna NaN (Not-a-Number) em caso de divisão por zero
        }
    }
}