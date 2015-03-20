/*	Exercício 5 da lista de filas e pilhas para N2.
 * 
 * 	Escreva uma classe Java contendo um método que receba uma fila de números inteiros
 * 	e devolva uma nova fila que é o inverso da primeira. 
 * 	Use uma pilha para ajudar a realizar a tarefa. 
 * */

package listaExerciciosN203FilasPilhas;

public class Ex_5 
{

	public static void main(String[] args) 
	{
		Fila f1 = new Fila(10);						// Instancia uma fila com 10 posições.
		preenche(f1, f1.tamanho());					// Invoca o método de preenchimento, passando a fila e seu tamanho como parâmetros.
	
		System.out.print("Fila inicial: \n");
		f1.imprimeTodos();							// Imprime a fila inicial preenchida com valores aleatórios.
		
		Fila f2 = inverte(f1);						// Instancia uma nova fila, que armazenará a fila anterior após esta ser
													// invertida pelo método apropriado. 
			
		System.out.print("Fila invertida após passar pela pilha: \n");		// Imprime a fila invertida.
		f2.imprimeTodos();		
	}
	
	
	public static void preenche(Fila a, int x)	// Método de preenchimento, recebe a fila e o tamanho como parâmetros.
	{
		for (int i = 0; i < x; i++)
		{
			a.enfileira(((int) (Math.random() * 20) + 1));	// invoca o método de enfileiramento, usando um 
		}													// número aleatório como o valor a ser armazenado.
	}
	
	
	public static Fila inverte(Fila a)				// Método para inverter a fila. Recebe a fila como parâmetro.
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

		Fila b = new Fila(a.tamanho());				// Instancia uma fila auxiliar, do mesmo tamanho da fila recebida como parâmetro.
		
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
		return b;								// Retorna a fila invertida após passar pela pilha.
	}

}  // ====================== // FIM DO PROGRAMA!
