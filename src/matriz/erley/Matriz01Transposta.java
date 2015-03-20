//Quest�o - 1
package matriz.erley;

import java.util.Scanner;

public class Matriz01Transposta {
	Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int[][] Matriz = new int[10][10];
		int[][] Trans = new int[10][10];
		Matriz01Transposta mat = new Matriz01Transposta();
		mat.leitura(Matriz);
		mat.geratransposta(Matriz,Trans);
		mat.imprimir(Matriz,Trans);
		
	}
	
	public void leitura(int matriz[][]){
		
		System.out.println("Informe 100 Valores para a matriz : ");
		for(int l = 0; l < 10; l++){
			for(int c= 0; c < 10; c++){
				
				matriz[l][c] = entrada.nextInt();
				
			}
		}
	
	}
	
	public int[][] geratransposta(int matriz[][],int matriztranposta[][]){
		
		for(int l = 0; l < 10; l++){
			for(int c= 0; c < 10; c++){
				matriztranposta[l][c] = matriz[c][l];
			}
		}
		return matriztranposta;
	}

	public void imprimir(int matriz[][],int matriztranposta[][]){
		System.out.println("Matriz Original");
		for(int l = 0; l < 10; l++){
		System.out.print("\n");
			for(int c= 0; c < 10; c++){

				System.out.print( matriz[l][c] + "\t");
				
			}
		}

		System.out.print("\n");

		
		System.out.println("Matriz Tranposta");
		for(int l = 0; l < 10; l++){
		System.out.print("\n");
			for(int c= 0; c < 10; c++){

				System.out.print( matriztranposta[l][c] + "\t");
				
			}
		}
	}
}


