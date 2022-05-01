package projetoDeLista;

public class Aluno {

	private int rgm;
	private String nome;
	private ListaEncadeada disciplina;
	
	public Aluno(String nome, int rgm, ListaEncadeada diciplina){
		ListaEncadeada materias = new ListaEncadeada();
		materias = diciplina;
		setNome(nome); // recebe o nome de "Principal - new aluno" e armazena na estrutura 
		setRgm(rgm); // recebe o rgm de "Principal - new aluno" e armazena na estrutura 
		setDisciplina(materias);
	}
	
	public int getRgm() {
		return rgm;
	}
	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ListaEncadeada getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(ListaEncadeada materias) {
		this.disciplina = materias;
	}
	

}




