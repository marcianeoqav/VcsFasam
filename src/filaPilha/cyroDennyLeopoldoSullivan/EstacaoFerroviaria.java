/*	Exercício 13 da lista de filas e pilhas para N2.
 * 
 * 	Implemente a questão 05 discursiva da avaliação N1.
 * 
 * 	Implemente a classe Vagao e a classe EstacaoFerroviaria, esta última
 * 	contendo o método main que conterá as chamadas aos métodos  da classe
 * 	pilha, feita no exercício 1.
 * 
 * 	Implemente as operações descritas nos subitens a e b da questão 5 e 
 * 	imprima o resultado de cada uma dessas sequências de entradas e saídas.* FUDEU/

package listaExerciciosN203FilasPilhas;

public class EstacaoFerroviaria 
{
	public static Fila entra1 = new Fila(6);				// Fila de entrada do item A
	public static Fila entra2 = new Fila(6);				// Fila de entrada do item B
	public static Fila saida1 = new Fila(6);				// Fila de saída do item A
	public static Fila saida2 = new Fila(6);				// Fila de saída do item B
	public static Pilha estac1 = new Pilha(6);				// Pilha de estacionamento do item A
	public static Pilha estac2 = new Pilha(6);				// Pilha de estacionamento do item B
	public static int aux1[] = new int[12];					// Vetor auxiliar que armazenará o tipo de cada operação realizada
	public static int count1 = 0;							// Variável auxiliar que armazenará o índice do vetor Aux1
	
	public static void main(String[] args) 
	{
		int v1[] = new int[6];							// Vetor auxiliar que armazenará o número de cada um dos vagões. 
		for (int i = 0; i < v1.length; i++)
		{
			v1[i] = (i + 1);							// Atribui um número de 1 a 6 aos vagões, na ordem crescente.
		}
		
		for (int j = 0; j < entra1.tamanho(); j++)		// Preenche a fila de entrada do item A.
		{
			Vagao vag1 = new Vagao();
			vag1.num = (v1[j]);
			entra1.enfileira(vag1);
		}
		
		int aux = v1[1];						// Inverte a posição dos vagões 2 e 3
		v1[1] = v1[2];							// na fila de entrada do item B, possibilitando
		v1[2] = aux;							// que a sequência de saída desejada seja obtida.
		
		for (int k = 0; k < entra2.tamanho(); k++)		// Preenche a fila de entrada do item B.
		{
			Vagao vag2 = new Vagao();
			vag2.num = v1[k];
			entra2.enfileira(vag2);
		}
		
		System.out.print("Operações do item A: \n\n");		// Realiza as operações necessárias para obter a sequência de saída desejada.
		
		estaciona(entra1, estac1);					// Três inserções, invocando o método estaciona e passando a fila de entrada e a pilha de estacionamento
		estaciona(entra1, estac1);					// como parâmetros. O método tira o primeiro elemento da fila e armazena na pilha.
		estaciona(entra1, estac1);					//
		
		sai(estac1, saida1);						// Duas retiradas, invocando o método sai e passando a pilha de estacionamento e a fila de saída
		sai(estac1, saida1);						// como parâmetros. O método tira o primeiro elemento da pilha e armazena na fila. 
		
		estaciona(entra1, estac1);					//
		estaciona(entra1, estac1);					// Demais operações de entrada e saída, conforme necessário para alcançar
													// o resultado desejado.
		sai(estac1, saida1);						// 
													// Cada vez que uma dessas operações é executada, o código referente ao tipo de 
		estaciona(entra1, estac1);					// operação (R ou I) é impresso na tela pelo método invocado.
													//
		sai(estac1, saida1);						//
		sai(estac1, saida1);						//
		sai(estac1, saida1);						//
		
		
		
		System.out.print("\n");						// Agora já temos a sequência de operações impressa na tela...
		
		for (int r = 0; r < aux1.length; r++)		
		{
			System.out.print(aux1[r] + "  ");		// ...então vamos imprimir o número do vagão vinculado a cada uma das operações.
		}
		
		System.out.print("\n\nResultado:\n\n");					// Em seguida, mostraremos a ordem em que os vagões ficaram na fila de saída.
		
		for (int s = 0; s < saida1.tamanho(); s++)
		{
			try 
			{
				Vagao vagon = (Vagao) saida1.desenfileira();
				System.out.print(vagon.num + "  ");				// Imprime os números dos vagões, na ordem em que eles estão na fila de saída.
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		count1 = 0;					// Zeramos o contador para poder reaproveitá-lo. 
		System.out.print("\n\n");
		
		System.out.print("Operações do item B: \n(Invertendo a posição dos vagões 2 e 3 na entrada)\n\n");
		
		estaciona(entra2, estac2);							//
															//
		sai(estac2, saida2);								//
															//
		estaciona(entra2, estac2);							//	Operações de entrada e saída para o item B da questão.
		estaciona(entra2, estac2);							//
		estaciona(entra2, estac2);							//	
		estaciona(entra2, estac2);							//
															//
		sai(estac2, saida2);								//
		sai(estac2, saida2);								//
															//
		estaciona(entra2, estac2);							//
															//
		sai(estac2, saida2);								//
		sai(estac2, saida2);								//
		sai(estac2, saida2);								//
															//
		System.out.print("\n");			
		

		for (int r = 0; r < aux1.length; r++)
		{
			System.out.print(aux1[r] + "  ");				// Imprime o número dos vagões vinculados a cada uma das operações feitas acima.
		}
		
	System.out.print("\n\nResultado:\n\n");
		
		for (int s = 0; s < saida2.tamanho(); s++)
		{
			try 
			{
				Vagao vagon = (Vagao) saida2.desenfileira();		// Imprime o número dos vagões na ordem em que eles estão na fila de saída. 
				System.out.print(vagon.num + "  ");
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
	}
	
	public static void estaciona(Fila ent, Pilha est)		// Método para tirar vagões da entrada e colocá-los no estacionamento. 
	{														// Recebe como parâmetros a fila de entrada e a pilha de estacionamento.
		try 
		{
			Vagao vag = (Vagao) ent.desenfileira();			// Remove um vagão da fila...
			est.empilha(vag);								// ... e coloca na pilha.
			aux1[count1++] = vag.num;						// Armazena o número do vagão no vetor auxiliar, que exibirá o resultado das operações.
			System.out.print("I  ");						// Imprime o tipo de operação: I = inserção.
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
	}
	
	public static void sai(Pilha est, Fila sai)				// Método para tirar vagões do estacionamento e colocá-los na saída.
	{														// Recebe como parâmetros a pilha de estacionamento e a fila de saída.
		Vagao vag3 = (Vagao) est.desempilha();				// Remove um vagão da pilha...
		sai.enfileira(vag3);								// ...e o coloca na fila de saída.
		aux1[count1++] = vag3.num;							// Armazena o número do vagão no vetor auxiliar... 
		System.out.print("R  ");							// E imprime o código da operação: R = retirada.
	}

}	// ============================ // FIM DO PROGRAMA!
