
package processual03;




import javax.swing.JOptionPane;

public class Exercicio_15 
{
	public static Pilha p = new Pilha(20);
	public static int aux[];
	
	public static void main(String[] args) 
	{
		int opt = -3;
		
		while (opt < 1 || opt > 4)
		{
			try
			{
				opt = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção: \n1 - Adicionar um número à pilha;\n" + 
																	"2 - Calcular pares no intervalo fornecido;\n" + 
																	"3 - Excluir um número;\n4 - Sair do programa."));
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
		case 1: 
			if (!p.cheia())
			{
				cadastraNumero();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Impossível cadastrar novos números. A pilha está cheia.", "ERRO", JOptionPane.WARNING_MESSAGE);
			}
			x = -3;
			return x;

		case 2:
			if (p.vazia())
			{
				System.out.print("A pilha está vazia, não há números para calcular.\n");
			}
			else
			{
				prePares(p);
			}
			x = -3;
			return x;
			
		case 3:
			if (p.vazia())
			{
				System.out.print("A pilha está vazia, não há números para remover.\n");
			}
			else
			{
				int rem = (int) p.desempilha();
				System.out.print("Número removido: " + rem + "\n");
			}
			x = -3;
			return x;
			
		case 4:
			return x;

		default:
			JOptionPane.showMessageDialog(null, "O valor inserido é inválido.", "PRESTENÇÃO!", JOptionPane.WARNING_MESSAGE);
			return x;
		}
	}
	
	public static void cadastraNumero()
	{
		int q;
		
		try {
			q = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser cadastrado!"));
			p.empilha(q);
			System.out.print("Número adicionado: " + q + "\n");
		} 
		catch (NumberFormatException e) 
		{
			JOptionPane.showMessageDialog(null, "O valor inserido é inválido.", "PRESTENÇÃO!", JOptionPane.WARNING_MESSAGE);
		}
			
	}
	
	public static void prePares(Pilha p)
	{
		
		int auxPilha[] = new int[p.topo()];
		Pilha restaura = new Pilha(auxPilha.length);

		for (int r = 0; r < auxPilha.length; r++)
		{
			auxPilha[r] = (int) p.desempilha();	
			restaura.empilha(auxPilha[r]);			
		}
		
		for (int e = 0; e < auxPilha.length; e++)
		{
			p.empilha(restaura.desempilha());
		}
		
		getPares(auxPilha);
	}
		

	
	public static void getPares(int[] x)
	{
		int auxX[];
		if ((x.length == 1) || (x[x.length - 1] == x[0]))
		{
			System.out.print("Somente um valor foi inserido ou os números são iguais. ");
					
			auxX = new int[x.length];
			auxX[0] = x[0];
			if (auxX[0] % 2 == 0)
			{
				System.out.print("O valor é par: \n" + auxX[0] + "\n");
			}
			else
			{
				System.out.print("O valor não é par. \n");
			}
		}		
		else if (x[0] > x[x.length - 1])
		{
			auxX = new int[(x[0] - (x[x.length -1]) + 1)];
			for (int w = 0; w < auxX.length; w++)
			{
				int z = x[x.length -1];
				auxX[w] = z + w;
			}
			System.out.print("Números pares no intervalo: \n");
			imprimePares(auxX);
		}
		else if (x[x.length - 1] > x[0])
		{
			auxX = new int[((x[x.length -1]) - x[0] + 1)];
			for (int w = 0; w < auxX.length; w++)
			{
				int z = x[0];
				auxX[w] = z + w;
			}
			System.out.print("Números pares no intervalo: \n");
			imprimePares(auxX);
		}
	}
	
			
	public static void imprimePares(int[] x)
	{
		int cntRes = 0;
		for (int u = 0; u < x.length; u++)
		{
			if (x[u] % 2 == 0)
			{
				System.out.print(x[u]+ "\t");
				cntRes++;
				if (cntRes >= 10)
				{
					System.out.print("\n");
					cntRes = 0;
				}
			}
		}
		System.out.print("\n\n");
	}

}
