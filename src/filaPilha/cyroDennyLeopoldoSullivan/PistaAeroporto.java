/*	Exercicio 12 da lista de filas e pilhas para N2.
 * 	Implemente a quest�o 04 discursiva da avalia��o N1.
 * 	Apenas duas classes dever�o ser implementadas;
 * 	A classe Avi�o e a Classe PistaAeroporto. Esta �ltima dever� conter
 * 	o m�todo main, com o menu e as chamadas �s opera��es da classe Fila 
 *  do exerc�cio 02.
 * */

package listaExerciciosN203FilasPilhas;

import javax.swing.JOptionPane;

public class PistaAeroporto 
{
	public static Fila f1 = new Fila(50);
	
	public static void main(String[] args) 
	{
		int opt = -3;								// Vari�vel de controle de op��es. Os valores v�lidos v�o de 0 a 5. 
		
		while (opt < 0 || opt > 5)					// Enquanto o valor da vari�vel de controle estiver fora da faixa v�lida, o la�o ser� executado. 
		{
			try																			// Menu de op��es para o usu�rio.
			{
				opt = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma op��o: \n1 - Adicionar avi�o � lista;\n2 - Exibir quantidade de aeronaves na pista;\n" + 
																	"3 - Exibir todos os avi�es na pista;\n4 - Exibir detalhes do primeiro avi�o na pista;\n" + "" +
																	"5 - Autorizar decolagem do primeiro avi�o;\n0 - Sair do programa."));
			}
			catch(NumberFormatException e)
			{
				opt = 10;
			}
			opt = getOption(opt);				// Invoca o m�todo getOption passando o n�mero selecionado pelo usu�rio como par�metro. 
		}										// O m�todo getOption executa diferentes fun��es, dependendo do n�mero escolhido. 
		
		
	}
		public static int getOption(int x)		// M�todo de controle de a��es. Recebe um inteiro como par�metro e retorna um inteiro como resultado.
		{
			switch(x)
			{
			case 0:								// Se a op��o selecionada for 0, retorna 0 ao m�todo anterior (Encerra a execu��o do programa).
				return x;

			case 1: 							// Op��o 1.
				if (!f1.cheia())				// Verifica se a lista N�O est� cheia (veja o ponto de exclama��o na express�o). 
				{
				adicionaAviao();				// Se n�o estiver, invoca o m�todo para adicionar um avi�o � fila. 
				}
				else							// Do contr�rio, exibe uma mensagem de erro informando que a pista est� cheia. 
				{
					JOptionPane.showMessageDialog(null, "Imposs�vel cadastrar aeronave, a pista est� cheia.", "ERRO", JOptionPane.WARNING_MESSAGE);
				}
				x = -3;							// Atribui um valor fora da faixa aceit�vel para manter o la�o While funcionando no m�todo Main. 
				return x;						// Retorna o valor.

			case 2:								// Op��o 2.
				if (f1.vazia())					// Verifica se a pista de decolagem est� vazia...
				{
					System.out.print("N�o h� aeronaves na pista.\n");	// ...e avisa o usu�rio.
				}
				else													// Do contr�rio, informa quantas aeronaves est�o na pista.
				{
				System.out.print("No momento, a pista cont�m " + f1.qtd() + " aeronave(s).\n");
				}
				x = -3;							// Atribui um valor fora da faixa para manter o la�o While funcionando...
				return x;						// ...e retorna o valor. 
				
			case 3:								// Op��o 3.
				if (f1.vazia())					// Se a pista estiver vazia, avisa o usu�rio.
				{
					System.out.print("N�o h� aeronaves na pista.\n");
				}
				else
				{
					System.out.print("Nome da aeronave:\tC�digo:\n");				// Do contr�rio, exibe as informa��es de
					for (int j = f1.getPrimeiro(); j < f1.getUltimo(); j++)			// todas as aeronaves aguardando na pista.
					{																//
						Aviao avx = (Aviao) f1.getElementoNoIndice(j); 				// Os m�todos getPrimeiro e getUltimo retornam o �ndice do primeiro e do �ltimo elemento. 
						System.out.print(avx.nome + "\t" + avx.id + "\n");			// getElementoNoIndice retorna o objeto no �ndice fornecido, sem remov�-lo da fila. 
					}																// Estes s�o m�todos utilit�rios que eu adicionei � classe Fila. 
					
				}
				x = -3;					// Atribui um valor fora da faixa para a vari�vel de controle de op��es...
				return x;				// ... e retorna o valor. 
				
			case 4:														// Op��o 4.
				if (f1.vazia())
				{
					System.out.print("N�o h� aeronaves na pista.\n");		// Informa se a pista estiver vazia. 
				}
				else
				{
					Aviao obx = (Aviao) f1.getElementoNoIndice(f1.getPrimeiro());				// Do contr�rio, recupera e exibe as informa��es do 
					System.out.print("Informa��es do primeiro avi�o na fila:\n");				// primeiro objeto (avi�o) na fila.
					System.out.print("Nome:\t" + obx.nome + "\t" + "ID:\t"+ obx.id + "\n");
				}
				x = -3;									// Atribui um valor fora da faixa para a vari�vel de controle...
				return x;								// Retorna o valor. 
				
			case 5:								// Op��o 5.
				liberaDecolagem();				// Invoca o m�todo de autoriza��o de decolagem para a primeira aeronave da fila. 
				x = -3;							// Atribui um valor fora da faixa para a vari�vel de controle...
				return x;						// ...e retorna o valor. 

			default:					// As op��es v�lidas s�o de 0 a 5. Qualquer outro valor inserido pelo usu�rio ir� gerar uma mensagem de erro. 
				JOptionPane.showMessageDialog(null, "O valor inserido � inv�lido.", "PRESTEN��O!", JOptionPane.WARNING_MESSAGE);
				return x;
			}
		}
		
		public static void adicionaAviao()											// M�todo para adicionar avi�es � pista. 
		{
			Aviao av = new Aviao();														// Instancia um novo avi�o...
			String nm = JOptionPane.showInputDialog("Digite o nome da aeronave:\n");	// Pede o nome do avi�o ao usu�rio...	
						
			while (nm.length() < 17)						//
			{												// Padding (preenchimento com espa�os em branco) para uniformizar
				nm = (nm + " ");							// o tamanho dos nomes. Ajuda a manter a tabela alinhada na hora
			}												// de imprimir, mas n�o � essencial para a execu��o do programa.
			
			av.nome = nm;									// Atribui o nome ao avi�o. 
			av.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de identifica��o da aeronave: \n"));		// Pede o n�mero de identifica��o ao usu�rio.
			f1.enfileira(av);								// Adiciona o avi�o � fila.
		}
		
		public static void liberaDecolagem()				// M�todo para autoriza��o de decolagem. 
		{
			if (f1.vazia())									// Verifica se a pista est� vazia e avisa o usu�rio. 
			{
				JOptionPane.showMessageDialog(null, "N�o h� avi�es aguardando para decolar.", "ERRO!", JOptionPane.WARNING_MESSAGE);
			}
			else											// Se n�o estiver vazia...
			{
				Aviao av = new Aviao();						// Instancia um avi�o auxiliar...
				try 
				{
					av = (Aviao) f1.desenfileira();			// ... para armazenar o nome e ID do primeiro avi�o da fila, que � removido. 
					System.out.print("Decolagem autorizada para a aeronave:\n" + av.nome + "\tID " + av.id + "\n");	// Informa que a aeronave decolou.
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
}
