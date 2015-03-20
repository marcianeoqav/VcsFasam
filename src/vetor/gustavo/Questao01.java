package vetor.gustavo;

import java.util.Scanner;

public class Questao01 {

	Scanner leia = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];
		Questao01 x = new Questao01();

		x.preencherVetor(vetor);
		x.imprimirVetor(vetor);
	}

	public void preencherVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Informe o valor para a posição " + i + " do vetor");
			vetor[i] = leia.nextInt();
		}

	}

	public void imprimirVetor(int vetor[]) {
		System.out.println("Valores do vetor");
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
