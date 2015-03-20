package ListaPilhaFila3;

public class Fila2{
	
	
	private Object item[];
	private int inicio, fim;	
	
	public Fila2(int x)
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
	
	public void  enfileirar(Object ob)
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
	
	public Object desenfileirar() throws Exception
	{
		if (this.vazia())
		{
			throw new Exception("ERRO:A fila está vazia.\n");
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
			System.out.print("ERRO: A fila está vazia.\n");
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
