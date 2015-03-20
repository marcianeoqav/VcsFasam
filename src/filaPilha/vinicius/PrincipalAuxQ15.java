package Ex15;

public class PrincipalAux {
	public String item1[];
	public int topo1;

	public PrincipalAux(int tamMax) {
		this.item1 = new String[tamMax];
		this.topo1 = 0;
	}

	public void empilhar(String x) throws Exception {
		if (this.cheia()) {
			throw new Exception("Erro, a pilha está cheia!");
		} else {
			this.item1[topo1++] = x;
		}
	}

	public Object desempilhar() throws Exception {
		if (this.vazia()) {
			throw new Exception("Erro, a pilha está vazia!");
		} else {
			return this.item1[--this.topo1];
		}
	}

	public boolean vazia() {
		return (this.topo1 == 0);
	}

	public boolean cheia() {
		return (this.topo1 == this.item1.length);
	}

	public int tamanho() {
		return this.topo1; // mostrar topo.
	}

	public void imprimir() {
		for (int i = 0; i < this.item1.length; i++) {
			System.out.println(this.item1[i]); 
		}
		for (int i = 0; i < this.item1.length; i++) {
			if (i == (this.item1.length - 1)) {
				System.out.println(i); 
			}
		}
	}

}
