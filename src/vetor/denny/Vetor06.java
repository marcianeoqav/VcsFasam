package vetor.denny;

import java.util.Scanner;

public class Vetor06 {
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetorA[] = new int[t];
		int vetorB[] = new int[t];
		int vetorC[] = new int[t * 2];
		Vetor06 prin = new Vetor06();
		prin.preencher(vetorA, vetorB);
		System.out.println("Vetor A: ");
		prin.imprime(vetorA);
		System.out.println("\nVetor B: ");
		prin.imprime(vetorB);
		vetorC = prin.intercalacao(vetorA, vetorB, vetorC);
		System.out.println("\nVetor C: ");
		prin.imprime(vetorC);
	}

	public void preencher(int vetorA[], int vetorB[]) {
		t = vetorA.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite um valor para a posição: " + i
					+ " do vetorA");
			vetorA[i] = leia.nextInt();
			System.out.println("Digite um valor para a posição: " + i
					+ " do vetorB");
			vetorB[i] = leia.nextInt();
		}
		leia.close();
	}

	public int[] intercalacao(int vetorA[], int vetorB[], int vetorC[]) {
		t = vetorA.length;
		int aux = 0;
		for (int i = 0; i < t; i++) {
			vetorC[aux] = vetorA[i];
			aux++;
			vetorC[aux] = vetorB[i];
			aux++;
		}
		return vetorC;
	}

	public void imprime(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
