package matriz.jonas;

import java.util.Scanner;
public class Exercicio05{
	static Scanner leia = new Scanner(System.in);
	public static void Preenche(int A[][],int a, int b){
		for (int i = 0 ; i < a ; i++){
			for (int j = 0 ; j < b ; j++ ){
				System.out.println("digite o valor da linha "+(i+1)+" coluna "+(j+1)+ ":");
				int v =  leia.nextInt();
				A[i][j] = v;
			}
		}
	}
	public static void BaixoPrincipal(int M[][] , int l , int c){
		for(int i = 0; i < l ; i ++){
			for (int j = 0; j < c ; j ++){
				if(i>j){
					System.out.printf(" "+M[i][j]);
				}
			}
		}
	}
	public static void Imprime(int M[][],int l, int c){
		for(int i = 0; i < l ; i ++){
			for (int j = 0; j < c ; j ++){
				 System.out.print(M[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}
	public static void main(String args[]){
		int l = 10;
		int c = 10;
		int M[][] = new int [l][c];
		Preenche(M,l,c);
		
		System.out.println("A matriz:"+"\n");
		Imprime(M,l,c);
		System.out.println("Abaixo da Principal:"+"\n");
		BaixoPrincipal(M,l,c);
	}
}
