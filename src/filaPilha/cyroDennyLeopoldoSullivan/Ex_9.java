/* Exercício 9 da lista de filas e pilhas para N2.
 * 
 * Implemente uma classe com métodos que retorne o maior, o menor e a média aritmética dos 
 * elementos de uma Pilha.*/

package listaExerciciosN203FilasPilhas;

public class Ex_9 
{

	public static void main(String[] args) 
	{
	Pilha p1 = new Pilha(10);					// Instancia uma nova pilha com 10 posições.
	preenche(p1, p1.tamanho());					// Invoca o método para preencher a pilha. 
	
	System.out.print("Pilha original com valores aleatórios:\n");		// Imprime a pilha original.
	p1.imprimeTudo();
	
	int top = getMaior(p1);											// Invoca o método para encontrar o maior valor.
	System.out.print("O maior elemento é: " + top + "\n\n");		// Imprime o maior valor.

	int bottom = getMenor(p1);										// Invoca o método para encontrar o menor valor.
	System.out.print("O menor elemento é: " + bottom + "\n\n");		// Imprime o menor valor.
	
	int media = getMedia(p1);																		// Invoca o método para encontrar a média.
	System.out.print("A média aritmética (arredondada) de todos os elementos é: " + media + "\n");	// Imprime a média. 
	
	}
	
	public static void preenche(Pilha a, int x)	// Método de preenchimento, recebe a pilha e o tamanho como parâmetros.
	{
		for (int i = 0; i < x; i++)
		{
			a.empilha(((int) (Math.random() * 20) + 1));	// invoca o método de empilhamento, usando um 
		}													// número aleatório como o valor a ser armazenado.
	}
	
	public static int getMaior(Pilha a) 			// Método para localizar o maior valor da pilha.
	{
		int maior = 0;								// Variável auxiliar para armazenar o maior valor.
		int v1[] = new int[a.tamanho()];			// Vetor auxiliar para facilitar a operação.
		
		for (int c = 0; c < a.tamanho(); c++)
		{
			v1[c] = (int) a.desempilha();			// Remove os elementos da pilha e armazena no vetor.
		}		
		for (int i = 0; i < v1.length; i++)
		{
			a.empilha(v1[(v1.length - 1) - i]);		// Copia os elementos do vetor de volta para a pilha, pois vamos usá-la novamente.
			if (v1[i] > maior)				
			{
				maior = v1[i];						// Grava o maior dos valores comparados.
			}
		}
		return maior;								// Retorna o maior valor. 		
	}
	
	public static int getMenor(Pilha a)				// Método para localizar o menor valor da pilha.
	{
		int menor = 20;								// Variável auxiliar, com valor inicial igual ao maior valor possível (determinado no método de preenchimento).
		int v1[] = new int[a.tamanho()];			// Vetor auxiliar para facilitar a operação.
		
		for (int c = 0; c < a.tamanho(); c++)
		{
			v1[c] = (int) a.desempilha();			// Remove os elementos da pilha e armazena no vetor. 
		}		
		for (int i = 0; i < v1.length; i++)
		{
			a.empilha(v1[(v1.length - 1) - i]);		// Copia os elementos do vetor de volta para a pilha, pois vamos usá-la novamente.
			if (v1[i] < menor)
			{
				menor = v1[i];						// Armazena o menor dos valores comparados.
			}
		}
		return menor;								// Retorna o menor valor.
	}

	public static int getMedia(Pilha a)				// Método para obter a média aritmética dos elementos da pilha. 
	{
		int med = 0;								// Variável auxiliar para armazenar a média.
		int v1[] = new int[a.tamanho()];			// Vetor auxiliar para facilitar a operação.
		
		for (int d = 0; d < a.tamanho(); d++)
		{
			v1[d] = (int) a.desempilha();			// Remove os elementos da pilha e armazena no vetor. 
		}
		
		for (int f = 0; f < a.tamanho(); f++)
		{
			med = (med + v1[f]);					// Soma o valor de cada elemento no vetor...
		}
		med = (med / a.tamanho());					// ...e divide pelo número de elementos, obtendo a média. 
		
		return med;							// Retorna a média (arredondada). 
	}

}	//=====================// FIM DO PROGRAMA!
