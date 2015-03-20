package vetor.samuelDavid;
//Quest�o 9
//é a questão 8
import java.util.Scanner;

public class Questao08 {
	
	Scanner entrada = new Scanner(System.in);
	static int t;
	
	public static void main(String[] args) {
		String palavra = "Inconstitucionalidade";
		t = palavra.length();
		char vetor[] = new char[t];

		Questao08 x = new Questao08();

		x.preencher(vetor, palavra);
		x.imprimir(vetor);
	}

	public void preencher(char vetor[], String a) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			vetor[i] = a.charAt(i);
		}
	}

	public void imprimir(char vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
