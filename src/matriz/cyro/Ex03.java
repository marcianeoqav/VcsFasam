/*	Exerc�cio 3 da lista de Matrizes para N2.
 * 	Implementar em Java uma classe que leia uma matriz 10x10 de inteiros e 
 * 	imprima os elementos da diagonal principal da matriz. 
 * 	A) Apenas uma classe, com os m�todos abaixo:
 * 		1) M�todo para preencher a matriz. Recebe a matriz como par�metro, mas n�o retorna nada.
 * 		2) Um m�todo para a impress�o de todos os elementos, EXCETO os da diagonal principal. 
 * 		   Esse m�todo recebe a matriz como par�metro, mas n�o retorna nada. 
 * 		3) M�todo main para coordenar a classe e invocar os m�todos supracitados.
 */

package matriz.cyro;

//Neste exerc�cio, coloquei um m�todo adicional para imprimir a matriz original, 
//a fim de facilitar a confer�ncia. H� dois m�todos de impress�o da matriz 
//sem os elementos da diagonal principal: 
//O primeiro substitui os elementos da DP por espa�os em branco, gerando uma matriz com as mesmas dimens�es;
//O segundo elimina a diagonal principal toda, resultando em uma matriz com uma coluna a menos. 

public class Ex03 
{
	int matriz[][];
	
	public static void main(String[] args) 
	{
		Ex03 objeto = new Ex03();		// Instancia um objeto da classe Ex_3
		objeto.matriz = new int[10][10];	// Inicializa o vetor do objeto;
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeSemDP(objeto.matriz);
		imprimeSemDP2(objeto.matriz);
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
	
	public static void imprimeSemDP(int[][] m)	// M�todo de impress�o SEM a diagonal principal. Recebe a matriz do objeto como par�metro. 
	{	
		System.out.print("Elementos da diagonal principal em branco:\n");
		for (int a = 0; a < m.length; a++)		// Repete pelo n�mero de linhas (a) ...
		{
			for (int b = 0; b < m[0].length; b++)	// ...e colunas (b) da matriz.
			{
				if (a == b)	// Se o elemento estiver na diagonal principal...
				{
					System.out.print("  \t");	// ...imprime dois espa�os no lugar do elemento e um caractere de tabula��o.
				}
				else
				{
					System.out.print(m[a][b] + "\t"); // Imprime o valor de todos os outros elementos.
				}				
			}
			System.out.print("\n");	// Separador de linhas dentro da matriz.
		}
		System.out.print("\n\n");
	} // Fim do m�todo de impress�o SEM a diagonal principal. 
	
	public static void imprimeSemDP2(int[][] m)	// M�todo de impress�o SEM a diagonal principal. Recebe a matriz do objeto como par�metro. 
	{		
		System.out.print("Elementos da diagonal principal exclu�dos:\n");
		for (int a = 0; a < m.length; a++)		// Repete pelo n�mero de linhas (a) ...
		{
			for (int b = 0; b < m[0].length; b++)	// ...e colunas (b) da matriz.
			{
				if (a == b) //Se o elemento estiver na diagonal principal...
				{
							//...n�o fa�a nada =D
				}
				else
				{
					System.out.print(m[a][b] + "\t"); // Imprime o valor de todos os outros elementos.
				}				
			}
			System.out.print("\n");	// Separador de linhas dentro da matriz.
		}
		System.out.print("\n\n");
	} // Fim do m�todo de impress�o SEM a diagonal principal. 

} //==================== // FIM DO PROGRAMA!
