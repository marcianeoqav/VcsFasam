package Quest�o15;

import java.util.Scanner;

public class Principal {
	Scanner entrada = new Scanner(System.in);

	static Principal EP = new Principal(10);

	public static void main(String[] args) throws Exception {

		EP.esquolha(EP.item);
	}

	public void esquolha(int[] ep) throws Exception {

		int escolha = 0;
		int x = 0;
		System.out
				.println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
		escolha = entrada.nextInt();

		while (escolha != 4) {
			if (escolha == 1) {
				System.out
						.println("Infome o numero que deseja ser cadastrado = ");
				x = entrada.nextInt();
				EP.empilhar(x);

				System.out
						.println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
				escolha = entrada.nextInt();
			}

			if (escolha == 2) {
				for (int i = 0; i < EP.item.length; i++) {
					if ((ep[i] % 2) == 0) {
						System.out.println(ep[i]);
					}
				}
				System.out
						.println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
				escolha = entrada.nextInt();
			}

			if (escolha == 3) {
				EP.desempilhar();
				System.out
						.println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
				escolha = entrada.nextInt();

			}

			if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4) {
				System.out
						.println("ERRO- Escolha invalida, por favor fa�a uma nova escolha");
				System.out
						.println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
				escolha = entrada.nextInt();
			}
		}

		if (escolha == 4) {
			System.out.println("OBRIGADO, volte sempre !");
		}

	}

	public int item[];
	public int topo;

	public Principal(int tamMax) {
		this.item = new int[tamMax];
		this.topo = 0;
	}

	public void empilhar(int x) throws Exception {
		if (this.cheia()) {
			throw new Exception("ERRO, a pilha est� cheia");
		} else {
			this.item[topo++] = x;
		}
	}

	public Object desempilhar() throws Exception {
		if (this.vazia()) {
			throw new Exception("ERRO, a pilha est� vazia");
		} else {
			return this.item[--this.topo];
		}
	}

	public boolean vazia() {
		return (this.topo == 0);
	}

	public boolean cheia() {
		return (this.topo == this.item.length);
	}

	public int tamanho() {
		return this.topo; // mostrar topo.
	}

	public void imprimir() {
		for (int i = 0; i < this.item.length; i++) {
			System.out.println(this.item[i]); // imprimir elementos da pilha.
		}
		for (int i = 0; i < this.item.length; i++) {
			if (i == (this.item.length - 1)) {
				System.out.println(i); // quantidade de elementos na pilha.
			}
		}
	}
}

//
// public int item[];
// public int topo;
//
// public Principal(int tamMax) {
// this.item = new int[tamMax];
// this.topo = 0;
// }
//
// public static void main(String[] args) throws Exception {
// Scanner leia = new Scanner(System.in);
// int tamMax = 20;
// Principal p = new Principal(tamMax);
//
// System.out
// .println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
//
// int escolha = leia.nextInt();
//
// while (escolha != 4) {
// if (escolha == 1) {
// System.out.println("Digite um valor: ");
// p.empilhar(leia.nextInt());
// System.out
// .println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
// escolha = leia.nextInt();
// }
// if (escolha == 2) {
// for (int i = 0; i < p.item.length; i++) {
// if ((p.item[i] % 2) == 0) {
// System.out.println(p.item[i]);
// }
//
// }
// System.out
// .println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
// escolha = leia.nextInt();
// }
// }
// if( escolha == 3){
// p.desempilhar();
// System.out
// .println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
// escolha = leia.nextInt();
//
// }
// if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4) {
// System.out.println("Op��o inv�lida, escolha outra op��o.");
//
// }
//
// if (escolha == 4) {
// System.out.println("Obrigado, volte sempre");
// }
//
// }
//
// public void empilhar(int x) throws Exception {
// if (this.cheia()) {
// throw new Exception("ERRO, a pilha est� cheia");
// } else {
// this.item[topo++] = x;
// }
// }
//
// public int desempilhar() throws Exception {
// if (this.vazia()) {
// throw new Exception("ERRO, a pilha est� vazia");
// } else {
// return this.item[--this.topo];
// }
// }
//
// public boolean vazia() {
// return (this.topo == 0);
// }
//
// public boolean cheia() {
// return (this.topo == this.item.length);
// }
// }
