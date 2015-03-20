package Ex7;

import java.util.Scanner;

public class Principal {

	private int item[];
	private int topo;

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int tamMax = 20;
		int aux[] = new int[tamMax];
		Principal p = new Principal(tamMax);
		for (int i = 0; i < tamMax; i++) {

			System.out.println("Digite um valor: ");
			int valor = leia.nextInt();
			try {
				p.empilhar(valor);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				aux[i] = p.desempilhar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for(int i = 0; i < tamMax; i++){
			for(int j = 0; j < tamMax; j++){
				if(aux[i] < aux[j]){
					int aux1 = aux[i];
					aux[i] = aux[j];
					aux[j] = aux1;
				}
			}	
		}
		
		for(int k = 0; k < tamMax; k++){
			p.item[k] = aux[k];
			System.out.println(p.item[k]);
		}
	}

	public Principal(int tamMax) {
		this.item = new int[tamMax];
		this.topo = 0;
	}

	public void empilhar(int x) throws Exception {
		if (this.cheia()) {
			throw new Exception("ERRO, a pilha está cheia");
		} else {
			this.item[this.topo++] = x;
		}
	}

	public int desempilhar() throws Exception {
		if (this.vazia()) {
			throw new Exception("ERRO, a pilha está vazia");
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

	public void imprimir() {
		for (int i = 0; i < this.item.length; i++) {
			System.out.println(this.item[i]); 
		}

	}

}
