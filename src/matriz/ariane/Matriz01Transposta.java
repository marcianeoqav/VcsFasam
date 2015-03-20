//Quest�o - 1
package matriz.ariane;

import java.util.Scanner;

public class Matriz01Transposta {

	Scanner entrada = new Scanner(System.in);
	static int t; //ordem da matriz
	public static void main(String[] args) {
		t = 3;
		int[][] matriz = new int[t][t];
		int[][] transposta = new int[t][t];
		Matriz01Transposta mat = new Matriz01Transposta();
		mat.leitura(matriz);
		transposta = mat.geratransposta(matriz);
		System.out.println("Matriz original");
		mat.imprimir(matriz);
		System.out.println("\nMatriz Transposta");
		mat.imprimir(transposta);
	}

	public void leitura(int matriz[][]) {
		t = matriz.length; //funciona desta forma porque a matriz é quadrada.
		System.out.println("Informe " + t*t + " Valores para a matriz : ");
		for (int l = 0; l < t; l++) {
			for (int c = 0; c < t; c++) {
				matriz[l][c] = entrada.nextInt();
			}
		}
	}

	public int[][] geratransposta(int matriz[][]) {
		t = matriz.length;
		int transposta[][] = new int[t][t];
		for (int l = 0; l < t; l++) {
			for (int c = 0; c < t; c++) {
				transposta[l][c] = matriz[c][l];
			}
		}
		return transposta;
	}

	public void imprimir(int matriz[][]) {
		t = matriz.length;
		for (int l = 0; l < t; l++) {
			System.out.print("\n");
			for (int c = 0; c < t; c++) {
				System.out.print(matriz[l][c] + "\t");
			}
		}
	}
	
}
