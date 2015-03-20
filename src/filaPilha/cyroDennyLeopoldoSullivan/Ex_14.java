/*	Exercício 14 da lista de filas e pilhas para N2.
 * 
 * 	Faça um programa que cadastre cinco nomes em uma fila e mais cinco em uma 
 *  pilha. Em seguida o programa deverá mostrar três relatórios. O primeiro terá os nomes que 
 *  estão nas duas estruturas. O segundo terá os que estão apenas na fila e o terceiro terá os que 
 *  estão apenas na fila*/

package listaExerciciosN203FilasPilhas;

	// A fim de facilitar a conferência, criei um método para preencher aleatoriamente a fila e a pilha a partir
	// de um vetor com vários nomes. Execute o programa algumas vezes para ver os diferentes resultados possíveis. 

public class Ex_14 
{
									// ALTERE este valor para limitar ou expandir o número de nomes disponíveis para seleção aleatória.
	public static int seed = 20; 	// Números menores vão gerar mais chances de ter nomes aparecendo na pilha e na fila ao mesmo tempo. 
									// Por exemplo, 5 fará com que todos os nomes selecionados apareçam nas duas estruturas.
									// A faixa de valores válidos é de 5 a 20. Experimente com 5, 6 e 20 para ver como 
									// as mensagens ao usuário são alteradas de acordo com o resultado.
	
	
	public static Fila f1 = new Fila(5);			// Fila para armazenar nomes.
	public static Pilha p1 = new Pilha(5);			// Pilha para armazenar nomes.
	
																	// Vetor de nomes para escolha aleatória pelo programa :D	
	public static String nomes[] = {"Adalgyzo   ", "Berenisso  ", "Catarino   ", "Danielo    ", "Elisângelo ", "Francineido", "Genovevo   ", "Hortênsio  ", "Isabelo    ", "Jaquelino  ", "Kátio      ", 
									"Liliano    ", "Margarido  ", "Neuzo      ", "Olívio     ", "Priscilo   ", "Quitério   ", "Rosângelo  ", "Sabrino    ", "Tereso     ", "Úrsulo     ", "Vanderléio "};
	
	public static String aux1[] = new String[p1.tamanho()];					// Vetor auxiliar para a pilha;
	public static String aux2[] = new String[f1.tamanho()];					// Vetor auxiliar para a fila;
	public static String comum = "";							// Variável que armazenará os nomes que aparecem na fila E na pilha.
	public static String resfila = "Nomes exibidos somente na fila:\n";
	public static String respilha = "Nomes exibidos somente na pilha:\n";
	
	public static void main(String[] args) 
	{
		preenchePilha(p1);											// Invoca o método de preenchimento da pilha
		System.out.print("Nomes sorteados para a pilha: \n");		// e exibe os nomes escolhidos.
		p1.imprimeTudo();											//
		
		preencheFila(f1);											// Invoca o método de preenchimento da fila
		System.out.print("Nomes sorteados para a fila: \n");		// e exibe os nomes escolhidos. 
		f1.imprimeTodos();											//	
		
		localizaComum(p1, f1);						// Invoca o método de localização de nomes, passando a pilha e a fila como parâmetros. 
	}
	
	public static void preenchePilha(Pilha p)				// Método de preenchimento da pilha. Recebe uma pilha como parâmetro. 
	{
		int vP[] = new int[p.tamanho()];				// Vetor auxiliar que armazenará os índices dos nomes. 
		for (int j = 0; j < p.tamanho(); j ++)
		{
			vP[j] = (int) (Math.random() * seed) + 1;			// Seleciona índices aleatórios para os nomes...
			for (int k = 0; k < j; k++)
			{
				if (vP[j] == vP[k])							// ...e verifica se há índices repetidos no vetor. Se houver,
				{
					j = k = 0;								// ...refaz a seleção dos índices para eliminar nomes repetidos na pilha. 
				}
			}
		}
		
		for (int c = 0; c < vP.length; c++)
			{
				p.empilha(nomes[vP[c]]);						// Preenche a pilha com nomes aleatórios e não repetidos!
			}
	}
	
	public static void preencheFila(Fila f)					// Método de preenchimento da fila. Recebe uma fila como parâmetro. 			
	{
		int vF[] = new int[f.tamanho()];					// Vetor auxiliar que armazenará os índices dos nomes da fila. 
		for (int j = 0; j < f.tamanho(); j ++)
		{
			vF[j] = (int) (Math.random() * seed) + 1;			// Seleciona um índice aleatório entre 0 e 21...
			for (int k = 0; k < j; k++)
			{
				if (vF[j] == vF[k])							// ...e verifica se há índices repetidos. Se houver...
				{
					j = k = 0;								// ...refaz a seleção dos índices para eliminar nomes repetidos na fila. 
				}
			}
		}
		
		for (int p = 0; p < vF.length; p++)	
		{
			f.enfileira(nomes[vF[p]]);  						// Preenche a fila com nomes aleatórios e não repetidos!
		}
		
	}
	
	
	public static void localizaComum(Pilha p, Fila f)		// Método de localização de nomes que estão na pilha E na fila.
	{														// Recebe uma pilha e uma fila como parâmetros. 
		
		int cntcomum = 0;							// Variável auxiliar que armazenará o número de nomes que aparecem tanto na fila como na pilha. 
		
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
					comum = (comum + aux1[l] + "\t");	// Se encontrar, armazena o nome na variável do tipo String chamada "comum". 
					aux1[l] = "";						// Anula os nomes encontrados, tanto no vetor da pilha
					aux2[m] = "";						// como no vetor da fila (assim eles não aparecerão várias vezes na pesquisa).
					cntcomum++;					// Incrementa o contador de nomes que estavam nas duas estruturas.  
				}
			}
		}
		
		switch(cntcomum)			// Avalia o valor do contador de nomes que apareceram na fila E na pilha. 
		{
		
		case 0:						// Se o valor for 0, não há nomes que aparecem na fila e na pilha. 
			
			System.out.print("NENHUM NOME FOI ENCONTRADO NAS DUAS ESTRUTURAS!\n");
			break;
			
		case 1:						// Se o valor for 1, somente um nome foi encontrado. 						
			
			System.out.print("O NOME QUE ESTÁ NAS DUAS ESTRUTURAS É: \n" + comum + "\n");
			break;
			
		case 4:
			
			System.out.print("OS NOMES QUE ESTÃO NAS DUAS ESTRUTURAS SÃO: \n" + comum + "\n");
			resfila = "Nome exibido somente na fila:\n";
			respilha = "Nome exibido somente na pilha:\n";
			break;
			
		case 5:
			
			System.out.print("TODOS OS NOMES ESTÃO NAS DUAS ESTRUTURAS: \n" + comum + "\n");
			resfila = "Nenhum nome é exibido somente na fila.\n";
			respilha = "Nenhum nome é exibido somente na pilha.\n";
			break;
			
		default:					// Qualquer outro valor indica que dois ou mais nomes foram encontrados. 
			
			System.out.print("OS NOMES QUE ESTÃO NAS DUAS ESTRUTURAS SÃO: \n" + comum + "\n");
			break;
		}
		
		System.out.print("\n\n" + respilha);		// Os nomes que aparecem na pilha E na fila foram removidos dos respectivos vetores. 
		for (int n = 0; n < aux1.length; n++)								// Assim, os nomes restantes estão presentes apenas na pilha ou apenas na fila. 
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
