package matriz.danielBatista;

import java.util.Scanner;

public class Exercicio02 {
	private static int Matriz[][] = new int[10][10];
	
	public static void main(String[] args) {
		
		Preencher(Matriz);
		Diagonal(Matriz);
		
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
	public static void Diagonal(int Matriz[][]){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(i == j )
					System.out.println(Matriz[i][j] + " ");
			}
		}

	}
}