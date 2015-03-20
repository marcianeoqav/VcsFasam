package processual03;


public class Exercico_08 
{

	public static void main(String[] args) 
	{
	Fila f1 = new Fila(10);
	preenche(f1, f1.tamanho());

	System.out.print("Fila original com valores aleatórios:\n");		
	f1.imprimeTodos();
	
	Fila f2 = ordena(f1, f1.tamanho());				
	
	System.out.print("Fila com valores na ordem crescente:\n");
	f2.imprimeTodos();							
	
	}

	public static void preenche(Fila a, int x)
	{
		for (int i = 0; i < x; i++)
		{
			a.enfileira(((int) (Math.random() * 20) + 1));	
		}													
	}
	
	public static Fila ordena(Fila a, int x)		
	{
		int aux;									
		int v1[] = new int[x];						
		
		for (int i = 0; i < x; i++)
		{
			try 
			{
				v1[i] = (int) a.desenfileira();		
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		for (int j = 0; j < x; j++)
		{
			for (int k = (j+1); k < v1.length; k++)
			{
				if (v1[j] > v1[k])
				{
					aux = v1[j];					
					v1[j] = v1[k];						
					v1[k] = aux;					
				}
			}
		}
		
		Fila b = new Fila(x);
		
		for (int m = 0; m < x; m++)
		{
			b.enfileira(v1[m]);					
		}
		return b;			
	}
	
} 
