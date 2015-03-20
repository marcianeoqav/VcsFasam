/*	Exerc�cio 10 da lista de filas e pilhas para N2. 
 * 
 * Implemente uma classe com m�todos que retorne o maior, o menor e a m�dia 
 * aritm�tica dos elementos de uma Fila.*/

package listaExerciciosN203FilasPilhas;

public class Ex_10 
{

	public static void main(String[] args) 
	{
		Fila f1 = new Fila(10);						// Instancia uma fila com 10 posi��es.
		preenche(f1, f1.tamanho());					// Invoca o m�todo de preenchimento da fila. 
		
		
		System.out.print("Fila original com valores aleat�rios:\n");		// Imprime a fila original.
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
		
		int top = getMaior(v1);											// Invoca o m�todo para encontrar o maior valor, passando o vetor
		System.out.print("O maior elemento �: " + top + "\n\n");		// como par�metro. Imprime o maior valor.

		int bottom = getMenor(v1);										// Invoca o m�todo para encontrar o menor valor, passando o vetor
		System.out.print("O menor elemento �: " + bottom + "\n\n");		// como par�metro. Imprime o menor valor.
		
		int media = getMedia(v1);																		// Invoca o m�todo para encontrar a m�dia.
		System.out.print("A m�dia aritm�tica (arredondada) de todos os elementos �: " + media + "\n");	// Imprime a m�dia. 
	}
		
	public static void preenche(Fila a, int x)	// M�todo de preenchimento, recebe a fila e o tamanho como par�metros.
	{
		for (int i = 0; i < x; i++)
		{
			a.enfileira(((int) (Math.random() * 20) + 1));	// invoca o m�todo de enfileiramento, usando um 
		}													// n�mero aleat�rio como o valor a ser armazenado.
	}
		
	public static int getMaior(int[] a) 			// M�todo para localizar o maior valor da pilha. Recebe um vetor como par�metro.
	{
		int maior = 0;								// Vari�vel auxiliar para armazenar o maior valor.
			
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] > maior)				
			{
				maior = a[i];						// Grava o maior dos valores comparados.
			}
		}
		return maior;								// Retorna o maior valor. 		
	}
	
	public static int getMenor(int[] a)				// M�todo para localizar o menor valor da pilha. Recebe um vetor como par�metro.
	{
		int menor = 20;								// Vari�vel auxiliar, com valor inicial igual ao maior valor poss�vel 	
													// (determinado no m�todo de preenchimento).		
		for (int z = 0; z < a.length; z++)
		{
			if (a[z] < menor)
			{
				menor = a[z];						// Armazena o menor dos valores comparados.
			}
		}
		return menor;								// Retorna o menor valor.
	}

	public static int getMedia(int[] a)				// M�todo para obter a m�dia aritm�tica dos elementos da pilha. 
	{
		int med = 0;								// Vari�vel auxiliar para armazenar a m�dia.
		
		for (int f = 0; f < a.length; f++)
		{
			med = (med + a[f]);					// Soma o valor de cada elemento no vetor...
		}
		med = (med / a.length);					// ...e divide pelo n�mero de elementos, obtendo a m�dia. 
		
		return med;								// Retorna a m�dia (arredondada). 
	}
	
}	// =============================== // FIM DO PROGRAMA!
