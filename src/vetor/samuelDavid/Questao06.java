package vetor.samuelDavid;

//Quest�o 6

import java.util.Scanner;

public class Questao06 {

	Scanner entrada = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		int v1[] = new int[t];
		int v2[] = new int[t];
		Questao06 x = new Questao06();

		x.preencherVetor(v1);
		x.preencherVetor(v2);
		System.out.println("Vetor 1");
		x.imprimir(v1);
		System.out.println("\nVetor 2");
		x.imprimir(v2);
		int[] id = x.intercalacao(v1, v2);
		System.out.println("\nVetor id");
		x.imprimir(id);
	}

	public void preencherVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Informe o valor para a " + (i + 1)
					+ "ª posição do vetor");
			vetor[i] = entrada.nextInt();
		}
	}

	// metodo nomeado utilizando caracteres especiais.
	public int[] intercalacao(int v1[], int v2[]) {
		t = v1.length;
		int v_intercalado[] = new int[t * 2];
		int aux = 0;
		for (int i = 0; i < t; i++) {
			v_intercalado[aux] = v1[i];
			aux++;
			v_intercalado[aux] = v2[i];
			aux++;
		}
		return v_intercalado;
	}

	public void imprimir(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}