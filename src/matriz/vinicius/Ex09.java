package matriz.vinicius;

public class Ex09 {
	int matriz[][];

	public static void main(String[] args) {

		Ex09 objeto = new Ex09();
		objeto.matriz = new int[10][10];
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeDiagSecInf(objeto.matriz);
	}

	public static void preenche(int[][] m) {

		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[0].length; j++) {

				m[i][j] = (int) (Math.random() * 100);
			}
		}
	}

	public static void imprime(int[][] m) {

		for (int a = 0; a < m.length; a++) {

			for (int b = 0; b < m[0].length; b++) {

				System.out.print(m[a][b] + "\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n\n");
	}

	public static void imprimeDiagSecInf(int[][] m) {

		System.out.print("Elementos abaixo da diagonal secund�ria:\n");
		for (int a = 0; a < m.length; a++) {

			for (int b = 0; b < m[0].length; b++) {

				if (b > (m.length - a) - 1) {

					System.out.print(m[a][b] + "\t");
				} else {
					System.out.print("  \t");
				}
			}
			System.out.print("\n");
			System.out.print("\n\n");
		}
	}
}