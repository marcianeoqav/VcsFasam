package processual03;

public class EstacaoFerroviaria 
{
	public static Fila entra1 = new Fila(6);				
	public static Fila entra2 = new Fila(6);				
	public static Fila saida1 = new Fila(6);				
	public static Fila saida2 = new Fila(6);			
	public static Pilha estac1 = new Pilha(6);			
	public static Pilha estac2 = new Pilha(6);				
	public static int aux1[] = new int[12];				
	public static int count1 = 0;						

	public static void main(String[] args) 
	{
		int v1[] = new int[6];						
		for (int i = 0; i < v1.length; i++)
		{
			v1[i] = (i + 1);						
		}

		for (int j = 0; j < entra1.tamanho(); j++)		
		{
			Vagao vag1 = new Vagao();
			vag1.num = (v1[j]);
			entra1.enfileira(vag1);
		}

		int aux = v1[1];						
		v1[1] = v1[2];							
		v1[2] = aux;							

		for (int k = 0; k < entra2.tamanho(); k++)		
		{
			Vagao vag2 = new Vagao();
			vag2.num = v1[k];
			entra2.enfileira(vag2);
		}

		System.out.print("Operações do item A: \n\n");		

		estaciona(entra1, estac1);					
		estaciona(entra1, estac1);					
		estaciona(entra1, estac1);					
		sai(estac1, saida1);						
		sai(estac1, saida1);						

		estaciona(entra1, estac1);					
		estaciona(entra1, estac1);					

		sai(estac1, saida1);						

		estaciona(entra1, estac1);					

		sai(estac1, saida1);						
		sai(estac1, saida1);						
		sai(estac1, saida1);						



		System.out.print("\n");						

		for (int r = 0; r < aux1.length; r++)		
		{
			System.out.print(aux1[r] + "  ");		
		}

		System.out.print("\n\nResultado:\n\n");					

		for (int s = 0; s < saida1.tamanho(); s++)
		{
			try 
			{
				Vagao vagon = (Vagao) saida1.desenfileira();
				System.out.print(vagon.num + "  ");				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

		count1 = 0;					
		System.out.print("\n\n");

		System.out.print("Operações do item B: \n(Invertendo a posição dos vagões 2 e 3 na entrada)\n\n");

		estaciona(entra2, estac2);							

		sai(estac2, saida2);								

		estaciona(entra2, estac2);							
		estaciona(entra2, estac2);							
		estaciona(entra2, estac2);								
		estaciona(entra2, estac2);							

		sai(estac2, saida2);								
		sai(estac2, saida2);								

		estaciona(entra2, estac2);						

		sai(estac2, saida2);								
		sai(estac2, saida2);								
		sai(estac2, saida2);								

		System.out.print("\n");			


		for (int r = 0; r < aux1.length; r++)
		{
			System.out.print(aux1[r] + "  ");				
		}

		System.out.print("\n\nResultado:\n\n");

		for (int s = 0; s < saida2.tamanho(); s++)
		{
			try 
			{
				Vagao vagon = (Vagao) saida2.desenfileira();		
				System.out.print(vagon.num + "  ");
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

	}

	public static void estaciona(Fila ent, Pilha est)		
	{														
		try 
		{
			Vagao vag = (Vagao) ent.desenfileira();			
			est.empilha(vag);								
			aux1[count1++] = vag.num;				
			System.out.print("I  ");						
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
	}

	public static void sai(Pilha est, Fila sai)				
	{													
		Vagao vag3 = (Vagao) est.desempilha();				
		sai.enfileira(vag3);								
		aux1[count1++] = vag3.num;							
		System.out.print("R  ");							

	}	
}
