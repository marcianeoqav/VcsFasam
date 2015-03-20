package vetor.ueslei;

public class Exercicio10 
{
	public int v1[] = new int[10];
	
	public static void main(String[] args) 
	{
	
	Exercicio10 objeto = new Exercicio10();
	objeto.preenche();
	objeto.imprime();
	objeto.inverte();
	objeto.imprime();
	}
	
	public void preenche()
	{
		for (int i = 0; i < v1.length; i++)
		{
			v1[i] = (int) (Math.random() * 30);
		}
	}
	
	public void inverte()
	{
		int aux;
		if (this.v1.length % 2 != 0)
		{
			for (int l = 0; l < ((this.v1.length / 2) + 1); l++)
			{
				int m = ((this.v1.length - l) - 1);
				aux = this.v1[l];
				this.v1[l] = (this.v1[m] * this.v1[m]);
				this.v1[m] = (aux * aux);
			}					
		}
		else
		{
			for (int l = 0; l < (this.v1.length / 2); l++)
			{
				int m = ((this.v1.length - l) -1);
				aux = this.v1[l];
				this.v1[l] = (this.v1[m] * this.v1[m]);
				this.v1[m] = (aux * aux);
			}
		}
	}
	
	public void imprime()
	{
		for (int j = 0; j < this.v1.length; j++)
		{
			System.out.print(this.v1[j] + "\t");
		}
		System.out.print("\n\n");
	}

}
