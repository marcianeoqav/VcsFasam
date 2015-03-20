package vetor.danielBatista;

import java.util.Scanner;

public class Exercicio05 {

	static Scanner leia = new Scanner(System.in);
	static int t;

	public static void main(String args[]) {
		t = 10;
		int vetor[] = new int[t];
		int x = 10;
		preencherVetor(vetor);
		System.out.println("Digite o Numero para Pesquisa");
		x = leia.nextInt();
		int resultado = pesquisar(vetor, x);
		if (resultado > 0) {
			System.out
					.println("O valor " + x + " está na posição " + resultado);
		} else {
			System.out.println("O valor " + x + " não foi encontrado ");
		}
	}

	public static void preencherVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Digite o numero para a posição" + i
					+ " do vetor");
			vetor[i] = leia.nextInt();
		}
	}

	public static int pesquisar(int vetor[], int x) {
		int aux = -1;
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			if (vetor[i] == x) {
				aux = i;
			}
		}
		return aux;
	}
}
