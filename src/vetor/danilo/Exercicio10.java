package vetor.danilo;
// Exerc�cio 10 da lista de vetores para N2.
// Criar um programa em Java para instanciar, preencher, imprimir e inverter um vetor de 10 posi��es.
// A) Implementar somente uma classe Java, contendo os seguintes m�todos:
// I) Um m�todo para preencher o vetor. Recebe o vetor como par�metro, n�o retorna nada.
// II) Um m�todo para inverter o vetor. O vetor invertido dever� conter o quadrado do n�mero original.
// III) Um m�todo para imprimir o vetor;
// IV) Um m�todo main para instanciar o vetor e invocar os outros m�todos.
// O m�todo main dever� imprimir o vetor antes e depois de inverter.


public class Exercicio10 
{
	public int vet1[] = new int[10];
	
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
		for (int i = 0; i < vet1.length; i++)
		{
			vet1[i] = (int) (Math.random() * 30);
		}
	}
	
	public void inverte()
	{
		int aux;
		if (this.vet1.length % 2 != 0)
		{
			for (int l = 0; l < ((this.vet1.length / 2) + 1); l++)
			{
				int m = ((this.vet1.length - l) - 1);
				aux = this.vet1[l];
				this.vet1[l] = (this.vet1[m] * this.vet1[m]);
				this.vet1[m] = (aux * aux);
			}					
		}
		else
		{
			for (int l = 0; l < (this.vet1.length / 2); l++)
			{
				int m = ((this.vet1.length - l) -1);
				aux = this.vet1[l];
				this.vet1[l] = (this.vet1[m] * this.vet1[m]);
				this.vet1[m] = (aux * aux);
			}
		}
	}
	
	public void imprime()
	{
		for (int j = 0; j < this.vet1.length; j++)
		{
			System.out.print(this.vet1[j] + "\t");
		}
		System.out.print("\n\n");
	}

}
