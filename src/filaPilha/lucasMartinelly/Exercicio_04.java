
package processual03;

public class Exercicio_04 
{

	public static void main(String[] args) 
	{
		Fila f1 = new Fila(5);				
		preenche(f1, f1.tamanho());			
		
		Fila f2 = new Fila(5);				
		preenche(f2, f2.tamanho());			
		
		System.out.print("Fila 1: \n");
		f1.imprimeTodos();					
		
		System.out.print("Fila 2: \n");
		f2.imprimeTodos();					
		
		Fila f3 = intercala(f1, f2);		
											
		
		System.out.print("Fila intercalada: \n");
		f3.imprimeTodos();							
	}
	
	
	public static void preenche(Fila a, int x)	
	{
		for (int i = 0; i < x; i++)
		{
			a.enfileira(((int) (Math.random() * 20) + 1));	
		}													
	}
	
	
	public static Fila intercala(Fila a, Fila b)	
	{
		int comp = (a.tamanho() + b.tamanho());		
		Fila aux = new Fila(comp);					
		
		for (int j = 0; j < (aux.tamanho() / 2); j++)	
		{
			try 
			{
				aux.enfileira(a.desenfileira());		
				aux.enfileira(b.desenfileira());		
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return aux;				
	}
	
}	
