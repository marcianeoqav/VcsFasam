package vetor.danielBatista;

import java.util.Scanner;

public class Exercicio01 {
	static int t;
	public static void main(String args[]) {
		t = 10;
		int vetor[] = new int[t];
		preencheVetor(vetor);
		imprimeVetor(vetor);
	}

	public static void preencheVetor(int vetor[]) {
		Scanner leia = new Scanner(System.in);
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Digite o valor do vetor na posição " + i);
			vetor[i] = leia.nextInt();
		}
		leia.close();
	}

	public static void imprimeVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i]+ " ");
		}
	}
}