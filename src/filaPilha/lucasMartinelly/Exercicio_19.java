
package processual03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;


import javax.swing.JOptionPane;

public class Exercicio_19 
{
	public static Scanner leia;					
	public static Scanner conta;				
	public static Pilha p1 = new Pilha(10);	
	public static Pilha p2 = new Pilha(10);		
	public static Placa vOps[];					
	
	public static void main(String[] args) 
	{
		System.out.print("Estacionamento de Bashemin. Vagas disponíveis: 10\n\n");
		
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
	
	public static void processa()						
	{
		for (int i = 0; i < vOps.length; i++)			
		{
			if (vOps[i].op.equals("E"))					
				entrada(vOps[i].placa);					
			else										
			{
				saida(vOps[i].placa);					
			}
		}
	}
	
	public static void entrada(String placa)			
	{
		if (p1.cheia())						
		{
			System.out.print((placa).trim() + " não conseguiu uma vaga, o estacionamento está cheio!\n\n"); 
		}
		else								
		{
			int vag = (p1.tamanho() - p1.topo()) - 1;		
			System.out.print((placa).trim() + " entrou no estacionamento. Vagas restantes: " + vag + "\n\n");	
			Carro car = new Carro();						
			car.setPlaca(placa);							
			p1.empilha(car);								
		}
	}
	
	public static void saida(String placa)			
	{
		if (p1.vazia())							
		{
			System.out.print("O estacionamento está vazio!\n");		  
		}
		else									
		{
			Carro cars = new Carro();									
			cars = (Carro) p1.desempilha();								
			while (!cars.getPlaca().equals(placa) && !p1.vazia())		 
			{															
				
				cars.setmanobra();										
				p2.empilha(cars);										
				cars = (Carro) p1.desempilha();							
			}
																		
			System.out.print(cars.getPlaca().trim() + " SAIU do estacionamento. Manobras: " + cars.getmanobra() + "\n\n");	
			
			while (!p2.vazia())	
			{
				p1.empilha(p2.desempilha());	
			}
		}
	}
	
	
	public static void ler()			
	{
		boolean pass = false;
		try 
		{
			leia = new Scanner(new FileReader("Estacionamento.txt")).useDelimiter(";|\\n");		
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
}
