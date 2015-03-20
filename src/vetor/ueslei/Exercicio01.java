package vetor.ueslei;

public class Exercicio01 
{
	int vetor[] = new int[10];
	
	public static void main(String[] args) 
	{
		Exercicio01 objeto = new Exercicio01();
		objeto.preencher();
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
	
	public void imprime()
	{
		for (int j = 0; j < this.vetor.length; j++)
		{
			System.out.print(this.vetor[j] + "\t");
		}
	}
}
