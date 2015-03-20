package processual03;

public class Exercicio_05 
{

	public static void main(String[] args) 
	{
		Fila f1 = new Fila(10);						
		preenche(f1, f1.tamanho());					
		System.out.print("Fila inicial: \n");
		f1.imprimeTodos();							
		Fila f2 = inverte(f1);						
													
			
		System.out.print("Fila invertida após passar pela pilha: \n");		
		f2.imprimeTodos();		
	}
	
	
	public static void preenche(Fila a, int x)
	{
		for (int i = 0; i < x; i++)
		{
			a.enfileira(((int) (Math.random() * 20) + 1));	
		}													
	}
	
	
	public static Fila inverte(Fila a)				
	{
		Pilha p1 = new Pilha(a.tamanho());			
		
		for (int i = 0; i < p1.tamanho(); i++)
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

		Fila b = new Fila(a.tamanho());				
		
		for (int j = 0; j < p1.tamanho(); j++)
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
		return b;								
	}

}
