package matriz.kelly;

import java.util.Scanner;

/**Implementar na linguagem de programa��o Java, uma classe que leia uma matriz de inteiros 
de dimens�es 10 x 10 e imprima os elementos da diagonal principal desta matriz;
 3.1  A  implementa��o   dever�   conter  apenas   uma  classe  java   com  os   seguintes 
m�todos:
 3.2  Um m�todo para o preenchimento dos dados da matriz. Este m�todo recebe a 
matriz como par�metro, mas n�o retorna nada;
 3.3  Um   m�todo   para   a   impress�o   de   todos   elementos,   exceto   os   da   diagonal 
principal. Este m�todo recebe a matriz como par�metro, mas n�o retorna nada;
 3.4  Um m�todo main, para coordenar os trabalhos da classe, chamando os servi�os 
disponibilizados pelos dois m�todos descritos anteriormente.
*/

public class Questao03 {
	
	//matAux(Matriz a ser preenchida) maxI(Valor max de coluna) maxJ(Valor max de linha)
	
	//3.2
	private static void preencherMatriz(int  matAux [][], int maxI, int maxJ){ 		
		Scanner ler = new Scanner (System.in);
		int i,j;
		for (i=0; i<maxI; i++){
			System.out.printf("Informe os elementos %da. linha:\n", (i + 1));
			for (j=0; j<maxJ; j++){
				System.out.printf("m[%d][%d] = ", i, j);
				matAux[i][j] = ler.nextInt();
			}
						
			System.out.printf("\n");
		}
				
	}
	
	//M�todo que vai realizar a impress�o dos elementos da matriz exceto os da diagonal principal.
	//3.3
	private static void exibirSemDiagonalPrincipalMatriz(int matAux [][], int maxI, int maxJ){
		int i,j;
		System.out.printf("\n");
		System.out.printf("Elementos da matriz,exceto os da diagonal principal s�o: \n");
		for (i=0; i<maxI; i++){
			for (j = 0; j < maxJ; j++) {
				if (i!=j){
					System.out.printf("%d ", matAux[i][j]);
				}
			}
		}
	}
	
//M�todo main que executa o preenchimento da matriz e a impress�o da diagonal principal.
	//3.4
	public static void main (String args[]){
		
		
		int dI,dJ;//Estabelece o tamanho da matriz a ser preenchida
		dI =3;
		dJ= 3;
		int matriz [][]  = new int [dI][dJ];
		
		Questao03.preencherMatriz(matriz,dI,dJ);
				
		Questao03.exibirSemDiagonalPrincipalMatriz(matriz,dI,dJ);
	}
}
