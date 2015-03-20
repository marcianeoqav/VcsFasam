package vetor.gustavo;

import java.util.Scanner;

public class Questao10 {
	Scanner leia = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];
		Questao10 x = new Questao10();
		System.out.println("Preenchendo o vetor");
		x.preencherVetor(vetor);
		System.out.println("\nVetor antes da inversão");
		x.imprimir(vetor);
		System.out.println("\nInvertendo o vetor");
		x.inverteVetor(vetor);
		System.out.println("\nVetor depois da inversão");
		x.imprimir(vetor);
	}

	public void preencherVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Informe o valor para a posição " + i + " do vetor");
			vetor[i] = leia.nextInt();
		}
	}

	public void inverteVetor(int vetor[]) {
		t = vetor.length;
		int aux;
		for(int i = 0; i < t/2; i++){
			aux = vetor[i] * vetor[i];
			vetor[i] = vetor[(t-1)-i] * vetor[(t-1)-i];
			vetor[(t-1)-i] = aux;
		}
	}

	public void imprimir(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
