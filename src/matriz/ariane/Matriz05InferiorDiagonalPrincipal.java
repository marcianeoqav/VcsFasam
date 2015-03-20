//Quest�o - 5
package matriz.ariane;

import java.util.Scanner;

public class Matriz05InferiorDiagonalPrincipal {
	Scanner entrada = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 3;
		int[][] Matriz = new int[3][3];
		Matriz05InferiorDiagonalPrincipal mat = new Matriz05InferiorDiagonalPrincipal();
		mat.leitura(Matriz);
		mat.imprimirMatriz(Matriz);
		System.out.println("\n");
		mat.imprimirABaixoDiagonalPrincipal(Matriz);
	}

	public void leitura(int matriz[][]) {
		t = matriz.length;
		System.out.println("Informe " + t * t + " Valores para a matriz : ");
		for (int l = 0; l < t; l++) {
			for (int c = 0; c < t; c++) {

				matriz[l][c] = entrada.nextInt();

			}
		}

	}

	public void imprimirMatriz(int matriz[][]) {
		t = matriz.length;
		System.out.println("Matriz");
		for (int l = 0; l < t; l++) {
			System.out.print("\n");
			for (int c = 0; c < t; c++) {
				System.out.print(matriz[l][c] + "\t");
			}
		}
	}

	public void imprimirABaixoDiagonalPrincipal(int matriz[][]) {
		t = matriz.length;
		System.out.println("Elementos a baixo da diagonal principal");
		for (int l = 0; l < t; l++) {
			System.out.print("\n");
			for (int c = 0; c < t; c++) {
				if (l > c) {
					System.out.print(matriz[l][c] + "\t");
				}
			}
		}
	}
}
