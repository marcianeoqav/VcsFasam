//Quest�o n� 8
package matriz.wenderson;

import java.util.Scanner;

public class Matriz08AcimaDiagonalSecundaria {
	Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int[][] Matriz = new int[10][10];
		Matriz08AcimaDiagonalSecundaria mat = new Matriz08AcimaDiagonalSecundaria();
		mat.leitura(Matriz);
		mat.imprimirMatriz(Matriz);
		System.out.println("\n");
		mat.imprimirAcimaDiagonalSecundaria(Matriz);
		
	}
	public void imprimirMatriz(int matriz[][]){
		System.out.println("Matriz");
		for(int l = 0; l < 10; l++){
		System.out.print("\n");
			for(int c= 0; c < 10; c++){
				
					System.out.print( matriz[l][c] + "\t");	
				}
		}
	}
	public void leitura(int matriz[][]){
	
		System.out.println("Informe 100 Valores  : ");
		for(int l = 0; l < 10; l++){
		for(int c= 0; c < 10; c++){
			
			matriz[l][c] = leia.nextInt();
				
			}
		}
}
	public void imprimirAcimaDiagonalSecundaria(int matriz[][]){
		System.out.println("Elementos da diagonal secundaria:");
		for(int l = 0; l < 10; l++){
		System.out.print("\n");
			for(int c= 0; c < 10; c++){
				
				if (l + c <= 8 ){
					System.out.print( matriz[l][c] + "\t");	
				
					
				}
			}
		}

	}
}
