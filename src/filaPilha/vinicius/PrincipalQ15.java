package Questão15;

import java.util.Scanner;

public class Principal {
	Scanner leia = new Scanner(System.in);

	static Principal EP = new Principal(10);

	public static void main(String[] args) throws Exception {

		EP.esquolha(EP.item);
	}

	public void esquolha(int[] ep) throws Exception {

		int escolha = 0;
		int x = 0;
		System.out.println("Digite 1 - Cadastrar numero, 2 - Mostrar números pares entre o primeiro e o último número cadastrado, 3 - Excluir numero ou 4 - Sair");
		escolha = leia.nextInt();

		while (escolha != 4) {
			if (escolha == 1) {

				System.out.println("Infome o numero que deseja ser cadastrado = ");
				x = leia.nextInt();
				EP.empilhar(x);

				System.out.println("Digite 1 - Cadastrar numero, 2 - Mostrar números pares entre o primeiro e o último número cadastrado, 3 - Excluir numero ou 4 - Sair");
				escolha = leia.nextInt();
			}

			if (escolha == 2) {

				for (int i = 0; i < EP.item.length; i++) {
					if ((ep[i] % 2) == 0) {
						System.out.println(ep[i]);
					}
				}
				System.out
						.println("Digite 1 - Cadastrar numero, 2 - Mostrar números pares entre o primeiro e o último número cadastrado, 3 - Excluir numero ou 4 - Sair");
				escolha = leia.nextInt();
			}

			if (escolha == 3) {

				EP.desempilhar();
				System.out.println("Digite 1 - Cadastrar numero, 2 - Mostrar números pares entre o primeiro e o último número cadastrado, 3 - Excluir numero ou 4 - Sair");
				escolha = leia.nextInt();

			}

			if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4) {

				System.out.println("ERRO- Escolha invalida, por favor faça uma nova escolha");
				System.out.println("Digite 1 - Cadastrar numero, 2 - Mostrar números pares entre o primeiro e o último número cadastrado, 3 - Excluir numero ou 4 - Sair");
				escolha = leia.nextInt();
			}
		}

		if (escolha == 4) {
			System.out.println("Obrigado !");
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
			throw new Exception("Erro, a pilha está cheia!");
		} else {
			this.item[topo++] = x;
		}
	}

	public Object desempilhar() throws Exception {
		if (this.vazia()) {
			throw new Exception("Erro, a pilha está vazia!");
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
		return this.topo; 
	}

	public void imprimir() {
		for (int i = 0; i < this.item.length; i++) {
			System.out.println(this.item[i]);
		}
		for (int i = 0; i < this.item.length; i++) {
			if (i == (this.item.length - 1)) {
				System.out.println(i); 
			}
		}
	}
}