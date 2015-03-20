/*	Exerc�cio 1 da lista de Matrizes para N2.
 * 	Implemente em Java a quest�o descritiva 02 da avalia��o N1, da seguinte forma:
 * 	A) Apenas uma classe java, com os m�todos abaixo. 
 * 		1) Um m�todo para preencher os dados da matriz.
 * 		2) Um m�todo para gerar a transposta da matriz. Recebe uma matriz[n][n] e retorna a transposta[n][n].
 * 		3) Um m�todo para imprimir as matrizes;
 * 		4) M�todo main para 
 * 			* instanciar uma matriz 10x10
 * 			* pass�-la como par�metro para o m�todo de preenchimento
 * 			* pass�-la como par�metro para o m�todo de gera��o da transposta
 * 			* chamar o m�todo de impress�o da matriz original
 * 			* chamar o m�todo de impress�o da matriz transposta. 
 */


package matriz.cyro;

public class Ex01
{
	int matriz[][]; 	// Uma matriz de inteiros, que por enquanto n�o tem tamanho definido. 
	
	public static void main(String[] args) // M�todo principal
	{
	Ex01 objeto = new Ex01();			// Instancia um objeto da classe Ex_1, que chamaremos de "objeto".
	objeto.matriz = new int[10][10];	// Inicializa a matriz do objeto com dimens�es 10x10.
	preenche(objeto.matriz);			// Invoca o m�todo de preenchimento, passando a matriz como par�metro;
	imprime(objeto.matriz);				// Invoca o m�todo de impress�o, usando a matriz como par�metro;
	objeto.matriz = geraTransposta(objeto.matriz);	// Invoca o m�todo da transposta, passando a matriz como par�metro;
	imprime(objeto.matriz);							// Invoca o m�todo de impress�o, agora com a matriz j� transposta. 
	}
	
	public static void preenche(int[][] m)	// M�todo de preenchimento, recebe a matriz do objeto como par�metro
	{
		int cont = 0;
		for (int i = 0; i < m.length; i++)		// Repete pelo n�mero de linhas...
		{
			for (int j = 0; j < m[0].length; j++)	// ... e de colunas da matriz.
			{
				m[i][j] = cont;						// Atribui um valor sequencial para facilitar a confer�ncia do resultado.
				cont++;								// Incrementa o valor sequencial. 
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
	
	
	public static int[][] geraTransposta(int[][] m) // M�todo para gerar a transposta. 
	{
		int x = m.length;			// Vari�vel para armazenar o n�mero de linhas da matriz.
		int y = m[0].length;		// Vari�vel para armazenar o n�mero de colunas da matriz. 
		int transposta[][] = new int[y][x];	// Instancia uma nova matriz com as dimens�es invertidas para armazenar a transposta.
		
		for (int c = 0; c < x; c++)		// Repete pelo n�mero de linhas...
		{
			for (int d = 0; d < y; d++)	// ...e colunas da matriz:
			{
				transposta[d][c] = m[c][d];		// Transp�e o valor de m[c][d] para transposta[d][c] (�ndices invertidos!)
			}
		}
		return transposta;		// Retorna a matriz transposta. 
	} // Fim do m�todo de gera��o da transposta. 
	
}	// ============================================== // FIM DO PROGRAMA!
