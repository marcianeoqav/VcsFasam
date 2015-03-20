/*	Exerc�cio 17 da lista de filas e pilhas para N2.
 * 
 * Fa�a um programa que cadastre em uma pilha v�rios n�meros. A entrada deles ser�
 * finalizada com a digita��o de um n�mero menor ou igual a zero. Posteriormente, 
 * o programa deve gerar duas filas, a primeira com os n�meros pares e a segunda
 * com os n�meros �mpares. A sa�da do programa deve apresentar a pilha digitada e
 * as filas geradas. Caso alguma das filas seja vazia, uma mensagem deve ser exibida.*/

package listaExerciciosN203FilasPilhas;


import javax.swing.JOptionPane;

public class Ex_17 
{
	public static Pilha p1 = new Pilha(30);
	public static Fila pares;
	public static Fila impares;

	public static void main(String[] args) 
	{
		int num = 1;
		while (num > 0)
		{
			try 
			{
				num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para cadastrar.\nDigite um n�mero menor ou igual a 0\npara finalizar a entrada de dados."));
				if (num > 0)
				{
					p1.empilha(num);
				}	
			} 
			catch (NumberFormatException e) 
			{
				JOptionPane.showMessageDialog(null, "O valor inserido � inv�lido.", "PRESTEN��O!", JOptionPane.WARNING_MESSAGE);
			} 
			
		
		}
		
		int auxP1[] = new int[p1.topo()];
		pares = new Fila(auxP1.length);
		impares = new Fila(auxP1.length);
		
		System.out.print("Pilha digitada:\n");
		for (int i = 0; i < auxP1.length; i++)
		{
			auxP1[i] = (int) p1.desempilha();
			System.out.print(auxP1[i] + "\t");
		}
		System.out.print("\n\n");
		
		int cntpar = 0;
		int cntimpar = 0;
		for (int j = 0; j < auxP1.length; j++)
		{
			if (auxP1[j] % 2 == 0)
			{
				pares.enfileira(auxP1[j]);
				cntpar++;
			}
			else
			{
				impares.enfileira(auxP1[j]);
				cntimpar++;
			}
		}
		
		if (pares.vazia())
		{
			System.out.print("A fila de n�meros pares est� vazia!\n\n");
		}
		else
		{
			System.out.print("Fila de n�meros pares:\n");
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
			System.out.print("A fila de n�meros �mpares est� vazia!\n\n");
		}
		else
		{
			System.out.print("Fila de n�meros �mpares:\n");
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
