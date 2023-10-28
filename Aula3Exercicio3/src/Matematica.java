
public class Matematica {
	
	public static double somar(double v1, double v2) {
		return v1 + v2;
	}

	public static double subtrair(double v1, double v2) {
		return v1 - v2;
	}

	public static double multiplicar(double v1, double v2) {
		return v1 * v2;
	}

	public static double dividir(double v1, double v2) {
		if (v2 == 0) {
			return -1;
		}
		return v1 / v2;
	}

	// 2 e 3 = 2 elevado 3 = 8 (2*2*2)
	public static double exponente(double base, double expoenteFlutuante) {
		int expoente = (int) expoenteFlutuante; // casting
		double resultado = 1;
		for (int i = 0; i < expoente; i++) {
			resultado = resultado * base;
		}
		return resultado;
	}
	
	public static double calcular(double v1, char operador, double v2) {
		double resultado;
		switch (operador) {

		case '+':
			resultado = somar(v1, v2);
			break;
		case '-':
			resultado = subtrair(v1, v2);
			break;
		case '*':
			resultado = multiplicar(v1, v2);
			break;
		case '/':
			resultado = dividir(v1, v2);
			break;
		case 'e':
			resultado = exponente(v1, v2);
			break;

		default:
			resultado = -1;
			break;
		}
		return resultado;
	}

}
