package vetor.erley;

//Quest�o 9
public class Questao09 {
	static int t;
	public static void main(String[] args) {
		String palavra = "INCONSTITUCIONALIDADE";
		t = palavra.length();
		char vetor[] = new char[t];
		Questao09 p = new Questao09();
		p.preencher(vetor, palavra);
		System.out.println("Vetor original:");
		p.imprime(vetor);
		p.inverter(vetor);
		System.out.println("\nVetor invertido:");
		p.imprime(vetor);
	}

	public void preencher(char vetor[], String letra) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			vetor[i] = letra.charAt(i);
		}
	}

	public void imprime(char vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i]);
		}
	}

	public void inverter(char vetor[]) {
		t = vetor.length;
		char aux;
		for (int i = 0; i < t/2; i++) {
			aux = vetor[(t-1) - i];
			vetor[(t-1) - i] = vetor[i];
			vetor[i] = aux;
		}
	}
}
