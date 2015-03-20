package vetor.lucasMartinelly;

import java.util.Scanner;

/**
 * 
 * @author Lucas Martinelly
 */
public class Questao03 {

	static int t;

	

	public static void preencher(int vetor[]) {
		t = vetor.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor:");
			vetor[i] = leia.nextInt();
		}
		leia.close();
	}

	public static void ordenar(int vetor[]) {
		t = vetor.length;
		int aux;
		for (int i = 0; i < t-1; i++) {
			for (int j = i+1; j < t; j++) {
				if (vetor[i] < vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	}

	public static void imprimir(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	public static void main(String[] args) {
		t = 10;
		int v[] = new int[10];
		preencher(v);
		ordenar(v);
		imprimir(v);
	}
}
