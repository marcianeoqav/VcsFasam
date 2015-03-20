package matriz.kelly;

import java.util.Scanner;

public class Questao10 {
	//M�todo que realizara o preenchimento da matriz;
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


	//M�todo que ir� totalizar a matriz
	//Um m�todo para totalizar as linhas e colunas da matriz. Este m�todo 
	//receber�  a matriz[m][n],  totalizar�  cada  linha  e cada  coluna e  retornar�  a 
	//matriz[m+1][n+1] com a linha e coluna adicionais onde constam as totaliza��es;
	
	
	
}