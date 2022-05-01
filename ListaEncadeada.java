package projetoDeLista;


public class ListaEncadeada {
	
	
	private Materia primeiraMateria = null;
	private Materia ultimaMateria = null;
	
	private int totalDeElementos = 0;
	
	
	public void adicionaNoComecoMateria(String disciplina, double nota) {
		
		Materia nova = new Materia(disciplina,nota, primeiraMateria);
		nova.setDisciplina(disciplina);
		nova.setNota(nota);
		this.primeiraMateria = nova;
		
		if(this.totalDeElementos == 0) {
			this.ultimaMateria = this.primeiraMateria;
		}
		
		this.totalDeElementos++;	
	}
	
	//public void adicionaNoComecoNota(Object valor) {
			
		//	Nota nova = new Nota(valor, primeiraNota);
		//	this.primeiraNota = nova;
			
			
		//}
	
	public String toString() {
		
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		
		Materia atual = primeiraMateria;
		//Nota atual2 = primeiraMateria;
		
		
		StringBuilder builder = new StringBuilder("");
		
		for(int i = 0; i < totalDeElementos; i++) {
			builder.append("[");
			builder.append("Disciplina: ");
			builder.append(atual.getDisciplina());
			builder.append(" | ");
			builder.append("Nota: ");
			builder.append(atual.getNota());
			builder.append("]");
			
			atual = atual.getProximo();
			//atual2 = atual2.getProximo1();

		}
		builder.append("");
		
		return builder.toString();
	}
	
	public void adiciona(String disciplina, double nota) {
		
		if(this.totalDeElementos == 0) {
			adicionaNoComecoMateria(disciplina,nota);
		}
		else {
			Materia nova = new Materia(disciplina,nota, null);
			this.ultimaMateria.setProximo(nova);
			this.ultimaMateria = nova;
			this.totalDeElementos++;
		}
	}
	
	public void removeDoComeco() {
	    if(this.totalDeElementos == 0) {
	        throw new IllegalArgumentException("lista vazia");
	    }

	    this.primeiraMateria = this.primeiraMateria.getProximo();
	    this.totalDeElementos--;

	    if(this.totalDeElementos == 0) {
	        this.ultimaMateria = null;
	    }
	}
	

	/*public String getMateriadealuno() {
		return materiadealuno;
	}

	public void setMateriadealuno(String materiadealuno) {
		this.materiadealuno = materiadealuno;
	}*/

	
	
}
