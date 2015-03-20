package vetor.samuelDavid;

import java.util.Scanner;
//Quest�o 3
public class Questao03 {
	
	Scanner entrada = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];

		Questao03 x = new Questao03();

		x.preencherVetor(vetor);
		System.out.println("Vetor original");
		x.imprimirVetor(vetor);
		x.ordenarVetor(vetor);
		System.out.println("\nVetor ordenado");
		x.imprimirVetor(vetor);
	}

	public void preencherVetor(int vetor[]) {
		t = vetor.length;
		System.out.println("Informe " + t + " Valores");
		for (int i = 0; i < t; i++) {
			vetor[i] = entrada.nextInt();
		}
	}

	public void imprimirVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	public void ordenarVetor(int vetor[]) {
		int t = vetor.length;
		int aux;

		for (int i = 0; i < t - 1; i++) {
			for (int j = i + 1; j < t; j++) {
				if (vetor[i] < vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	}

}
