

package processual03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio_20 
{
	
	public static Scanner leia;						
	public static Scanner conta;					
	public static Placa vOps[];						
	public static Carro f[] = new Carro[40]; 		
	public static Pilha p1 = new Pilha(10);			
	public static Carro v[] = new Carro[10];		
	public static int cntEst = 0;					
	public static int cntFila = 0;					 
	

	public static void main(String[] args) 
	{
		System.out.print("Estacionamento de Scratchemup. Vagas disponíveis: 10\n\n");
		
		int opt = -3;											
		
		while (opt < 0 || opt > 2)										
		{
			try																			
			{
			opt = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:\n1 - Gerar arquivo de movimentação do estacionamento;\n" + 
															   "2 - Processar a movimentação (64 operações de E/S);\n0 - Sair do programa."));	
			}
			catch(NumberFormatException e)
			{
				opt = 10;		
			}
			opt = getOption(opt);		
		}	
	}
	
	public static int getOption(int x)
	{
		switch(x)											
		{
		case 0:									
			
			return x;							
			
		case 1:									
			
			GeraArqEstacionamento.main(null);	
			x = -3;								
			return x;							
			
		case 2:												
			
			File arq = new File("Estacionamento.txt");			
			if (!arq.exists())								
			{												
				
				JOptionPane.showMessageDialog(null, "O arquivo de movimentação ainda não foi gerado.", "Operação ilegal", JOptionPane.WARNING_MESSAGE);
				
				x = -3;							
			}
			else					
			{		
				ler();				
				processa();			
				x = 0;				
			}
			return x;				
			
		default:					
			JOptionPane.showMessageDialog(null, "O valor inserido é inválido.", "PRESTENÇÃO!", JOptionPane.WARNING_MESSAGE);
			
			return x;				
		}		
	}
	
	
	public static void ler()			
	{
		boolean pass = false;			
		try 
		{
			leia = new Scanner(new FileReader("Estacionamento.txt")).useDelimiter(";|\\n");		// Inicializa o scanner...
			pass = true;				
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		if (pass)						
		{	
		int linhas = getLines();					
			int conta = 0;						
			vOps = new Placa[linhas];				
			
			while (leia.hasNext())					
			{
				Placa pl = new Placa();				
				pl.op = leia.next();				
				pl.placa = leia.next();				
				vOps[conta++] = pl;					
			}
			leia.close();							
		}
	}
	
	
	
	public static int getLines()					
	{
	    int aux = 0;								
	    boolean pass = false;
	    try
	    {
	    	conta = new Scanner(new FileReader("Estacionamento.txt")).useDelimiter("\\n");		
	    	pass = true;
	    }
	    catch (FileNotFoundException e)
	    {
	    	e.printStackTrace();
	    } 
	    if(pass)
	    {
	    	while (conta.hasNext())
	    	{
	    		conta.next();					
	    		aux++;						
	    	}
	    conta.close();					
	    }
	    return aux;						
	}	
	
	public static void processa()						
	{
		for (int i = 0; i < vOps.length; i++)			
		{
			if (vOps[i].op.equals("E"))					
			{
				entrada(vOps[i].placa);					
			}
			else													{
				saida(vOps[i].placa);					
			}
		}
	}
	
	public static void entrada(String p)		
	{
		int vagas; 								
		Carro car = new Carro();				
		car.setPlaca(p);						
		
		if (cntEst == v.length)				
		{
			System.out.print("O estacionamento está cheio. " + p.trim() + " foi para a fila de espera.\n\n");
			
			f[cntFila] = car;					
			cntFila++;							
		}
		else									
		{		
			v[cntEst] = car;					
			cntEst++;					
			vagas = (v.length - cntEst);		
			
			System.out.print(p.trim() + " entrou no estacionamento. Vagas restantes: " + vagas + ".\n\n");
		}
	}
	
	public static void saida(String p)	
	{
		boolean filaParaEst = false;		
		boolean saiu = false;				
		
		if (cntEst < 0)						
		{
			System.out.print("O estacionamento está vazio!\n\n");
		}
		else 								
		{
			for (int i = 0; i < cntEst; i++)				
			{
				if (v[i].getPlaca().equals(p))			
				{	
					Carro car = new Carro();			
					car = v[i];						
					car.setmanobra();						
					for (int j = 0; j < i; j++)			
					{									
						Carro carx = new Carro();		
						carx = v[j];					
						carx.setmanobra();				
						p1.empilha(carx);				
					}
					System.out.print(car.getPlaca().trim() + " SAIU do estacionamento. Manobras realizadas: " + car.getmanobra() + ".\n\n");
					
					cntEst--;							
					saiu = true;						 
					
					for (int k = (i - 1); k >= 0; k--)				
					{												
						v[k] = (Carro) p1.desempilha();			
					}
					
					for (int m = i; m < (v.length - 1); m++)		
					{												
						v[m] = v[m+1];							
					}												
					
					
					if (cntFila > 0)								
					{												
						Carro cara = new Carro();					
						cara = f[0];								
						
						System.out.print(cara.getPlaca().trim() + " foi chamado na fila de espera!\n\n");
						
						entrada(cara.getPlaca());					
						for (int b = 0; b < (f.length - 1); b++)	// Em seguida...  
						{
							f[b] = f[b + 1];						
						}
						cntFila--;					
						filaParaEst = true;			
					}
					else							
					{
						v[v.length - 1] = null;		
					}
				}
			}
			if ((cntFila > 0) && !saiu && !filaParaEst)		
			{
				for (int n = 0; n < cntFila; n++)			
				{
					if (f[n].getPlaca().equals(p))			
					{
						Carro carz = new Carro();			
						carz = f[n];						
						
						System.out.print(carz.getPlaca().trim() + " estava na fila de espera, mas teve que partir. Manobras: " + carz.getmanobra() + "\n\n");
						
						cntFila--;									
						
						for (int o = n; o < f.length - 1; o++)		
						{
							f[o] = f[o + 1];						
						}
					}
				}
			}
		}	
	}
}	
