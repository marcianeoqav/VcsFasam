
package processual03;

import javax.swing.JOptionPane;

public class PistaAeroporto 
{
	public static Fila f = new Fila(50);
	
	public static void main(String[] args) 
	{
		int opt = -3;								
		
		while (opt < 0 || opt > 5)					
		{
			try																			
			{
				opt = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma op��o: \n1 - Adicionar avi�o � lista;\n2 - Exibir quantidade de aeronaves na pista;\n" + 
																	"3 - Exibir todos os avi�es na pista;\n4 - Exibir detalhes do primeiro avi�o na pista;\n" + "" +
																	"5 - Autorizar decolagem do primeiro avi�o;\n0 - Sair do programa."));
			}
			catch(NumberFormatException e)
			{
				opt = 10;
			}
			opt = getOption(opt);				 
		}										
		
		
	}
		public static int getOption(int x)		
	{
			switch(x)
			{
			case 0:								
				return x;

			case 1: 							
				if (!f.cheia())				
				{
				adicionaAviao();				
				}
				else							
				{
					JOptionPane.showMessageDialog(null, "Imposs�vel cadastrar aeronave, a pista est� cheia.", "ERRO", JOptionPane.WARNING_MESSAGE);
				}
				x = -3;							
				return x;						

			case 2:								
				if (f.vazia())					
				{
					System.out.print("N�o h� aeronaves na pista.\n");	
				}
				else													
				{
				System.out.print("No momento, a pista cont�m " + f.qtd() + " aeronave(s).\n");
				}
				x = -3;							
				return x;						
				
			case 3:								
				if (f.vazia())					
				{
					System.out.print("N�o h� aeronaves na pista.\n");
				}
				else
				{
					System.out.print("Nome da aeronave:\tC�digo:\n");				
					for (int j = f.getPrimeiro(); j < f.getUltimo(); j++)			
					{																
						Aviao avx = (Aviao) f.getElementoNoIndice(j); 				
						System.out.print(avx.nome + "\t" + avx.id + "\n");			
					}																
					
				}
				x = -3;					
				return x;				
				
			case 4:														
				if (f.vazia())
				{
					System.out.print("N�o h� aeronaves na pista.\n");		
				}
				else
				{
					Aviao obx = (Aviao) f.getElementoNoIndice(f.getPrimeiro());				
					System.out.print("Informa��es do primeiro avi�o na fila:\n");				
					System.out.print("Nome:\t" + obx.nome + "\t" + "ID:\t"+ obx.id + "\n");
				}
				x = -3;									
				return x;								
				
			case 5:								
				liberaDecolagem();				
				x = -3;							
				return x;						
			default:					
				JOptionPane.showMessageDialog(null, "O valor inserido � inv�lido.", "PRESTEN��O!", JOptionPane.WARNING_MESSAGE);
				return x;
			}
		}
		
		public static void adicionaAviao()											
		{
			Aviao av = new Aviao();														
			String nm = JOptionPane.showInputDialog("Digite o nome da aeronave:\n");		
						
			while (nm.length() < 17)						
			{												
				nm = (nm + " ");							
			}												
			
			av.nome = nm;									
			av.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de identifica��o da aeronave: \n"));		
			f.enfileira(av);								
		}
		
		public static void liberaDecolagem()				
		{
			if (f.vazia())									
			{
				JOptionPane.showMessageDialog(null, "N�o h� avi�es aguardando para decolar.", "ERRO!", JOptionPane.WARNING_MESSAGE);
			}
			else											
			{
				Aviao av = new Aviao();						
				try 
				{
					av = (Aviao) f.desenfileira();			 
					System.out.print("Decolagem autorizada para a aeronave:\n" + av.nome + "\tID " + av.id + "\n");	
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
}
