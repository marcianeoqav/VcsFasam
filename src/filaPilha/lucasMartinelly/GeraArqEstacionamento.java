package processual03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class GeraArqEstacionamento 
{
	public static Placa placasEntrada[] = new Placa[40];			
	public static Placa placasSaida[] = new Placa[40];			
	public static Placa ops[] = new Placa[64];					
	public static int contaplaca = 0;					
	public static int contaops = 0;						
	public static int contaentrada = 0;						
	public static int contasaida = 0;						

	public static void main(String[] args) 
	{
		for (int j = 0; j < placasEntrada.length; j++)		
		{
			Placa pl = new Placa();							
			pl.setPlaca(geraPlaca());					
			pl.setOp("E");								
			placasEntrada[j] = pl;							
		}
		
		contaplaca = 0;									 
		
		for (int i = 0; i < placasSaida.length; i++)		
		{
			Placa p2 = new Placa();						
			p2.setPlaca(geraPlaca());					
			p2.setOp("S");								
			placasSaida[i] = p2;						
		}
		
		Placa aux;
		for (int aa = 0; aa < 15; aa++)						
		{
			int ran = (int) ((Math.random() * 19) + aa);	
			aux = placasSaida[ran];							 
			placasSaida[ran] = placasSaida[ran+6];
			placasSaida[ran+6] = aux;			
		}
				
		for(int w = 0; w < 8; w++)
		{
			entra();			
		}
		
		sai();
		
		for(int w = 0; w < 8; w++)
		{
			entra();			
		}

		sai();
		sai();
		
		entra();		
		
		sai(); 
		sai();		 
		
		for(int w = 0; w < 6; w++)
		{
			entra();			
		}
				
		sai();   
		sai();   
		
		for(int v = 0; v < 5; v++)
		{
			entra();			
		}
		
		sai();					
		sai();		
		
		entra();	
		
		sai();		
		
		entra();	
		entra();	
		entra();	
		entra();	
		
		for (int z = 0; z < 9; z++)
		{
			sai();						
		}
		
		entra();	
		sai(); 
		
		for(int u = 0; u < 6; u++)
		{
			entra();			 
		}

		for(int u = 0; u < 4; u++)
		{
			sai();			
		}
				
		
			
		try
	    {
			FileWriter Arq = new FileWriter("Estacionamento.txt");
		    PrintWriter gravaArquivo = new PrintWriter(Arq);
		    for (int a = 0; a < ops.length; a++)
		    {
		        gravaArquivo.printf("%s;%s %n", new Object[] { ops[a].op, ops[a].placa});
		    }
		    Arq.close();
		    System.out.print("// ===================================================== //\n" + 
		    				 "// ========== Arquivo de movimentação gerado. ========== //\n" + 
		    				 "// ===================================================== //\n\n");
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}		
	}
	
	public static String geraPlaca()		
	{
		String placa = new String();		
		placa = "CYR01";					 
		
		if (contaplaca < 9)					
		{
			placa = placa + "0";					
			placa = placa + (contaplaca + 1);		
			contaplaca++;							
		}
		else									
		{
			placa = placa + (contaplaca + 1);	
			contaplaca++;						
		}
		return placa;		
	}
	
	public static void entra()						
	{
		ops[contaops] = placasEntrada[contaentrada];		
		contaops++;									
		contaentrada++;									
	}
	
	public static void sai()						
	{
		ops[contaops] = placasSaida[contasaida];		
		contaops++;									
		contasaida++;									
	}	
}
