package matriz.jean;
import java.util.Scanner;


public class Exe09 {
	static Scanner in = new Scanner(System.in);

	public static void Preencher(int mat[][]) {
		int k = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				// System.out.println("Digite a posi��o: " + (i + 1) +"-"+ (j +
				// 1));
				// mat[i][j] = in.nextInt();
				mat[i][j] = k++;
			}
		}
	}

	public static void Ler(int mat[][]) {
		int k = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("Digite a posi��o: " + (i + 1) + "-"
						+ (j + 1));
				mat[i][j] = in.nextInt();
				// mat[i][j] = k++;
			}
		}
	}

	public static void Imprimir(int mat[][]) {
		System.out.print("Diagonal principal:  ");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == j) {
					System.out.print(mat[i][j] + "\t");
				}
			}
		}
	}

	public static void Imprimir1(int mat[][]) {
		System.out
				.print("\n---------------------------------------------------------------------------------------"
						+ "\nAcima da diagonal secund�ria:  ");
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				if (i == (9 - j) || (9 - i) > j) {
					System.out.print("\t");
				} else {
					System.out.print(mat[i][j] + "\t");
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("EXE8:\nAperte 1 para digitar a matriz "
				+ "\nou qualquer n�mero para usar uma pronta:");

		int op = in.nextInt();
		int mat[][] = new int[10][10];
		if (op == 1) {
			Ler(mat);
		} else {
			Preencher(mat);
		}
		Imprimir(mat);
		Imprimir1(mat);

	}
}
