//Quest�o - 7
package matriz.ariane;

import java.util.Scanner;

public class Matriz07ImprimirElementosDianogalSecundaria {
	
	Scanner entrada = new Scanner(System.in);
	static int t;
	public static void main(String[] args){
		t = 3;
		int[][] Matriz = new int[t][t];
		Matriz07ImprimirElementosDianogalSecundaria mat = new Matriz07ImprimirElementosDianogalSecundaria();
		mat.leitura(Matriz);
		mat.imprimirMatriz(Matriz);
		System.out.println("\n");
		mat.imprimirNDiagonalSecundaria(Matriz);
		
	}
	
	public void leitura(int matriz[][]){
		t = matriz.length;
		System.out.println("Informe " + t*t + " Valores para a matriz : ");
		for(int l = 0; l < t; l++){
			for(int c= 0; c < t; c++){
				
				matriz[l][c] = entrada.nextInt();
				
			}
		}
	}

	public void imprimirMatriz(int matriz[][]){
		t = matriz.length;
		System.out.println("Matriz");
		for(int l = 0; l < t; l++){
		System.out.print("\n");
			for(int c= 0; c < t; c++){
				
					System.out.print( matriz[l][c] + "\t");	
				}
				
			}
		}

	public void imprimirNDiagonalSecundaria(int matriz[][]){
		t = matriz.length;
		System.out.println("Elementos da matriz, exceto diagonal Secundaria");
		for(int l = 0; l < t; l++){
		System.out.print("\n");
			for(int c= 0; c < t; c++){
				
				if( l != t - 1- c ){
					System.out.print( matriz[l][c] + "\t");	
				}
				
			}
		}

	}
}
