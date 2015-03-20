package Lista03;

public class Questao09 
{

	public static void main(String[] args) 
	{
	Pilha pilha1 = new Pilha(10);					
	preenche(pilha1, pilha1.tamanho());					
	
	System.out.print("Pilha original com valores aleatórios:\n");	
	pilha1.imprimeTudo();
	
	int top = getMaior(pilha1);										
	System.out.print("O maior elemento é: " + top + "\n\n");		

	int bottom = getMenor(pilha1);									
	System.out.print("O menor elemento é: " + bottom + "\n\n");		
	
	int media = getMedia(pilha1);																	
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
		int vet1[] = new int[a.tamanho()];			
		
		for (int c = 0; c < a.tamanho(); c++)
		{
			vet1[c] = (int) a.desempilha();			
		}		
		for (int i = 0; i < vet1.length; i++)
		{
			a.empilha(vet1[(vet1.length - 1) - i]);	
			if (vet1[i] > maior)				
			{
				maior = vet1[i];					
			}
		}
		return maior;								
	}
	
	public static int getMenor(Pilha a)				
	{
		int menor = 20;								
		int vet1[] = new int[a.tamanho()];			
		
		for (int c = 0; c < a.tamanho(); c++)
		{
			vet1[c] = (int) a.desempilha();			
		}		
		for (int i = 0; i < vet1.length; i++)
		{
			a.empilha(vet1[(vet1.length - 1) - i]);	
			if (vet1[i] < menor)
			{
				menor = vet1[i];			
			}
		}
		return menor;						
	}

	public static int getMedia(Pilha a)		
	{
		int med = 0;						
		int vet1[] = new int[a.tamanho()];	
		
		for (int d = 0; d < a.tamanho(); d++)
		{
			vet1[d] = (int) a.desempilha();	
		}
		
		for (int f = 0; f < a.tamanho(); f++)
		{
			med = (med + vet1[f]);			
		}
		med = (med / a.tamanho());			
		
		return med;							
	}

}