
public class Programa {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		a.setNome("José Luiz");
		a.setNotaUm(10);
		a.setNotaDois(6);
		
		System.out.println(a.getMedia());
		System.out.println(a.isAprovado());
		System.out.println(a.getNome());
	}

}
