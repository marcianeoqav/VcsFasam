
package processual03;

public class Exercicio_10 
{

	public static void main(String[] args) 
	{
		Fila f = new Fila(10);						
		preenche(f, f.tamanho());					
		
		
		System.out.print("Fila original com valores aleatórios:\n");		
		f.imprimeTodos();
		
		int v1[] = new int[f.tamanho()];			 
		
		for (int i = 0; i < v1.length; i++)
		{
			try 
			{
				v1[i] = (int) f.desenfileira();	 
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		int top = getMaior(v1);											
		System.out.print("O maior elemento é: " + top + "\n\n");		
		int bottom = getMenor(v1);										
		System.out.print("O menor elemento é: " + bottom + "\n\n");		
		
		int media = getMedia(v1);																		
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
