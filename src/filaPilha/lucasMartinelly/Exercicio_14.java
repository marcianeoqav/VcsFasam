
package processual03;

	

public class Exercicio_14 
{
									
	public static int seed = 20; 	
	
	
	public static Fila f = new Fila(5);			
	public static Pilha p = new Pilha(5);			
	
																	
	public static String nomes[] = {"Adalgyzo   ", "Berenisso  ", "Catarino   ", "Danielo    ", "Elisângelo ", "Francineido", "Genovevo   ", "Hortênsio  ", "Isabelo    ", "Jaquelino  ", "Kátio      ", 
									"Liliano    ", "Margarido  ", "Neuzo      ", "Olívio     ", "Priscilo   ", "Quitério   ", "Rosângelo  ", "Sabrino    ", "Tereso     ", "Úrsulo     ", "Vanderléio "};
	
	public static String aux1[] = new String[p.tamanho()];					
	public static String aux2[] = new String[f.tamanho()];					
	public static String comum = "";							
	public static String resfila = "Nomes exibidos somente na fila:\n";
	public static String respilha = "Nomes exibidos somente na pilha:\n";
	
	public static void main(String[] args) 
	{
		preenchePilha(p);											
		System.out.print("Nomes sorteados para a pilha: \n");		
		p.imprimeTudo();								
		
		preencheFila(f);										
		System.out.print("Nomes sorteados para a fila: \n");		
		f.imprimeTodos();											
		
		localizaComum(p, f);						
	}
	
	public static void preenchePilha(Pilha p)				
	{
		int vP[] = new int[p.tamanho()];				
		for (int j = 0; j < p.tamanho(); j ++)
		{
			vP[j] = (int) (Math.random() * seed) + 1;			
			for (int k = 0; k < j; k++)
			{
				if (vP[j] == vP[k])							
				{
					j = k = 0;								 
				}
			}
		}
		
		for (int c = 0; c < vP.length; c++)
			{
				p.empilha(nomes[vP[c]]);						
			}
	}
	
	public static void preencheFila(Fila f)								
	{
		int vF[] = new int[f.tamanho()];					
		for (int j = 0; j < f.tamanho(); j ++)
		{
			vF[j] = (int) (Math.random() * seed) + 1;			
			for (int k = 0; k < j; k++)
			{
				if (vF[j] == vF[k])							
				{
					j = k = 0;								
				}
			}
		}
		
		for (int p = 0; p < vF.length; p++)	
		{
			f.enfileira(nomes[vF[p]]);  						
		}
		
	}
	
	
	public static void localizaComum(Pilha p, Fila f)		
	{														
		
		int cntcomum = 0;							
		
		for (int k = 0; k < aux1.length; k++)
		{
			try 
			{
				aux1[k] = (String) p.desempilha();			
				aux2[k] = (String) f.desenfileira();		
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		for (int l = 0; l < aux1.length; l++)						
		{
			for (int m = 0; m < aux2.length; m++)
			{
				if (aux1[l].equals(aux2[m]) && ((!aux1[l].equals("")) || (!aux2[m].equals(""))))		
				{
					comum = (comum + aux1[l] + "\t");	
					aux1[l] = "";				
					aux2[m] = "";						
					cntcomum++;					
				}
			}
		}
		
		switch(cntcomum)			
		{
		
		case 0:						
			
			System.out.print("NENHUM NOME FOI ENCONTRADO NAS DUAS ESTRUTURAS!\n");
			break;
			
		case 1:						 						
			
			System.out.print("O NOME QUE ESTÁ NAS DUAS ESTRUTURAS É: \n" + comum + "\n");
			break;
			
		case 4:
			
			System.out.print("OS NOMES QUE ESTÃO NAS DUAS ESTRUTURAS SÃO: \n" + comum + "\n");
			resfila = "Nome exibido somente na fila:\n";
			respilha = "Nome exibido somente na pilha:\n";
			break;
			
		case 5:
			
			System.out.print("TODOS OS NOMES ESTÃO NAS DUAS ESTRUTURAS: \n" + comum + "\n");
			resfila = "Nenhum nome é exibido somente na fila.\n";
			respilha = "Nenhum nome é exibido somente na pilha.\n";
			break;
			
		default:					
			
			System.out.print("OS NOMES QUE ESTÃO NAS DUAS ESTRUTURAS SÃO: \n" + comum + "\n");
			break;
		}
		
		System.out.print("\n\n" + respilha);		
		for (int n = 0; n < aux1.length; n++)								
		{
			if (!aux1[n].equals(""))
			{
			System.out.print(aux1[n] + "\t");								
			}
		}
		
		System.out.print("\n\n" + resfila);
		for (int n = 0; n < aux2.length; n++)
		{
			if (!aux2[n].equals(""))
			{	
			System.out.print(aux2[n] + "\t");								
			}
		}
	}
} 
