import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		double num =  lerDouble("Informe um sálario: " , "Ops! Valor invalido!", 0, 1000);
		System.out.println("O valor lido foi: " + num);
		
		double nota = lerDouble("Informe a nota: ", "Nota inválida! ", 0, 10);
		System.out.println("A nota foi: " + nota);
	}
	
	public static double lerDouble(String msg, String msgErro, double min, double max) {
		
		double retorno;
		do {
			retorno = lerDouble(msg);
			if (retorno < min || retorno > max) {
				System.out.println(msgErro);
			}
		} while (retorno < 0 || retorno > max);
		return retorno;
		
	}
	
	private static double lerDouble(String msg) {
		System.out.println(msg);
		return lerDouble();
	}
	
	public static double lerDouble() {
		return new Scanner(System.in).nextDouble();
	}
}
