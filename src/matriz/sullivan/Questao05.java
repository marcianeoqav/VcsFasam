package matriz.sullivan;
public class Questao05
{
	int matriz[][];
	public static void main(String[] args) 
	{
		Questao05 app = new Questao05();		
		app.matriz = new int[10][10];	
		preenchimento(app.matriz);
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
		System.out.print("Elementos da diagonal principal:\n");
		for (int a = 0; a < m.length; a++)		
		{
			for (int b = 0; b < m[0].length; b++)	
			{
				if (a > b)
				{				
					System.out.print(m[a][b] + "\t");	
				}
				else
				{
					System.out.print("  \t");
				}
			}
			System.out.print("\n");	
		}
		System.out.print("\n\n");	
	} 
}	
