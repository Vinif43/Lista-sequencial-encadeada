package projetoDeLista;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		
		
		//printf("\n1- Jogar");
		//printf("\n2- Ranking");
		//printf("\n3- Créditos");
		//printf("\n4- Sair\n");
		Aluno alunoNovo = new Aluno(null, 0, null);
		listaSequencial lista = new listaSequencial();
		String disciplina;
		
		
		int opcao = 1;
		
		do {
			System.out.println("\t---------------------");
			System.out.println("\t| Bem vindo ao menu |");
			System.out.println("\t---------------------");
			System.out.println("\t[1] Inserir Aluno");
			System.out.println("\t[2] Buscar Aluno");
			System.out.println("\t[3] Exibir todos os alunos");
			System.out.println("\t[4] Excluir Aluno");
			System.out.println("\t[Aleatorio] Sair");
			Scanner teclado = new Scanner (System.in);
			int escolha = teclado.nextInt();
			
			switch(escolha) {
			case 1:
				System.out.println("Digite o nome do aluno ");
				String nome = teclado.next();
				
				System.out.println("Digite o rgm do aluno ");
				int rgm = teclado.nextInt();
				
				ListaEncadeada listaDisciplina = new ListaEncadeada();
				String escolhaoutra = "";
				while(!escolhaoutra.equals("2")){
					
					System.out.println("Digite a disciplina ");
					disciplina = teclado.next();
					System.out.println("Digite a nota: ");
					double nota = teclado.nextDouble();
					
					listaDisciplina.adicionaNoComecoMateria(disciplina, nota);
					
					System.out.println("Deseja inserir outra materia? Sim [1] Não [2]");
					escolhaoutra = teclado.next();
					
					
				}
				
				alunoNovo = new Aluno(nome, rgm, listaDisciplina);
				lista.inserirAluno(alunoNovo);
				
				System.out.println("Digite qualquer coisa para continuar ");
				String qualquel = teclado.next();
				break;
			
			case 2:
				System.out.println("Digite o rgm do aluno que deseja buscar: ");
				int chave = teclado.nextInt();
				lista.buscaRGM(chave);
				
				System.out.println("Digite qualquer coisa para continuar ");
				qualquel = teclado.next();
				break;
			case 3:
				lista.mostraAlunos();
				System.out.println("Digite qualquer coisa para continuar ");
				qualquel = teclado.next();
				break;
			case 4:
				System.out.println("Digite o rgm do aluno que deseja excluir: ");
				chave = teclado.nextInt();
				lista.excluirAluno(chave);
				System.out.println("Digite qualquer coisa para continuar ");
				 qualquel = teclado.next();
				break;
			default:
				opcao = 2;
			
			}
		}while(opcao == 1);	
	}
}
