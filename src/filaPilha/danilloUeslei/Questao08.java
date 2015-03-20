package Lista03;

public class Questao08 
{

	public static void main(String[] args) 
	{
	Fila fila1 = new Fila(10);
	preenche(fila1, fila1.tamanho());

	System.out.print("Fila com valores aleatorios:\n");		
	fila1.imprimeTodos();
	
	Fila fila2 = ordena(fila1, fila1.tamanho());				
	
	System.out.print("Valores na ordem crescente:\n");
	fila2.imprimeTodos();							
	
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
		int vet1[] = new int[x];						
		
		for (int i = 0; i < x; i++)
		{
			try 
			{
				vet1[i] = (int) a.desenfileira();		
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		for (int j = 0; j < x; j++)
		{
			for (int k = (j+1); k < vet1.length; k++)
			{
				if (vet1[j] > vet1[k])
				{
					aux = vet1[j];					
					vet1[j] = vet1[k];						
					vet1[k] = aux;					
				}
			}
		}
		
		Fila filaAux = new Fila(x);
		
		for (int m = 0; m < x; m++)
		{
			filaAux.enfileira(vet1[m]);					
		}
		return filaAux;			 
	}
	
}
