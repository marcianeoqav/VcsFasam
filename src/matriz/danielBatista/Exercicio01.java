package matriz.danielBatista;

import java.util.Scanner;

public class Exercicio01 {

	private static int Matriz[][] = new int[10][10];
	private static int Matriztrans[][] = new int[10][10];

	public static void main(String[] args) {
		Preencher(Matriz);
		Transposta(Matriz, Matriztrans);
		Imprimi(Matriz, Matriztrans);
	}

	public static void Preencher(int Matriz[][]){
		Scanner leia = new Scanner(System.in);

		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.println("Digite o valor da Linha:" +i+ "Coluna:" +j+ ":");
				Matriz[i][j] = leia.nextInt();

			}
		}
		leia.close();
	}

	public static void Transposta(int Matriz[][], int Matriztras[][]){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(j > i )  
					Matriztras[j][i] = Matriz[i][j];  
				else if(j == i)  
					Matriztras[i][j] = Matriz[i][j];  
				else  
					Matriztras[j][i] = Matriz[i][j]; 
			}
		}

	}
	public static void Imprimi(int Matriz[][], int Matriztras[][]){
		System.out.println("Matriz:");
		for(int i = 0; i < 10; i++){
			System.out.println("\n");
			for(int j = 0; j < 10; j++){
				System.out.print(Matriz[i][j] + "\t");
			}
		}
		System.out.println("\n");
		System.out.println("Matriz Transposta:");
		for(int i = 0; i < 10; i++){
			System.out.println("\n");
			for(int j = 0; j < 10; j++){
				System.out.print(Matriztras[i][j] + "\t");
			}
		}
	}
}