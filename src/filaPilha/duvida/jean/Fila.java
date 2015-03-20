package filaPilha.duvida.jean;

/**
 * 
 * @author JeanPaulo
 */
public class Fila {

	private Object item[];
	private int frente, tras;

	public Fila(int maxTerm) {
		this.item = new Object[maxTerm];
		this.frente = 0;
		this.tras = this.frente;
	}

	public void enfileira(Object x) {
		try {
			this.item[this.tras] = x;
			this.tras = (this.tras + 1) % this.item.length;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: a lista est� cheia.");
		}
	}

	public Object desenfileira() {
		try {
			Object item = this.item[this.frente];
			this.frente = (this.frente + 1) % this.item.length;
			return item;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: a lista est� vazia.");
			return "";
		}
	}

	public boolean vazia() {
		return (this.frente == tras);
	}
	
	public Object[] getItem() {
		return item;
	}	
}
