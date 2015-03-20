package matriz.danillo; 
//Exerc�cio 2 da lista de Matrizes para N2.
 //	Implementar em Java uma classe que leia uma matriz de inteiros 10x10 e imprima os elementos da diagonal principal.
 //	A) Apenas uma classe Java, com os m�todos abaixo:
 //		1) M�todo para preenchimento dos dados da matriz. Recebe a matriz como par�metro, mas n�o retorna nada.
 //		2) M�todo para impress�o da diagonal principal. Recebe a matriz como par�metro, mas n�o retorna nada.
 // 	3) M�todo main para coordenar o trabalho e invocar os servi�os dos m�todos anteriores.
 

public class Exercicio02 
{
	int matriz[][];
	
	public static void main(String[] args) 
	{
		Exercicio02 objeto = new Exercicio02();	
		objeto.matriz = new int[10][10];	
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeDP(objeto.matriz);
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
	
	public static void imprimeDP(int[][] m)	
	{	
		System.out.print("Diagonal principal:\n");
		for (int a = 0; a < m.length; a++)	
		{
			for (int b = 0; b < m[0].length; b++)	
			{
				if (a == b)
				{
				System.out.print(m[a][b] + "\t");	
				}
			}
		}
		System.out.print("\n\n");
	}

}
