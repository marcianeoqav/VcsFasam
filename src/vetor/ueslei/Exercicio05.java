package vetor.ueslei;

import javax.swing.JOptionPane;

public class Exercicio05 
{
	public static int v1[] = new int[10];
	
	public static void main(String[] args) 
	{
		Exercicio05 objeto = new Exercicio05();
		objeto.preenche(v1);
		
		for (int t = 0; t < v1.length; t++)
		{
			System.out.print(v1[t] + "\t");
		}
		System.out.print("\n");
		
		int getX = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero."));
		int res = objeto.pesquisa(v1, getX);
				
		if (res == -1)
		{
			System.out.print("O n�mero n�o foi encontrado.");			
		}
		else
		{
			System.out.print("O n�mero " + getX + " est� na posi��o " + res + ".\n");
		}
	}
	
	public void preenche(int v1[])
	{
		for (int i = 0; i < v1.length; i++)
		{
			v1[i] = (int) (Math.random() * 30);
		}
	}
	
	public int pesquisa(int v1[], int x)
	{
		int aux = -1;
		for (int j = 0; j < v1.length; j++)
		{
			if (v1[j] == x)
			{
				aux = j;
				break;
			}
		}
		return aux;
	}

}
