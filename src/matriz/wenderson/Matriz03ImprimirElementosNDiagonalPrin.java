//Quest�o n� 3
package matriz.wenderson;

import java.util.Scanner;

public class Matriz03ImprimirElementosNDiagonalPrin {
	Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int[][] Matriz = new int[10][10];
		Matriz03ImprimirElementosNDiagonalPrin mat = new Matriz03ImprimirElementosNDiagonalPrin();
		mat.leitura(Matriz);
		mat.imprimirMatriz(Matriz);
		System.out.println("\n");
		mat.imprimirNDiagonalPrincipal(Matriz);
		
	}
	
	public void leitura(int matriz[][]){
		
		System.out.println("Informe os 100 Valores : ");
		for(int l = 0; l < 10; l++){
			for(int c= 0; c < 10; c++){
				
				matriz[l][c] = leia.nextInt();
				
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

	public void imprimirNDiagonalPrincipal(int matriz[][]){
		System.out.println("Elementos da matriz, exeto diagonal pricipal");
		for(int l = 0; l < 10; l++){
		System.out.print("\n");
			for(int c= 0; c < 10; c++){
				
				if( l != c ){
					System.out.print( matriz[l][c] + "\t");	
				}
				
			}
		}

	}
}