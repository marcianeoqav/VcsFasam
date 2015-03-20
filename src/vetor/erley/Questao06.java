package vetor.erley;

import java.util.Scanner;

//Quest�o 06
public class Questao06 {

	Scanner leia;
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetorA[] = new int[t];
		int vetorB[] = new int[t];
		int vetorC[] = new int[t * 2];

		Questao06 prin = new Questao06();
		System.out.println("Preenchendo o vetor A:");
		prin.preencher(vetorA);
		System.out.println("Preenchendo o vetor B:");
		prin.preencher(vetorB);
		System.out.println("Valores do vetor A:");
		prin.imprimir(vetorA);
		System.out.println("\nValores do vetor B:");
		prin.imprimir(vetorB);
		prin.intercalacao(vetorA, vetorB, vetorC);
		System.out.println("Valores do vetor C:");
		prin.imprimir(vetorC);
	}

	public void preencher(int vetor[]) {
		t = vetor.length;
		leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite um valor para a posição " + i
					+ " do vetor");
			vetor[i] = leia.nextInt();
		}
	}

	public void intercalacao(int vetorA[], int vetorB[], int vetorC[]) {
		int aux = 0;
		t = vetorA.length;
		for (int i = 0; i < t; i++) {
			vetorC[aux] = vetorA[i];
			aux++;
			vetorC[aux] = vetorB[i];
			aux++;
		}
	}

	public void imprimir(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

}
