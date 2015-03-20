/*	Exerc�cio 6 da lista de filas e pilhas para N2.
 * 
 * Considere uma pilha P vazia e uma fila F n�o vazia. Utilizando apenas os testes de fila e  
 * pilha vazias, as opera��es Enfileira, Desenfileira, Empilha, Desempilha, e uma vari�vel aux 
 * do TipoItem, implemente uma classe com um m�todo que inverta a ordem dos elementos da fila.*/

package listaExerciciosN203FilasPilhas;

public class Ex_6 
{

	public static void main(String[] args) 
	{			
		Fila f1 = new Fila(10);			// Instancia uma fila com 10 posi��es.
		
		while (!f1.cheia())				// Usa um la�o com o teste de fila cheia para...
		{
			f1.enfileira(((int) (Math.random() * 20) + 1));	// ...invocar o m�todo de enfileiramento, usando um 
		}													// n�mero aleat�rio como o valor a ser armazenado.
		
		System.out.print("Fila inicial: \n");
		f1.imprimeTodos();							// Imprime a fila inicial.
		
		Fila f2 = inverte(f1);						// Instancia uma segunda fila para armazenar a fila invertida, obtida 
													// com a chamada ao m�todo de invers�o, mandando a fila inicial como par�metro.
		
		System.out.print("Fila invertida: \n");
		f2.imprimeTodos();							// Imprime a fila invertida.
	}
	
	
	public static Fila inverte(Fila a)		// M�todo de invers�o, recebe uma fila como par�metro e retorna uma fila invertida.
	{
		Pilha p1 = new Pilha(10);			// Instancia uma pilha do mesmo tamanho da fila para facilitar a opera��o.
		
		while (!a.vazia())					// La�o com teste de fila vazia...
		{
			if (!p1.cheia())				// ... e de pilha cheia...
			{
				try 
				{
					p1.empilha(a.desenfileira());	// ... para tirar elementos da fila e colocar na pilha.
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
		
		Fila b = new Fila(10);		// Instancia uma nova fila, do mesmo tamanho da fila original. 
		
		while (!p1.vazia())			// La�o com teste de pilha vazia...
		{
			if (!b.cheia())			// ... e de fila cheia...
			{
				try 
				{
					b.enfileira(p1.desempilha());	// ...para tirar elementos da pilha e colocar na fila.
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
		return b;			// Retorna a fila invertida. 
	}
	
}  //=========================== // FIM DO PROGRAMA!
