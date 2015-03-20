package Lista03;

public class Questao06 
{

	public static void main(String[] args) 
	{			
		Fila fila1 = new Fila(10);			
		
		while (!fila1.cheia())				
		{
			fila1.enfileira(((int) (Math.random() * 20) + 1));	
		}													
		
		System.out.print("Fila inicial: \n");
		fila1.imprimeTodos();							
		
		Fila fila2 = inverte(f1);						
													
		
		System.out.print("Fila invertida: \n");
		fila2.imprimeTodos();				
	}
	
	
	public static Fila inverte(Fila a)	
	{
		Pilha pilha1 = new Pilha(10);	
		
		while (!a.vazia())					
		{
			if (!pilha1.cheia())
			{
				try 
				{
					pilha1.empilha(a.desenfileira());
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
		
		Fila filaAux = new Fila(10);
		
		while (!pilha1.vazia())			
		{
			if (!filaAux.cheia())		
			{
				try 
				{
					filaAux.enfileira(p1.desempilha());	
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
		return filaAux;			
	}
	
}