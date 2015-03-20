//Quest�o - 9
package matriz.samuelDavid;

import java.util.Scanner;

public class Matriz09InferiorDiagonalSec {
	Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int[][] Matriz = new int[10][10];
		Matriz09InferiorDiagonalSec mat = new Matriz09InferiorDiagonalSec();
		mat.leitura(Matriz);
		mat.imprimirMatriz(Matriz);
		System.out.println("\n");
		mat.imprimirABaixoDiagonalSecundaria(Matriz);
		
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

	public void imprimirABaixoDiagonalSecundaria(int matriz[][]){
		System.out.println("Elementos a baixo da diagonal secundaria");
		for(int l = 0; l < 10; l++){
		System.out.print("\n");
			for(int c= 0; c < 10; c++){
				
				if (l + c >= 10 ){
					System.out.print( matriz[l][c] + "\t");	
				
					
				}
			}
		}

	}
}


