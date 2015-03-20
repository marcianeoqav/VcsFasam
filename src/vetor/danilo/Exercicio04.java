package vetor.danilo;
// Exerc�cio 4 da lista de vetores para N2. 
// Implemente um programa em Java para ler e imprimir o conte�do de 3 vetores. 
// Todos os vetores dever�o ter 10 posi��es e dever�o armazenar o nome, a 
// profiss�o e a idade de 10 pessoas, considerando que todas possuem idades distintas.
// Implementar apenas uma classe, com os seguintes m�todos:
// Um m�todo para preenchimento dos valores dos vetores. O m�todo recebe o vetor
// como par�metro, mas n�o precisa retornar nada.
// Um m�todo para impress�o dos vetoreos. Esse m�todo receber� os tr�s vetores 
// como par�metro e imprimir� um relat�rio com o cabe�alho 
//  NOME		-		PROFISS�O		- IDADE 
 

import javax.swing.JOptionPane;

public class Exercicio04 
{
		public static int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas deseja registrar?"));
		public static String nomes[] = new String[qtd];
		public static String prof[] = new String[qtd];
		public static int idade[] = new int[qtd];
		public static int contador = 0;
	
	public static void main(String[] args) 
	{
		Exercicio04 objeto = new Exercicio04();
		for (int i = 0; i < qtd; i++)
		{
			contador = i;
			objeto.preencheNome(nomes);
			objeto.preencheProf(prof);
			objeto.preencheIdade(idade);			
		}
		objeto.imprime(nomes, prof, idade);
	}
	
	public void preencheNome(String nomes[])
	{
		nomes[contador] = JOptionPane.showInputDialog("Informe o nome, registro: " + (contador + 1));
	}
	
	public void preencheProf(String prof[])
	{
		prof[contador] = JOptionPane.showInputDialog("Informe a profiss�o, registro: " + (contador + 1));
	}
	
	public void preencheIdade(int idade[])
	{
		idade[contador] = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa, registro: " + (contador + 1)));
	}
	
	public void imprime (String nomes[], String prof[], int idade[])
	{
		System.out.print("NOME      \t-\tPROFISS�O \t-\tIDADE     \n");
		for (int p = 0; p < qtd; p++)
		{
			System.out.print(nomes[p] + "\t-\t" + prof[p] + " \t-\t" + idade[p] + "\n");
		}
	}

}
