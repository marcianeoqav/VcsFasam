package filaPilha.jean;

/**
 * 
 * @author JeanPaulo
 */
public class Pilha {

	private Object item[];
	private int topo;

	public Pilha(int maxTerm) {
		this.item = new Object[maxTerm];
		this.topo = 0;
	}

	public void empilha(Object x) {
		try {
			this.item[this.topo++] = x;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: a pilha esta cheia");
		}
	}

	public Object desempilha() {
		try {
			return this.item[--this.topo];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: a pilha esta vazia");
			return "";
		}
	}

	public void topo() {
		System.out.println("Topo da Pilha: " + this.item[this.topo]);
	}

	public boolean vazia() {
		return this.topo == 0;
	}

	public int tamanho() {
		return this.topo;
	}
	
	public Object[] getItem() {
		return item;
	}

}
