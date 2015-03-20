package vetor.denny;
public class Vetor09 {
	static int t;
	public static void main(String [] args){
		String palavra = "INCONSTITUCIONALIDADE";
		t = palavra.length();
		char vetor[] = new char[t];
		
		Vetor09 p = new Vetor09();
		
		p.preencher(vetor, palavra);
		System.out.println("Impressão do vetor");
		p.imprime(vetor);
		p.inverter(vetor);
		System.out.println("\nImpressão do vetor invertido");
		p.imprime(vetor);
	}
	public void preencher(char vetor[], String letra){
		t = vetor.length;
		for(int i = 0; i < t; i++){
			vetor[i] = letra.charAt(i);
		}
	}
	public void imprime(char vetor[]){
		t = vetor.length;
		for(int i = 0; i < t; i++){
			System.out.print(vetor[i]);
		}
	}
	
	public void inverter(char vetor[]){
		char aux;
		t = vetor.length-1;
		for(int i = 0; i < t/2; i++){
			aux = vetor[t-i];
			vetor[t-i] = vetor[i];
			vetor[i] = aux;			
		}
	}
}
