//Quest�o - 6

package matriz.lyns;

import java.util.Scanner;

public class Exer06 {
	Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int[][] Matriz = new int[10][10];
		Exer06 mat = new Exer06();
		mat.leitura(Matriz);
		mat.imprimirMatriz(Matriz);
		System.out.println("\n");
		mat.imprimirDiagonalSecundaria(Matriz);
		
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

	public void imprimirDiagonalSecundaria(int matriz[][]){
		System.out.println("Diagonal Secundaria");
		for(int l = 0; l < 10; l++){
		System.out.print("\n");
			for(int c= 0; c < 10; c++){
				
				   if(l == 10 - 1 - c){
					System.out.print( matriz[l][c] + "\t");	
				}
				
			}
		}

	}
}
