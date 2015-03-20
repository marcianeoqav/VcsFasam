/*	Exerc�cio 5 da lista de filas e pilhas para N2.
 * 
 * 	Escreva uma classe Java contendo um m�todo que receba uma fila de n�meros inteiros
 * 	e devolva uma nova fila que � o inverso da primeira. 
 * 	Use uma pilha para ajudar a realizar a tarefa. 
 * */

package listaExerciciosN203FilasPilhas;

public class Ex_5 
{

	public static void main(String[] args) 
	{
		Fila f1 = new Fila(10);						// Instancia uma fila com 10 posi��es.
		preenche(f1, f1.tamanho());					// Invoca o m�todo de preenchimento, passando a fila e seu tamanho como par�metros.
	
		System.out.print("Fila inicial: \n");
		f1.imprimeTodos();							// Imprime a fila inicial preenchida com valores aleat�rios.
		
		Fila f2 = inverte(f1);						// Instancia uma nova fila, que armazenar� a fila anterior ap�s esta ser
													// invertida pelo m�todo apropriado. 
			
		System.out.print("Fila invertida ap�s passar pela pilha: \n");		// Imprime a fila invertida.
		f2.imprimeTodos();		
	}
	
	
	public static void preenche(Fila a, int x)	// M�todo de preenchimento, recebe a fila e o tamanho como par�metros.
	{
		for (int i = 0; i < x; i++)
		{
			a.enfileira(((int) (Math.random() * 20) + 1));	// invoca o m�todo de enfileiramento, usando um 
		}													// n�mero aleat�rio como o valor a ser armazenado.
	}
	
	
	public static Fila inverte(Fila a)				// M�todo para inverter a fila. Recebe a fila como par�metro.
	{
		Pilha p1 = new Pilha(a.tamanho());			// Instancia uma pilha do mesmo tamanho da fila, para facilitar nossa vida...
		
		for (int i = 0; i < p1.tamanho(); i++)
		{
			try 
			{
				p1.empilha(a.desenfileira());		// ...tira cada elemento da fila e coloca na pilha, um de cada vez. 
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

		Fila b = new Fila(a.tamanho());				// Instancia uma fila auxiliar, do mesmo tamanho da fila recebida como par�metro.
		
		for (int j = 0; j < p1.tamanho(); j++)
		{
			try 
			{
				b.enfileira(p1.desempilha());		// ...tira cada elemento da pilha e coloca na fila, um de cada vez.
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return b;								// Retorna a fila invertida ap�s passar pela pilha.
	}

}  // ====================== // FIM DO PROGRAMA!
