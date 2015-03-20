package matriz.danillo;
// Exerc�cio 4 da lista de Matrizes para N2.
// Implementar em Java uma classe que leia uma matriz de inteiros 10x10
// e imprima os elementos acima da diagonal principal. 
// A) Uma classe;
// B) Um m�todo para preencher a matriz. Ele recebe a matriz como par�metro, mas n�o retorna nada.
// C) Um m�todo para imprimir todos os elementos acima da diagonal principal. Recebe a matriz como
// 	  par�metro e n�o retorna nada. 
//D) M�todo main para coordenar a classe e invocar os m�todos acima. 


public class Exercicio04 
{
	int matriz[][];

	public static void main(String[] args) 
	{
		Exercicio03 objeto = new Exercicio03();	
		objeto.matriz = new int[10][10];	
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeDiagSup(objeto.matriz);
	}
	
	public static void preenche(int[][] m)	
	{
		int cont = 0;
		for (int i = 0; i < m.length; i++)	
		{
			for (int j = 0; j < m[0].length; j++)
			{
				m[i][j] = cont;					
				cont++;							
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
	
	public static void imprimeDiagSup(int[][] m)	
	{	
		System.out.print("Elementos acima da diagonal principal:\n");
		for (int a = 0; a < m.length; a++)		
		{
			for (int b = 0; b < m[0].length; b++)	
			{
				if (a < b)
				{				
					System.out.print(m[a][b] + "\t");	
				}
				else
				{
					System.out.print("  \t");
				}
			}
			System.out.print("\n");	
		}
		System.out.print("\n\n");	
	}  

}