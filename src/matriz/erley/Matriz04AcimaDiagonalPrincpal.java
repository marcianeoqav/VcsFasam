//Quest�o - 4
package matriz.erley;

import java.util.Scanner;

public class Matriz04AcimaDiagonalPrincpal {
	Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int[][] Matriz = new int[10][10];
		Matriz04AcimaDiagonalPrincpal mat = new Matriz04AcimaDiagonalPrincpal();
		mat.leitura(Matriz);
		mat.imprimirMatriz(Matriz);
		System.out.println("\n");
		mat.imprimirAcimaDiagonalPrincipal(Matriz);
		
	}
	
	public void leitura(int matriz[][]){
		
		System.out.println("Informe 100 Valores para a matriz : ");
		for(int l = 0; l < 10; l++){
			for(int c= 0; c < 10; c++){
				
				matriz[l][c] = entrada.nextInt();
				
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
		System.out.println("Elementos acima da diagonal principal");
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
