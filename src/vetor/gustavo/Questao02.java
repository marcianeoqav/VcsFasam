package vetor.gustavo;

import java.util.Scanner;

public class Questao02 {

	Scanner leia = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];
		Questao02 x = new Questao02();
		x.preencherVetor(vetor);
		System.out.println("Imprimindo o vetor antes da ordenação:");
		x.imprimirVetor(vetor);
		x.ordenarVetor(vetor);
		System.out.println("\nImprimindo o vetor depois da ordenação:");
		x.imprimirVetor(vetor);
	}

	public void preencherVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Informe o valor para a posição " + i
					+ " do vetor");
			vetor[i] = leia.nextInt();
		}
	}

	public void imprimirVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	public void ordenarVetor(int vetor[]) {
		t = vetor.length;
		int aux;
		for (int i = 0; i < t - 1; i++) {
			for (int j = i + 1; j < t; j++) {
				if (vetor[i] > vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	}
}