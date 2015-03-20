package PilhaFila;

// Quetão 1

public class EstruturaPilha {

	public Object item[];
	public int topo;

	public EstruturaPilha(int tamMax) {
		this.item = new Object[tamMax];
		this.topo = 0;
	}

	public void empilhar(Object x) throws Exception {
		if (this.cheia()) {
			throw new Exception("ERRO, a pilha está cheia");
		} else {
			this.item[topo++] = x;
		}
	}

	public Object desempilhar() throws Exception {
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

