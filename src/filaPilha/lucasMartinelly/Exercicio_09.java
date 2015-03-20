
package processual03;

public class Exercicio_09 
{

	public static void main(String[] args) 
	{
	Pilha p = new Pilha(10);					
	preenche(p, p.tamanho());					
	
	System.out.print("Pilha original com valores aleatórios:\n");		
	p.imprimeTudo();
	
	int top = getMaior(p);											
	System.out.print("O maior elemento é: " + top + "\n\n");		

	int bottom = getMenor(p);										
	System.out.print("O menor elemento é: " + bottom + "\n\n");		
	
	int media = getMedia(p);																		
	System.out.print("A média aritmética (arredondada) de todos os elementos é: " + media + "\n");
	
	}
	
	public static void preenche(Pilha a, int x)	
	{
		for (int i = 0; i < x; i++)
		{
			a.empilha(((int) (Math.random() * 20) + 1));	
		}													
	}
	
	public static int getMaior(Pilha a) 			
	{
		int maior = 0;								
		int v[] = new int[a.tamanho()];			
		
		for (int c = 0; c < a.tamanho(); c++)
		{
			v[c] = (int) a.desempilha();			
		}		
		for (int i = 0; i < v.length; i++)
		{
			a.empilha(v[(v.length - 1) - i]);		
			if (v[i] > maior)				
			{
				maior = v[i];						
			}
		}
		return maior;								
	}
	
	public static int getMenor(Pilha a)				
	{
		int menor = 20;								
		int v[] = new int[a.tamanho()];			
		
		for (int c = 0; c < a.tamanho(); c++)
		{
			v[c] = (int) a.desempilha();			
		}		
		for (int i = 0; i < v.length; i++)
		{
			a.empilha(v[(v.length - 1) - i]);	
			if (v[i] < menor)
			{
				menor = v[i];					
			}
		}
		return menor;							
	}

	public static int getMedia(Pilha a)			
	{
		int med = 0;								
		int v[] = new int[a.tamanho()];			
		
		for (int d = 0; d < a.tamanho(); d++)
		{
			v[d] = (int) a.desempilha();			
		}
		
		for (int f = 0; f < a.tamanho(); f++)
		{
			med = (med + v[f]);				
		}
		med = (med / a.tamanho());				
		return med;							
	}

}	