package vetor.erley;

//Quest�o 8
public class Questao08 {
	static int t;
	public static void main(String[] args) {
		String palavra = "INCONSTITUCIONALIDADE";
		t = palavra.length();
		char vetor[] = new char[t];

		Questao08 p = new Questao08();

		p.preencher(vetor, palavra);
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
}
