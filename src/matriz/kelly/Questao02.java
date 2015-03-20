package matriz.kelly;

import java.util.Scanner;
/**Implementar na linguagem de programa��o Java, uma classe que leia uma matriz de inteiros 
de dimens�es 10 x 10 e imprima os elementos da diagonal principal desta matriz;
 2.1  A  implementa��o   dever�   conter  apenas   uma  classe  java   com  os   seguintes 
m�todos:
 2.2  Um m�todo para o preenchimento dos dados da matriz. Este m�todo recebe a 
matriz como par�metro, mas n�o retorna nada;
 2.3  Um m�todo para a impress�o dos elementos da diagonal principal. Este m�todo 
recebe a matriz como par�metro, mas n�o retorna nada;
 2.4  Um m�todo main, para coordenar os trabalhos da classe, chamando os servi�os 
disponibilizados pelos dois m�todos descritos anteriormente;*/
public class Questao02 { //Declara��o da Classe
	
	//M�todo que vai fazer o preenchimento da matriz 10x10.
	
	private static void preencherMatriz(int  matAux [][], int maxI, int maxJ){ //matAux(Matriz a ser preenchida) maxI(Valor max de coluna) maxJ(Valor max de linha)
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
	
	//M�todo que vai realizar a impress�o da diagonal principal.
	private static void exibirDiagPrincMatriz(int matAux [][], int maxI, int maxJ){
		int i,j;
		System.out.printf("\n");
		System.out.printf("Diagonal principal: \n");
		for (i=0; i<maxI; i++){
			for (j = 0; j < maxJ; j++) {
				if (i==j){
					System.out.printf("%d ", matAux[i][j]);
				}
			}
		}
	}
	
//M�todo main que executa o preenchimento da matriz e a impress�o da diagonal principal.
	public static void main (String args[]){
		
		
		int dI,dJ;//Estabelece o tamanho da matriz a ser preenchida
		dI =3;
		dJ= 3;
		int matriz [][]  = new int [dI][dJ];
		
		Questao02.preencherMatriz(matriz,dI,dJ);
				
		Questao02.exibirDiagPrincMatriz(matriz,dI,dJ);
	}
}



