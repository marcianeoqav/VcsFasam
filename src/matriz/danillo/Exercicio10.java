package matriz.danillo;
//	Exerc�cio 10 da lista de Matrizes para N2.
// 	4 vendedores;
// 	5 produtos diferentes.
// 	Todos os dias, cada vendedor passa uma nota de cada tipo de produto vendido.
// 	Cada nota cont�m: n�mero do vendedor, n�mero do produto e o valor total desse produto vendido no dia.
// 	Portanto, cada vendedor pode emitir entre 0 e 5 notas de venda por dia.
// 	Considerando que as informa��es de todas as notas do �ltimo m�s est�o dispon�veis, escreva um
// 	aplicativo que leia todas essas informa��es sobre as vendas e fa�a um resumo por vendedor e por produto.
// 	Os totais devem ser armazenados na mattriz Vendas. Depois de processar as informa��es do �ltimo m�s,
// 	exiba os resultados em formato tabular, com cada coluna representando um vendedor e cada linha, um produto.
// 	Some as linhas para obter o total de vendas de cada produto.
// 	Some as colunas para obter o total de vendas por vendedor.
//  A sa�da deve exibir esses totais � direita das linhas e na parte inferior das colunas.
//  Apenas uma classe, contendo:
//  Um m�todo para o preenchimento de dados da matriz. Recebe a matriz e suas dimens�es como par�metro, n�o retorna nada.
//  Um m�todo para totalizar linhas e colunas da matriz. Recebe uma matriz [m][n] como par�metro e retorna uma matriz [m+1][n+1]
//  com a linha e coluna adicionais contendo os resultados.
//  Um m�todo para imprimir essa matriz na forma tabular. Recebe a matriz como par�metro, mas n�o retorna nada.
//  M�todo main para coordenar todo o trabalho da classe. 

import java.text.NumberFormat;

public class Exercicio10 
{
	int matriz[][];
	public static NumberFormat emReais = NumberFormat.getCurrencyInstance(); 
	
	public static void main(String[] args) 
	{
		Exercicio10 objeto = new Exercicio10();	
		objeto.matriz = new int[6][5]; 	
		preenche(objeto.matriz, objeto.matriz.length, objeto.matriz[0].length); 
		int[][] res = somaTudo(objeto.matriz); 
		imprimeTab(res);	
	}
	
	public static void preenche(int[][] m, int x, int y)
	{
		m[0][0] = 0;
		for (int a = 1; a < y; a++) 
		{
			m[0][a] = a;
		}
		for (int b = 1; b < x; b++)
		{
			m[b][0] = (b + 10);		
		}
		
		for (int c = 1; c < x; c++)
		{
			for (int d = 1; d < y; d++)
			{
				m[c][d] = (int) ((Math.random() * 2000) + 600);	
			}													
		}
	}
	
	public static int[][] somaTudo(int[][] m)
	{	
		int somaLinha = 0;			
		int somaColuna = 0;			
		int soma[][] = new int[m.length + 1][m[0].length + 1]; 
		for (int a = 0; a < m.length; a++)
		{
			for (int b = 0; b < m[0].length; b++)
			{
				soma[a][b] = m[a][b];	
			}
		}
		
		for (int c = 1; c < m.length; c++)
		{
			somaLinha = 0;
			for (int d = 1; d < m[0].length; d++)
			{
				somaLinha += m[c][d];	
			}
			soma[c][soma[0].length - 1] = somaLinha;
		}
		
		for (int e = 1; e < m[0].length; e++)
		{
			somaColuna = 0;	
			for (int f = 1; f < m.length; f++)
			{
				somaColuna += m[f][e];	
			}
			soma[soma.length - 1][e] = somaColuna;	
		}
		return soma; 
	}
	
	
	public static void imprimeTab(int[][] m)
	{
		System.out.print("Resuldado mes \t");
		System.out.print("Vendedor " + m[0][1] + "\tVendedor " + m[0][2] + "\tVendedor " + m[0][3] + "\tVendedor " + m[0][4] + "\ttotal por produto:\n\n");
		for (int x = 1; x < m.length - 1; x++)
		{
			System.out.print("Codigo do produto: " + m[x][0] + "\t");
			for (int y = 1; y < m[0].length; y++)
				{
				System.out.print(emReais.format(m[x][y]) + "\t");
				}
			System.out.print("\n");
		}
		System.out.print("\n Total por vendedor:\t");
		for (int z = 1; z < m[0].length - 1; z++)
		{
			System.out.print(emReais.format(m[m[0].length][z]) + "\t");
		}
	}

}