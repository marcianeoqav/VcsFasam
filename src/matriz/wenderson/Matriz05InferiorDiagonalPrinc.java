//Quest�o n� 5
package matriz.wenderson;

import java.util.Scanner;

public class Matriz05InferiorDiagonalPrinc {
	Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int[][] Matriz = new int[10][10];
		Matriz05InferiorDiagonalPrinc mat = new Matriz05InferiorDiagonalPrinc();
		mat.leitura(Matriz);
		mat.imprimirMatriz(Matriz);
		System.out.println("\n");
		mat.imprimirABaixoDiagonalPrincipal(Matriz);		
	}
	
	public void leitura(int matriz[][]){
		
		System.out.println("Informe 100 Valores para preencher a matriz : ");
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

	public void imprimirABaixoDiagonalPrincipal(int matriz[][]){
		System.out.println("Elementos a baixo da diagonal principal");
		for(int l = 0; l < 10; l++){
		System.out.print("\n");
			for(int c= 0; c < 10; c++){
				
				if( l > c ){
					System.out.print( matriz[l][c] + "\t");	
				}
				
			}
		}

	}
}


