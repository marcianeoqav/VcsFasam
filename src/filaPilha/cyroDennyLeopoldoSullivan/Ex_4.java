/*	Exerc�cio 4 da lista de filas e pilhas para N2.
 * 
 * 	Usando o TAD FILA, implemente o exerc�cio 6 da lista de vetores para N2:
 * 
 * Escreva uma fun��o em Java que receba como par�metro dois vetores num�ricos A e B e sua respectiva quantidade de elementos.
 * Essa fun��o dever� intercalar esses vetores A e B, formando outro vetor C, conforme especificado abaixo. Retorne C.
 * C[1] = A[1]
 * C[2] = B[1]
 * C[3] = A[2]
 * C[4] = B[2] E ASSIM POR DIANTE.
 * 
 * Apenas uma classe, tr�s m�todos: Preenchimento dos vetores, Intercala��o (retorna vetor intercalado), main.*/

package listaExerciciosN203FilasPilhas;

public class Ex_4 
{

	public static void main(String[] args) 
	{
		Fila f1 = new Fila(5);				// Instancia uma fila com 5 elementos;
		preenche(f1, f1.tamanho());			// Invoca o m�todo de preenchimento, passando a fila e o tamanho como par�metros.
		
		Fila f2 = new Fila(5);				// Instancia a segunda fila com 5 elementos;
		preenche(f2, f2.tamanho());			// Invoca o m�todo de preenchimento, passando a fila e o tamanho como par�metros.
		
		System.out.print("Fila 1: \n");
		f1.imprimeTodos();					// Imprime a primeira fila para facilitar a confer�ncia.
		
		System.out.print("Fila 2: \n");
		f2.imprimeTodos();					// Imprime a segunda fila para facilitar a confer�ncia.
		
		Fila f3 = intercala(f1, f2);		// Instancia a terceira fila, invocando o m�todo de intercala��o para
											// preench�-la e passando as duas filas anteriores como par�metros.
		
		System.out.print("Fila intercalada: \n");
		f3.imprimeTodos();					// Imprime a fila intercalada.		
	}
	
	
	public static void preenche(Fila a, int x)	// M�todo de preenchimento, recebe a fila e o tamanho como par�metros.
	{
		for (int i = 0; i < x; i++)
		{
			a.enfileira(((int) (Math.random() * 20) + 1));	// invoca o m�todo de enfileiramento, usando um 
		}													// n�mero aleat�rio como o valor a ser armazenado.
	}
	
	
	public static Fila intercala(Fila a, Fila b)	// M�todo de intercala��o. Recebe duas filas como par�metros.
	{
		int comp = (a.tamanho() + b.tamanho());		// Vari�vel que armazena a soma dos tamanhos das duas filas recebidas.
		Fila aux = new Fila(comp);					// Instancia uma fila auxiliar, com tamanho igual � soma das filas recebidas.
		
		for (int j = 0; j < (aux.tamanho() / 2); j++)	// Repete pelo tamanho da fila auxiliar / 2, pois 2 elementos entram de cada vez.
		{
			try 
			{
				aux.enfileira(a.desenfileira());		// Remove um elemento da fila 1 e armazena na fila auxiliar.
				aux.enfileira(b.desenfileira());		// Remove um elemento da fila 2 e armazena na fila auxiliar.
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return aux;				// Retorna a fila intercalada.
	}
	
}	// ===================== // FIM DO PROGRAMA!
