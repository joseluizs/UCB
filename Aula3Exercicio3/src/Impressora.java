import javax.swing.JOptionPane;

public class Impressora {

	public static void print(double v1, char operador, double v2, double resultado) {
		System.out.println("[" + v1 + "] " + operador + " [" + v2 + "] = " + resultado);
	}
	
	public static void printPane(double v1, char operador, double v2, double resultado) {
		JOptionPane.showMessageDialog(null, "[" + v1 + "] " + operador + " [" + v2 + "] = " + resultado);
	}
}
