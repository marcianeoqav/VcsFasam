/* Exercício 3 da lista de filas e pilhas para N2.
 * 
 * Usando o TAD FILA, implemente o Exercício 5 da lista de vetores para N2:
 * 
 * (aaaafff exercícios recursivos) 
 * 
 * Implemente um programa em Java para ler um vetor de inteiros com 10 posições
 * e um valor inteiro x informado pelo usuário. O programa deve pesquisar a 
 * existência de x no vetor. Se encontrar, devolver a posição em que ele se 
 * encontra. Caso contrário, retornar -1.
 * Instruções:
 * 		* Implementar somente uma classe java contendo os métodos abaixo:
 * 		* Um método para preencher o vetor. Recebe o vetor como parâmetro, 
 * 		  não retorna valores.
 * 		* Um método para pesquisar se x existe no vetor. Esse método recebe
 * 		  como parâmetro o vetor e o valor de X. Deve retornar a posição em
 * 		  que X se encontra, ou -1, se o valor não estiver no vetor.
 * 		* Método main para instanciar o vetor e o valor de X, chamar o método
 * 		  de pesquisa e apresentar ao usuário uma mensagem informando
 * 			A) O valor pesquisado e a posição, se encontrado;
 * 			B) Aviso ao usuário de que o valor não foi encontrado. */

package listaExerciciosN203FilasPilhas;

import javax.swing.JOptionPane;

public class Ex_3 
{

	public static void main(String[] args) 
	{		
		Fila f1 = new Fila(10);									// Instancia uma nova fila com 10 posições.
				
		for (int i = 0; i < f1.tamanho(); i++)
		{
			f1.enfileira(((int) (Math.random() * 20) + 1));		// Preenche a fila com valores aleatórios.
		}
		
		System.out.print("Gerando fila inicial com valores aleatórios: \n\n");	// Imprime a fila.
		f1.imprimeTodos();
		
		Object getX = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja pesquisar."));	// Informado pelo usuário.
		
		Object res[] = new Object[f1.tamanho()];	// Cria um vetor auxiliar para procurar o valor informado pelo usuário.
		for (int j = 0; j < res.length; j++)
		{
			try 
			{
				res[j] = f1.desenfileira();			// Remove os elementos da fila e armazena no vetor, na mesma ordem.
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		Object result = pesquisa(res, getX);		/* Invoca o método de busca para ver se o valor procurado está no vetor. 
													 * Tanto o vetor como o número procurado são passados ao método de busca 
													 * como parâmetros.	O resultado é armazenado na variável local "result". */
		
		if (result.equals(-1))			// Se o resultado for -1...
		{
			System.out.print("O número pesquisado não foi encontrado.\n"); // Informa ao usuário que o número não foi encontrado.
		}
		else							// Qualquer outro resultado será o índice em que o valor foi encontrado.
		{
			int show = (int) (result);
			System.out.print("O número " + getX + " foi encontrado na posição " + (show + 1));	// Informa ao usuário o valor e a posição.
		}

	}
	
	public static Object pesquisa(Object v1[], Object x) 	// Método de busca. Recebe um vetor e o valor a ser buscado no vetor.
	{
		Object aux = -1;						// Resultado inicial de -1, indicando que o número procurado ainda não foi encontrado.
		for (int j = 0; j < v1.length; j++)
		{
			if (v1[j] == x)						// Se o número for encontrado...
			{
				aux = j;						// ...então o resultado passa a ser o índice do número no vetor. 
				break;
			}
		}
		return aux;					// Retorna o resultado!
	}

}	// ==================== // FIM DO PROGRAMA!
