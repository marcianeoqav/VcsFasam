//Quest�o n� 2
package matriz.wenderson;

import java.util.Scanner;

public class Matriz02DiagonalPrincipal {
	Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int[][] Matriz = new int[10][10];
		Matriz02DiagonalPrincipal mat = new Matriz02DiagonalPrincipal();
		mat.leitura(Matriz);
		mat.imprimirMatriz(Matriz);
		System.out.println("\n");		
		mat.imprimirDiagonalPrincipal(Matriz);
		
	}
	
	public void leitura(int matriz[][]){
		
		System.out.println("Informe 100 Valores para a matriz : ");
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

	
	public void imprimirDiagonalPrincipal(int matriz[][]){
		System.out.println("Diagonal Principal");
		for(int l = 0; l < 10; l++){
		System.out.print("\n");
			for(int c= 0; c < 10; c++){
				
				if( l == c ){
					System.out.print( matriz[l][c] + "\t");	
				}
				
			}
		}

	}
}