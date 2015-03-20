package matriz.danillo;
//	Exerc�cio 3 da lista de Matrizes para N2.
// 	Implementar em Java uma classe que leia uma matriz 10x10 de inteiros e 
// 	imprima os elementos da diagonal principal da matriz. 
// 	A) Apenas uma classe, com os m�todos abaixo:
// 		1) M�todo para preencher a matriz. Recebe a matriz como par�metro, mas n�o retorna nada.
// 		2) Um m�todo para a impress�o de todos os elementos, EXCETO os da diagonal principal. 
// 		   Esse m�todo recebe a matriz como par�metro, mas n�o retorna nada. 
//  	3) M�todo main para coordenar a classe e invocar os m�todos supracitados.
//Neste exerc�cio, coloquei um m�todo adicional para imprimir a matriz original, 
//a fim de facilitar a confer�ncia. H� dois m�todos de impress�o da matriz 
//sem os elementos da diagonal principal: 
//O primeiro substitui os elementos da DP por espa�os em branco, gerando uma matriz com as mesmas dimens�es;
//O segundo elimina a diagonal principal toda, resultando em uma matriz com uma coluna a menos. 

public class Exercicio03 
{
	int matriz[][];
	
	public static void main(String[] args) 
	{
		Exercicio03 objeto = new Exercicio03();	
		objeto.matriz = new int[10][10];	
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeSemDP(objeto.matriz);
		imprimeSemDP2(objeto.matriz);
	}
	
	public static void preenche(int[][] m)	
	{	
				
		for (int i = 0; i < m.length; i++)	
		{
			for (int j = 0; j < m[0].length; j++)	
			{
				m[i][j] = (int) (Math.random() * 100);
			}
		}
	}	
	
	public static void imprime(int[][] m)	
	{										
		for (int a = 0; a < m.length; a++)	
		{
			for (int b = 0; b < m[0].length; b++)	
			{
				System.out.print(m[a][b] + "\t");	
			}
			System.out.print("\n");	
		}
		System.out.print("\n\n");	
	}  
	
	public static void imprimeSemDP(int[][] m)
	{	
		System.out.print("Elementos da diagonal principal em branco:\n");
		for (int a = 0; a < m.length; a++)		
		{
			for (int b = 0; b < m[0].length; b++)
			{
				if (a == b)	
				{
					System.out.print("  \t");	
				}
				else
				{
					System.out.print(m[a][b] + "\t"); 
				}				
			}
			System.out.print("\n");	
		}
		System.out.print("\n\n");
	} 
	
	public static void imprimeSemDP2(int[][] m)	
	{		
		System.out.print("Elementos da diagonal principal exclu�dos:\n");
		for (int a = 0; a < m.length; a++)		
		{
			for (int b = 0; b < m[0].length; b++)	
			{
				if (a == b) 
				{
							
				}
				else
				{
					System.out.print(m[a][b] + "\t"); 
				}				
			}
			System.out.print("\n");	
		}
		System.out.print("\n\n");
	} 

}