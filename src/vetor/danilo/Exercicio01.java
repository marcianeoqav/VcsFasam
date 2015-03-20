package vetor.danilo;
// Exerc�cio 1 da lista de vetores para N2.
// Escrever um programa em Java para instanciar, preencher e imprimir
// um vetor de 10 posi��es, cujo conte�do s�o n�meros inteiros.
// Instru��es:
// Deve haver somente uma classe, contendo os 3 m�todos abaixo.
// - M�todo para preencher o vetor. N�o retorna valores.
// - M�todo para imprimir o vetor. N�o retorna valores.
// - M�todo main instancia o vetor e invoca os outros dois.

public class Exercicio01 
{
	int vetor[] = new int[10];
	
	public static void main(String[] args) 
	{
		Exercicio01 objeto = new Exercicio01();
		objeto.preenche();
		objeto.imprime();

	}
	
	public void preenche()
	{
		for (int i = 0; i < this.vetor.length; i++)
		{
			int p = (int) (Math.random() * 50);
			this.vetor[i] = p;
		}
	}
	
	public void imprime()
	{
		for (int j = 0; j < this.vetor.length; j++)
		{
			System.out.print(this.vetor[j] + "\t");
		}
	}
}
