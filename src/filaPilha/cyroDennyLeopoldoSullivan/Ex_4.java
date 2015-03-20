/*	Exercício 4 da lista de filas e pilhas para N2.
 * 
 * 	Usando o TAD FILA, implemente o exercício 6 da lista de vetores para N2:
 * 
 * Escreva uma função em Java que receba como parâmetro dois vetores numéricos A e B e sua respectiva quantidade de elementos.
 * Essa função deverá intercalar esses vetores A e B, formando outro vetor C, conforme especificado abaixo. Retorne C.
 * C[1] = A[1]
 * C[2] = B[1]
 * C[3] = A[2]
 * C[4] = B[2] E ASSIM POR DIANTE.
 * 
 * Apenas uma classe, três métodos: Preenchimento dos vetores, Intercalação (retorna vetor intercalado), main.*/

package listaExerciciosN203FilasPilhas;

public class Ex_4 
{

	public static void main(String[] args) 
	{
		Fila f1 = new Fila(5);				// Instancia uma fila com 5 elementos;
		preenche(f1, f1.tamanho());			// Invoca o método de preenchimento, passando a fila e o tamanho como parâmetros.
		
		Fila f2 = new Fila(5);				// Instancia a segunda fila com 5 elementos;
		preenche(f2, f2.tamanho());			// Invoca o método de preenchimento, passando a fila e o tamanho como parâmetros.
		
		System.out.print("Fila 1: \n");
		f1.imprimeTodos();					// Imprime a primeira fila para facilitar a conferência.
		
		System.out.print("Fila 2: \n");
		f2.imprimeTodos();					// Imprime a segunda fila para facilitar a conferência.
		
		Fila f3 = intercala(f1, f2);		// Instancia a terceira fila, invocando o método de intercalação para
											// preenchê-la e passando as duas filas anteriores como parâmetros.
		
		System.out.print("Fila intercalada: \n");
		f3.imprimeTodos();					// Imprime a fila intercalada.		
	}
	
	
	public static void preenche(Fila a, int x)	// Método de preenchimento, recebe a fila e o tamanho como parâmetros.
	{
		for (int i = 0; i < x; i++)
		{
			a.enfileira(((int) (Math.random() * 20) + 1));	// invoca o método de enfileiramento, usando um 
		}													// número aleatório como o valor a ser armazenado.
	}
	
	
	public static Fila intercala(Fila a, Fila b)	// Método de intercalação. Recebe duas filas como parâmetros.
	{
		int comp = (a.tamanho() + b.tamanho());		// Variável que armazena a soma dos tamanhos das duas filas recebidas.
		Fila aux = new Fila(comp);					// Instancia uma fila auxiliar, com tamanho igual à soma das filas recebidas.
		
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
