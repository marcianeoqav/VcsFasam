/*	Exerc�cio 6 da lista de Matrizes para N2.
 * 	Implementar em Java uma classe que leia uma matriz 10x10 de inteiros e 
 *  imprima os elementos da diagonal SECUND�RIA.
 *  A) Apenas uma classe, com os m�todos abaixo:
 *  Um m�todo para preencher a matriz. Recebe a matriz como par�metro e n�o retorna nada.
 *  Um m�todo para imprimir os elementos da diagonal secund�ria. Recebe a matriz como
 *  par�metro e n�o retorna nada.
 *  M�todo main para organizar a porra toda. 
 */

package matriz.cyro;

//A fim de facilitar a confer�ncia, adicionei um m�todo para imprimir a matriz original. 

public class Ex06 
{
	int matriz[][];
	
	public static void main(String[] args) 
	{
		Ex06 objeto = new Ex06();		// Instancia um objeto da classe Ex_5
		objeto.matriz = new int[10][10];	// Inicializa o vetor do objeto;
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeDS(objeto.matriz);
	}
	
	public static void preenche(int[][] m)	// M�todo de preenchimento, recebe a matriz do objeto como par�metro
	{	
				
		for (int i = 0; i < m.length; i++)		// Repete pelo n�mero de linhas...
		{
			for (int j = 0; j < m[0].length; j++)	// ... e de colunas da matriz.
			{
				m[i][j] = (int) (Math.random() * 100); // Preenche com n�meros aleat�rios entre 0 e 20.
			}
		}
	}	// Fim do m�todo de preenchimento. 
	
	public static void imprime(int[][] m)	// M�todo de impress�o. Recebe a matriz do objeto como par�metro. 
	{										// Serve para todas as matrizes do exerc�cio. 
		for (int a = 0; a < m.length; a++)		// Repete pelo n�mero de linhas (a) ...
		{
			for (int b = 0; b < m[0].length; b++)	// ...e colunas (b) da matriz.
			{
				System.out.print(m[a][b] + "\t");	// Imprime o valor na posi��o [a][b] da matriz e um caractere de tabula��o.
			}
			System.out.print("\n");	// Separador de linhas dentro da matriz.
		}
		System.out.print("\n\n");	// Separador de linhas entre as matrizes. 
	} // Fim do m�todo de impress�o. 
	
	
	public static void imprimeDS(int[][] m)	// M�todo de impress�o da diagonal secund�ria. Recebe a matriz do objeto como par�metro. 
	{	
		System.out.print("Elementos da diagonal secund�ria:\n");
		for (int a = 0; a < m.length; a++)		// Repete pelo n�mero de linhas (a) ...
		{
			int b = ((m.length - a) - 1);
			{
				System.out.print(m[a][b] + "\t");	// Imprime o valor na posi��o [a][b] da matriz e um caractere de tabula��o.
			}
		}
		System.out.print("\n\n");
	} // Fim do m�todo de impress�o da diagonal secund�ria. 

}
