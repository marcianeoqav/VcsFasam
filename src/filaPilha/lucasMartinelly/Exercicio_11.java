
package processual03;

public class Exercicio_11 
{
	
	public static void main(String[] args) 
	{
		Pilha p = new Pilha(6);				
		Fila f1 = new Fila(5);					
	
		p.empilha("P");						
		p.empilha("E");					
		p.empilha("R");						
		p.empilha("T");						
		p.empilha("O");						
	
		f1.enfileira(p.desempilha());			
		f1.enfileira(p.desempilha());			
	
		p.empilha("S");					
		p.empilha("O");						
		p.empilha("L");				
	
		f1.enfileira(p.desempilha());			
		f1.enfileira(p.desempilha());			
		f1.enfileira(p.desempilha());			
	
		for (int j = 0; j < f1.tamanho(); j++)
		{
			try 
			{
				System.out.print(f1.desenfileira() + "\t");			
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}	
	}
}
