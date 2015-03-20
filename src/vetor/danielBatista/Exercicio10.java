package vetor.danielBatista;

import java.util.Scanner;

public class Exercicio10 {

	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];
		preencheVetor(vetor);
		System.out.println("Vetor original: ");
		imprimeVetor(vetor);
		inverteVetor(vetor);
		System.out.println("\nVetor invertido: ");
		imprimeVetor(vetor);
	}

	public static void preencheVetor(int vetor[]) {
		t = vetor.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite o valor para o vetor na posição: " + i);
			vetor[i] = leia.nextInt();
		}
		leia.close();
	}

	public static void inverteVetor(int vetor[]) {
		int aux;
		t = vetor.length;
		for (int i = 0; i < t/2; i++) {
			aux = vetor[i];
			vetor[i] = vetor[(t-1)-i]*vetor[(t-1)-i];
			vetor[(t-1)-i] = aux * aux;
		}
	}

	public static void imprimeVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
