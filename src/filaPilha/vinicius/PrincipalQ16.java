package Ex16;

import java.util.Scanner;

import Questão15.PrincipalAux;

public class Principal {
	Scanner leia = new Scanner(System.in);

	static Principal EP = new Principal(10);
	static Principal NUMERO = new Principal(10);
	static Principal NOTA = new Principal(10);
	static PrincipalAux ALUNO = new PrincipalAux(10);

	public static void main(String[] args) throws Exception {

		EP.esquolha(EP.item);
	}

	public void esquolha(int[] ep) throws Exception {

		int escolha = 0;
		int x = 0;
		String a;
		int n = 0;
		int numero = 0;
		boolean ncadastrado = false;
		int[] cont = new int[10];
		int[] media = new int[10];
		int numeroMEdia = 0;
		boolean snota = false;
		boolean excluido = false;

		System.out.println("Digite 1 - Cadastrar aluno, 2 - Cadastrar nota, 3 - Calcular media de um aluno, 4 - Listar nome de alunos sem nota, 5 - Excluir aluno, 6 - Excluir nota, 7 - Sair ");
		escolha = leia.nextInt();

		while (escolha != 7) {
			if (escolha == 1) {
				System.out.println("Informe o nome do aluno");
				a = leia.next();
				ALUNO.empilhar(a);
				NUMERO.enfileirar(x);
				x++;

				System.out.println("Digite 1 - Cadastrar aluno, 2 - Cadastrar nota, 3 - Calcular media de um aluno, 4 - Listar nome de alunos sem nota, 5 - Excluir aluno, 6 - Excluir nota, 7 - Sair ");
				escolha = leia.nextInt();
			}

			if (escolha == 2) {

				System.out.println("Digite o numero do aluno dono da nota que será cadastrada = ");
				numero = leia.nextInt();
				 
					if (numero == NUMERO.item[numero]) {
			
						System.out.println("Digite a nota = ");
						n = entrada.nextInt();
						NOTA.item[numero] += n;
						cont[numero] += 1;
					} else {
						cadastrado = true;
					}
				

				if (cadastrado == true) {

					System.out.println("Erro! - Aluno não cadastrado! Escolha novamente a opçaõ de Cadastrar nota e informe o numero de um aluno já cadastrado");
				}
				System.out.println("Digite 1 - Cadastrar aluno, 2 - Cadastrar nota, 3 - Calcular media de um aluno, 4 - Listar nome de alunos sem nota, 5 - Excluir aluno, 6 - Excluir nota, 7 - Sair ");
				escolha = leia.nextInt();
			}

			if (escolha == 3) {

				System.out.println("Digite o numero do aluno desejado parar gerar a media do mesmo = ");
				numeroMEdia = leia.nextInt();
				media[numeroMEdia] = NOTA.item[numeroMEdia] / cont[numeroMEdia];

				System.out.println("A Media do Aluno"
						+ ALUNO.item1[numeroMEdia] + "  é  "
						+ media[numeroMEdia]);

				System.out.println("Digite 1 - Cadastrar aluno, 2 - Cadastrar nota, 3 - Calcular media de um aluno, 4 - Listar nome de alunos sem nota, 5 - Excluir aluno, 6 - Excluir nota, 7 - Sair ");
				escolha = entrada.nextInt();

			}

			if (escolha == 4) {

				System.out.println("Lista dos Alunos sem nota ");
				for (int i = 0; i < NOTA.item.length; i++) {
					if (NOTA.item[i] == 0) {
						System.out.println(ALUNO.item1[i]);
					} else {
						snota = true;
					}
				}
				if (snota == true) {
					System.out.println("Todos os alunos possui nota");
				}

				System.out.println("Digite 1 - Cadastrar aluno, 2 - Cadastrar nota, 3 - Calcular media de um aluno, 4 - Listar nome de alunos sem nota, 5 - Excluir aluno, 6 - Excluir nota, 7 - Sair ");
				escolha = leia.nextInt();

			}

			if (escolha == 5) {
				for (int i = 0; i < NOTA.item.length; i++) {
					if (NOTA.item[i] == 0) {
						if (ALUNO.topo1 == i) {
							ALUNO.desempilhar();
							System.out.println("Aluno excluido com sucesso!");
						} else {
							excluido = true;
						}
					}
				}
				if (excluido == true) {
					System.out.println("Aluno não pode ser excluido, já que o mesmo pussui notas! ");
				}
				System.out.println("Digite 1 - Cadastrar aluno, 2 - Cadastrar nota, 3 - Calcular media de um aluno, 4 - Listar nome de alunos sem nota, 5 - Excluir aluno, 6 - Excluir nota, 7 - Sair ");
				escolha = leia.nextInt();

			}

			if (escolha == 6) {
				for (int i = 0; i < NOTA.item.length; i++) {
					if (NOTA.item[i] != 0) {
						System.out.println("Nota excluida com sucesso! ");
					}
				}
				System.out.println("Digite 1 - Cadastrar aluno, 2 - Cadastrar nota, 3 - Calcular media de um aluno, 4 - Listar nome de alunos sem nota, 5 - Excluir aluno, 6 - Excluir nota, 7 - Sair ");
				escolha = leia.nextInt();

			}
			
			if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4
					&& escolha != 5 && escolha != 6 && escolha != 7) {
				System.out.println("ERRO- Escolha invalida, por favor faça uma nova escolha");

				System.out.println("Digite 1 - Cadastrar aluno, 2 - Cadastrar nota, 3 - Calcular media de um aluno, 4 - Listar nome de alunos sem nota, 5 - Excluir aluno, 6 - Excluir nota, 7 - Sair ");
				escolha = entrada.nextInt();
			}
		}

		if (escolha == 7) {
			System.out.println("Obrigado!");
		
		}

	}

	public int item[];
	public int frente;
	public int fundo;

	public Principal(int tamMax) {
		this.item = new int[tamMax];
		this.frente = 0;
		this.fundo = this.frente;
	}

	public void enfileirar(int x) throws Exception {
		if (this.cheia()) {
			throw new Exception("Erro, a fila está cheia!");
		}
		this.item[this.fundo] = x;
		this.fundo = (this.fundo + 1) % this.item.length;
	}

	public int desenfileirar() throws Exception {
		if (this.vazia()) {
			throw new Exception("ERRO, a fila está vazia");
		}
		int item = this.item[this.frente];
		this.frente = (this.frente + 1) % this.item.length;
		return item;
	}

	public boolean vazia() {
		return (this.frente == this.fundo - 1);
	}

	public boolean cheia() {
		return (this.fundo == this.item.length);
	}

	public void imprimir() {
		for (int i = 0; i < this.item.length; i++) {
			System.out.println(this.item[i]);
		}
	}
}