/* Exerc�cio 3 da lista de filas e pilhas para N2.
 * 
 * Usando o TAD FILA, implemente o Exerc�cio 5 da lista de vetores para N2:
 * 
 * (aaaafff exerc�cios recursivos) 
 * 
 * Implemente um programa em Java para ler um vetor de inteiros com 10 posi��es
 * e um valor inteiro x informado pelo usu�rio. O programa deve pesquisar a 
 * exist�ncia de x no vetor. Se encontrar, devolver a posi��o em que ele se 
 * encontra. Caso contr�rio, retornar -1.
 * Instru��es:
 * 		* Implementar somente uma classe java contendo os m�todos abaixo:
 * 		* Um m�todo para preencher o vetor. Recebe o vetor como par�metro, 
 * 		  n�o retorna valores.
 * 		* Um m�todo para pesquisar se x existe no vetor. Esse m�todo recebe
 * 		  como par�metro o vetor e o valor de X. Deve retornar a posi��o em
 * 		  que X se encontra, ou -1, se o valor n�o estiver no vetor.
 * 		* M�todo main para instanciar o vetor e o valor de X, chamar o m�todo
 * 		  de pesquisa e apresentar ao usu�rio uma mensagem informando
 * 			A) O valor pesquisado e a posi��o, se encontrado;
 * 			B) Aviso ao usu�rio de que o valor n�o foi encontrado. */

package listaExerciciosN203FilasPilhas;

import javax.swing.JOptionPane;

public class Ex_3 
{

	public static void main(String[] args) 
	{		
		Fila f1 = new Fila(10);									// Instancia uma nova fila com 10 posi��es.
				
		for (int i = 0; i < f1.tamanho(); i++)
		{
			f1.enfileira(((int) (Math.random() * 20) + 1));		// Preenche a fila com valores aleat�rios.
		}
		
		System.out.print("Gerando fila inicial com valores aleat�rios: \n\n");	// Imprime a fila.
		f1.imprimeTodos();
		
		Object getX = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero que deseja pesquisar."));	// Informado pelo usu�rio.
		
		Object res[] = new Object[f1.tamanho()];	// Cria um vetor auxiliar para procurar o valor informado pelo usu�rio.
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
		
		Object result = pesquisa(res, getX);		/* Invoca o m�todo de busca para ver se o valor procurado est� no vetor. 
													 * Tanto o vetor como o n�mero procurado s�o passados ao m�todo de busca 
													 * como par�metros.	O resultado � armazenado na vari�vel local "result". */
		
		if (result.equals(-1))			// Se o resultado for -1...
		{
			System.out.print("O n�mero pesquisado n�o foi encontrado.\n"); // Informa ao usu�rio que o n�mero n�o foi encontrado.
		}
		else							// Qualquer outro resultado ser� o �ndice em que o valor foi encontrado.
		{
			int show = (int) (result);
			System.out.print("O n�mero " + getX + " foi encontrado na posi��o " + (show + 1));	// Informa ao usu�rio o valor e a posi��o.
		}

	}
	
	public static Object pesquisa(Object v1[], Object x) 	// M�todo de busca. Recebe um vetor e o valor a ser buscado no vetor.
	{
		Object aux = -1;						// Resultado inicial de -1, indicando que o n�mero procurado ainda n�o foi encontrado.
		for (int j = 0; j < v1.length; j++)
		{
			if (v1[j] == x)						// Se o n�mero for encontrado...
			{
				aux = j;						// ...ent�o o resultado passa a ser o �ndice do n�mero no vetor. 
				break;
			}
		}
		return aux;					// Retorna o resultado!
	}

}	// ==================== // FIM DO PROGRAMA!
