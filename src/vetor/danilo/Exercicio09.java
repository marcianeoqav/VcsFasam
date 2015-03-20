package vetor.danilo;
//	Exerc�cio 9 da lista de vetores para N2.
// 	Com base no exerc�cio 8, acrescente um m�todo para inverter o vetor. 
// 	O m�todo recebe o vetor como par�metro (PRA QU�?). 
// 	O programa deve ser capaz de operar com vetores de tamanho par ou �mpar.*/

import javax.swing.JOptionPane;

public class Exercicio09 
{

public char palavra[];
	
	public static void main(String[] args) 
	{
		String str = JOptionPane.showInputDialog("Digite uma palavra!");
		Exercicio09 objeto = new Exercicio09();
		objeto.preenche(str);
		objeto.imprime();
		objeto.inverte();
		objeto.imprime();
	}
	
	public void preenche(String str)
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
		System.out.print("\n\n");
	}
	
	public void inverte()
	{
		char aux;
		if (this.palavra.length % 2 != 0)
		{
			for (int l = 0; l < ((this.palavra.length / 2) + 1); l++)
			{
				int m = ((this.palavra.length - l) - 1);
				aux = this.palavra[l];
				this.palavra[l] = this.palavra[m];
				this.palavra[m] = aux;
			}					
		}
		else
		{
			for (int l = 0; l < (this.palavra.length / 2); l++)
			{
				int m = ((this.palavra.length - l) -1);
				aux = this.palavra[l];
				this.palavra[l] = this.palavra[m];
				this.palavra[m] = aux;
			}
		}
	}
}
