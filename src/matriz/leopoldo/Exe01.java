package matriz.leopoldo;

public class Exe01 {

	int matriz[][];

	public static void preencheMatriz(int[][] tamanho) {
		int aux = 0;
		for (int l = 0; l < tamanho.length; l++) {
			for (int c = 0; c < tamanho[0].length; c++) {
				tamanho[l][c] = aux;
				aux++;
			}
		}
	}

	public static void imprimeMatriz(int[][] tamanho) {
		for (int l = 0; l < tamanho.length; l++) {
			for (int c = 0; c < tamanho[0].length; c++) {
				System.out.printf("%4d", tamanho[l][c]);
			}
			System.out.println();
		}
		System.out.println("");
	}

	public static int[][] criaMatrizTransposta(int[][] tamanho) {
		int l = tamanho.length;
		int c = tamanho[0].length;

		int matriztransposta[][] = new int[c][l];

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				matriztransposta[j][i] = tamanho[i][j];
			}
		}
		return matriztransposta;
	}

	public static void main(String[] args) {

		Exe01 Matriz = new Exe01();
		Matriz.matriz = new int[10][10];

		preencheMatriz(Matriz.matriz);
		imprimeMatriz(Matriz.matriz);
		Matriz.matriz = criaMatrizTransposta(Matriz.matriz);
		imprimeMatriz(Matriz.matriz);
	}
}
