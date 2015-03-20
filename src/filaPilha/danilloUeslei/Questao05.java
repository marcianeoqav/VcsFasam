package Lista03;

public class Questao05 
{

	public static void main(String[] args) 
	{
		Fila fila1 = new Fila(10);						
		preenche(fila1, fila1.tamanho());					
	
		System.out.print("Fila inicial: \n");
		fila1.imprimeTodos();							
		
		Fila fila2 = inverte(fila1);					
													
			
		System.out.print("Fila invertida: \n");		
		fila2.imprimeTodos();		
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
		Pilha pilha1 = new Pilha(a.tamanho());			
		
		for (int i = 0; i < pilha1.tamanho(); i++)
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

		Fila filaAux = new Fila(a.tamanho());			
		
		for (int j = 0; j < pilha1.tamanho(); j++)
		{
			try 
			{
				filaAux.enfileira(pilha1.desempilha());
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return filaAux;								
	}

}