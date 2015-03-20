package matriz.gilmar;

//import matriz.ariane.Matriz01Transposta;
import matriz.ariane.Matriz02DiagonalPrincipal;

public class Matriz {
	static int transposta[][];
	public static void main(String args[]){
		int matriz[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		testaExerciciosAriane(matriz);
	}
	
	public static void testaExerciciosAriane(int matriz[][]){
//		Matriz01Transposta m01Ariane = new Matriz01Transposta();
//		transposta = m01Ariane.geratransposta(matriz);
//		System.out.println("Matriz Original");
//		m01Ariane.imprimir(matriz);
//		System.out.println("\nMatriz Transposta");
//		m01Ariane.imprimir(transposta);
		
		Matriz02DiagonalPrincipal m02Ariane = new Matriz02DiagonalPrincipal();
		m02Ariane.imprimirMatriz(matriz);
		m02Ariane.imprimirDiagonalPrincipal(matriz);
	}
}
