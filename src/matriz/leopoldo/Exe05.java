package matriz.leopoldo;

public class Exe05  {

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

		l = 0; c= 0;
		
		for (l = 0; l < tamanho.length; l++) {			
			for (c = 0; c < tamanho[0].length; c++) {
				if(l > c){					
					System.out.printf("%4d", tamanho[l][c]);					
				}
				else{
					System.out.printf("  * ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Exe05 Matriz = new Exe05();
		Matriz.matriz = new int[10][10];

		preencheMatriz(Matriz.matriz);
		imprimeMatriz(Matriz.matriz);
	}
}

