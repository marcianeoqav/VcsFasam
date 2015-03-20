package matriz.danielBatista;

import java.util.Scanner;

public class Exercicio08 {


	private static int Matriz[][] = new int[10][10];
	private static int Matrizaux[][] = new int[10][10];

	public static void main(String[] args) {
		Preencher(Matriz);
		CimaDiagonalSec(Matriz, Matrizaux);
		Imprimi(Matriz, Matrizaux);
	}

	public static void Preencher(int Matriz[][]){
		Scanner leia = new Scanner(System.in);

		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.println("Digite o valor da Linha:" +i+ "Coluna:" +j+ ":");
				Matriz[i][j] = leia.nextInt();

			}
		}
	}

	public static void CimaDiagonalSec(int Matriz[][], int Matrizaux[][]){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(i + j <= 10 - 2)  
					Matrizaux[i][j] = Matriz[i][j];  
				
			}
		}

	}
	public static void Imprimi(int Matriz[][], int Matrizaux[][]){
		System.out.println("Matriz:");
		for(int i = 0; i < 10; i++){
			System.out.println("\n");
			for(int j = 0; j < 10; j++){
				System.out.print(Matriz[i][j] + "\t");
			}
		}
		System.out.println("\n");
		System.out.println("Elementos acima da Diagonal Secundaria:");
		for(int i = 0; i < 10; i++){
			System.out.println("\n");
			for(int j = 0; j < 10; j++){
				System.out.print(Matrizaux[i][j] + "\t");
			}
		}
	}
}


