package vetor.gustavo;

import java.util.Scanner;

public class Questao05 {
	static Scanner entrada = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];
		int x = 0;
		Questao05 q05 = new Questao05();
		q05.preencherVetor(vetor);
		q05.imprime(vetor);
		System.out.print("\n1Infome o Valor desejado para a pesquisa no vetor");
		x = entrada.nextInt();
		int indice = q05.pesquisa(vetor, x);
		if (indice != -1) {
			System.out.println("valor pesquisado " + x + " está na posição " + indice + " do vetor");
		} else {
			System.out.println("valor pesquisado " + x + " não foi encontrado no vetor");
		}
	}

	public void preencherVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Informe o valor para a posição " + i
					+ " do vetor");
			vetor[i] = entrada.nextInt();
		}
	}

	public int pesquisa(int vetor[], int x) {
		t = vetor.length;
		int posicao = -1;
		for (int i = 0; i < t; i++){
			if (vetor[i] == x) {
				posicao = i;
				return posicao;
			}
		}
		return posicao;
	}

	public void imprime(int vetor[]) {
		t = vetor.length;
		System.out.println("Valores do vetor:");
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}