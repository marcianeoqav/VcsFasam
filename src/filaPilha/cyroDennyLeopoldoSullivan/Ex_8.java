/*	Exerc�cio 8 da lista de filas e pilhas para N2.
 * 
 * Implemente uma classe com um m�todo para ordenar filas, sendo que no final do 
 * processamento os elementos da fila devem estar dispostos em ordem crescente de seus 
 * valores. Determine e utilize a estrutura auxiliar mais adequada que julgar necess�ria para 
 * suportar o processo. Determine a complexidade do seu algoritmo. */

package listaExerciciosN203FilasPilhas;

public class Ex_8 
{

	public static void main(String[] args) 
	{
	Fila f1 = new Fila(10);
	preenche(f1, f1.tamanho());

	System.out.print("Fila original com valores aleat�rios:\n");		// Imprime a fila original.
	f1.imprimeTodos();
	
	Fila f2 = ordena(f1, f1.tamanho());				// Invoca o m�todo de ordena��o, passando a fila e seu tamanho como par�metros.
	
	System.out.print("Fila com valores na ordem crescente:\n");
	f2.imprimeTodos();							// Imprime a fila ordenada. 
	
	}

	public static void preenche(Fila a, int x)	// M�todo de preenchimento, recebe a fila e o tamanho como par�metros.
	{
		for (int i = 0; i < x; i++)
		{
			a.enfileira(((int) (Math.random() * 20) + 1));	// invoca o m�todo de enfileiramento, usando um 
		}													// n�mero aleat�rio como o valor a ser armazenado.
	}
	
	public static Fila ordena(Fila a, int x)		// M�todo de ordena��o. Recebe a fila e seu tamanho como par�metros.
	{
		int aux;									// Vari�vel auxiliar a ser usada na ordena��o.
		int v1[] = new int[x];						// Vetor auxiliar a ser usado na ordena��o.
		
		for (int i = 0; i < x; i++)
		{
			try 
			{
				v1[i] = (int) a.desenfileira();		// Remove os elementos da fila e armazena no vetor.
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		for (int j = 0; j < x; j++)
		{
			for (int k = (j+1); k < v1.length; k++)
			{
				if (v1[j] > v1[k])
				{
					aux = v1[j];					// Ordena o vetor na ordem CRESCENTE
					v1[j] = v1[k];						
					v1[k] = aux;					
				}
			}
		}
		
		Fila b = new Fila(x);
		
		for (int m = 0; m < x; m++)
		{
			b.enfileira(v1[m]);					// Armazena os elementos do vetor na fila
		}
		return b;			// Retorna a fila ordenada. 
	}
	
} //======================== // FIM DO PROGRAMA!
