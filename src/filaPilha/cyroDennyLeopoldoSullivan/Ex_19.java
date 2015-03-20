/*	Exerc�cio 19 da lista de filas e pilhas para N2.
 * 
 * O estacionamento de Bashemin cont�m uma �nica alameda que guarda at� 10 carros. 
 * Existe apenas uma entrada/sa�da no estacionamento em uma extremidade da alameda. 
 * Se chegar um cliente para retirar um carro que n�o seja o mais pr�ximo da sa�da, 
 * todos os carros bloqueando seu caminho sair�o do estacionamento, o carro do cliente
 * ser� retirado do estacionamento e os outros carros voltar�o a ocupar a mesma 
 * sequ�ncia inicial. 
 * 
 * Escreva um programa que processe um n�mero de linhas de entrada. Cada linha deve
 * conter um 'E' de entrada ou um 'S' de sa�da e o n�mero da placa do carro. 
 * O programa deve imprimir uma mensagem sempre que um carro chegar ou sair. 
 * Quando um carro chegar, a mensagem deve especificar se h� ou n�o vaga no estacionamento.
 * Se n�o houver vaga, o carro partir� sem entrar no estacionamento. Quando um carro
 * sair do estacionamento, a mensagem deve incluir a quantidade de vezes que o carro 
 * foi manobrado para fora do estacionamento para permitir a sa�da de outros carros. 
 * */

package listaExerciciosN203FilasPilhas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;


import javax.swing.JOptionPane;

public class Ex_19 
{
	public static Scanner leia;					// Scanner usado para ler o arquivo.
	public static Scanner conta;				// Scanner usado para contar as linhas do arquivo.
	public static Pilha p1 = new Pilha(10);		// Alameda do estacionamento.
	public static Pilha p2 = new Pilha(10);		// P�tio de manobras do estacionamento.
	public static Placa vOps[];					// Vetor de placas para armazenar as informa��es do arquivo texto.
	
	public static void main(String[] args) 
	{
		System.out.print("Estacionamento de Bashemin. Vagas dispon�veis: 10\n\n");
		
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
				opt = 10;
			}
			opt = getOption(opt);		// Invoca o m�todo de gerenciamento, mandando a op��o do usu�rio como par�metro (n�mero inteiro). 
		}	
	}
	
	public static int getOption(int x)						// M�todo de gerenciamento, recebe um inteiro como par�metro. 
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
	
	public static void entrada(String placa)			// M�todo de registro de entradas no estacionamento. Recebe uma placa como par�metro.
	{
		if (p1.cheia())						// p1 � a pilha que representa o estacionamento. Se estiver cheia...
		{
			System.out.print((placa).trim() + " n�o conseguiu uma vaga, o estacionamento est� cheio!\n\n"); // ...o carro n�o poder� estacionar.
		}
		else								// Se o estacionamento n�o estiver cheio...
		{
			int vag = (p1.tamanho() - p1.topo()) - 1;		// ...verifica o n�mero de vagas dispon�veis...
			System.out.print((placa).trim() + " entrou no estacionamento. Vagas restantes: " + vag + "\n\n");	// Informa a entrada e as vagas ao usu�rio...
			Carro car = new Carro();						// ...instancia um novo objeto do tipo Carro...
			car.setPlaca(placa);							// ...anota a placa... 
			p1.empilha(car);								// ...e coloca o carro no estacionamento!
		}
	}
	
	public static void saida(String placa)			// M�todo de registro de sa�das. Recebe a placa como par�metro. 
	{
		if (p1.vazia())							// Se o estacionamento estiver vazio...
		{
			System.out.print("O estacionamento est� vazio!\n");		// ...avisa o usu�rio.  
		}
		else									// Mas se houver vagas...
		{
			Carro cars = new Carro();									// ...instancia um novo objeto da classe Carro...
			cars = (Carro) p1.desempilha();								// ...e usa o objeto para armazenar o carro que tiramos do estacionamento.
			while (!cars.getPlaca().equals(placa) && !p1.vazia())		// Enquanto a placa do carro que tiramos da pilha n�o for a que procuramos 
			{															// e se a pilha n�o estiver vazia...
				
				cars.setManob();										// ...esse n�o � o carro que precisa sair. Vamos manobr�-lo uma vez...
				p2.empilha(cars);										// ...levando-o para o p�tio de manobras (a pilha p2)...
				cars = (Carro) p1.desempilha();							// ...e examinando o pr�ximo carro do estacionamento, at� achar o que queremos.
			}
																		// Quando encontrarmos o carro desejado, informamos sua sa�da e a 
			System.out.print(cars.getPlaca().trim() + " SAIU do estacionamento. Manobras: " + cars.getManob() + "\n\n");	// quantidade de manobras...
			
			while (!p2.vazia())	
			{
				p1.empilha(p2.desempilha());	// E devolvemos TODOS os carros movidos para o p�tio de manobras ao estacionamento.  
			}
		}
	}
	
	
	public static void ler()			// M�todo de leitura do arquivo. 
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
		int linhas = getLines();					// Usa o m�todo getLines() para obter o n�mero de linhas contidas no arquivo.
			int conta = 0;							// Contador.
			vOps = new Placa[linhas];				// Inicializa o vetor de opera��es com um tamanho igual ao n�mero de linhas do arquivo.
			
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
}
