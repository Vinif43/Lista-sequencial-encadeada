package projetoDeLista;

public class Materia {
	
	private String disciplina;
	private double nota;
	private Materia proximo;
	

	public Materia(String disciplina,double nota2, Materia proximo) {
		this.disciplina = disciplina;
		this.nota = nota2;
		this.proximo = proximo;
		
	}
	
	public Materia getProximo() {
		return proximo;
	}
	public void setProximo(Materia proximo) {
		this.proximo = proximo;
	}

	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
