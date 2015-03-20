package filaPilha.arianeErleySamuelWenderson;

// Quest�o 2

public class EstruturaFila {
	public Object item[];
	public int frente;
	public int fundo;
	
	public EstruturaFila(int tamMax){
		this.item = new Object[tamMax];
		this.frente = 0;
		this.fundo = this.frente;
	}
	
	public void enfileirar(Object x) throws Exception{
		if(this.cheia()){
			throw new Exception("ERRO, a fila est� cheia");
		}
		this.item[this.fundo] = x;
		this.fundo = (this.fundo + 1) % this.item.length;
	}
	
	public Object desenfileirar() throws Exception{
		if(this.vazia()){
			throw new Exception("ERRO, a fila est� vazia");
		}
		Object item = this.item[this.frente];
		this.frente = (this.frente + 1) % this.item.length;
		return item;
	}
	
	public boolean vazia(){
		return (this.frente == this.fundo-1);
	}
	
	public boolean cheia(){
		return (this.fundo == this.item.length);
	}
	
	public void imprimir(){
		for(int i = 0; i < this.item.length; i++){
			System.out.println(this.item[i]);
		}
	}
}
