package matriz.danillo;
// Exerc�cio 07 da lista de Matrizes para N2.
 //	Implementar em Java uma classe que leia uma matriz de inteiros 10x10 e imprima os elementos 
 // da matriz, exceto os da diagonal secund�ria. 
 // A implementa��o dever� conter somente uma classe, com os seguintes m�todos:
 // Um m�todo para preencer a matriz. Recebe a matriz como par�metro, n�o retorna nada.
 // Um m�todo para imprimir todos os elementos, exceto os da diagonal secund�ria. Recebe
 // a matriz como par�metro e n�o retorna nada.
 //  M�todo main para coordenar a classe e invocar os outros m�todos.
 

public class Exercicio07 
{

	int matriz[][];
	
	public static void main(String[] args) 
	{
		Exercicio07 objeto = new Exercicio07();		
		objeto.matriz = new int[10][10];	
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeSemDS(objeto.matriz);
		imprimeSemDS2(objeto.matriz);
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
	
	public static void imprimeSemDS(int[][] m)	
	{	
		System.out.print("Elementos em branco da diagonal secund�ria:\n");
		for (int a = 0; a < m.length; a++)		
		{
			for (int b = 0; b < m[0].length; b++)	
			{
				if (b == ((m.length - a) - 1))	
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
	
	public static void imprimeSemDS2(int[][] m)	
	{		
		System.out.print("Elementos excluido da diagonal secund�ria:\n");
		for (int a = 0; a < m.length; a++)		
		{
			for (int b = 0; b < m[0].length; b++)	
			{
				if (b == ((m.length - a) - 1)) 
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