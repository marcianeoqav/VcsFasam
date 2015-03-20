package vetor.danilo;
//Exerc�cio 5 da lista de vetores para N2.
 //Implemente um programa em Java para ler um vetor de inteiros com 10 posi��es
 //e um valor inteiro x informado pelo usu�rio. O programa deve pesquisar a 
 //exist�ncia de x no vetor. Se encontrar, devolver a posi��o em que ele se 
 //encontra. Caso contr�rio, retornar -1.
 //Instru��es:
 //		* Implementar somente uma classe java contendo os m�todos abaixo:
 //		* Um m�todo para preencher o vetor. Recebe o vetor como par�metro, 
 //		  n�o retorna valores.
 //		* Um m�todo para pesquisar se x existe no vetor. Esse m�todo recebe
 //		  como par�metro o vetor e o valor de X. Deve retornar a posi��o em
 //		  que X se encontra, ou -1, se o valor n�o estiver no vetor.
 //		* M�todo main para instanciar o vetor e o valor de X, chamar o m�todo
 //		  de pesquisa e apresentar ao usu�rio uma mensagem informando
 //			A) O valor pesquisado e a posi��o, se encontrado;
 //		B) Aviso ao usu�rio de que o valor n�o foi encontrado. */

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
				
		int getX = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero que deseja pesquisar."));
		int res = objeto.pesquisa(v1, getX);
				
		if (res == -1)
		{
			System.out.print("O numero informado n�o foi encontrado.");			
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
