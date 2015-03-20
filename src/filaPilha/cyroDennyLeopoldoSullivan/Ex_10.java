/*	Exercício 10 da lista de filas e pilhas para N2. 
 * 
 * Implemente uma classe com métodos que retorne o maior, o menor e a média 
 * aritmética dos elementos de uma Fila.*/

package listaExerciciosN203FilasPilhas;

public class Ex_10 
{

	public static void main(String[] args) 
	{
		Fila f1 = new Fila(10);						// Instancia uma fila com 10 posições.
		preenche(f1, f1.tamanho());					// Invoca o método de preenchimento da fila. 
		
		
		System.out.print("Fila original com valores aleatórios:\n");		// Imprime a fila original.
		f1.imprimeTodos();
		
		int v1[] = new int[f1.tamanho()];			// Instancia um vetor de inteiros do mesmo tamanho da fila. 
		
		for (int i = 0; i < v1.length; i++)
		{
			try 
			{
				v1[i] = (int) f1.desenfileira();	// Remove os elementos da fila e armazena no vetor. 
			} 
			catch (Exception e) 
			{
			//	e.printStackTrace();
			}
		}
		
		int top = getMaior(v1);											// Invoca o método para encontrar o maior valor, passando o vetor
		System.out.print("O maior elemento é: " + top + "\n\n");		// como parâmetro. Imprime o maior valor.

		int bottom = getMenor(v1);										// Invoca o método para encontrar o menor valor, passando o vetor
		System.out.print("O menor elemento é: " + bottom + "\n\n");		// como parâmetro. Imprime o menor valor.
		
		int media = getMedia(v1);																		// Invoca o método para encontrar a média.
		System.out.print("A média aritmética (arredondada) de todos os elementos é: " + media + "\n");	// Imprime a média. 
	}
		
	public static void preenche(Fila a, int x)	// Método de preenchimento, recebe a fila e o tamanho como parâmetros.
	{
		for (int i = 0; i < x; i++)
		{
			a.enfileira(((int) (Math.random() * 20) + 1));	// invoca o método de enfileiramento, usando um 
		}													// número aleatório como o valor a ser armazenado.
	}
		
	public static int getMaior(int[] a) 			// Método para localizar o maior valor da pilha. Recebe um vetor como parâmetro.
	{
		int maior = 0;								// Variável auxiliar para armazenar o maior valor.
			
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] > maior)				
			{
				maior = a[i];						// Grava o maior dos valores comparados.
			}
		}
		return maior;								// Retorna o maior valor. 		
	}
	
	public static int getMenor(int[] a)				// Método para localizar o menor valor da pilha. Recebe um vetor como parâmetro.
	{
		int menor = 20;								// Variável auxiliar, com valor inicial igual ao maior valor possível 	
													// (determinado no método de preenchimento).		
		for (int z = 0; z < a.length; z++)
		{
			if (a[z] < menor)
			{
				menor = a[z];						// Armazena o menor dos valores comparados.
			}
		}
		return menor;								// Retorna o menor valor.
	}

	public static int getMedia(int[] a)				// Método para obter a média aritmética dos elementos da pilha. 
	{
		int med = 0;								// Variável auxiliar para armazenar a média.
		
		for (int f = 0; f < a.length; f++)
		{
			med = (med + a[f]);					// Soma o valor de cada elemento no vetor...
		}
		med = (med / a.length);					// ...e divide pelo número de elementos, obtendo a média. 
		
		return med;								// Retorna a média (arredondada). 
	}
	
}	// =============================== // FIM DO PROGRAMA!
