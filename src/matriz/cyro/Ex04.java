/*	Exerc�cio 4 da lista de Matrizes para N2.
 * Implementar em Java uma classe que leia uma matriz de inteiros 10x10
 * e imprima os elementos acima da diagonal principal. 
 * A) Uma classe;
 * B) Um m�todo para preencher a matriz. Ele recebe a matriz como par�metro, mas n�o retorna nada.
 * C) Um m�todo para imprimir todos os elementos acima da diagonal principal. Recebe a matriz como
 * 	  par�metro e n�o retorna nada. 
 * D) M�todo main para coordenar a classe e invocar os m�todos acima. 
 */ 

package matriz.cyro;

//A fim de facilitar a confer�ncia, adicionei um m�todo para imprimir a matriz original. 

public class Ex04 
{
	int matriz[][];

	public static void main(String[] args) 
	{
		Ex04 objeto = new Ex04();		// Instancia um objeto da classe Ex_4
		objeto.matriz = new int[10][10];	// Inicializa o vetor do objeto;
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeDiagSup(objeto.matriz);
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
	
	public static void imprimeDiagSup(int[][] m)	// M�todo de impress�o. Recebe a matriz do objeto como par�metro. 
	{	
		System.out.print("Elementos acima da diagonal principal:\n");
		for (int a = 0; a < m.length; a++)		// Repete pelo n�mero de linhas (a) ...
		{
			for (int b = 0; b < m[0].length; b++)	// ...e colunas (b) da matriz.
			{
				if (a < b) // Se o �ndice da linha � menor do que o �ndice da coluna, o elemento est� acima da DP!
				{				
					System.out.print(m[a][b] + "\t");	// Imprime o valor na posi��o [a][b] da matriz e um caractere de tabula��o.
				}
				else
				{
					System.out.print("  \t");
				}
			}
			System.out.print("\n");	// Separador de linhas dentro da matriz.
		}
		System.out.print("\n\n");	// Separador de linhas entre as matrizes. 
	} // Fim do m�todo de impress�o. 

}	// ============================= // FIM DO PROGRAMA!
