
package Questão4;

import java.util.Scanner;

public class Principal {
	private int itemC[];
	private int itemA[];
	private int itemB[];
	private int frenteA, frenteB, fundo;

	public static void main(String[] Args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o tamanho máximo: ");
		int tamMax = leia.nextInt();

		Principal p = new Principal(tamMax);

		for (int i = 0; i < tamMax; i++) {
			try {
				p.enfileirarA(p.itemA);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < tamMax; i++) {
			try {
				p.enfileirarB(p.itemB);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		int[] indice = p.intercalar(p.itemA, p.itemB, p.itemC);

		for(int i = 0; i < (tamMax*2); i++){
			System.out.println(indice[i]);
			
	}
		}

	public Principal(int tamMax) {
		this.itemA = new int[tamMax];
		this.frenteA = 0;
		this.fundo = 0;
		this.itemB = new int[tamMax];
		this.frenteB = 0;
		this.itemC = new int[tamMax*2];
	}

	public void enfileirarA(int[] itemA) throws Exception {
		Scanner leia = new Scanner(System.in);
		if (cheiaA()) {
			throw new Exception("ERRO, a fila está cheia");
		}
		System.out.println("Digite um valores para A: ");
		int a = leia.nextInt();
		for (int i = 0; i < 10; i++) {
			itemA[this.fundo] = a;
			this.fundo = (this.fundo = 1) % this.itemA.length;
		}
	}

	public void enfileirarB(int[] itemB) throws Exception {
		Scanner leia = new Scanner(System.in);
		if (cheiaB()) {
			throw new Exception("ERRO, a pilha está cheia");
		}
		System.out.println("Digite um valor para B: ");
		int b = leia.nextInt();
		for (int i = 0; i < 10; i++) {
			itemB[this.fundo] = b;
			this.fundo = (this.fundo + 1) % this.itemB.length;
		}
	}

	public int[] intercalar(int itemA[], int itemB[], int itemC[]) {
		if (this.itemA.length == this.itemB.length) {
			for (int i = 0; i < 10; i++) {
				itemC[this.fundo] = this.itemA[this.frenteA];
				this.frenteA = (this.frenteA + 1) % this.itemA.length;
				this.fundo++;

				itemC[this.fundo] = this.itemB[this.frenteB];
				this.frenteB = (this.frenteB + 1) % this.itemB.length;
				this.fundo++;
			}
			return itemC;
		}
		return null;
	}

	public boolean cheiaA() {
		return (this.fundo == this.itemA.length);
	}

	public boolean cheiaB() {
		return (this.fundo == this.itemB.length);
	}

}