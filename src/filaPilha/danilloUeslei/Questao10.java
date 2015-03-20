package Lista03;

public class Questao10 
{

	public static void main(String[] args) 
	{
		Fila fila1 = new Fila(10);						
		preenche(fila1, fila1.tamanho());					
		
		
		System.out.print("Fila com valores aleatorios:\n");	
		fila1.imprimeTodos();
		
		int vet1[] = new int[fila1.tamanho()];			
		
		for (int i = 0; i < vet1.length; i++)
		{
			try 
			{
				vet1[i] = (int) fila1.desenfileira();	
			} 
			catch (Exception e) 
			{
	
			}
		}
		
		int top = getMaior(vet1);										
		System.out.print("O maior elemento é: " + top + "\n\n");		

		int bottom = getMenor(vet1);									
		System.out.print("O menor elemento é: " + bottom + "\n\n");		
		
		int media = getMedia(vet1);																		
		System.out.print("A média aritmética (arredondada) de todos os elementos é: " + media + "\n");
	}
		
	public static void preenche(Fila a, int x)	
	{
		for (int i = 0; i < x; i++)
		{
			a.enfileira(((int) (Math.random() * 20) + 1));	
		}										
	}
		
	public static int getMaior(int[] a) 		
	{
		int maior = 0;							
			
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] > maior)				
			{
				maior = a[i];					
			}
		}
		return maior;							
	}
	
	public static int getMenor(int[] a)			
	{
		int menor = 20;							
												
		for (int z = 0; z < a.length; z++)
		{
			if (a[z] < menor)
			{
				menor = a[z];					
			}
		}
		return menor;							
	}

	public static int getMedia(int[] a)			
	{
		int med = 0;							
		
		for (int f = 0; f < a.length; f++)
		{
			med = (med + a[f]);					
		}
		med = (med / a.length);					
		
		return med;							 
	}
	
}