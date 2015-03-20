/*	Exercício 19 da lista de filas e pilhas para N2.
 * 
 * O estacionamento de Bashemin contém uma única alameda que guarda até 10 carros. 
 * Existe apenas uma entrada/saída no estacionamento em uma extremidade da alameda. 
 * Se chegar um cliente para retirar um carro que não seja o mais próximo da saída, 
 * todos os carros bloqueando seu caminho sairão do estacionamento, o carro do cliente
 * será retirado do estacionamento e os outros carros voltarão a ocupar a mesma 
 * sequência inicial. 
 * 
 * Escreva um programa que processe um número de linhas de entrada. Cada linha deve
 * conter um 'E' de entrada ou um 'S' de saída e o número da placa do carro. 
 * O programa deve imprimir uma mensagem sempre que um carro chegar ou sair. 
 * Quando um carro chegar, a mensagem deve especificar se há ou não vaga no estacionamento.
 * Se não houver vaga, o carro partirá sem entrar no estacionamento. Quando um carro
 * sair do estacionamento, a mensagem deve incluir a quantidade de vezes que o carro 
 * foi manobrado para fora do estacionamento para permitir a saída de outros carros. 
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
	public static Pilha p2 = new Pilha(10);		// Pátio de manobras do estacionamento.
	public static Placa vOps[];					// Vetor de placas para armazenar as informações do arquivo texto.
	
	public static void main(String[] args) 
	{
		System.out.print("Estacionamento de Bashemin. Vagas disponíveis: 10\n\n");
		
		int opt = -3;											// Variável de controle do menu de opções. 
		
		while (opt < 0 || opt > 2)										// Valores válidos: 0, 1, 2.
		{
			try																			// Menu de opções para o usuário.
			{
			opt = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:\n1 - Gerar arquivo de movimentação do estacionamento;\n" + 
															   "2 - Processar a movimentação (64 operações de E/S);\n0 - Sair do programa."));	
			}
			catch(NumberFormatException e)
			{
				opt = 10;
			}
			opt = getOption(opt);		// Invoca o método de gerenciamento, mandando a opção do usuário como parâmetro (número inteiro). 
		}	
	}
	
	public static int getOption(int x)						// Método de gerenciamento, recebe um inteiro como parâmetro. 
	{														
		switch(x)											// Avaliação da opção feita pelo usuário no menu.
		{
		case 0:									// Opção 0: 
			
			return x;							// Retorna o valor zero, encerrando o programa. 
			
		case 1:									// Opção 1:
			
			GeraArqEstacionamento.main(null);	// Gera o arquivo de movimentação do estacionamento, criado em uma classe separada.
			x = -3;								// Atribui um valor fora da faixa válida para a variável de controle...
			return x;							// ...e retorna o valor. 
			
		case 2:												// Opção 2:
			
			File arq = new File("Estacionamento.txt");		// Antes de tudo, verifica se o arquivo existe. 	
			if (!arq.exists())								// Tentar acessar um arquivo que não existe costuma quebrar o programa.
			{												// Caso o arquivo não exista, avisamos o usuário, em vez de cuspir um erro horroroso. 
				
				JOptionPane.showMessageDialog(null, "O arquivo de movimentação ainda não foi gerado.", "Operação ilegal", JOptionPane.WARNING_MESSAGE);
				
				x = -3;							// Atribui um valor fora da faixa para a variável de controle.  
			}
			else					// Mas se o arquivo já existir...
			{		
				ler();				// ...invocamos o método para ler as informações do arquivo...
				processa();			// ...e o método para processar as entradas. 
				x = 0;				// A variável de controle recebe o valor 0, para encerrar o programa após o processamento.
			}
			return x;				// Retorna o valor da variável de controle. 
			
		default:					// Opção padrão:
									// As opções válidas já foram tratadas acima. Qualquer outro valor é inválido. 
			
			JOptionPane.showMessageDialog(null, "O valor inserido é inválido.", "PRESTENÇÃO!", JOptionPane.WARNING_MESSAGE);
			
			return x;				// Retorna o valor da variável de controle. 
		}			
	}
	
	public static void processa()						// Método de processamento
	{
		for (int i = 0; i < vOps.length; i++)			// Percorre o vetor de operações, que contém o número das placas e o tipo de operação.
		{
			if (vOps[i].op.equals("E"))					// Se a operação for 'E'...
			{
				entrada(vOps[i].placa);					// ...mandamos essa placa como parâmetro para o método de Entrada.
			}
			else										// Se a operação não é 'E', então é 'S'...
			{
				saida(vOps[i].placa);					// ...e aí mandamos a placa como parâmetro para o método de Saída.
			}
		}
	}
	
	public static void entrada(String placa)			// Método de registro de entradas no estacionamento. Recebe uma placa como parâmetro.
	{
		if (p1.cheia())						// p1 é a pilha que representa o estacionamento. Se estiver cheia...
		{
			System.out.print((placa).trim() + " não conseguiu uma vaga, o estacionamento está cheio!\n\n"); // ...o carro não poderá estacionar.
		}
		else								// Se o estacionamento não estiver cheio...
		{
			int vag = (p1.tamanho() - p1.topo()) - 1;		// ...verifica o número de vagas disponíveis...
			System.out.print((placa).trim() + " entrou no estacionamento. Vagas restantes: " + vag + "\n\n");	// Informa a entrada e as vagas ao usuário...
			Carro car = new Carro();						// ...instancia um novo objeto do tipo Carro...
			car.setPlaca(placa);							// ...anota a placa... 
			p1.empilha(car);								// ...e coloca o carro no estacionamento!
		}
	}
	
	public static void saida(String placa)			// Método de registro de saídas. Recebe a placa como parâmetro. 
	{
		if (p1.vazia())							// Se o estacionamento estiver vazio...
		{
			System.out.print("O estacionamento está vazio!\n");		// ...avisa o usuário.  
		}
		else									// Mas se houver vagas...
		{
			Carro cars = new Carro();									// ...instancia um novo objeto da classe Carro...
			cars = (Carro) p1.desempilha();								// ...e usa o objeto para armazenar o carro que tiramos do estacionamento.
			while (!cars.getPlaca().equals(placa) && !p1.vazia())		// Enquanto a placa do carro que tiramos da pilha não for a que procuramos 
			{															// e se a pilha não estiver vazia...
				
				cars.setManob();										// ...esse não é o carro que precisa sair. Vamos manobrá-lo uma vez...
				p2.empilha(cars);										// ...levando-o para o pátio de manobras (a pilha p2)...
				cars = (Carro) p1.desempilha();							// ...e examinando o próximo carro do estacionamento, até achar o que queremos.
			}
																		// Quando encontrarmos o carro desejado, informamos sua saída e a 
			System.out.print(cars.getPlaca().trim() + " SAIU do estacionamento. Manobras: " + cars.getManob() + "\n\n");	// quantidade de manobras...
			
			while (!p2.vazia())	
			{
				p1.empilha(p2.desempilha());	// E devolvemos TODOS os carros movidos para o pátio de manobras ao estacionamento.  
			}
		}
	}
	
	
	public static void ler()			// Método de leitura do arquivo. 
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
		int linhas = getLines();					// Usa o método getLines() para obter o número de linhas contidas no arquivo.
			int conta = 0;							// Contador.
			vOps = new Placa[linhas];				// Inicializa o vetor de operações com um tamanho igual ao número de linhas do arquivo.
			
			while (leia.hasNext())					// Percorre o arquivo...
			{
				Placa pl = new Placa();				// Para cada linha, cria um novo registro de placa...
				pl.op = leia.next();				// ...anota o tipo de operação (E ou S)...
				pl.placa = leia.next();				// ...anota a placa...
				vOps[conta++] = pl;					// ...e armazena no vetor. 
			}
			leia.close();							// Fecha o scanner. 
		}
	}
	
	public static int getLines()					// Método utilitário. Retorna o número de linhas do arquivo. 
	{
	    int aux = 0;								// Variável auxiliar. 
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
	    return aux;						// Retorna o número de linhas. 
	}	
}
