import java.util.Scanner;

/*
 * Sintese:
 * Objetivo: Receber as notas de um estudante e infomar o status de aprovação enquanto o usúario desejar.
 * Entradas: Nome e duas notas.
 * Saída: Nome, notas, media e status.
 * **/
public class Programa {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		char opcao = 'N';
		do {
			
			System.out.println("Informe o seu nome: ");
			String nome =  new Scanner(System.in).nextLine();
			double n1;
			do {
				System.out.println("Informe a 1ª nota: ");
				n1 = new Scanner(System.in).nextDouble();
				if (n1 <= 0 || n1 > 10) {
					System.out.println("Ops! valor informado pra 1ª nota inválido!");
				}
			}while(n1 <= 0 || n1 > 10);
			
			double n2;
			do {
				System.out.println("Informe a 2ª nota: ");
				n2 = new Scanner(System.in).nextDouble();
				if (n2 <= 0 || n2 > 10) {
					System.out.println("Ops! valor informado pra 2ª nota inválido!");
				}
			}while(n2 <= 0 || n2 > 10);
			double media = (n1 + n2) /2;
			
			if (media >= 7.0) {
				System.out.println("Aluno " +nome+" aprovado com a 1ª nota:"+n1+" com a 1ª nota:"+n2+" com média: " +media);
			}else {
				System.out.println("Aluno " +nome+" reprovado com a 1ª nota:"+n1+" com a 1ª nota:"+n2+" com média: " +media);
			}
			
			System.out.println("Deseja continuar? S-Sim e N-Não");
			opcao =  new Scanner(System.in).next().charAt(0);
		} while (opcao == 'S' || opcao == 's');
	}
}
