/*	Exercício 2 da lista de filas e pilhas para N2.
 * 
 * Implemente em Java o TAD fila com os atributos necessários e as seguintes operações:
 * 		- Criar fila (construtor)
 * 		- Enfileirar
 * 		- Desenfileirar
 * 		- Mostrar todos os elementos da fila
 * 		- Verificar se a fila está vazia
 * 		- Verificar se a fila está cheia
 * 		- Mostrar o elemento que ocupa a primeira posição
 * 		- Mostrar o elemento que ocupa a última posição
 * */

package listaExerciciosN203FilasPilhas;

public class Fila 
{
	private Object item[];
	private int inicio, fim;
	
	public Fila(int x)
	{
		this.item = new Object[x];
		inicio = fim = 0;
	}
	
	public boolean vazia()
	{
		return (this.fim == this.inicio);
	}
	
	public boolean cheia()
	{
		return (this.fim == this.item.length);
	}
	
	public void enfileira(Object ob)
	{
		if (this.fim == this.item.length)
		{
			System.out.print("ERRO: A fila está cheia.\n");
		}
		else
		{
			this.item[this.fim++] = ob;  
		}
	}
	
	public Object desenfileira() throws Exception
	{
		if (this.vazia())
		{
			throw new Exception("ERRO: Não há objetos a remover. A fila está vazia.\n");
		}
		else
		{
			Object ret = this.item[this.inicio++];
			return ret;
		}
	}
	
	public void imprimeTodos()
	{
		if (this.vazia())
		{
			System.out.print("ERRO: Não há objetos a exibir. A fila está vazia.\n");
		}
		else
		{
			for (int i = 0; i < fim; i++)
			{
				System.out.print(this.item[i] + "\t");
			}
			System.out.print("\n\n");
		}
	}
	
	public void imprimeInicio() 
	{
		if (this.vazia())
		{
			System.out.print("ERRO: A fila está vazia.");
		}
		else
		{
			System.out.print("O primeiro item da fila é:" + this.item[inicio] + "\n");
		}
	}
	
	public void imprimeUltimo() 
	{
		if (this.vazia())
		{
			System.out.print("ERRO: A fila está vazia.");
		}
		else
		{
			System.out.print("O último item da fila é: " + this.item[fim-1] + "\n");
		}
	}
	
	/* Métodos utilitários adicionais! :D
	 * Porque a vida é curta e o tempo é escasso.
	 */
	
	public int tamanho()
	{
		return this.item.length;
	}
	
	public int qtd()
	{
		return (this.fim - this.inicio);
	}
	
	public Object getElementoNoIndice(int x)
	{
		return this.item[x];
	}
	
	public int getPrimeiro()
	{
		return this.inicio;
	}
	
	public int getUltimo()
	{
		return this.fim;
	}
}
