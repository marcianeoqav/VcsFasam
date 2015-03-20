package vetor.ueslei;

public class Exercicio07 
{
	public static int a1[] = new int[20];
	public static int a2[] = new int[10];
	public static int a3[] = new int[10];
	
	public static void main(String[] args) 
	{
	Exercicio07 objeto = new Exercicio07();
	objeto.preenchea1();
	objeto.imprime(a1);
	objeto.preenchea2a3();
	objeto.imprime(a2);
	objeto.imprime(a3);
	}
	
	public void preenchea1()
	{ 
		for (int i = 0; i < a1.length; i++)
		{
			if ((i % 2 == 0) || (i == 0)) 
			{
				while ((a1[i] % 2 != 0) || (a1[i] == 0))
				{
					a1[i] = (int) (Math.random() * 100);
				}
			}
			else
			{
				while (a1[i] % 2 == 0)
				{
					a1[i] = (int) (Math.random() * 100);
				}
			}
		}
	}
	
	public void preenchea2a3()
	{
		int auxB = 0;
		int auxC = 0;
		for (int a = 0; a < a1.length; a++)
		{
			if (a1[a] % 2 == 0)
			{
				a2[auxB] = a1[a];
				auxB++;
			}
			else
			{
				a3[auxC] = a1[a];
				auxC++;
			}
		}
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
