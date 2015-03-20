/*	Exercício 7 da lista de filas e pilhas para N2.
 * 
 * Implemente uma classe com um método para ordenar pilhas, sendo que no final do 
 * processamento os elementos da pilha devem estar dispostos em ordem crescente de seus 
 * valores. Determine e utilize a estrutura auxiliar mais adequada que julgar necessária para 
 * suportar o processo.*/

package listaExerciciosN203FilasPilhas;

public class Ex_7 
{

	public static void main(String[] args) 
	{
		Pilha p1 = new Pilha(10);				// Instancia uma nova pilha com 10 posições, porque dez é 10.
		preenche(p1, p1.tamanho());				// Invoca o método de preenchimento da pilha.
		
		System.out.print("Pilha original com valores aleatórios:\n");		// Imprime a pilha original.
		p1.imprimeTudo();
		
		Pilha p2 = ordena(p1, p1.tamanho());				// Invoca o método de ordenação, passando a pilha e seu tamanho como parâmetros.
		
		System.out.print("Pilha com valores na ordem crescente:\n");
		p2.imprimeTudo();							// Imprime a pilha ordenada. 
	}
	
	public static void preenche(Pilha a, int x)	// Método de preenchimento, recebe a pilha e o tamanho como parâmetros.
	{
		for (int i = 0; i < x; i++)
		{
			a.empilha(((int) (Math.random() * 20) + 1));	// invoca o método de empilhamento, usando um 
		}													// número aleatório como o valor a ser armazenado.
	}
	
	public static Pilha ordena(Pilha a, int x)		// Método de ordenação. Recebe a pilha e seu tamanho como parâmetros.
	{
		int aux;									// Variável auxiliar a ser usada na ordenação.
		int v1[] = new int[x];						// Vetor auxiliar a ser usado na ordenação.
		
		for (int i = 0; i < x; i++)
		{
			v1[i] = (int) a.desempilha();		// Remove os elementos da pilha e armazena no vetor.
		}
		
		for (int j = 0; j < x; j++)
		{
			for (int k = (j+1); k < v1.length; k++)
			{
				if (v1[j] < v1[k])
				{
					aux = v1[j];					// Ordena o vetor na ordem DECRESCENTE, pois assim os elementos
					v1[j] = v1[k];					// serão inseridos na pilha do maior para o menor,	
					v1[k] = aux;					// resultando em uma pilha CRESCENTE, conforme pedido pelo exercício.
				}
			}
		}
		
		for (int m = 0; m < x; m++)
		{
			a.empilha(v1[m]);					// Armazena os elementos do vetor na pilha, onde os últimos serão os primeiros!
		}
		return a;			// Retorna a pilha ordenada. 
	}

}  // ==================== // FIM DO PROGRAMA!
