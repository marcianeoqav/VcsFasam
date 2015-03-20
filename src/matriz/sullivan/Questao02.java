package matriz.sullivan;

public class Questao02
{
	int matriz[][];
	public static void main(String[] args) 
	{
		Questao02 app = new Questao02();
		app.matriz = new int[10][10];
		preenchimento(app.matriz);
		imprimir(app.matriz);
		
	}
		public static void preenchimento(int[][] m)	
	{	
				
		for (int i = 0; i < m.length; i++)		
		{
			for (int j = 0; j < m[0].length; j++)	
			{
				m[i][j] = (int) (Math.random() * 100); 
			}
		}
	}	
	
	public static void imprimir(int[][] m)	
	{	
		System.out.print("Elementos da diagonal principal:\n");
		for (int a = 0; a < m.length; a++)		
		{
			for (int b = 0; b < m[0].length; b++)	
			{
				if (a == b)
				{
				System.out.print(m[a][b] + "\t");	
				}
			}
		}
		System.out.print("\n\n");
	} 
}