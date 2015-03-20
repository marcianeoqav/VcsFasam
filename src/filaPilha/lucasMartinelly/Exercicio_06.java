package processual03;

public class Exercicio_06 
{

	public static void main(String[] args) 
	{			
		Fila f1 = new Fila(10);			
		
		while (!f1.cheia())				
		{
			f1.enfileira(((int) (Math.random() * 20) + 1));	
		}													
		
		System.out.print("Fila inicial: \n");
		f1.imprimeTodos();							
		
		Fila f2 = inverte(f1);						
		
		System.out.print("Fila invertida: \n");
		f2.imprimeTodos();							
	}
	
	
	public static Fila inverte(Fila a)		
	{
		Pilha p1 = new Pilha(10);			
		
		while (!a.vazia())				
		{
			if (!p1.cheia())				
			{
				try 
				{
					p1.empilha(a.desenfileira());	
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
		
		Fila b = new Fila(10);		
		
		while (!p1.vazia())			
		{
			if (!b.cheia())			
			{
				try 
				{
					b.enfileira(p1.desempilha());	
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
		return b;			
	}
	
}  