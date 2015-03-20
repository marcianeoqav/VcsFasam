package Ex10;

import java.util.Scanner;

public class Principal {

	private int item[];
	private int frente, fundo;

	public Principal(int tamMax) {

		this.item = new int[tamMax];
		this.frente = 0;
		this.fundo = this.frente;
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int tamMax = 20;
		Principal p = new Principal(tamMax);
		System.out.println("Didige vinte valores: ");
		for (int i = 0; i < tamMax; i++) {
			try {
				p.enfileirar(leia.nextInt());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int maior = 0;
		int menor = 1000;
		int media = 0;
		for (int i = 0; i < tamMax; i++) {
			if (p.item[i] > maior) {
				maior = p.item[i];
			}
		}
		
		for (int i = 0; i < tamMax; i++) {
			if (p.item[i] < menor) {
				menor = p.item[i];
			}
		}
		
		for (int i = 0; i < tamMax; i++) {
			media = media + p.item[i];
		}

		System.out.println("A média aritmética da pilha é: " + media);
		System.out.println();
		System.out.println("O maior valor da fila é: " + maior);
		System.out.println();
		System.out.println("O menor valor da fila é: " + menor);

	}

	public void enfileirar(int x) throws Exception {

		if (this.cheia()) {
			throw new Exception("Erro, a fila está cheia!!");
		}
		this.item[this.fundo] = x;
		this.fundo = (this.fundo + 1) % this.item.length;
	}

	public boolean cheia() {
		return (this.fundo == this.item.length);
	}

}