/*	Classe utilit�ria usada na gera��o do movimento de carros nos estacionamentos dos exerc�cios 19 e 20. */

package listaExerciciosN203FilasPilhas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GeraArqEstacionamento 
{
	public static Placa placasEnt[] = new Placa[40];			// Vetor de registros do tipo Placa, opera��es de Entrada.
	public static Placa placasSai[] = new Placa[40];			// Vetor de registros do tipo Placa, opera��es de Sa�da.
	public static Placa ops[] = new Placa[64];					// Vetor de registros do tipo Placa, opera��es de Entrada e Sa�da. 
	public static int contaplaca = 0;					//
	public static int contaops = 0;						// Contadores sortidos, v�rios sabores. 
	public static int contaent = 0;						//
	public static int contasai = 0;						//

	public static void main(String[] args) 
	{
		for (int j = 0; j < placasEnt.length; j++)		// La�o para preencher o vetor de Entradas.
		{
			Placa pl = new Placa();						// Instancia uma nova placa...	
			pl.setPlaca(geraPlaca());					// ...invoca o m�todo de gera��o de placas e armazena o valor retornado.
			pl.setOp("E");								// Define a opera��o como Entrada.
			placasEnt[j] = pl;							// Armazena a placa no vetor de Entradas.
		}
		
		contaplaca = 0;									// Zera o contador para reutiliza��o. 
		
		for (int i = 0; i < placasSai.length; i++)		// La�o para preencher o vetor de Sa�das.
		{
			Placa p2 = new Placa();						// Instancia uma nova placa.
			p2.setPlaca(geraPlaca());					// Invoca o m�todo de gera��o da placa. A placa gerada ser� igual � placa de mesmo �ndice no vetor de Entradas... 
			p2.setOp("S");								// ...mas aqui, ter� a opera��o definida como Sa�da.
			placasSai[i] = p2;							// Armazena a placa no vetor de Sa�das.
		}
		
		Placa aux;
		for (int aa = 0; aa < 15; aa++)						// La�o para quebrar a linearidade do fluxo de sa�das.
		{
			int ran = (int) ((Math.random() * 19) + aa);	// Mudando a ordem de sa�da dos carros, geramos mais manobras e
			aux = placasSai[ran];							// tornamos os resultados mais variados. 
			placasSai[ran] = placasSai[ran+6];
			placasSai[ran+6] = aux;			
		}
				
		for(int w = 0; w < 8; w++)
		{
			entra();			//8 entradas;
		}
		
		sai();
		
		for(int w = 0; w < 8; w++)
		{
			entra();			//8 entradas;
		}

		sai();
		sai();
		
		entra();		// 20 opera��es;
		
		sai(); 
		sai();		// 7 carros l� dentro. 
		
		for(int w = 0; w < 6; w++)
		{
			entra();			//6 entradas;  
		}
				
		sai();   // .
		sai();   // 8 carros, 30 opera��es.  
		
		for(int v = 0; v < 5; v++)
		{
			entra();			//5 entradas. 
		}
		
		sai();					
		sai();		//8
		
		entra();	//9
		
		sai();		//8
		
		entra();	//		//40 opera��es
		entra();	//10
		entra();	// Negado
		entra();	// Negado (aqui j� s�o 33 carros diferentes)
		
		for (int z = 0; z < 9; z++)
		{
			sai();						// 9 sa�das, vai sobrar 1 carro. 
		}
		
		entra();	//2
		sai(); //1
		
		for(int u = 0; u < 6; u++)
		{
			entra();			//6 entradas. 
		}

		for(int u = 0; u < 4; u++)
		{
			sai();			//4 Sa�das. Total de opera��es: 64. 40 tentaram entrar.  
		}
				
		// O trecho abaixo � o c�digo de grava��o do arquivo. 
			
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
		    				 "// ========== Arquivo de movimenta��o gerado. ========== //\n" + 
		    				 "// ===================================================== //\n\n");
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}		
	}
	
	public static String geraPlaca()		// M�todo para gerar placas. N�o recebe par�metros, retorna uma placa do tipo String.
	{
		String placa = new String();		// Instancia uma nova placa... 
		placa = "CYR01";					// ...e atribui os primeiros caracteres, para padroniza��o. 
		
		if (contaplaca < 9)					// Se esta placa for uma das primeiras 9...
		{
			placa = placa + "0";					// ...acrescenta um 0...
			placa = placa + (contaplaca + 1);		// ...e coloca o �ltimo n�mero na ordem crescente, de 1 a 9, usando o contador.
			contaplaca++;							// Incrementa o contador.
		}
		else									// Da d�cima placa em diante...
		{
			placa = placa + (contaplaca + 1);	// Acrescenta o n�mero do contador para manter a sequ�ncia crescente...
			contaplaca++;						// ...e incrementa o contador. 
		}
		return placa;		// Retorna a placa criada. 
	}
	
	public static void entra()						// M�todo de registro de entradas no vetor de opera��es de entrada e de sa�da (ops[]).
	{
		ops[contaops] = placasEnt[contaent];		// Usa um contador para o total de opera��es e outro para o total de entradas. 
		contaops++;									//
		contaent++;									// Incrementa os contadores. 
	}
	
	public static void sai()						// M�todo de registro de sa�das no vetor de opera��es de entrada e sa�da.
	{
		ops[contaops] = placasSai[contasai];		// Usa o mesmo contador para o total de opera��es e outro para o total de sa�das. 
		contaops++;									//
		contasai++;									// Incrementa os contadores. 
	}	
}
