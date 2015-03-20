//Quest�o n� 4
package matriz.wenderson;

import java.util.Scanner;

public class Matriz04AcimaDiagonalPrincpal {
	Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int[][] Matriz = new int[10][10];
		Matriz04AcimaDiagonalPrincpal mat = new Matriz04AcimaDiagonalPrincpal();
		mat.leitura(Matriz);
		mat.imprimirMatriz(Matriz);
		System.out.println("\n");
		mat.imprimirAcimaDiagonalPrincipal(Matriz);
		
	}
	
	public void leitura(int matriz[][]){
		
		System.out.println("Informe 100 Valores  : ");
		for(int j = 0; j < 10; j++){
			for(int c= 0; c < 10; c++){
				
				matriz[j][c] = leia.nextInt();
				
			}
		}
	
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

	public void imprimirAcimaDiagonalPrincipal(int matriz[][]){
		System.out.println("Elementos da diagonal principal :");
		for(int l = 0; l < 10; l++){
		System.out.print("\n");
			for(int c= 0; c < 10; c++){
				
				if( l < c ){
					System.out.print( matriz[l][c] + "\t");	
				}
				
			}
		}

	}
}
