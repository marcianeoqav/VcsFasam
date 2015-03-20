/*	Exerc�cio 7 da lista de Matrizes para N2.
 * 	Implementar em Java uma classe que leia uma matriz de inteiros 10x10 e imprima os elementos 
 *  da matriz, exceto os da diagonal secund�ria. 
 *  A implementa��o dever� conter somente uma classe, com os seguintes m�todos:
 *  Um m�todo para preencer a matriz. Recebe a matriz como par�metro, n�o retorna nada.
 *  Um m�todo para imprimir todos os elementos, exceto os da diagonal secund�ria. Recebe
 *  a matriz como par�metro e n�o retorna nada.
 *  M�todo main para coordenar a classe e invocar os outros m�todos.
 */

package matriz.cyro;

//Neste exerc�cio, coloquei um m�todo adicional para imprimir a matriz original, 
//a fim de facilitar a confer�ncia. H� dois m�todos de impress�o da matriz 
//sem os elementos da diagonal secund�ria: 
//O primeiro substitui os elementos da DS por espa�os em branco, gerando uma matriz com as mesmas dimens�es;
//O segundo elimina a diagonal secund�ria toda, resultando em uma matriz com uma coluna a menos. 

public class Ex07 
{

	int matriz[][];
	
	public static void main(String[] args) 
	{
		Ex07 objeto = new Ex07();		// Instancia um objeto da classe Ex_7
		objeto.matriz = new int[10][10];	// Inicializa o vetor do objeto;
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeSemDS(objeto.matriz);
		imprimeSemDS2(objeto.matriz);
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
	
	public static void imprimeSemDS(int[][] m)	// M�todo de impress�o SEM a diagonal secund�ria. Recebe a matriz do objeto como par�metro. 
	{	
		System.out.print("Elementos da diagonal secund�ria em branco:\n");
		for (int a = 0; a < m.length; a++)		// Repete pelo n�mero de linhas (a) ...
		{
			for (int b = 0; b < m[0].length; b++)	// ...e colunas (b) da matriz.
			{
				if (b == ((m.length - a) - 1))	// Se o elemento estiver na diagonal secund�ria...
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
	} // Fim do m�todo de impress�o SEM a diagonal secund�ria. 
	
	public static void imprimeSemDS2(int[][] m)	// M�todo de impress�o SEM a diagonal secund�ria. Recebe a matriz do objeto como par�metro. 
	{		
		System.out.print("Elementos da diagonal secund�ria exclu�dos:\n");
		for (int a = 0; a < m.length; a++)		// Repete pelo n�mero de linhas (a) ...
		{
			for (int b = 0; b < m[0].length; b++)	// ...e colunas (b) da matriz.
			{
				if (b == ((m.length - a) - 1)) //Se o elemento estiver na diagonal secund�ria...
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
	} // Fim do m�todo de impress�o SEM a diagonal secund�ria. 

} //==================== // FIM DO PROGRAMA!
