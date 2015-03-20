package vetor.danielBatista;

import java.util.Scanner;

public class Exercicio07 {

	static int t;

	public static void main(String[] args) {
		t = 20;
		int[] vetorA = new int[t];
		int[] vetorB = new int[t / 2];
		int[] vetorC = new int[t / 2];

		preencherVetor(vetorA);
		System.out.println("Valores do vetor A:");
		imprimeVetor(vetorA);
		preencherVetoresBC(vetorA, vetorB, vetorC);
		System.out.println("\nValores Vetor B");
		imprimeVetor(vetorB);
		System.out.println("\nValores Vetor C");
		imprimeVetor(vetorC);
	}

	public static void preencherVetor(int[] vetor) {
		t = vetor.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			if (i % 2 == 0) {
				System.out.println("Digite um valor par para a " + (i + 1)
						+ "ª posição do vetor A");
			} else {
				System.out.println("Digite um valor impar para a " + (i + 1)
						+ "ª posição do vetor A");
			}
			vetor[i] = leia.nextInt();
		}
		leia.close();
	}

	public static void preencherVetoresBC(int[] vetorA, int[] vetorB,
			int[] vetorC) {
		int iVetorB = 0;
		int iVetorC = 0;
		int aux;
		for (int i = 0; i < vetorA.length; i++) {
			aux = vetorA[i];
			if ((aux % 2) == 0) {
				vetorB[iVetorB] = vetorA[i]/2;
				iVetorB++;
			} else {
				vetorC[iVetorC] = (vetorA[i] * 3);
				iVetorC++;
			}
		}
	}

	public static void imprimeVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
