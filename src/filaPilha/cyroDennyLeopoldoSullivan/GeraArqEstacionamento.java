/*	Classe utilitária usada na geração do movimento de carros nos estacionamentos dos exercícios 19 e 20. */

package listaExerciciosN203FilasPilhas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GeraArqEstacionamento 
{
	public static Placa placasEnt[] = new Placa[40];			// Vetor de registros do tipo Placa, operações de Entrada.
	public static Placa placasSai[] = new Placa[40];			// Vetor de registros do tipo Placa, operações de Saída.
	public static Placa ops[] = new Placa[64];					// Vetor de registros do tipo Placa, operações de Entrada e Saída. 
	public static int contaplaca = 0;					//
	public static int contaops = 0;						// Contadores sortidos, vários sabores. 
	public static int contaent = 0;						//
	public static int contasai = 0;						//

	public static void main(String[] args) 
	{
		for (int j = 0; j < placasEnt.length; j++)		// Laço para preencher o vetor de Entradas.
		{
			Placa pl = new Placa();						// Instancia uma nova placa...	
			pl.setPlaca(geraPlaca());					// ...invoca o método de geração de placas e armazena o valor retornado.
			pl.setOp("E");								// Define a operação como Entrada.
			placasEnt[j] = pl;							// Armazena a placa no vetor de Entradas.
		}
		
		contaplaca = 0;									// Zera o contador para reutilização. 
		
		for (int i = 0; i < placasSai.length; i++)		// Laço para preencher o vetor de Saídas.
		{
			Placa p2 = new Placa();						// Instancia uma nova placa.
			p2.setPlaca(geraPlaca());					// Invoca o método de geração da placa. A placa gerada será igual à placa de mesmo índice no vetor de Entradas... 
			p2.setOp("S");								// ...mas aqui, terá a operação definida como Saída.
			placasSai[i] = p2;							// Armazena a placa no vetor de Saídas.
		}
		
		Placa aux;
		for (int aa = 0; aa < 15; aa++)						// Laço para quebrar a linearidade do fluxo de saídas.
		{
			int ran = (int) ((Math.random() * 19) + aa);	// Mudando a ordem de saída dos carros, geramos mais manobras e
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
		
		entra();		// 20 operações;
		
		sai(); 
		sai();		// 7 carros lá dentro. 
		
		for(int w = 0; w < 6; w++)
		{
			entra();			//6 entradas;  
		}
				
		sai();   // .
		sai();   // 8 carros, 30 operações.  
		
		for(int v = 0; v < 5; v++)
		{
			entra();			//5 entradas. 
		}
		
		sai();					
		sai();		//8
		
		entra();	//9
		
		sai();		//8
		
		entra();	//		//40 operações
		entra();	//10
		entra();	// Negado
		entra();	// Negado (aqui já são 33 carros diferentes)
		
		for (int z = 0; z < 9; z++)
		{
			sai();						// 9 saídas, vai sobrar 1 carro. 
		}
		
		entra();	//2
		sai(); //1
		
		for(int u = 0; u < 6; u++)
		{
			entra();			//6 entradas. 
		}

		for(int u = 0; u < 4; u++)
		{
			sai();			//4 Saídas. Total de operações: 64. 40 tentaram entrar.  
		}
				
		// O trecho abaixo é o código de gravação do arquivo. 
			
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
	
	public static String geraPlaca()		// Método para gerar placas. Não recebe parâmetros, retorna uma placa do tipo String.
	{
		String placa = new String();		// Instancia uma nova placa... 
		placa = "CYR01";					// ...e atribui os primeiros caracteres, para padronização. 
		
		if (contaplaca < 9)					// Se esta placa for uma das primeiras 9...
		{
			placa = placa + "0";					// ...acrescenta um 0...
			placa = placa + (contaplaca + 1);		// ...e coloca o último número na ordem crescente, de 1 a 9, usando o contador.
			contaplaca++;							// Incrementa o contador.
		}
		else									// Da décima placa em diante...
		{
			placa = placa + (contaplaca + 1);	// Acrescenta o número do contador para manter a sequência crescente...
			contaplaca++;						// ...e incrementa o contador. 
		}
		return placa;		// Retorna a placa criada. 
	}
	
	public static void entra()						// Método de registro de entradas no vetor de operações de entrada e de saída (ops[]).
	{
		ops[contaops] = placasEnt[contaent];		// Usa um contador para o total de operações e outro para o total de entradas. 
		contaops++;									//
		contaent++;									// Incrementa os contadores. 
	}
	
	public static void sai()						// Método de registro de saídas no vetor de operações de entrada e saída.
	{
		ops[contaops] = placasSai[contasai];		// Usa o mesmo contador para o total de operações e outro para o total de saídas. 
		contaops++;									//
		contasai++;									// Incrementa os contadores. 
	}	
}
