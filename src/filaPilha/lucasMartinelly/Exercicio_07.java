
package processual03;

public class Exercicio_07 
{

	public static void main(String[] args) 
	{
		Pilha p1 = new Pilha(10);				
		preenche(p1, p1.tamanho());				
		
		System.out.print("Pilha original com valores aleatórios:\n");		
		p1.imprimeTudo();
		
		Pilha p2 = ordena(p1, p1.tamanho());				
		
		System.out.print("Pilha com valores na ordem crescente:\n");
		p2.imprimeTudo();							
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
		int v1[] = new int[x];						
		
		for (int i = 0; i < x; i++)
		{
			v1[i] = (int) a.desempilha();		
		}
		
		for (int j = 0; j < x; j++)
		{
			for (int k = (j+1); k < v1.length; k++)
			{
				if (v1[j] < v1[k])
				{
					aux = v1[j];					
					v1[j] = v1[k];					
					v1[k] = aux;				
				}
			}
		}
		
		for (int m = 0; m < x; m++)
		{
			a.empilha(v1[m]);					
		}
		return a;			
	}

}  
