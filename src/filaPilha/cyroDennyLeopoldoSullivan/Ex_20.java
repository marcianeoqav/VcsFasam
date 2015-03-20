/*	Exerc�cio 20 da lista de filas e pilhas para N2.
 * 
 * O estacionamento de Scratchemup cont�m uma �nica alameda que guarda at� 10 carros. 
 * Os carros entram pela extremidade sul e saem pela extremidade norte. 
 * Se chegar um cliente para retirar um carro que n�o esteja estacionado na posi��o 
 * do extremo norte, todos os carros ao norte dele ser�o deslocados para fora, o
 * carro sair� do estacionamento e os outros carros voltar�o � mesma ordem em que
 * encontravam inicialmente. 
 * 
 * Sempre que um carro deixa o estacionamento, todos os carros ao sul s�o deslocados
 * para a frente, de modo que os espa�os vazios estejam sempre na parte sul. 
 * 
 * Escreva um programa que leia um grupo de linhas de entrada. 
 * 
 * Cada linha cont�m um C de chegada ou um P de partida, al�m do n�mero da placa. 
 * As entradas e sa�das ocorrer�o na ordem especificada pelo arquivo. O programa
 * deve imprimir uma mensagem cada vez que um carro chegar ou partir. 
 * Quando um carro chegar, a mensagem dever� especificar se existe ou n�o vaga
 * para o carro no estacionamento. Se n�o houver vaga, o carro esperar� pela
 * vaga ou at� que uma linha de partida seja lida para ele. 
 * 
 * Quando um carro partir, a mensagem dever� incluir o n�mero de vezes que o 
 * carro foi deslocado dentro do estacionamento, incluindo a partida, mas n�o
 * a chegada. O n�mero ser� 0 se o carro for embora a partir da linha de espera.*/


package listaExerciciosN203FilasPilhas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex_20 
{
	
	public static Scanner leia;						// Scanner usado para ler o arquivo.
	public static Scanner conta;					// Scanner usado para contar as linhas do arquivo.
	public static Placa vOps[];						// Vetor de placas para armazenar as informa��es do arquivo texto.
	public static Carro f1[] = new Carro[40]; 		// Fila de espera. 
	public static Pilha p1 = new Pilha(10);			// P�tio de manobras.
	public static Carro v1[] = new Carro[10];		// Alameda do estacionamento. 
	public static int cntEst = 0;					// Contador do estacionamento. 
	public static int cntFila = 0;					// Contador da fila de espera. 
	

	public static void main(String[] args) 
	{
		System.out.print("Estacionamento de Scratchemup. Vagas dispon�veis: 10\n\n");
		
		int opt = -3;											// Vari�vel de controle do menu de op��es. 
		
		while (opt < 0 || opt > 2)										// Valores v�lidos: 0, 1, 2.
		{
			try																			// Menu de op��es para o usu�rio.
			{
			opt = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma op��o:\n1 - Gerar arquivo de movimenta��o do estacionamento;\n" + 
															   "2 - Processar a movimenta��o (64 opera��es de E/S);\n0 - Sair do programa."));	
			}
			catch(NumberFormatException e)
			{
				opt = 10;		// Se o usu�rio fizer uma entrada est�pida, atribui um inteiro inv�lido para manter o la�o funcionando. 
			}
			opt = getOption(opt);		// Invoca o m�todo de gerenciamento, mandando a op��o do usu�rio como par�metro (n�mero inteiro). 
		}	
	}
	
	public static int getOption(int x)
	{
		switch(x)											// Avalia��o da op��o feita pelo usu�rio no menu.
		{
		case 0:									// Op��o 0: 
			
			return x;							// Retorna o valor zero, encerrando o programa. 
			
		case 1:									// Op��o 1:
			
			GeraArqEstacionamento.main(null);	// Gera o arquivo de movimenta��o do estacionamento, criado em uma classe separada.
			x = -3;								// Atribui um valor fora da faixa v�lida para a vari�vel de controle...
			return x;							// ...e retorna o valor. 
			
		case 2:												// Op��o 2:
			
			File arq = new File("Estacionamento.txt");		// Antes de tudo, verifica se o arquivo existe. 	
			if (!arq.exists())								// Tentar acessar um arquivo que n�o existe costuma quebrar o programa.
			{												// Caso o arquivo n�o exista, avisamos o usu�rio, em vez de cuspir um erro horroroso. 
				
				JOptionPane.showMessageDialog(null, "O arquivo de movimenta��o ainda n�o foi gerado.", "Opera��o ilegal", JOptionPane.WARNING_MESSAGE);
				
				x = -3;							// Atribui um valor fora da faixa para a vari�vel de controle.  
			}
			else					// Mas se o arquivo j� existir...
			{		
				ler();				// ...invocamos o m�todo para ler as informa��es do arquivo...
				processa();			// ...e o m�todo para processar as entradas. 
				x = 0;				// A vari�vel de controle recebe o valor 0, para encerrar o programa ap�s o processamento.
			}
			return x;				// Retorna o valor da vari�vel de controle. 
			
		default:					// Op��o padr�o:
									// As op��es v�lidas j� foram tratadas acima. Qualquer outro valor � inv�lido. 
			
			JOptionPane.showMessageDialog(null, "O valor inserido � inv�lido.", "PRESTEN��O!", JOptionPane.WARNING_MESSAGE);
			
			return x;				// Retorna o valor da vari�vel de controle. 
		}		
	}
	
	
	public static void ler()			// M�todo de leitura do arquivo. 
	{
		boolean pass = false;			// Teste de execu��o. 
		try 
		{
			leia = new Scanner(new FileReader("Estacionamento.txt")).useDelimiter(";|\\n");		// Inicializa o scanner...
			pass = true;				// Se chegamos at� aqui, o scanner foi aberto sem problemas. 
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		if (pass)						// Passamos, ent�o vamos continuar!
		{	
		int linhas = getLines();					// Usa o m�todo getLines() para obter o n�mero de linhas contidas no arquivo.
			int conta = 0;							// Contador.
			vOps = new Placa[linhas];				// Inicializa o vetor de opera��es de E/S com um tamanho igual ao n�mero de linhas do arquivo.
			
			while (leia.hasNext())					// Percorre o arquivo...
			{
				Placa pl = new Placa();				// Para cada linha, cria um novo registro de placa...
				pl.op = leia.next();				// ...anota o tipo de opera��o (E ou S)...
				pl.placa = leia.next();				// ...anota a placa...
				vOps[conta++] = pl;					// ...e armazena no vetor. 
			}
			leia.close();							// Fecha o scanner. 
		}
	}
	
	
	
	public static int getLines()					// M�todo utilit�rio. Retorna o n�mero de linhas do arquivo. 
	{
	    int aux = 0;								// Vari�vel auxiliar. 
	    boolean pass = false;
	    try
	    {
	    	conta = new Scanner(new FileReader("Estacionamento.txt")).useDelimiter("\\n");		// Scanner usado para contar as linhas.
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
	    		aux++;						// Soma a quantidade de linhas.
	    	}
	    conta.close();					// Fecha o scanner. 
	    }
	    return aux;						// Retorna o n�mero de linhas. 
	}	
	
	public static void processa()						// M�todo de processamento
	{
		for (int i = 0; i < vOps.length; i++)			// Percorre o vetor de opera��es, que cont�m o n�mero das placas e o tipo de opera��o.
		{
			if (vOps[i].op.equals("E"))					// Se a opera��o for 'E'...
			{
				entrada(vOps[i].placa);					// ...mandamos essa placa como par�metro para o m�todo de Entrada.
			}
			else										// Se a opera��o n�o � 'E', ent�o � 'S'...
			{
				saida(vOps[i].placa);					// ...e a� mandamos a placa como par�metro para o m�todo de Sa�da.
			}
		}
	}
	
	public static void entrada(String p)		// M�todo de registro de entradas. Recebe uma placa como par�metro.
	{
		int vagas; 								// Vari�vel para armazenar o n�mero de vagas.
		Carro car = new Carro();				// Instancia um novo registro de carro...
		car.setPlaca(p);						// ...e anota a placa.
		
		if (cntEst == v1.length)				// Se o contador do estacionamento for igual ao comprimento do vetor, o estacionamento est� cheio. 
		{
			System.out.print("O estacionamento est� cheio. " + p.trim() + " foi para a fila de espera.\n\n");
			
			f1[cntFila] = car;					// Manda o carro para a fila de espera, no �ndice do contador da fila...
			cntFila++;							// ...e incrementa o �ndice. 
		}
		else									// Se o estacionamento N�O estiver cheio...
		{		
			v1[cntEst] = car;					// ...recebe o carro no �ndice do contador do estacionamento...
			cntEst++;							// ...incrementa o �ndice...
			vagas = (v1.length - cntEst);		// ...calcula as vagas e d� as informa��es ao usu�rio.
			
			System.out.print(p.trim() + " entrou no estacionamento. Vagas restantes: " + vagas + ".\n\n");
		}
	}
	
	public static void saida(String p)	// ...VAI UMA MACARRONADA?
	{
		boolean filaParaEst = false;		// Vari�vel de controle para saber se o carro foi da fila de espera para o estacionamento.
		boolean saiu = false;				// Vari�vel para saber se o carro foi embora do estacionamento. 
		
		if (cntEst < 0)						// Verifica se o estacionamento est� vazio.
		{
			System.out.print("O estacionamento est� vazio!\n\n");
		}
		else 								// Se n�o estiver...
		{
			for (int i = 0; i < cntEst; i++)				// ...l� o vetor da posi��o inicial at� o �ltimo elemento da fila.
			{
				if (v1[i].getPlaca().equals(p))				// Se a placa que estamos procurando for encontrada...
				{	
					Carro car = new Carro();			// ...instanciamos um novo registro de carro. 
					car = v1[i];						// O registro recebe o carro estacionado no �ndice i.
					car.setManob();						// Incrementa o n�mero de manobras feitas pelo carro. 

					for (int j = 0; j < i; j++)			// Mas o carro acima pode n�o ser o primeiro da fila, ou seja, 
					{									// vamos ter que manobrar os carros que est�o na frente para poder
						Carro carx = new Carro();		// tir�-lo do estacionamento. 
						carx = v1[j];					// Fazemos isso tirando o primeiro carro da fila, incrementando o 
						carx.setManob();				// n�mero de manobras dele e colocando o carro na pilha. 
						p1.empilha(carx);				// Repetimos isso at� chegar ao �ndice do carro que queremos retirar. 
					}
					System.out.print(car.getPlaca().trim() + " SAIU do estacionamento. Manobras realizadas: " + car.getManob() + ".\n\n");
					
					cntEst--;							// Decrementa o contador do estacionamento
					saiu = true;						// Marca o identificador de sa�da como verdadeiro. 
					
					for (int k = (i - 1); k >= 0; k--)				// Note que o contador desse la�o � DECRESCENTE. Isso � porque precisamos devolver
					{												// os carros que foram manobrados para o p�tio �s suas posi��es originais no estacionamento.
						v1[k] = (Carro) p1.desempilha();			// Tiramos cada carro da pilha e colocamos de volta no estacionamento. 
					}
					
					for (int m = i; m < (v1.length - 1); m++)		// Em seguida, precisamos avan�ar os carros que estavam atr�s daquele que foi retirado.
					{												// Iniciamos o contador no �ndice do carro removido e contamos a partir da�, at� o pen�ltimo
						v1[m] = v1[m+1];							// elemento, reduzindo o �ndice de todos os elementos em 1. Isso faz com que as vagas
					}												// abertas pelos carros que partiram fiquem sempre na parte sul (entrada) do estacionamento.
					
					// Como um carro acabou de sair, isso significa que h� pelo menos uma vaga aberta! 
					
					if (cntFila > 0)								// Por isso, verificamos se algu�m est� esperando na fila antes de aceitar outro carro qualquer. 
					{												// 
						Carro cara = new Carro();					// Instanciamos um novo registro de carro...
						cara = f1[0];								// ...anotamos a placa, avisamos o usu�rio que o carro vai sair da fila e entrar no estacionamento...
						
						System.out.print(cara.getPlaca().trim() + " foi chamado na fila de espera!\n\n");
						
						entrada(cara.getPlaca());					// ...e processamos a entrada desse carro. 
						
						for (int b = 0; b < (f1.length - 1); b++)	// Em seguida...  
						{
							f1[b] = f1[b + 1];						// ...avan�amos toda a fila de espera em uma posi��o...
						}
						cntFila--;					// ...reduzimos o contador da fila, pois acabamos de tirar um carro dela...
						filaParaEst = true;			// ...e indicamos que o carro veio da fila para o estacionamento. 
					}
					else							// Mas se ningu�m estiver esperando na fila...
					{
						v1[v1.length - 1] = null;		// ...a �ltima vaga do estacionamento est� livre. 
					}
				}
			}
			if ((cntFila > 0) && !saiu && !filaParaEst)		// Se o carro que precisa ir embora n�o est� no estacionamento, nem esteve l� e j� saiu...
			{
				for (int n = 0; n < cntFila; n++)			// ...ent�o deve estar na fila de espera. 
				{
					if (f1[n].getPlaca().equals(p))			// Procuramos a placa do carro desejado...
					{
						Carro carz = new Carro();			// ...criamos um novo registro...
						carz = f1[n];						// ...que vai receber os dados do carro, e informamos sua partida ao usu�rio.
						
						System.out.print(carz.getPlaca().trim() + " estava na fila de espera, mas teve que partir. Manobras: " + carz.getManob() + "\n\n");
						
						cntFila--;									// Reduzimos o tamanho da fila...
						
						for (int o = n; o < f1.length - 1; o++)		
						{
							f1[o] = f1[o + 1];						// ...e avan�amos a fila inteira uma posi��o. 
						}
					}
				}
			}
		}	
	}
}	// ================================= // FIM DO PROGRAMA!
