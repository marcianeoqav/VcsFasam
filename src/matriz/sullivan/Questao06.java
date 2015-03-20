package matriz.sullivan;
public class Questao06
{
	int matriz[][];
	public static void main(String[] args) 
	{
		Questao06 app = new Questao06();		
		app.matriz = new int[10][10];	
		preenchimento(app.matriz);
		imprime(app.matriz);
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
	public static void imprime(int[][] m)	
	{	
		System.out.print("impress�o dos elementos da diagonal secund�ria :\n");
		for (int a = 0; a < m.length; a++)		
		{
			int b = ((m.length - a) - 1);
			{
				System.out.print(m[a][b] + "\t");	
			}
		}
		System.out.print("\n\n");
	}
}
