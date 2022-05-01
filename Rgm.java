package projetoDeLista;

public class Rgm {
	
	private String aluno;
	
	public Rgm (String i) {
		this.aluno = i;
	}
	
	
	public String getAluno() {
		return aluno;
	}
	
	@Override
	public boolean equals(Object obj) {
		Rgm outro = (Rgm) obj;
		return outro.getAluno().equals(this.aluno);
	}
	
	@Override
	public String toString() {
		return aluno;
	}
	
}
