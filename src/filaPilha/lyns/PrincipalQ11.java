package Questão11;

public class Principal {

	private String item[];
	private int topo;
	private String itemm[];
	private int frente, fundo;

	public static void main(String[] args) {
		int tamMax = 20;

		Principal p = new Principal(tamMax);

		try {
			p.empilhar("P");
			p.empilhar("E");
			p.empilhar("R");
			p.empilhar("T");
			p.empilhar("O");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 2; i++) {
			try {
				p.itemm[i] = p.desempilhar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			p.empilhar("S");
			p.empilhar("O");
			p.empilhar("L");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int i = 2; i < 5; i++) {
			try {
				p.itemm[i] = p.desempilhar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 5; i++){
			System.out.println(p.itemm[i]);
		}
		
	}

	public Principal(int tamMax) {
		this.item = new String[tamMax];
		this.topo = 0;
		this.frente = 0;
		this.fundo = this.frente;
		this.itemm = new String[5];
	}

	public void empilhar(String x) throws Exception {
		if (this.cheia()) {
			throw new Exception("ERRO, a pilha está cheia");
		} else {
			this.item[topo++] = x;
		}
	}

	public String desempilhar() throws Exception {
		if (this.vazia()) {
			throw new Exception("ERRO, a pilha está vazia");
		} else {
			return this.item[--this.topo];
		}
	}

	public void enfileirar(String x) throws Exception {
		if (this.cheia()) {
			throw new Exception("ERRO, a fila está cheia");
		}
		this.itemm[this.fundo] = x;
		this.fundo = (this.fundo + 1) % this.item.length;
	}

	public boolean vazia() {
		return (this.topo == 0);
	}

	public boolean cheia() {
		return (this.topo == this.item.length);
	}

	public boolean cheiaa() {
		return (this.fundo % this.item.length == this.frente);
	}

}
