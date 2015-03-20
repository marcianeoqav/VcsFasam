
package processual03;

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
			System.out.print("ERRO: A fila est� cheia.\n");
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
			throw new Exception("ERRO: N�o h� objetos a remover. A fila est� vazia.\n");
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
			System.out.print("ERRO: N�o h� objetos a exibir. A fila est� vazia.\n");
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
			System.out.print("ERRO: A fila est� vazia.");
		}
		else
		{
			System.out.print("O primeiro item da fila �:" + this.item[inicio] + "\n");
		}
	}
	
	public void imprimeUltimo() 
	{
		if (this.vazia())
		{
			System.out.print("ERRO: A fila est� vazia.");
		}
		else
		{
			System.out.print("O �ltimo item da fila �: " + this.item[fim-1] + "\n");
		}
	}
	
	
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
