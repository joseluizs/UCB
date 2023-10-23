import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		int []nums = new int[5];//inicialização;
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Informe o "+(i +1)+" valor");
			nums[i] = new Scanner(System.in).nextInt();
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
