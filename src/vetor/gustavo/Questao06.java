package vetor.gustavo;

// quest�o  01 da avalia��o N1.
//nao se deve utilizar caracteres acentuados na nomeacao de classe ou de metodos em java.

import java.util.Scanner;

public class Questao06 {
	Scanner leia = new Scanner(System.in);
	static int t;
	public static void main(String[] args) {
		t = 10;
		int v1[] = new int[t];
		int v2[] = new int[t];
		int v3[] = new int[t*2];
		Questao06 x = new Questao06();
		x.preencher_vetor(v1, v2);
		System.out.println("Valor do vetor v1: ");
		x.imprime(v1);
		System.out.println("\nValor do vetor v2: ");
		x.imprime(v2);
		v3 = x.intercalacao(v1, v2);
		System.out.println("\nValor do vetor v3: ");
		x.imprime(v3);
	}

	public void preencher_vetor(int v1[], int v2[]) {
		t = v1.length;
		System.out.println("Informe 10 Valores Para o 1º Vetor");
		for (int i = 0; i < t; i++) {
			v1[i] = leia.nextInt();
		}

		System.out.println("Informe 10 Valores Para o 2º Vetor");
		for (int i = 0; i < t; i++) {
			v2[i] = leia.nextInt();
		}
	}

	public int[] intercalacao(int v1[], int v2[]) {
		t = v1.length;
		int v_intercalado[] = new int[t*2];
		int j = 0;
		for (int i = 0; i < t; i++) {
			v_intercalado[j] = v1[i];
			j++;
			v_intercalado[j] = v2[i];
			j++;
		}
		return v_intercalado;
	}
	
	public void imprime(int vetor[]){
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
