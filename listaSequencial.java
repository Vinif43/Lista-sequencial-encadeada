package projetoDeLista;


public class listaSequencial {
	

	Aluno [] estudante = new Aluno[60];
	int tamanho = 0;
	
	
	
	
	public boolean estaVazia() {
		return (tamanho == 0);
	}
	
	
	public boolean estaCheia() {
		return (tamanho == estudante.length);
	}
	
	
	public void mostraAlunos() {
		
		if ( estaVazia() )
			System.out.println("Nao ha nomes na lista");
		else {
			System.out.println("\t-------------------------");	
			System.out.println("\t| A lista de alunos: |");
			System.out.println("\t-------------------------");	
			for (int i = 0; i < tamanho; i++) {
				System.out.println("\tRGM:\t" + estudante[i].getRgm());
				System.out.println("\tNome:\t" + estudante[i].getNome());
				System.out.println("\t\t" + estudante[i].getDisciplina() + "\n");
				
			}
		}
	}

	
	void inserirAluno(Aluno novoAluno ) {
		
		if ( estaCheia()) {
			System.out.println("A lista esta cheia");
		
		}else{
			
			this.estudante[tamanho] = novoAluno;
			tamanho++;
			System.out.println("Feito!\n\n");
		}
	}
	
	
	
		
	
	public void excluirAluno(int chave) {
		for(int i = 0; i < tamanho; i++) {
 			if(estudante[i].getRgm() == chave) {
 				
 			int posicao = i;
 				for( i = posicao;i<tamanho; i++) {
			this.estudante[i]=this.estudante[i+1];
 				}
		}
		}
		tamanho--;
		System.out.println("aluno excluido!");

	}

 	public void buscaRGM(int chave) {

 		for(int i = 0; i < tamanho; i++) {
 			if(estudante[i].getRgm() == chave) {
 				System.out.println("Nome:\t" + estudante[i].getNome() + "\n");
 				System.out.println("\t\t" + estudante[i].getDisciplina() + "\n");
 				return;
 			}
 		}
 		System.out.println("Aluno não existe\n");
 	}
	
	
	@SuppressWarnings("unused")
	private void moveParaDireita(int posicao) {
		for( int i=tamanho+1 ;i>posicao; i--){
			estudante[i] = estudante[i - 1]; //quando o programa executa essa linha, sobrescreve duas vezes os ultimos dados que foram inseridos, ao inves de abrir uma nova posição para poder aloca-los
		}
	}

	@SuppressWarnings("unused")
	private void moveParaEsquerda(int posicao){
		for( int i = posicao ;i<tamanho; i++){
			estudante[i] = estudante[i + 1];
		}
	}
	
}
