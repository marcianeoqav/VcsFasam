package vetor.lyns;

/*
 9 Altere o programa anterior (8) adicionando um m�todo para a invers�o do vetor.
 */
import java.util.Scanner;

public class Questao10 {
	Scanner leia = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];

		Questao10 x = new Questao10();

		x.preencherVetor(vetor);
		System.out.println("Impressão antes da inversão:");
		x.imprimir(vetor);
		x.inverterVetor(vetor);
		System.out.println("\nImpressão depois da inversão:");
		x.imprimir(vetor);
	}

	public void preencherVetor(int vetor[]) {
		t = vetor.length;
		System.out.println("Informe o Valor :");
		for (int i = 0; i < t; i++) {
			vetor[i] = leia.nextInt();
		}
	}

	public void inverterVetor(int vetor[]) {
		t = vetor.length;
		int aux;
		for (int i = 0; i < t/2; i++) {
			aux = vetor[i] * vetor[i];
			vetor[i] = vetor[(t-1)-i] * vetor[(t-1)-i];
			vetor[(t-1)-i] = aux;
		}
	}

	public void imprimir(int vetor[]) {
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
