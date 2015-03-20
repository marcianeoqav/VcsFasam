package vetor.danilo; 
//Exerc�cio 7 da lista de vetores para N2.
 //Implemente um programa em JavetA para ler um vetor A de 20 posi��es, preenchido com 10 vetAlores �mpares e 10 pares.
 //Em seguida, preencher outros dois vetores B e C de 10 posi��es cada. B deve conter todos os vetAlores constantes 
 //pares de A, divididos por 2. 
 //O vetor C deve conter todos os vetAlores �mpares de A, multiplicados por 3.
 //Uma classe;
 //M�todo void para preencher A;
 //M�todo void para preencher B e C. Recebe A, B, e C;
 //M�todo void para imprimir os vetores. Recebe um vetor.

public class Exercicio07 
{
	public static int vetA[] = new int[20];
	public static int vetB[] = new int[10];
	public static int vetC[] = new int[10];
	
	public static void main(String[] args) 
	{
	Exercicio07 objeto = new Exercicio07();
	objeto.preencheA();
	objeto.imprime(vetA);
	objeto.preencheBC();
	objeto.imprime(vetB);
	objeto.imprime(vetC);
	}
	
	public void preencheA()
	{ 
		for (int i = 0; i < vetA.length; i++)
		{
			if ((i % 2 == 0) || (i == 0)) 
			{
				while ((vetA[i] % 2 != 0) || (vetA[i] == 0))
				{
					vetA[i] = (int) (Math.random() * 100);
				}
			}
			else
			{
				while (vetA[i] % 2 == 0)
				{
					vetA[i] = (int) (Math.random() * 100);
				}
			}
		}
	}
	
	public void preencheBC()
	{
		int auxB = 0;
		int auxC = 0;
		for (int a = 0; a < vetA.length; a++)
		{
			if (vetA[a] % 2 == 0)
			{
				vetB[auxB] = vetA[a];
				auxB++;
			}
			else
			{
				vetC[auxC] = vetA[a];
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
