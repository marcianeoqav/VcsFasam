package vetor.erley;

//Quest�o 2
import java.util.Scanner;

public class Questao02 {

	Scanner leia = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];
		Questao02 x = new Questao02();
		x.preencher(vetor);
		System.out.println("Impressão do vetor antes da ordenação:");
		x.imprime(vetor);
		x.ordenar(vetor);
		System.out.println("\nImpressão do vetor depois da ordenação:");
		x.imprime(vetor);
	}

	public void preencher(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Digite um valor para a posição: " + i + " do vetor");
			vetor[i] = leia.nextInt();
		}
	}

	public void imprime(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	public void ordenar(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t-1; i++) {
			for (int j = i+1; j < t; j++) {
				if (vetor[i] > vetor[j]) {
					int aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	}
}
