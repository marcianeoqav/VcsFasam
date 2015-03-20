package matriz.sullivan;
public class Questao01{
	int matriz[][]; 	
	public static void main(String[] args) 
	{
		Questao01  app = new Questao01();			
	app.matriz = new int[10][10];	
	preenchimento(app.matriz);							
	imprimir (app.matriz);
	app.matriz = transposta(app.matriz);	
	imprimir(app.matriz);							
	}
	public static void preenchimento(int[][] m)	
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
	public static void imprimir(int[][] m)	
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
	public static int[][] transposta(int[][] m)  
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

	
