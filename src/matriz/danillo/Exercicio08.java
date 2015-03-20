package matriz.danillo;
//	Exerc�cio 8 da lista de Matrizes para N2.
// 	Implementar em Java uma classe que leia uma matriz 10x10 de inteiros
// 	e imprima os elementos acima da diagonal secund�ria.
// 	Deve haver apenas uma classe, com os m�todos abaixo:
// 	Um m�todo para preencher a matriz. Recebe a matriz como par�metro e n�o retorna nada.
// 	Um m�todo para imprimir todos os elementos acima da diagonal secund�ria. Recebe a 
//  matriz como par�metro, mas n�o retorna nada.
//  M�todo main para coordenar a classe e invocar os outros m�todos. 

public class Exercicio08 
{
	int matriz[][];
	public static void main(String[] args) 
	{
		Exercicio08 objeto = new Exercicio08();	
		objeto.matriz = new int[10][10];	
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeDiagSecSup(objeto.matriz);
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
	
	
	public static void imprimeDiagSecSup(int[][] m)	 
	{		
		System.out.print("Elementos acima da diagonal secund�ria:\n");
		for (int a = 0; a < m.length; a++)		
		{
			for (int b = 0; b < m[0].length; b++)
			{
				 
				if (b < ((m.length - a) - 1)) 
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