/*	Exerc�cio 7 da lista de filas e pilhas para N2.
 * 
 * Implemente uma classe com um m�todo para ordenar pilhas, sendo que no final do 
 * processamento os elementos da pilha devem estar dispostos em ordem crescente de seus 
 * valores. Determine e utilize a estrutura auxiliar mais adequada que julgar necess�ria para 
 * suportar o processo.*/

package listaExerciciosN203FilasPilhas;

public class Ex_7 
{

	public static void main(String[] args) 
	{
		Pilha p1 = new Pilha(10);				// Instancia uma nova pilha com 10 posi��es, porque dez � 10.
		preenche(p1, p1.tamanho());				// Invoca o m�todo de preenchimento da pilha.
		
		System.out.print("Pilha original com valores aleat�rios:\n");		// Imprime a pilha original.
		p1.imprimeTudo();
		
		Pilha p2 = ordena(p1, p1.tamanho());				// Invoca o m�todo de ordena��o, passando a pilha e seu tamanho como par�metros.
		
		System.out.print("Pilha com valores na ordem crescente:\n");
		p2.imprimeTudo();							// Imprime a pilha ordenada. 
	}
	
	public static void preenche(Pilha a, int x)	// M�todo de preenchimento, recebe a pilha e o tamanho como par�metros.
	{
		for (int i = 0; i < x; i++)
		{
			a.empilha(((int) (Math.random() * 20) + 1));	// invoca o m�todo de empilhamento, usando um 
		}													// n�mero aleat�rio como o valor a ser armazenado.
	}
	
	public static Pilha ordena(Pilha a, int x)		// M�todo de ordena��o. Recebe a pilha e seu tamanho como par�metros.
	{
		int aux;									// Vari�vel auxiliar a ser usada na ordena��o.
		int v1[] = new int[x];						// Vetor auxiliar a ser usado na ordena��o.
		
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
					v1[j] = v1[k];					// ser�o inseridos na pilha do maior para o menor,	
					v1[k] = aux;					// resultando em uma pilha CRESCENTE, conforme pedido pelo exerc�cio.
				}
			}
		}
		
		for (int m = 0; m < x; m++)
		{
			a.empilha(v1[m]);					// Armazena os elementos do vetor na pilha, onde os �ltimos ser�o os primeiros!
		}
		return a;			// Retorna a pilha ordenada. 
	}

}  // ==================== // FIM DO PROGRAMA!
