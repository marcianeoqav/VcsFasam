
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
				opt = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção: \n1 - Adicionar avião à lista;\n2 - Exibir quantidade de aeronaves na pista;\n" + 
																	"3 - Exibir todos os aviões na pista;\n4 - Exibir detalhes do primeiro avião na pista;\n" + "" +
																	"5 - Autorizar decolagem do primeiro avião;\n0 - Sair do programa."));
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
					JOptionPane.showMessageDialog(null, "Impossível cadastrar aeronave, a pista está cheia.", "ERRO", JOptionPane.WARNING_MESSAGE);
				}
				x = -3;							
				return x;						

			case 2:								
				if (f.vazia())					
				{
					System.out.print("Não há aeronaves na pista.\n");	
				}
				else													
				{
				System.out.print("No momento, a pista contém " + f.qtd() + " aeronave(s).\n");
				}
				x = -3;							
				return x;						
				
			case 3:								
				if (f.vazia())					
				{
					System.out.print("Não há aeronaves na pista.\n");
				}
				else
				{
					System.out.print("Nome da aeronave:\tCódigo:\n");				
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
					System.out.print("Não há aeronaves na pista.\n");		
				}
				else
				{
					Aviao obx = (Aviao) f.getElementoNoIndice(f.getPrimeiro());				
					System.out.print("Informações do primeiro avião na fila:\n");				
					System.out.print("Nome:\t" + obx.nome + "\t" + "ID:\t"+ obx.id + "\n");
				}
				x = -3;									
				return x;								
				
			case 5:								
				liberaDecolagem();				
				x = -3;							
				return x;						
			default:					
				JOptionPane.showMessageDialog(null, "O valor inserido é inválido.", "PRESTENÇÃO!", JOptionPane.WARNING_MESSAGE);
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
			av.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de identificação da aeronave: \n"));		
			f.enfileira(av);								
		}
		
		public static void liberaDecolagem()				
		{
			if (f.vazia())									
			{
				JOptionPane.showMessageDialog(null, "Não há aviões aguardando para decolar.", "ERRO!", JOptionPane.WARNING_MESSAGE);
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
