package matriz.leopoldo;

public class Exe09 {

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
		int l, c;
		for (l = 0; l < tamanho.length; l++) {
			for (c = 0; c < tamanho[0].length; c++) {
				System.out.printf("%4d", tamanho[l][c]);
			}
			System.out.println();
		}
		System.out.println("\n");

			
		for (l = 0; l < tamanho.length; l++) {	
			for (c = 0; c < tamanho[0].length; c++) {
				if (c <= ((tamanho.length - l) - 1)) {
					System.out.printf("   *");
				}
				else {
					System.out.printf("%4d", tamanho[l][c]);
				}				
			}
			System.out.println();
		}
	}	

	public static void main(String[] args) {

		Exe09 Matriz = new Exe09();
		Matriz.matriz = new int[10][10];

		preencheMatriz(Matriz.matriz);
		imprimeMatriz(Matriz.matriz);
	}
}

