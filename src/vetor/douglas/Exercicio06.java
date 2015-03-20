package vetor.douglas;

import java.util.*;

public class Exercicio06 {

	static int t;
	static Scanner leia;

	public static int[] intercalacao(int vetorA[], int vetorB[]) {
		t = vetorA.length;
		int tc = t * 2;
		int[] vetorC = new int[tc];
		int j = 0;
		for (int i = 0; i < t; i++) {
			vetorC[j] = vetorA[i];
			j++;
			vetorC[j] = vetorB[i];
			j++;
		}
		return vetorC;
	}

	public static void preencherVetor(int vetor[], Scanner leia) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor.");
			vetor[i] = leia.nextInt();
		}
	}

	public static void imprime(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		System.out.println("Digite a quantidade de elementos do VetorA");
		t = leia.nextInt();
		int[] vetorA = new int[t];
		System.out.println("Digite a quantidade de elementos do VetorB");
		t = leia.nextInt();
		int[] vetorB = new int[t];
		preencherVetor(vetorA, leia);
		preencherVetor(vetorB, leia);
		System.out.println("Elementos do vetor A:");
		imprime(vetorA);
		System.out.println("\nElementos do vetor B:");
		imprime(vetorB);
		int[] vetorC = intercalacao(vetorA, vetorB);
		System.out.println("\nElementos do vetor C:");
		imprime(vetorC);
	}
}
