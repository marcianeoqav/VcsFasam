package Ex8;

import java.util.Scanner;

public class Principal {
	private int item[];
	private int frente, fundo;

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int tamMax = 20;
		int aux[] = new int[tamMax];
		Principal p = new Principal(tamMax);
		for (int i = 0; i < tamMax; i++) {
			System.out.println("Digite um valor: ");
			int valor = leia.nextInt();
			try {
				p.enfileirar(valor);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				aux[i] = p.desenfileirar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < tamMax; i++) {
			for (int j = 0; j < tamMax; j++) {
				if (aux[i] < aux[j]) {
					int aux1 = aux[i];
					aux[i] = aux[j];
					aux[j] = aux1;
				}
			}
		}
		for (int k = 0; k < tamMax; k++) {
			p.item[k] = aux[k];
			System.out.println(p.item[k]);
		}
	}

	public Principal(int tamMax) {
		this.item = new int[tamMax];
		this.frente = 0;
		this.fundo = this.frente;
	}

	public void enfileirar(int x) throws Exception {
		if (this.cheia()) {
			throw new Exception("ERRO, a fila está cheia");
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
		return (this.frente == this.fundo);
	}

	public boolean cheia() {
		return (this.fundo == this.item.length);
	}

}
