/*	Exerc�cio 8 da lista de Matrizes para N2.
 * 	Implementar em Java uma classe que leia uma matriz 10x10 de inteiros
 * 	e imprima os elementos acima da diagonal secund�ria.
 * 	Deve haver apenas uma classe, com os m�todos abaixo:
 * 	Um m�todo para preencher a matriz. Recebe a matriz como par�metro e n�o retorna nada.
 * 	Um m�todo para imprimir todos os elementos acima da diagonal secund�ria. Recebe a 
 *  matriz como par�metro, mas n�o retorna nada.
 *  M�todo main para coordenar a classe e invocar os outros m�todos. 
 */

package matriz.cyro;

public class Ex08 
{
	int matriz[][];
	public static void main(String[] args) 
	{
		Ex08 objeto = new Ex08();		// Instancia um objeto da classe Ex_7
		objeto.matriz = new int[10][10];	// Inicializa o vetor do objeto;
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeDiagSecSup(objeto.matriz);
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
	
	
	public static void imprimeDiagSecSup(int[][] m)	// M�todo de impress�o. Recebe a matriz do objeto como par�metro. 
	{		
		System.out.print("Elementos acima da diagonal secund�ria:\n");
		for (int a = 0; a < m.length; a++)		// Repete pelo n�mero de linhas (a) ...
		{
			for (int b = 0; b < m[0].length; b++)	// ...e colunas (b) da matriz.
			{
				
		//	E agora, um truque de matem�gica! Os elementos que est�o ACIMA da diagonal secund�ria
		//  t�m o �ndice da coluna MENOR que ((tamanho do vetor) - (�ndice da linha) - 1). 
		 
				if (b < ((m.length - a) - 1)) // Se o elemento estiver ACIMA da diagonal secund�ria...
				{							  	
					System.out.print(m[a][b] + "\t"); // ...imprime o elemento!
				}
				else			// Se ele N�O estiver ACIMA da diagonal secund�ria...
				{
					System.out.print("  \t");	// ...imprime dois espa�os e um caractere de tabula��o, 
				}								// pra formatar corretamente a matriz.
			}
			System.out.print("\n"); // Separador de linhas dentro da matriz
		}
		System.out.print("\n\n"); // Separador de linhas entre as matrizes
	} // Fim do m�todo de impress�o dos elementos ACIMA da diagonal secund�ria.

}	// ================================= // FIM DO PROGRAMA!
