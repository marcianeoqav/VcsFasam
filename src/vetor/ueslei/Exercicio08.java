package vetor.ueslei;

import javax.swing.JOptionPane;

public class Exercicio08 
{
	public char palavra[];
	
	public static void main(String[] args) 
	{
		String str = JOptionPane.showInputDialog("Digite uma palavra!");
		Exercicio08 objeto = new Exercicio08();
		objeto.preencher(str);
		objeto.imprime();
	}
	
	public void preencher(String str)
	{
		this.palavra = new char[str.length()];
		for (int i = 0; i < palavra.length; i++)
		{
			this.palavra[i] = str.charAt(i);
		}
	}
	
	public void imprime()
	{
		for (int p = 0; p < this.palavra.length; p++)
		{
			System.out.print(this.palavra[p] + "\t");
		}
		System.out.print("\n");
	}

}
