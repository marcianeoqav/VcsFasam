/*	Exerc�cio 11 da lista de filas e pilhas para N2.
 * 	Implemente a quest�o 03 objetiva da avalia��o N1.
 * 
 * 	Demonstrar a sequ�ncia correta de entrada dos elementos na fila. 
 * */

package listaExerciciosN203FilasPilhas;

public class Ex_11 
{
	
	public static void main(String[] args) 
	{
		Pilha p1 = new Pilha(6);				// Instancia uma pilha com seis posi��es (5 entradas - 2 sa�das + 3 entradas);
		Fila f1 = new Fila(5);					// Instancia uma fila com cinco posi��es (5 entradas).
	
		p1.empilha("P");						//
		p1.empilha("E");						//
		p1.empilha("R");						// 5 entradas na pilha
		p1.empilha("T");						//
		p1.empilha("O");						//
	
		f1.enfileira(p1.desempilha());			// 2 sa�das da pilha e
		f1.enfileira(p1.desempilha());			// 2 entradas na fila
	
		p1.empilha("S");						//
		p1.empilha("O");						// 3 entradas na pilha
		p1.empilha("L");						//
	
		f1.enfileira(p1.desempilha());			//	
		f1.enfileira(p1.desempilha());			// 3 sa�das da pilha e
		f1.enfileira(p1.desempilha());			// 3 entradas na fila
	
		for (int j = 0; j < f1.tamanho(); j++)
		{
			try 
			{
				System.out.print(f1.desenfileira() + "\t");			// Imprime o conte�do da fila na ordem. 
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}	
	}
}
