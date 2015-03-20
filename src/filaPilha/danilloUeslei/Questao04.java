package Lista03;

public class Questao04 
{

	public static void main(String[] args) 
	{
		Fila fila1 = new Fila(5);			
		preenche(fila1, fila1.tamanho());	
		Fila fila2 = new Fila(5);			
		preenche(fila2, fila2.tamanho());	
		System.out.print("Fila 1: \n");
		fila1.imprimeTodos();				
		System.out.print("Fila 2: \n");
		fila2.imprimeTodos();				
		Fila fila3 = intercala(fila1, fila2);
		System.out.print("Fila intercalada: \n");
		fila3.imprimeTodos();					
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