package Lista03;

import javax.swing.JOptionPane;

public class Questao03 
{

	public static void main(String[] args) 
	{		
		Fila fila1 = new Fila(10);									
				
		for (int i = 0; i < fila1.tamanho(); i++)
		{
			fila1.enfileira(((int) (Math.random() * 20) + 1));		
		}
		
		System.out.print("Fila inicia com valores aleatorios: \n\n");	
		f1.imprimeTodos();
		
		Object getX = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero que deseja procurar"));	
		
		Object res[] = new Object[fila1.tamanho()];	
		for (int j = 0; j < res.length; j++)
		{
			try 
			{
				res[j] = fila1.desenfileira();		
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		Object result = pesquisa(res, getX);		
													
													 		
		if (result.equals(-1))			
		{
			System.out.print("Não encontrado! \n");
		}
		else							
		{
			int show = (int) (result);
			System.out.print("O numero " + getX + " foi encontrado na posição " + (show + 1));	
		}

	}
	
	public static Object pesquisa(Object va1[], Object x) 	
	{
		Object aux = -1;						
		for (int j = 0; j < va1.length; j++)
		{
			if (va1[j] == x)						
			{
				aux = j;						
				break;
			}
		}
		return aux;					
	}
}
