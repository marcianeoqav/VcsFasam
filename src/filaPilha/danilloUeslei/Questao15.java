package Lista03;

import javax.swing.JOptionPane;

public class Questao15 
{
	public static Pilha p1 = new Pilha(20);
	public static int aux[];
	
	public static void main(String[] args) 
	{
		int opt = -3;
		
		while (opt < 1 || opt > 4)
		{
			try
			{
				opt = Integer.parseInt(JOptionPane.showInputDialog("Selecione opção: \n1 - Adicionar um número na pilha;\n" + 
																	"2 - Calcular pares ;\n" + 
																	"3 - Excluir número;\n4 - Sair do programa."));
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
			if (!p1.cheia())
			{
				cadastraNum();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Pilha esta cheia ");
			}
			x = -3;
			return x;

		case 2:
			if (p1.vazia())
			{
				System.out.print("A pilha esta vazia\n");
			}
			else
			{
				prePares(p1);
			}
			x = -3;
			return x;
			
		case 3:
			if (p1.vazia())
			{
				System.out.print("A pilha esta vazia\n");
			}
			else
			{
				int rem = (int) p1.desempilha();
				System.out.print("Número removido: " + rem + "\n");
			}
			x = -3;
			return x;
			
		case 4:
			return x;

		default:
			JOptionPane.showMessageDialog(null, "valor inválido.");
			return x;
		}
	}
	
	public static void cadastraNum()
	{
		int q;
		
		try {
			q = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
			p1.empilha(q);
			System.out.print("Número inserido " + q + "\n");
		} 
		catch (NumberFormatException e) 
		{
			JOptionPane.showMessageDialog(null, "O valor nao é inválido.");
		}
			
	}
	
	public static void prePares(Pilha p1)
	{
		
		int auxPilha[] = new int[p1.topo()];
		Pilha restaura = new Pilha(auxPilha.length);

		for (int r = 0; r < auxPilha.length; r++)
		{
			auxPilha[r] = (int) p1.desempilha();	
			restaura.empilha(auxPilha[r]);			
		}
		
		for (int e = 0; e < auxPilha.length; e++)
		{
			p1.empilha(restaura.desempilha());
		}
		
		getPares(auxPilha);
	}
		

	
	public static void getPares(int[] x)
	{
		int auxX[];
		if ((x.length == 1) || (x[x.length - 1] == x[0]))
		{
			System.out.print("Existe somente um numero ");
					
			auxX = new int[x.length];
			auxX[0] = x[0];
			if (auxX[0] % 2 == 0)
			{
				System.out.print("O valor é par: \n" + auxX[0] + "\n");
			}
			else
			{
				System.out.print("O valor não é impar. \n");
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
			System.out.print("Números pares: \n");
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
			System.out.print("Números pares: \n");
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
