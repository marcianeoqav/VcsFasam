package matriz.kelly;

import java.util.Scanner;

public class Questao05 {
	/** Implementar na linguagem de programa��o Java, uma classe que leia uma matriz de inteiros 
		de dimens�es 10 x 10 e imprima os elementos da diagonal principal desta matriz;
 			5.1  A  implementa��o   dever�   conter  apenas   uma  classe  java   com  os   seguintes m�todos:
 
 			5.2  Um m�todo para o preenchimento dos dados da matriz. Este m�todo recebe a 
			matriz como par�metro, mas n�o retorna nada;
			
 			5.3  Um m�todo para a impress�o de todos elementos abaixo da diagonal principal. 
			Este m�todo recebe a matriz como par�metro, mas n�o retorna nada;

 			5.4  Um m�todo main, para coordenar os trabalhos da classe, chamando os servi�os 
			disponibilizados pelos dois m�todos descritos anteriormente;*/

	//matAux(Matriz a ser preenchida) maxI(Valor max de coluna) maxJ(Valor max de linha)
	//5.2
	
	private static void preencherMatriz(int [][] matAux,int  maxI,int maxJ){
		Scanner ler = new Scanner (System.in);
		int i,j; //Linhas e colunas recebem valores inteiros
		
		for (i=0; i<maxI; i++){
			System.out.printf("Informe os elementos %da. linha:\n", (i + 1));
			
			for (j=0; j<maxJ; j++){
				System.out.printf("m[%d][%d] = ", i, j);
				matAux[i][j] = ler.nextInt();
			}
			System.out.printf("/n");
		}	
	}
	
	//M�todo que vai realizar a impress�o dos elementos que est�o abaixo da diagonal principal.
		//5.3
		private static void exibirAbaixoDaDiagonalPrincipalMatriz(int matAux [][], int maxI, int maxJ){
			int i,j;
			System.out.printf("\n");
			System.out.printf("Elementos da matriz que est�o abaixo da diagonal principal s�o: \n");
			for (i=0; i<maxI; i++){
				for (j = 0; j < maxJ; j++) {
					if (i>j){
						System.out.printf("%d ", matAux[i][j]);
					}
				}
			}
		}
	//5.4 - M�todo main.(Execu��o)
		public static void main (String args[]){
			
			
			int dI,dJ;//Estabelece o tamanho da matriz a ser preenchida
			dI =3;//Quantidade de colunas
			dJ= 3;//Quantidade de linhas
			int matriz [][]  = new int [dI][dJ];
			
			Questao05.preencherMatriz(matriz,dI,dJ);
					
			Questao05.exibirAbaixoDaDiagonalPrincipalMatriz(matriz,dI,dJ);
		}
}
