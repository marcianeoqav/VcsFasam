package vetor.erley;

import java.util.Scanner;

//Quest�o 10
public class Questao10 {

	static int t;
	
	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];

		Questao10 p = new Questao10();

		p.preencher(vetor);
		System.out.println("Impressão do vetor antes da inversão:");
		p.imprimir(vetor);
		p.inverter(vetor);
		System.out.println("\nImpressão do vetor depois da inversão:");
		p.imprimir(vetor);
	}

	public void preencher(int vetor[]) {
		t = vetor.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite um valor para a posição " + i + " do vetor");
			vetor[i] = leia.nextInt();
		}
		leia.close();
	}

	private void imprimir(int[] vetor) {
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor[i] + "  ");
		}
	}

	public void inverter(int vetor[]) {
		t = vetor.length;
		int aux;
		for (int i = 0; i < t/2; i++) {
			aux = vetor[i] * vetor[i];
			vetor[i] = vetor[(t-1) - i] * vetor[(t-1) - i];
			vetor[(t-1) - i] = aux;
		}
	}
}
