package vetor.ueslei;

public class Exercicio03 
{

int vetor[] = new int[10];
	
	public static void main(String[] args) 
	{
		Exercicio03 objeto = new Exercicio03();
		objeto.preencher();
		objeto.ordenar();
		objeto.imprime();

	}
	
	public void preencher()
	{
		for (int i = 0; i < this.vetor.length; i++)
		{
			int p = (int) (Math.random() * 50);
			this.vetor[i] = p;
		}
	}
	
	public void ordenar()
	{
		int p = this.vetor.length;
		int temp = 0;
		for (int s=0; s<p; s++)
		{
			for (int t=s+1; t<p; t++)
			{
				if (vetor[s] < vetor[t])
				{
					temp=vetor[t];
					vetor[t]=vetor[s];
					vetor[s]=temp;
				}
			}
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
