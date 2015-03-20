
package processual03;


import javax.swing.JOptionPane;

public class Exercicio_17 
{
	public static Pilha p = new Pilha(30);
	public static Fila pares;
	public static Fila impares;

	public static void main(String[] args) 
	{
		int num = 1;
		while (num > 0)
		{
			try 
			{
				num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para cadastrar.\nDigite um número menor ou igual a 0\npara finalizar a entrada de dados."));
				if (num > 0)
				{
					p.empilha(num);
				}	
			} 
			catch (NumberFormatException e) 
			{
				JOptionPane.showMessageDialog(null, "O valor inserido é inválido.", "PRESTENÇÃO!", JOptionPane.WARNING_MESSAGE);
			} 
			
		
		}
		
		int auxp[] = new int[p.topo()];
		pares = new Fila(auxp.length);
		impares = new Fila(auxp.length);
		
		System.out.print("Pilha digitada:\n");
		for (int i = 0; i < auxp.length; i++)
		{
			auxp[i] = (int) p.desempilha();
			System.out.print(auxp[i] + "\t");
		}
		System.out.print("\n\n");
		
		int cntpar = 0;
		int cntimpar = 0;
		for (int j = 0; j < auxp.length; j++)
		{
			if (auxp[j] % 2 == 0)
			{
				pares.enfileira(auxp[j]);
				cntpar++;
			}
			else
			{
				impares.enfileira(auxp[j]);
				cntimpar++;
			}
		}
		
		if (pares.vazia())
		{
			System.out.print("A fila de números pares está vazia!\n\n");
		}
		else
		{
			System.out.print("Fila de números pares:\n");
			for (int k = 0; k < cntpar; k++)
			{
				try 
				{
					System.out.print(pares.desenfileira() + "\t");
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
			System.out.print("\n\n");
		}
		
		if (impares.vazia())
		{
			System.out.print("A fila de números ímpares está vazia!\n\n");
		}
		else
		{
			System.out.print("Fila de números ímpares:\n");
			for (int l = 0; l < cntimpar; l++)
			{
				try 
				{
					System.out.print(impares.desenfileira() + "\t");
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
			System.out.print("\n\n");
		}		
	}
}
