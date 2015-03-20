/*	Exerc�cio 2 da lista de Matrizes para N2.
 * 	Implementar em Java uma classe que leia uma matriz de inteiros 10x10 e imprima os elementos da diagonal principal.
 * 	A) Apenas uma classe Java, com os m�todos abaixo:
 * 		1) M�todo para preenchimento dos dados da matriz. Recebe a matriz como par�metro, mas n�o retorna nada.
 * 		2) M�todo para impress�o da diagonal principal. Recebe a matriz como par�metro, mas n�o retorna nada.
 * 		3) M�todo main para coordenar o trabalho e invocar os servi�os dos m�todos anteriores.
 */

package matriz.cyro;

//A fim de facilitar a confer�ncia, adicionei um m�todo para imprimir a matriz original. 

public class Ex02 
{
	int matriz[][];
	
	public static void main(String[] args) 
	{
		Ex02 objeto = new Ex02();		// Instancia um objeto da classe Ex_2
		objeto.matriz = new int[10][10];	// Inicializa o vetor do objeto;
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeDP(objeto.matriz);
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
	{										
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
	
	public static void imprimeDP(int[][] m)	// M�todo de impress�o da diagonal principal. Recebe a matriz do objeto como par�metro. 
	{	
		System.out.print("Elementos da diagonal principal:\n");
		for (int a = 0; a < m.length; a++)		// Repete pelo n�mero de linhas (a) ...
		{
			for (int b = 0; b < m[0].length; b++)	// ...e colunas (b) da matriz.
			{
				if (a == b)
				{
				System.out.print(m[a][b] + "\t");	// Imprime o valor na posi��o [a][b] da matriz e um caractere de tabula��o.
				}
			}
		}
		System.out.print("\n\n");
	} // Fim do m�todo de impress�o da diagonal principal. 

}
