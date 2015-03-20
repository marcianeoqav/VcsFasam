package vetor.ueslei;

public class Exercicio06 
{
	public static int a1[] = new int[5];
	public static int a2[] = new int[5];
	public static int auxiliar[][] = new int[2][5];
	public static int a3[] = new int[10];
	
	public static void main(String[] args) 
	{
		Exercicio06 objeto = new Exercicio06();
		objeto.preenche(a1, a2);
		objeto.imprime(a1);
		objeto.imprime(a2);
		objeto.intercala(a1, a2);
		objeto.imprime(a3);
		
	}
	
	public void preenche(int a1[], int a2[])
	{
		auxiliar[0] = a1;
		auxiliar[1] = a2;
		
		for (int j = 0; j < 2; j++)
		{
		for (int i = 0; i < 5; i++)
			{			
					auxiliar[j][i] = j+i;
			}
		}
		
	}
	
	public int[] intercala(int a1[], int a2[])
	{
		int aux = 0;
		//int res[] = new int[a1.length + a2.length];
		for (int p = 0; p < a3.length; p++)
		{
			if ((p == 0) || (p % 2 == 0))
			{
				a3[p] = a1[aux];			
			}
			else
			{
				a3[p] = a2[aux];
				aux++;
			}
		}
		return a3;
	}
	
	public void imprime(int x[])
	{
		for (int z = 0; z < x.length; z++)
		{
			System.out.print(x[z] + "\t");
		}
		System.out.print("\n\n");
	}

}
