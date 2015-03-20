package matriz.kelly;

import java.util.Scanner;

public class Questao01 {
	/**
	 * Escreva uma fun��o (em java ou portugal) q receba como par�metro uma
	 * matriz num�rica de tamanho 5x5,l� esta matriz, gera e retorna sua
	 * transposta.
	 */
	/** 1.1 A implementa��o dever� conter apenas uma classe java, com os seguintes m�todos: 
	 * 1.1.1 Um m�todo para preencher os dados da matriz;
	 * 1.1.2 Um m�todo para gerar a transposta da matriz. Este m�todo dever� receber uma matriz[n][n] e devolver como retorno outra 
	 * matriz[n][n] que represente a transposta da matriz recebida como par�metro;
	 * 1.1.3 Um m�todo para imprimir as matrizes; 
	 * 1.1.4 Um m�todo main para: 
	 * 1.1.4.1 instanciar a matriz com dimens�es 10 x 10; 
	 * 1.1.4.2 pass�-la como par�metro para o m�todo de preenchimento dos dados;
	 * 1.1.4.3 pass�-la como par�metro para o m�todo gerador da transposta;
	 * 1.1.4.4 chamar a impress�o da matriz original; 
	 * 1.1.4.5 chmar a impress�o da matriz transposta.
	 */
	
	//1.1.1-M�todo q preenche os dados da matriz.
	private static void preencherMatriz (int matAux[][], int maxI, int maxJ){
		Scanner ler = new Scanner (System.in);//insere dados do teclado
		int i,j;//vari�veis.
		
		for (i=0; i<maxI; i++){
			System.out.printf("Informe os elementos %da. linha:\n", (i + 1));
			for (j=0; j<maxJ; j++){
				System.out.printf("m[%d][%d] = ", i, j); 
				matAux[i][j] = ler.nextInt(); 
			}
		}
	}
	
	//1.1.2-M�todo q vai gerar uma matriz Transposta- que represente uma matriz recebida no par�metro anterior
	private static void gerarMatrizTransposta (int matAux[][], int maxI, int maxJ ){
		int i,j;
		for (j=0; j<maxJ; j++){
			for (i=0; i<maxI; i++){
			//	System.out.printf("%d ", matAux[j][i]);
			}
		}
	}
	
	//1.1.3- M�todo para imprimir as matriz e a matriz Transposta
	private static void exibirMatrizes(int matAux [][], int maxI, int maxJ){
		int i,j;
		System.out.printf("\n");
		System.out.printf("Matriz: \n");
		System.out.printf("\n");
		for (i=0; i<maxI; i++){
			System.out.printf("%da. linha: ", (i + 1));
			for (j = 0; j < maxJ; j++) {
					System.out.printf("%d ", matAux[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
		System.out.printf("Matriz Transposta: \n");
		System.out.printf("\n");
		for (j=0; j<maxJ; j++){
			System.out.printf("%da. linha: ", (j + 1));
			for (i=0; i<maxI; i++){
					System.out.printf("%d ", matAux[i][j]);
			}
			System.out.printf("\n");
		}
	}
	
	//1.1.4 M�todo main
	public static void main (String args[]){
		
		
		int dI,dJ;//Estabelece o tamanho da matriz a ser preenchida
		dI =3;
		dJ= 3;
		int matriz [][]  = new int [dI][dJ];
		
		Questao01.preencherMatriz(matriz,dI,dJ);
		
		Questao01.gerarMatrizTransposta(matriz, dI, dJ);
		
		Questao01.exibirMatrizes(matriz,dI,dJ);
	}
}




	
	
	
	