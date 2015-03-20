package matriz.danillo;
//	Exerc�cio 1 da lista de Matrizes para N2.
// 	Implemente em Java a quest�o descritiva 02 da avalia��o N1, da seguinte forma:
// 	A) Apenas uma classe java, com os m�todos abaixo. 
// 		1) Um m�todo para preencher os dados da matriz.
// 		2) Um m�todo para gerar a transposta da matriz. Recebe uma matriz[n][n] e retorna a transposta[n][n].
// 		3) Um m�todo para imprimir as matrizes;
// 		4) M�todo main para 
// 			* instanciar uma matriz 10x10
// 			* pass�-la como par�metro para o m�todo de preenchimento
// 			* pass�-la como par�metro para o m�todo de gera��o da transposta
// 			* chamar o m�todo de impress�o da matriz original
// 			* chamar o m�todo de impress�o da matriz transposta. 


public class Exercicio01 		
{
	int matriz[][]; 	
	
	public static void main(String[] args) 
	{
	Exercicio01 objeto = new Exercicio01();			
	objeto.matriz = new int[10][10];	
	preenche(objeto.matriz);			
	imprime(objeto.matriz);				
	objeto.matriz = geraTransposta(objeto.matriz);
	imprime(objeto.matriz);							
	}
	
	public static void preenche(int[][] m)	
	{
		int cont = 0;
		for (int i = 0; i < m.length; i++)	
		{
			for (int j = 0; j < m[0].length; j++)
			{
				m[i][j] = cont;					
				cont++;							
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
	
	
	public static int[][] geraTransposta(int[][] m) 
	{
		int x = m.length;			
		int y = m[0].length;		
		int transposta[][] = new int[y][x];	
		
		for (int c = 0; c < x; c++)		
		{
			for (int d = 0; d < y; d++)	
			{
				transposta[d][c] = m[c][d];	
			}
		}
		return transposta;		
	} 
	
}