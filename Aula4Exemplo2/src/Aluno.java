
public class Aluno {
	//caracteristicas atributos
	private String nome;
	private double notaUm;
	private double notaDois;

	
	//ações -> métodos
	public double getMedia() {
		return (getNotaUm() + getNotaDois()) / 2;
	}
	
	public boolean isAprovado() {
		return getMedia() > 7.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNotaUm() {
		return notaUm;
	}

	public void setNotaUm(double notaUm) {
		this.notaUm = notaUm;
	}

	public double getNotaDois() {
		if (notaDois > 10) {
			return 10;
		}
		return notaDois;
	}

	public void setNotaDois(double notaDois) {
		this.notaDois = notaDois;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", notaUm=" + notaUm + ", notaDois=" + notaDois + "]";
	}
	
	

}
