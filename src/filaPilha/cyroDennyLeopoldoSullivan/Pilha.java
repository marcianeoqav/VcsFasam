/*	Exercício 1 da lista de filas e pilhas para N2.
 * 
 * 	Implemente em Java o TAD pilha com os atributos necessários e as seguintes operações:
 * 		- Criar pilha (construtor
 * 		- Empilhar
 * 		- Desempilhar
 * 		- Mostrar o topo
 * 		- Mostrar se a pilha está vazia
 * 		- Mostrar se a pilha está cheia
 * 		- Mostrar a quantidade de elementos empilhados
 * 		- Mostrar (imprimir) a pilha (posição atual)*/


package listaExerciciosN203FilasPilhas;

public class Pilha 
{
	private Object item[];		// Vetor de objetos para armazenar o conteúdo da pilha.
	private int topo;			// Inteiro para armazenar o índice do topo.
	
	public Pilha(int i) 
	{
		this.item = new Object[i];
        this.topo = 0;
	}
	
	public boolean vazia()
	{
		return this.topo == 0;
	}
	
	public boolean cheia()
	{
		return this.topo == this.item.length;
	}
	
	public void empilha(Object ob)
	{
		if (this.topo == this.item.length)
		{
			System.out.print("ERRO: A pilha está cheia!");
		}
		else
		{
			this.item[this.topo] = ob;
			this.topo++;
		}
	}
	
	public Object desempilha()
	{
		if (this.vazia())
		{
			System.out.print("ERRO: Não é possível remover itens de uma pilha vazia!");
			return null;
		}
		else
		{
		return this.item[--this.topo];
		}
	}
	
	public int tamanho()
	{
		return this.item.length;
	}
	
	public int topo()
	{
		return this.topo;
	}
	
	public void imprimeTudo()
	{
		if (this.vazia())
		{
			System.out.print("ERRO: Não é possível imprimir uma pilha vazia!");
		}
		else
		{
			for (int z = this.topo - 1; z >= 0; z--)
			{
				System.out.print(this.item[z].toString() + "\t");
			}
			System.out.print("\n\n");
		}
	}
	
	public void imprimeIndice(int p)
	{
		if (this.vazia())
		{
			System.out.print("ERRO: Não é possível imprimir uma pilha vazia!");
		}
		else
		{
			System.out.print(this.item[p].toString() + "\n");
		}
	}
	
}
