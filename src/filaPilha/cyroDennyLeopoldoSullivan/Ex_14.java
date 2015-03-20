/*	Exerc�cio 14 da lista de filas e pilhas para N2.
 * 
 * 	Fa�a um programa que cadastre cinco nomes em uma fila e mais cinco em uma 
 *  pilha. Em seguida o programa dever� mostrar tr�s relat�rios. O primeiro ter� os nomes que 
 *  est�o nas duas estruturas. O segundo ter� os que est�o apenas na fila e o terceiro ter� os que 
 *  est�o apenas na fila*/

package listaExerciciosN203FilasPilhas;

	// A fim de facilitar a confer�ncia, criei um m�todo para preencher aleatoriamente a fila e a pilha a partir
	// de um vetor com v�rios nomes. Execute o programa algumas vezes para ver os diferentes resultados poss�veis. 

public class Ex_14 
{
									// ALTERE este valor para limitar ou expandir o n�mero de nomes dispon�veis para sele��o aleat�ria.
	public static int seed = 20; 	// N�meros menores v�o gerar mais chances de ter nomes aparecendo na pilha e na fila ao mesmo tempo. 
									// Por exemplo, 5 far� com que todos os nomes selecionados apare�am nas duas estruturas.
									// A faixa de valores v�lidos � de 5 a 20. Experimente com 5, 6 e 20 para ver como 
									// as mensagens ao usu�rio s�o alteradas de acordo com o resultado.
	
	
	public static Fila f1 = new Fila(5);			// Fila para armazenar nomes.
	public static Pilha p1 = new Pilha(5);			// Pilha para armazenar nomes.
	
																	// Vetor de nomes para escolha aleat�ria pelo programa :D	
	public static String nomes[] = {"Adalgyzo   ", "Berenisso  ", "Catarino   ", "Danielo    ", "Elis�ngelo ", "Francineido", "Genovevo   ", "Hort�nsio  ", "Isabelo    ", "Jaquelino  ", "K�tio      ", 
									"Liliano    ", "Margarido  ", "Neuzo      ", "Ol�vio     ", "Priscilo   ", "Quit�rio   ", "Ros�ngelo  ", "Sabrino    ", "Tereso     ", "�rsulo     ", "Vanderl�io "};
	
	public static String aux1[] = new String[p1.tamanho()];					// Vetor auxiliar para a pilha;
	public static String aux2[] = new String[f1.tamanho()];					// Vetor auxiliar para a fila;
	public static String comum = "";							// Vari�vel que armazenar� os nomes que aparecem na fila E na pilha.
	public static String resfila = "Nomes exibidos somente na fila:\n";
	public static String respilha = "Nomes exibidos somente na pilha:\n";
	
	public static void main(String[] args) 
	{
		preenchePilha(p1);											// Invoca o m�todo de preenchimento da pilha
		System.out.print("Nomes sorteados para a pilha: \n");		// e exibe os nomes escolhidos.
		p1.imprimeTudo();											//
		
		preencheFila(f1);											// Invoca o m�todo de preenchimento da fila
		System.out.print("Nomes sorteados para a fila: \n");		// e exibe os nomes escolhidos. 
		f1.imprimeTodos();											//	
		
		localizaComum(p1, f1);						// Invoca o m�todo de localiza��o de nomes, passando a pilha e a fila como par�metros. 
	}
	
	public static void preenchePilha(Pilha p)				// M�todo de preenchimento da pilha. Recebe uma pilha como par�metro. 
	{
		int vP[] = new int[p.tamanho()];				// Vetor auxiliar que armazenar� os �ndices dos nomes. 
		for (int j = 0; j < p.tamanho(); j ++)
		{
			vP[j] = (int) (Math.random() * seed) + 1;			// Seleciona �ndices aleat�rios para os nomes...
			for (int k = 0; k < j; k++)
			{
				if (vP[j] == vP[k])							// ...e verifica se h� �ndices repetidos no vetor. Se houver,
				{
					j = k = 0;								// ...refaz a sele��o dos �ndices para eliminar nomes repetidos na pilha. 
				}
			}
		}
		
		for (int c = 0; c < vP.length; c++)
			{
				p.empilha(nomes[vP[c]]);						// Preenche a pilha com nomes aleat�rios e n�o repetidos!
			}
	}
	
	public static void preencheFila(Fila f)					// M�todo de preenchimento da fila. Recebe uma fila como par�metro. 			
	{
		int vF[] = new int[f.tamanho()];					// Vetor auxiliar que armazenar� os �ndices dos nomes da fila. 
		for (int j = 0; j < f.tamanho(); j ++)
		{
			vF[j] = (int) (Math.random() * seed) + 1;			// Seleciona um �ndice aleat�rio entre 0 e 21...
			for (int k = 0; k < j; k++)
			{
				if (vF[j] == vF[k])							// ...e verifica se h� �ndices repetidos. Se houver...
				{
					j = k = 0;								// ...refaz a sele��o dos �ndices para eliminar nomes repetidos na fila. 
				}
			}
		}
		
		for (int p = 0; p < vF.length; p++)	
		{
			f.enfileira(nomes[vF[p]]);  						// Preenche a fila com nomes aleat�rios e n�o repetidos!
		}
		
	}
	
	
	public static void localizaComum(Pilha p, Fila f)		// M�todo de localiza��o de nomes que est�o na pilha E na fila.
	{														// Recebe uma pilha e uma fila como par�metros. 
		
		int cntcomum = 0;							// Vari�vel auxiliar que armazenar� o n�mero de nomes que aparecem tanto na fila como na pilha. 
		
		for (int k = 0; k < aux1.length; k++)
		{
			try 
			{
				aux1[k] = (String) p.desempilha();			// Armazena os nomes da pilha no vetor auxiliar 1
				aux2[k] = (String) f.desenfileira();		// Armazena os nomes da fila no vetor auxiliar 2
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		for (int l = 0; l < aux1.length; l++)						// Percorre os dois vetores...
		{
			for (int m = 0; m < aux2.length; m++)
			{
				if (aux1[l].equals(aux2[m]) && ((!aux1[l].equals("")) || (!aux2[m].equals(""))))		// ...procurando por nomes iguais. 
				{
					comum = (comum + aux1[l] + "\t");	// Se encontrar, armazena o nome na vari�vel do tipo String chamada "comum". 
					aux1[l] = "";						// Anula os nomes encontrados, tanto no vetor da pilha
					aux2[m] = "";						// como no vetor da fila (assim eles n�o aparecer�o v�rias vezes na pesquisa).
					cntcomum++;					// Incrementa o contador de nomes que estavam nas duas estruturas.  
				}
			}
		}
		
		switch(cntcomum)			// Avalia o valor do contador de nomes que apareceram na fila E na pilha. 
		{
		
		case 0:						// Se o valor for 0, n�o h� nomes que aparecem na fila e na pilha. 
			
			System.out.print("NENHUM NOME FOI ENCONTRADO NAS DUAS ESTRUTURAS!\n");
			break;
			
		case 1:						// Se o valor for 1, somente um nome foi encontrado. 						
			
			System.out.print("O NOME QUE EST� NAS DUAS ESTRUTURAS �: \n" + comum + "\n");
			break;
			
		case 4:
			
			System.out.print("OS NOMES QUE EST�O NAS DUAS ESTRUTURAS S�O: \n" + comum + "\n");
			resfila = "Nome exibido somente na fila:\n";
			respilha = "Nome exibido somente na pilha:\n";
			break;
			
		case 5:
			
			System.out.print("TODOS OS NOMES EST�O NAS DUAS ESTRUTURAS: \n" + comum + "\n");
			resfila = "Nenhum nome � exibido somente na fila.\n";
			respilha = "Nenhum nome � exibido somente na pilha.\n";
			break;
			
		default:					// Qualquer outro valor indica que dois ou mais nomes foram encontrados. 
			
			System.out.print("OS NOMES QUE EST�O NAS DUAS ESTRUTURAS S�O: \n" + comum + "\n");
			break;
		}
		
		System.out.print("\n\n" + respilha);		// Os nomes que aparecem na pilha E na fila foram removidos dos respectivos vetores. 
		for (int n = 0; n < aux1.length; n++)								// Assim, os nomes restantes est�o presentes apenas na pilha ou apenas na fila. 
		{
			if (!aux1[n].equals(""))
			{
			System.out.print(aux1[n] + "\t");								// Exibe os nomes restantes da pilha. 
			}
		}
		
		System.out.print("\n\n" + resfila);
		for (int n = 0; n < aux2.length; n++)
		{
			if (!aux2[n].equals(""))
			{	
			System.out.print(aux2[n] + "\t");								// Exibe os nomes restantes da fila. 
			}
		}
	}
} //===============================// FIM DO PROGRAMA!
