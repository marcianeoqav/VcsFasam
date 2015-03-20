package Lista03;

public class Questao11 
{
	
	public static void main(String[] args) 
	{
		Pilha pilha1 = new Pilha(6);				
		Fila fila1 = new Fila(5);					
	
		pilha1.empilha("P");						
		pilha1.empilha("E");						
		pilha1.empilha("R");						
		pilha1.empilha("T");						
		pilha1.empilha("O");						
	
		fila1.enfileira(pilha1.desempilha());			
		fila1.enfileira(pilha1.desempilha());			
	
		pilha1.empilha("S");						
		pilha1.empilha("O");						
		pilha1.empilha("L");						
	
		fila1.enfileira(pilha1.desempilha());				
		fila1.enfileira(pilha1.desempilha());			
		fila1.enfileira(pilha1.desempilha());			
	
		for (int j = 0; j < fila1.tamanho(); j++)
		{
			try 
			{
				System.out.print(fila1.desenfileira() + "\t");			 
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}	
	}
}
