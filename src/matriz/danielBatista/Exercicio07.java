package matriz.danielBatista;

import java.util.Scanner;

public class Exercicio07 {

	private static int Matriz[][] = new int[10][10];

	public static void main(String[] args) {
		
		Preencher(Matriz);
		MatrizsemDiagonalSec(Matriz);
		
	}

	public static void Preencher(int Matriz[][]){
		Scanner leia = new Scanner(System.in);

		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.println("Digite o valor da Linha:" + i + "Coluna:" + j + ":");
				Matriz[i][j] = leia.nextInt();

			}
		}
	}
	public static void MatrizsemDiagonalSec(int Matriz[][]){
		for(int i = 0; i < 10; i++){
			System.out.println("\n");
			for(int j = 0; j < 10; j++){
				System.out.println("\t");
				if(i != 5 - 1 - j )
					System.out.println(Matriz[i][j] + " ");
			}
		}

	}
}