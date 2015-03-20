package matriz.danillo;
//	Exerc�cio 06 da lista de Matrizes para N2.
// 	Implementar em Java uma classe que leia uma matriz 10x10 de inteiros e 
//  imprima os elementos da diagonal SECUND�RIA.
//  A) Apenas uma classe, com os m�todos abaixo:
//  Um m�todo para preencher a matriz. Recebe a matriz como par�metro e n�o retorna nada.
//  Um m�todo para imprimir os elementos da diagonal secund�ria. Recebe a matriz como
//  par�metro e n�o retorna nada.
//  M�todo main para organizar a porra toda. 
 
 
public class Exercicio06 
{
	int matriz[][];
	
	public static void main(String[] args) 
	{
		Exercicio06 objeto = new Exercicio06();	
		objeto.matriz = new int[10][10];	
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeDS(objeto.matriz);
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
	
	
	public static void imprimeDS(int[][] m)	
	{	
		System.out.print("Diagonal secund�ria:\n");
		for (int a = 0; a < m.length; a++)	
		{
			int b = ((m.length - a) - 1);
			{
				System.out.print(m[a][b] + "\t");	
			}
		}
		System.out.print("\n\n");
	} 

}