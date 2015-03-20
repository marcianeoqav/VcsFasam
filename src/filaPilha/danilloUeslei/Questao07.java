package Lista03;

public class Questao07 
{

	public static void main(String[] args) 
	{
		Pilha pilha1 = new Pilha(10);		
		preenche(pilha1, pilha1.tamanho());			
		
		System.out.print("Pilha com valores aleatorios:\n");	
		pilha1.imprimeTudo();
		
		Pilha pilha2 = ordena(pilha1, pilha1.tamanho());			
		
		System.out.print("Pilha com valores ordenados crescente:\n");
		pilha2.imprimeTudo();						
	}
	
	public static void preenche(Pilha a, int x)	
	{
		for (int i = 0; i < x; i++)
		{
			a.empilha(((int) (Math.random() * 20) + 1));
		}												
	}
	
	public static Pilha ordena(Pilha a, int x)	
	{
		int aux;								
		int vet1[] = new int[x];					
		
		for (int i = 0; i < x; i++)
		{
			vet1[i] = (int) a.desempilha();		
		}
		
		for (int j = 0; j < x; j++)
		{
			for (int k = (j+1); k < vet1.length; k++)
			{
				if (vet1[j] < vet1[k])
				{
					aux = vet1[j];				
					vet1[j] = vet1[k];	
					vet1[k] = aux;					
				}
			}
		}
		
		for (int m = 0; m < x; m++)
		{
			a.empilha(vet1[m]);				
		}
		return a;			
	}

}