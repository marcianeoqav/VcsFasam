/* Exercício 15 da lista de filas e pilhas para N2.
 * 
 * Faça um programa com o seguinte menu de opções:
 * 1 - Cadastrar número;
 * 2 - Mostrar números pares entre o primeiro e o último número cadastrado;
 * 3 - Excluir número;
 * 4 - Sair.
 * 
 * Usar PILHA. A opção 1 cadastra um número de cada vez. 
 * Mostrar mensagem para opção inválida do menu.
 * Atenção ao intervalo de números formado pelo primeiro e último número da pilha:
 * Ele pode ser crescente, decrescente ou igual. 
 * Quando a opção do menu não puder ser realizada, mostrar uma mensagem.*/

package listaExerciciosN203FilasPilhas;




import javax.swing.JOptionPane;

public class Ex_15 
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
			if (!p1.cheia())
			{
				cadastraNum();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Impossível cadastrar novos números. A pilha está cheia.", "ERRO", JOptionPane.WARNING_MESSAGE);
			}
			x = -3;
			return x;

		case 2:
			if (p1.vazia())
			{
				System.out.print("A pilha está vazia, não há números para calcular.\n");
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
				System.out.print("A pilha está vazia, não há números para remover.\n");
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
			JOptionPane.showMessageDialog(null, "O valor inserido é inválido.", "PRESTENÇÃO!", JOptionPane.WARNING_MESSAGE);
			return x;
		}
	}
	
	public static void cadastraNum()
	{
		int q;
		
		try {
			q = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser cadastrado!"));
			p1.empilha(q);
			System.out.print("Número adicionado: " + q + "\n");
		} 
		catch (NumberFormatException e) 
		{
			JOptionPane.showMessageDialog(null, "O valor inserido é inválido.", "PRESTENÇÃO!", JOptionPane.WARNING_MESSAGE);
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
