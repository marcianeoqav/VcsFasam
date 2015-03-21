/*	Exerc�cio 13 da lista de filas e pilhas para N2.
 * 
 * 	Implemente a quest�o 05 discursiva da avalia��o N1.
 * 
 * 	Implemente a classe Vagao e a classe EstacaoFerroviaria, esta �ltima
 * 	contendo o m�todo main que conter� as chamadas aos m�todos  da classe
 * 	pilha, feita no exerc�cio 1.
 * 
 * 	Implemente as opera��es descritas nos subitens a e b da quest�o 5 e 
 * 	imprima o resultado de cada uma dessas sequ�ncias de entradas e sa�das.* FUDEU/

package listaExerciciosN203FilasPilhas;

public class EstacaoFerroviaria 
{
	public static Fila entra1 = new Fila(6);				// Fila de entrada do item A
	public static Fila entra2 = new Fila(6);				// Fila de entrada do item B
	public static Fila saida1 = new Fila(6);				// Fila de sa�da do item A
	public static Fila saida2 = new Fila(6);				// Fila de sa�da do item B
	public static Pilha estac1 = new Pilha(6);				// Pilha de estacionamento do item A
	public static Pilha estac2 = new Pilha(6);				// Pilha de estacionamento do item B
	public static int aux1[] = new int[12];					// Vetor auxiliar que armazenar� o tipo de cada opera��o realizada
	public static int count1 = 0;							// Vari�vel auxiliar que armazenar� o �ndice do vetor Aux1
	
	public static void main(String[] args) 
	{
		int v1[] = new int[6];							// Vetor auxiliar que armazenar� o n�mero de cada um dos vag�es. 
		for (int i = 0; i < v1.length; i++)
		{
			v1[i] = (i + 1);							// Atribui um n�mero de 1 a 6 aos vag�es, na ordem crescente.
		}
		
		for (int j = 0; j < entra1.tamanho(); j++)		// Preenche a fila de entrada do item A.
		{
			Vagao vag1 = new Vagao();
			vag1.num = (v1[j]);
			entra1.enfileira(vag1);
		}
		
		int aux = v1[1];						// Inverte a posi��o dos vag�es 2 e 3
		v1[1] = v1[2];							// na fila de entrada do item B, possibilitando
		v1[2] = aux;							// que a sequ�ncia de sa�da desejada seja obtida.
		
		for (int k = 0; k < entra2.tamanho(); k++)		// Preenche a fila de entrada do item B.
		{
			Vagao vag2 = new Vagao();
			vag2.num = v1[k];
			entra2.enfileira(vag2);
		}
		
		System.out.print("Opera��es do item A: \n\n");		// Realiza as opera��es necess�rias para obter a sequ�ncia de sa�da desejada.
		
		estaciona(entra1, estac1);					// Tr�s inser��es, invocando o m�todo estaciona e passando a fila de entrada e a pilha de estacionamento
		estaciona(entra1, estac1);					// como par�metros. O m�todo tira o primeiro elemento da fila e armazena na pilha.
		estaciona(entra1, estac1);					//
		
		sai(estac1, saida1);						// Duas retiradas, invocando o m�todo sai e passando a pilha de estacionamento e a fila de sa�da
		sai(estac1, saida1);						// como par�metros. O m�todo tira o primeiro elemento da pilha e armazena na fila. 
		
		estaciona(entra1, estac1);					//
		estaciona(entra1, estac1);					// Demais opera��es de entrada e sa�da, conforme necess�rio para alcan�ar
													// o resultado desejado.
		sai(estac1, saida1);						// 
													// Cada vez que uma dessas opera��es � executada, o c�digo referente ao tipo de 
		estaciona(entra1, estac1);					// opera��o (R ou I) � impresso na tela pelo m�todo invocado.
													//
		sai(estac1, saida1);						//
		sai(estac1, saida1);						//
		sai(estac1, saida1);						//
		
		
		
		System.out.print("\n");						// Agora j� temos a sequ�ncia de opera��es impressa na tela...
		
		for (int r = 0; r < aux1.length; r++)		
		{
			System.out.print(aux1[r] + "  ");		// ...ent�o vamos imprimir o n�mero do vag�o vinculado a cada uma das opera��es.
		}
		
		System.out.print("\n\nResultado:\n\n");					// Em seguida, mostraremos a ordem em que os vag�es ficaram na fila de sa�da.
		
		for (int s = 0; s < saida1.tamanho(); s++)
		{
			try 
			{
				Vagao vagon = (Vagao) saida1.desenfileira();
				System.out.print(vagon.num + "  ");				// Imprime os n�meros dos vag�es, na ordem em que eles est�o na fila de sa�da.
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		count1 = 0;					// Zeramos o contador para poder reaproveit�-lo. 
		System.out.print("\n\n");
		
		System.out.print("Opera��es do item B: \n(Invertendo a posi��o dos vag�es 2 e 3 na entrada)\n\n");
		
		estaciona(entra2, estac2);							//
															//
		sai(estac2, saida2);								//
															//
		estaciona(entra2, estac2);							//	Opera��es de entrada e sa�da para o item B da quest�o.
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
			System.out.print(aux1[r] + "  ");				// Imprime o n�mero dos vag�es vinculados a cada uma das opera��es feitas acima.
		}
		
	System.out.print("\n\nResultado:\n\n");
		
		for (int s = 0; s < saida2.tamanho(); s++)
		{
			try 
			{
				Vagao vagon = (Vagao) saida2.desenfileira();		// Imprime o n�mero dos vag�es na ordem em que eles est�o na fila de sa�da. 
				System.out.print(vagon.num + "  ");
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
	}
	
	public static void estaciona(Fila ent, Pilha est)		// M�todo para tirar vag�es da entrada e coloc�-los no estacionamento. 
	{														// Recebe como par�metros a fila de entrada e a pilha de estacionamento.
		try 
		{
			Vagao vag = (Vagao) ent.desenfileira();			// Remove um vag�o da fila...
			est.empilha(vag);								// ... e coloca na pilha.
			aux1[count1++] = vag.num;						// Armazena o n�mero do vag�o no vetor auxiliar, que exibir� o resultado das opera��es.
			System.out.print("I  ");						// Imprime o tipo de opera��o: I = inser��o.
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
	}
	
	public static void sai(Pilha est, Fila sai)				// M�todo para tirar vag�es do estacionamento e coloc�-los na sa�da.
	{														// Recebe como par�metros a pilha de estacionamento e a fila de sa�da.
		Vagao vag3 = (Vagao) est.desempilha();				// Remove um vag�o da pilha...
		sai.enfileira(vag3);								// ...e o coloca na fila de sa�da.
		aux1[count1++] = vag3.num;							// Armazena o n�mero do vag�o no vetor auxiliar... 
		System.out.print("R  ");							// E imprime o c�digo da opera��o: R = retirada.
	}

}	// ============================ // FIM DO PROGRAMA!
