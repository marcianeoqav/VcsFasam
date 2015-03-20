/* Exerc�cio 9 da lista de filas e pilhas para N2.
 * 
 * Implemente uma classe com m�todos que retorne o maior, o menor e a m�dia aritm�tica dos 
 * elementos de uma Pilha.*/

package listaExerciciosN203FilasPilhas;

public class Ex_9 
{

	public static void main(String[] args) 
	{
	Pilha p1 = new Pilha(10);					// Instancia uma nova pilha com 10 posi��es.
	preenche(p1, p1.tamanho());					// Invoca o m�todo para preencher a pilha. 
	
	System.out.print("Pilha original com valores aleat�rios:\n");		// Imprime a pilha original.
	p1.imprimeTudo();
	
	int top = getMaior(p1);											// Invoca o m�todo para encontrar o maior valor.
	System.out.print("O maior elemento �: " + top + "\n\n");		// Imprime o maior valor.

	int bottom = getMenor(p1);										// Invoca o m�todo para encontrar o menor valor.
	System.out.print("O menor elemento �: " + bottom + "\n\n");		// Imprime o menor valor.
	
	int media = getMedia(p1);																		// Invoca o m�todo para encontrar a m�dia.
	System.out.print("A m�dia aritm�tica (arredondada) de todos os elementos �: " + media + "\n");	// Imprime a m�dia. 
	
	}
	
	public static void preenche(Pilha a, int x)	// M�todo de preenchimento, recebe a pilha e o tamanho como par�metros.
	{
		for (int i = 0; i < x; i++)
		{
			a.empilha(((int) (Math.random() * 20) + 1));	// invoca o m�todo de empilhamento, usando um 
		}													// n�mero aleat�rio como o valor a ser armazenado.
	}
	
	public static int getMaior(Pilha a) 			// M�todo para localizar o maior valor da pilha.
	{
		int maior = 0;								// Vari�vel auxiliar para armazenar o maior valor.
		int v1[] = new int[a.tamanho()];			// Vetor auxiliar para facilitar a opera��o.
		
		for (int c = 0; c < a.tamanho(); c++)
		{
			v1[c] = (int) a.desempilha();			// Remove os elementos da pilha e armazena no vetor.
		}		
		for (int i = 0; i < v1.length; i++)
		{
			a.empilha(v1[(v1.length - 1) - i]);		// Copia os elementos do vetor de volta para a pilha, pois vamos us�-la novamente.
			if (v1[i] > maior)				
			{
				maior = v1[i];						// Grava o maior dos valores comparados.
			}
		}
		return maior;								// Retorna o maior valor. 		
	}
	
	public static int getMenor(Pilha a)				// M�todo para localizar o menor valor da pilha.
	{
		int menor = 20;								// Vari�vel auxiliar, com valor inicial igual ao maior valor poss�vel (determinado no m�todo de preenchimento).
		int v1[] = new int[a.tamanho()];			// Vetor auxiliar para facilitar a opera��o.
		
		for (int c = 0; c < a.tamanho(); c++)
		{
			v1[c] = (int) a.desempilha();			// Remove os elementos da pilha e armazena no vetor. 
		}		
		for (int i = 0; i < v1.length; i++)
		{
			a.empilha(v1[(v1.length - 1) - i]);		// Copia os elementos do vetor de volta para a pilha, pois vamos us�-la novamente.
			if (v1[i] < menor)
			{
				menor = v1[i];						// Armazena o menor dos valores comparados.
			}
		}
		return menor;								// Retorna o menor valor.
	}

	public static int getMedia(Pilha a)				// M�todo para obter a m�dia aritm�tica dos elementos da pilha. 
	{
		int med = 0;								// Vari�vel auxiliar para armazenar a m�dia.
		int v1[] = new int[a.tamanho()];			// Vetor auxiliar para facilitar a opera��o.
		
		for (int d = 0; d < a.tamanho(); d++)
		{
			v1[d] = (int) a.desempilha();			// Remove os elementos da pilha e armazena no vetor. 
		}
		
		for (int f = 0; f < a.tamanho(); f++)
		{
			med = (med + v1[f]);					// Soma o valor de cada elemento no vetor...
		}
		med = (med / a.tamanho());					// ...e divide pelo n�mero de elementos, obtendo a m�dia. 
		
		return med;							// Retorna a m�dia (arredondada). 
	}

}	//=====================// FIM DO PROGRAMA!
