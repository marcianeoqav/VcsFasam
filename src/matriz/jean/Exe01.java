package matriz.jean;
import java.util.Scanner;


public class Exe01 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("EXE1:\nAperte 1 para digitar a matriz "
				+ "\nou qualquer n�mero para usar uma pronta:");

		int op = in.nextInt();
		int mat[][] = new int[10][10];
		if (op == 1) {
			Ler(mat);
		} else {
			Preencher(mat);
		}
		System.out.println("Matriz original:");
		Imprimir(mat);
		int trans[][] = Transp(mat);
		System.out.println("\n----------------------------------------------------------------------------"
				+ "\nMatriz transposta:");
		Imprimir(trans);

	}
	
	public static void Preencher(int mat[][]){
		int k = 0;
		for(int i = 0; i < 10;i++){
			for(int j = 0; j < 10; j++){
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
	
	public static int[][] Transp(int mat[][]){
		int trans[][] = new int[10][10];
		for(int i = 0; i < 10;i++){
			for(int j = 0; j < 10; j++){
				trans[j][i] = mat[i][j];
			}
		}
		return trans;
	}
	
	public static void Imprimir(int mat[][]){
		for(int i = 0; i < 10;i++){
			System.out.println();
			for(int j = 0; j < 10; j++){
				System.out.print(mat[i][j]+"\t");
			}
		}
	}
}
