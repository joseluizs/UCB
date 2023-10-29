
public class Aluno {
	//caracteristicas
	String nome;
	double notaUm;
	double notaDois;
	
	//ações -> métodos
	public double getMedia() {
		return (notaUm + notaDois) / 2;
	}
	
	public boolean isAprovado() {
		return getMedia() > 7.0;
	}

}
