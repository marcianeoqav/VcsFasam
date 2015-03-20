/* Escreva uma fun��o em Java que receba como par�metro dois vetores num�ricos A e B e sua respectiva quantidade de elementos.
 * Essa fun��o dever� intercalar esses vetores A e B, formando outro vetor C, conforme especificado abaixo. Retorne C.
 * C[1] = A[1]
 * C[2] = B[1]
 * C[3] = A[2]
 * C[4] = B[2] E ASSIM POR DIANTE.
 * 
 * Apenas uma classe, tr�s m�todos: Preenchimento dos vetores, Intercala��o (retorna vetor intercalado), main.*/

package vetor.cyro;

public class Ex06 {
	public static int v1[] = new int[5];
	public static int v2[] = new int[5];
	public static int auxiliar[][] = new int[2][5];
	public static int v3[] = new int[10];

	public static void main(String[] args) {
		Ex06 objeto = new Ex06();
		objeto.preenche(v1, v2);
		objeto.imprime(v1);
		objeto.imprime(v2);
		objeto.intercala(v1, v2);
		objeto.imprime(v3);

	}

	public void preenche(int v1[], int v2[]) {
		auxiliar[0] = v1;
		auxiliar[1] = v2;

		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 5; i++) {
				auxiliar[j][i] = j + i;
			}
		}

	}

	public int[] intercala(int v1[], int v2[]) {
		int aux = 0;
		// int res[] = new int[v1.length + v2.length];
		for (int p = 0; p < v3.length; p++) {
			if ((p == 0) || (p % 2 == 0)) {
				v3[p] = v1[aux];
			} else {
				v3[p] = v2[aux];
				aux++;
			}
		}
		return v3;
	}

	public void imprime(int x[]) {
		for (int z = 0; z < x.length; z++) {
			System.out.print(x[z] + "\t");
		}
		System.out.print("\n\n");
	}

}
