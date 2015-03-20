package vetor.denny;
public class Vetor08 {

	static int t;
	
	public static void main(String [] args){
		String palavra = "INCONSTITUCIONALIDADE";
		t = palavra.length();
		char Vetor[] = new char[t];
		
		Vetor08 p = new Vetor08();
		
		p.preencher(Vetor, palavra);
		p.imprime(Vetor);
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
			System.out.print(vetor[i] + " ");
		}
	}
}

