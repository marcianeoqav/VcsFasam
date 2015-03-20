/*	Exercicio 12 da lista de filas e pilhas para N2.
 * 	Implemente a questão 04 discursiva da avaliação N1.
 * 	Apenas duas classes deverão ser implementadas;
 * 	A classe Avião e a Classe PistaAeroporto. Esta última deverá conter
 * 	o método main, com o menu e as chamadas às operações da classe Fila 
 *  do exercício 02.
 * */

package listaExerciciosN203FilasPilhas;

import javax.swing.JOptionPane;

public class PistaAeroporto 
{
	public static Fila f1 = new Fila(50);
	
	public static void main(String[] args) 
	{
		int opt = -3;								// Variável de controle de opções. Os valores válidos vão de 0 a 5. 
		
		while (opt < 0 || opt > 5)					// Enquanto o valor da variável de controle estiver fora da faixa válida, o laço será executado. 
		{
			try																			// Menu de opções para o usuário.
			{
				opt = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção: \n1 - Adicionar avião à lista;\n2 - Exibir quantidade de aeronaves na pista;\n" + 
																	"3 - Exibir todos os aviões na pista;\n4 - Exibir detalhes do primeiro avião na pista;\n" + "" +
																	"5 - Autorizar decolagem do primeiro avião;\n0 - Sair do programa."));
			}
			catch(NumberFormatException e)
			{
				opt = 10;
			}
			opt = getOption(opt);				// Invoca o método getOption passando o número selecionado pelo usuário como parâmetro. 
		}										// O método getOption executa diferentes funções, dependendo do número escolhido. 
		
		
	}
		public static int getOption(int x)		// Método de controle de ações. Recebe um inteiro como parâmetro e retorna um inteiro como resultado.
		{
			switch(x)
			{
			case 0:								// Se a opção selecionada for 0, retorna 0 ao método anterior (Encerra a execução do programa).
				return x;

			case 1: 							// Opção 1.
				if (!f1.cheia())				// Verifica se a lista NÃO está cheia (veja o ponto de exclamação na expressão). 
				{
				adicionaAviao();				// Se não estiver, invoca o método para adicionar um avião à fila. 
				}
				else							// Do contrário, exibe uma mensagem de erro informando que a pista está cheia. 
				{
					JOptionPane.showMessageDialog(null, "Impossível cadastrar aeronave, a pista está cheia.", "ERRO", JOptionPane.WARNING_MESSAGE);
				}
				x = -3;							// Atribui um valor fora da faixa aceitável para manter o laço While funcionando no método Main. 
				return x;						// Retorna o valor.

			case 2:								// Opção 2.
				if (f1.vazia())					// Verifica se a pista de decolagem está vazia...
				{
					System.out.print("Não há aeronaves na pista.\n");	// ...e avisa o usuário.
				}
				else													// Do contrário, informa quantas aeronaves estão na pista.
				{
				System.out.print("No momento, a pista contém " + f1.qtd() + " aeronave(s).\n");
				}
				x = -3;							// Atribui um valor fora da faixa para manter o laço While funcionando...
				return x;						// ...e retorna o valor. 
				
			case 3:								// Opção 3.
				if (f1.vazia())					// Se a pista estiver vazia, avisa o usuário.
				{
					System.out.print("Não há aeronaves na pista.\n");
				}
				else
				{
					System.out.print("Nome da aeronave:\tCódigo:\n");				// Do contrário, exibe as informações de
					for (int j = f1.getPrimeiro(); j < f1.getUltimo(); j++)			// todas as aeronaves aguardando na pista.
					{																//
						Aviao avx = (Aviao) f1.getElementoNoIndice(j); 				// Os métodos getPrimeiro e getUltimo retornam o índice do primeiro e do último elemento. 
						System.out.print(avx.nome + "\t" + avx.id + "\n");			// getElementoNoIndice retorna o objeto no índice fornecido, sem removê-lo da fila. 
					}																// Estes são métodos utilitários que eu adicionei à classe Fila. 
					
				}
				x = -3;					// Atribui um valor fora da faixa para a variável de controle de opções...
				return x;				// ... e retorna o valor. 
				
			case 4:														// Opção 4.
				if (f1.vazia())
				{
					System.out.print("Não há aeronaves na pista.\n");		// Informa se a pista estiver vazia. 
				}
				else
				{
					Aviao obx = (Aviao) f1.getElementoNoIndice(f1.getPrimeiro());				// Do contrário, recupera e exibe as informações do 
					System.out.print("Informações do primeiro avião na fila:\n");				// primeiro objeto (avião) na fila.
					System.out.print("Nome:\t" + obx.nome + "\t" + "ID:\t"+ obx.id + "\n");
				}
				x = -3;									// Atribui um valor fora da faixa para a variável de controle...
				return x;								// Retorna o valor. 
				
			case 5:								// Opção 5.
				liberaDecolagem();				// Invoca o método de autorização de decolagem para a primeira aeronave da fila. 
				x = -3;							// Atribui um valor fora da faixa para a variável de controle...
				return x;						// ...e retorna o valor. 

			default:					// As opções válidas são de 0 a 5. Qualquer outro valor inserido pelo usuário irá gerar uma mensagem de erro. 
				JOptionPane.showMessageDialog(null, "O valor inserido é inválido.", "PRESTENÇÃO!", JOptionPane.WARNING_MESSAGE);
				return x;
			}
		}
		
		public static void adicionaAviao()											// Método para adicionar aviões à pista. 
		{
			Aviao av = new Aviao();														// Instancia um novo avião...
			String nm = JOptionPane.showInputDialog("Digite o nome da aeronave:\n");	// Pede o nome do avião ao usuário...	
						
			while (nm.length() < 17)						//
			{												// Padding (preenchimento com espaços em branco) para uniformizar
				nm = (nm + " ");							// o tamanho dos nomes. Ajuda a manter a tabela alinhada na hora
			}												// de imprimir, mas não é essencial para a execução do programa.
			
			av.nome = nm;									// Atribui o nome ao avião. 
			av.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de identificação da aeronave: \n"));		// Pede o número de identificação ao usuário.
			f1.enfileira(av);								// Adiciona o avião à fila.
		}
		
		public static void liberaDecolagem()				// Método para autorização de decolagem. 
		{
			if (f1.vazia())									// Verifica se a pista está vazia e avisa o usuário. 
			{
				JOptionPane.showMessageDialog(null, "Não há aviões aguardando para decolar.", "ERRO!", JOptionPane.WARNING_MESSAGE);
			}
			else											// Se não estiver vazia...
			{
				Aviao av = new Aviao();						// Instancia um avião auxiliar...
				try 
				{
					av = (Aviao) f1.desenfileira();			// ... para armazenar o nome e ID do primeiro avião da fila, que é removido. 
					System.out.print("Decolagem autorizada para a aeronave:\n" + av.nome + "\tID " + av.id + "\n");	// Informa que a aeronave decolou.
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
}
