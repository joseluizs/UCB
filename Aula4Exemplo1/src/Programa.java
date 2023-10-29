
public class Programa {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		a.nome = "José Luiz";
		a.notaUm = 10;
		a.notaDois = 6;
		
		System.out.println(a.getMedia());
		System.out.println(a.isAprovado());
	}

}
