
package processual03;

import javax.swing.JOptionPane;

public class Exercicio_03 
{

	public static void main(String[] args) 
	{		
		Fila f = new Fila(10);									
				
		for (int i = 0; i < f.tamanho(); i++)
		{
			f.enfileira(((int) (Math.random() * 20) + 1));		
		}
		
		System.out.print("Gerando fila inicial com valores aleat�rios: \n\n");	
		f.imprimeTodos();
		
		Object getX = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero que deseja pesquisar."));	
		
		Object res[] = new Object[f.tamanho()];	
		for (int j = 0; j < res.length; j++)
		{
			try 
			{
				res[j] = f.desenfileira();			
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		Object result = pesquisa(res, getX);		
		if (result.equals(-1))			
		{
			System.out.print("O n�mero pesquisado n�o foi encontrado.\n"); 
		}
		else							
		{
			int show = (int) (result);
			System.out.print("O n�mero " + getX + " foi encontrado na posi��o " + (show + 1));	
		}

	}
	
	public static Object pesquisa(Object v1[], Object x) 
	{
		Object aux = -1;						
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
