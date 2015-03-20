package matriz.vinicius;

public class Ex03 {

	int matriz[][];

	public static void main(String[] args) {

		Ex03 objeto = new Ex03();
		objeto.matriz = new int[10][10];
		imprime(objeto.matriz);
		imprimeSemDP(objeto.matriz);
		imprimeSemDP2(objeto.matriz);
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

	public static void imprimeSemDP(int[][] m) {

		System.out.print("Elementos da diagonal principal em branco:\n");
		for (int a = 0; a < m.length; a++) {
			for (int b = 0; b < m[0].length; b++) {
				if (a == b) {
					System.out.print("  \t");
				} else {
					System.out.print(m[a][b] + "\t");
				}
				System.out.print("\n");
			}
			System.out.print("\n\n");
		}
	}

	public static void imprimeSemDP2(int[][] m) {
		System.out.print("Elementos da diagonal principal exclu�dos:\n");
		for (int a = 0; a < m.length; a++) {
			for (int b = 0; b < m[0].length; b++) {
				if (a == b) {

				} else {
					System.out.print(m[a][b] + "\t");
				}
				System.out.print("\n");
			}
			System.out.print("\n\n");
		}
	}
}