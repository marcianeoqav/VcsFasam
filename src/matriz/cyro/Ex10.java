/*	Exerc�cio 10 da lista de Matrizes para N2.
 * 	4 vendedores;
 * 	5 produtos diferentes.
 * 	Todos os dias, cada vendedor passa uma nota de cada tipo de produto vendido.
 * 	Cada nota cont�m: n�mero do vendedor, n�mero do produto e o valor total desse produto vendido no dia.
 * 	Portanto, cada vendedor pode emitir entre 0 e 5 notas de venda por dia.
 * 	Considerando que as informa��es de todas as notas do �ltimo m�s est�o dispon�veis, escreva um
 * 	aplicativo que leia todas essas informa��es sobre as vendas e fa�a um resumo por vendedor e por produto.
 * 	Os totais devem ser armazenados na mattriz Vendas. Depois de processar as informa��es do �ltimo m�s,
 * 	exiba os resultados em formato tabular, com cada coluna representando um vendedor e cada linha, um produto.
 * 	Some as linhas para obter o total de vendas de cada produto.
 * 	Some as colunas para obter o total de vendas por vendedor.
 *  A sa�da deve exibir esses totais � direita das linhas e na parte inferior das colunas.
 *  Apenas uma classe, contendo:
 *  Um m�todo para o preenchimento de dados da matriz. Recebe a matriz e suas dimens�es como par�metro, n�o retorna nada.
 *  Um m�todo para totalizar linhas e colunas da matriz. Recebe uma matriz [m][n] como par�metro e retorna uma matriz [m+1][n+1]
 *  com a linha e coluna adicionais contendo os resultados.
 *  Um m�todo para imprimir essa matriz na forma tabular. Recebe a matriz como par�metro, mas n�o retorna nada.
 *  M�todo main para coordenar todo o trabalho da classe. 
 *  */

package matriz.cyro;

import java.text.NumberFormat;

public class Ex10 
{
	int matriz[][];
	public static NumberFormat emReais = NumberFormat.getCurrencyInstance(); 
	
	public static void main(String[] args) 
	{
		Ex10 objeto = new Ex10();		//Instancia
		objeto.matriz = new int[6][5]; 	//Inicializa a matriz com as dimens�es para armazenar os dados iniciais.
		preenche(objeto.matriz, objeto.matriz.length, objeto.matriz[0].length); //Invoca o m�todo de preenchimento, passando a matriz e as dimens�es como par�metros.
		int[][] res = somaTudo(objeto.matriz); // Invoca o m�todo de soma passando a matriz preenchida como par�metro e armazena o resultado em uma nova matriz.
		imprimeTab(res);	// Invoca o m�todo de impress�o tabulada.
	}
	
	public static void preenche(int[][] m, int x, int y)
	{
		m[0][0] = 0;
		for (int a = 1; a < y; a++) 
		{
			m[0][a] = a;	// Atribui o n�mero de identifica��o de cada vendedor;
		}
		for (int b = 1; b < x; b++)
		{
			m[b][0] = (b + 10);		// Atribui o c�digo de cada produto;		
		}
		
		for (int c = 1; c < x; c++)
		{
			for (int d = 1; d < y; d++)
			{
				m[c][d] = (int) ((Math.random() * 2000) + 600);	// Gera um valor aleat�rio para o volume de vendas 
			}													// de cada produto, para cada vendedor.
		}
	}
	
	public static int[][] somaTudo(int[][] m)
	{	
		int somaLinha = 0;			// Vari�vel auxiliar
		int somaColuna = 0;			// Vari�vel auxiliar
		int soma[][] = new int[m.length + 1][m[0].length + 1]; // Cria a matriz com as dimens�es [m+1][n+1]
		for (int a = 0; a < m.length; a++)
		{
			for (int b = 0; b < m[0].length; b++)
			{
				soma[a][b] = m[a][b];	// Copia os dados da matriz inicial para a nova matriz;
			}
		}
		
		for (int c = 1; c < m.length; c++)
		{
			somaLinha = 0;	// Reinicia a soma para cada linha;
			for (int d = 1; d < m[0].length; d++)
			{
				somaLinha += m[c][d];	// Soma cada linha para encontrar o total por produto;
			}
			soma[c][soma[0].length - 1] = somaLinha;	// Armazena a soma na �ltima posi��o da linha.
		}
		
		for (int e = 1; e < m[0].length; e++)
		{
			somaColuna = 0;		// Reinicia a soma para cada coluna;
			for (int f = 1; f < m.length; f++)
			{
				somaColuna += m[f][e];	// Soma cada coluna para encontrar o total por vendedor;
			}
			soma[soma.length - 1][e] = somaColuna;	// Armazena a soma na �ltima posi��o da coluna.
		}
		return soma; // Retorna a matriz com as somas calculadas.
	}
	
	
	public static void imprimeTab(int[][] m)
	{
		System.out.print("RESULTADOS DO M�S\t");
		System.out.print("Vendedor " + m[0][1] + "\tVendedor " + m[0][2] + "\tVendedor " + m[0][3] + "\tVendedor " + m[0][4] + "\tTOTAL POR PRODUTO:\n\n");
		for (int x = 1; x < m.length - 1; x++)
		{
			System.out.print("C�digo do produto: " + m[x][0] + "\t");
			for (int y = 1; y < m[0].length; y++)
				{
				System.out.print(emReais.format(m[x][y]) + "\t");
				}
			System.out.print("\n");
		}
		System.out.print("\nTOTAL POR VENDEDOR:\t");
		for (int z = 1; z < m[0].length - 1; z++)
		{
			System.out.print(emReais.format(m[m[0].length][z]) + "\t");
		}
	}	// fim do m�todo de impress�o tabulada

}	// ========================================= // FIM DO PROGRAMA!
