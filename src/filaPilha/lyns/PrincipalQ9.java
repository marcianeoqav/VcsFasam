package Questão9;

import java.util.Scanner;

public class Principal {

	private int item[];
	private int topo;

	public Principal(int tamMax) {
		this.item = new int[tamMax];
		this.topo = 0;
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int tamMax = 20;
		Principal p = new Principal(tamMax);
		System.out.println("Didige vinte valores: ");
		for (int i = 0; i < tamMax; i++) {
			try {
				p.empilhar(leia.nextInt());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		int maior = 0;
		int menor = 10000;
		int media = 0;
		for (int i = 0; i < tamMax; i++) {
			if (p.item[i] > maior) {
				maior = p.item[i];
			}
			if (p.item[i] < menor) {
				menor = p.item[i];
			}
			media = media + p.item[i];
		}
		System.out.println("A média aritmética da pilha é: " + media);
		System.out.println();
		System.out.println("O maior valor da pilha é: " + maior);
		System.out.println();
		System.out.println("O menor valor da pilha é: " + menor);

	}

	public void empilhar(int x) throws Exception {
		if (this.cheia()) {
			throw new Exception("ERRO, a pilha está cheia");
		}
		this.item[this.topo++] = x;
	}

	public boolean cheia() {
		return (this.topo == this.item.length);
	}

}
