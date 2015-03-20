package vetor.danilo;
// Exerc�cio 8 da lista de vetores para N2.
// Escreva um programa em Java para instanciar, preencher e imprimir um vetor.
// O programa deve conter os seguintes m�todos:
// 	A) Um m�todo para preencher o vetor. Recebe como par�metro o vetor (PRA QU�?) e uma string.
// 	   Cada posi��o do vetor dever� conter um caractere da String. Use o m�todo 
// 	   charAt() da classe String. 
// 	B) Um m�todo para imprimir o vetor;
// 	C) Um m�todo main para instanciar a String, o vetor e invocar os m�todos.*/

import javax.swing.JOptionPane;

public class Exercicio08 
{
	public char palavra[];
	
	public static void main(String[] args) 
	{
		String str = JOptionPane.showInputDialog("Informe uma palavra: ");
		Exercicio08 objeto = new Exercicio08();
		objeto.preenche(str);
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
		System.out.print("\n");
	}

}
