package vetor.danilo;
// Escreva uma fun��o em Java que receba como par�metro dois vetores num�ricos A e B e sua respectiva quantidade de elementos.
// Essa fun��o dever� intercalar esses vetores A e B, formando outro vetor C, conforme especificado abaixo. Retorne C.
// C[1] = A[1]
// C[2] = B[1]
// C[3] = A[2]
// C[4] = B[2] E ASSIM POR DIANTE.


public class Exercicio06 
{
	public static int vet1[] = new int[5];
	public static int vet2[] = new int[5];
	public static int auxiliar[][] = new int[2][5];
	public static int vet3[] = new int[10];
	
	public static void main(String[] args) 
	{
		Exercicio06 objeto = new Exercicio06();
		objeto.preenche(vet1, vet2);
		objeto.imprime(vet1);
		objeto.imprime(vet2);
		objeto.intercala(vet1, vet2);
		objeto.imprime(vet3);
		
	}
	
	public void preenche(int vet1[], int vet2[])
	{
		auxiliar[0] = vet1;
		auxiliar[1] = vet2;
		
		for (int j = 0; j < 2; j++)
		{
		for (int i = 0; i < 5; i++)
			{			
					auxiliar[j][i] = j+i;
			}
		}
		
	}
	
	public int[] intercala(int vet1[], int vet2[])
	{
		int aux = 0;
		for (int p = 0; p < vet3.length; p++)
		{
			if ((p == 0) || (p % 2 == 0))
			{
				vet3[p] = vet1[aux];			
			}
			else
			{
				vet3[p] = vet2[aux];
				aux++;
			}
		}
		return vet3;
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
