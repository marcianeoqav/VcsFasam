/*	Exercício 20 da lista de filas e pilhas para N2.
 * 
 * O estacionamento de Scratchemup contém uma única alameda que guarda até 10 carros. 
 * Os carros entram pela extremidade sul e saem pela extremidade norte. 
 * Se chegar um cliente para retirar um carro que não esteja estacionado na posição 
 * do extremo norte, todos os carros ao norte dele serão deslocados para fora, o
 * carro sairá do estacionamento e os outros carros voltarão à mesma ordem em que
 * encontravam inicialmente. 
 * 
 * Sempre que um carro deixa o estacionamento, todos os carros ao sul são deslocados
 * para a frente, de modo que os espaços vazios estejam sempre na parte sul. 
 * 
 * Escreva um programa que leia um grupo de linhas de entrada. 
 * 
 * Cada linha contém um C de chegada ou um P de partida, além do número da placa. 
 * As entradas e saídas ocorrerão na ordem especificada pelo arquivo. O programa
 * deve imprimir uma mensagem cada vez que um carro chegar ou partir. 
 * Quando um carro chegar, a mensagem deverá especificar se existe ou não vaga
 * para o carro no estacionamento. Se não houver vaga, o carro esperará pela
 * vaga ou até que uma linha de partida seja lida para ele. 
 * 
 * Quando um carro partir, a mensagem deverá incluir o número de vezes que o 
 * carro foi deslocado dentro do estacionamento, incluindo a partida, mas não
 * a chegada. O número será 0 se o carro for embora a partir da linha de espera.*/


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
	public static Placa vOps[];						// Vetor de placas para armazenar as informações do arquivo texto.
	public static Carro f1[] = new Carro[40]; 		// Fila de espera. 
	public static Pilha p1 = new Pilha(10);			// Pátio de manobras.
	public static Carro v1[] = new Carro[10];		// Alameda do estacionamento. 
	public static int cntEst = 0;					// Contador do estacionamento. 
	public static int cntFila = 0;					// Contador da fila de espera. 
	

	public static void main(String[] args) 
	{
		System.out.print("Estacionamento de Scratchemup. Vagas disponíveis: 10\n\n");
		
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
				opt = 10;		// Se o usuário fizer uma entrada estúpida, atribui um inteiro inválido para manter o laço funcionando. 
			}
			opt = getOption(opt);		// Invoca o método de gerenciamento, mandando a opção do usuário como parâmetro (número inteiro). 
		}	
	}
	
	public static int getOption(int x)
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
	
	
	public static void ler()			// Método de leitura do arquivo. 
	{
		boolean pass = false;			// Teste de execução. 
		try 
		{
			leia = new Scanner(new FileReader("Estacionamento.txt")).useDelimiter(";|\\n");		// Inicializa o scanner...
			pass = true;				// Se chegamos até aqui, o scanner foi aberto sem problemas. 
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		if (pass)						// Passamos, então vamos continuar!
		{	
		int linhas = getLines();					// Usa o método getLines() para obter o número de linhas contidas no arquivo.
			int conta = 0;							// Contador.
			vOps = new Placa[linhas];				// Inicializa o vetor de operações de E/S com um tamanho igual ao número de linhas do arquivo.
			
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
	
	public static void entrada(String p)		// Método de registro de entradas. Recebe uma placa como parâmetro.
	{
		int vagas; 								// Variável para armazenar o número de vagas.
		Carro car = new Carro();				// Instancia um novo registro de carro...
		car.setPlaca(p);						// ...e anota a placa.
		
		if (cntEst == v1.length)				// Se o contador do estacionamento for igual ao comprimento do vetor, o estacionamento está cheio. 
		{
			System.out.print("O estacionamento está cheio. " + p.trim() + " foi para a fila de espera.\n\n");
			
			f1[cntFila] = car;					// Manda o carro para a fila de espera, no índice do contador da fila...
			cntFila++;							// ...e incrementa o índice. 
		}
		else									// Se o estacionamento NÃO estiver cheio...
		{		
			v1[cntEst] = car;					// ...recebe o carro no índice do contador do estacionamento...
			cntEst++;							// ...incrementa o índice...
			vagas = (v1.length - cntEst);		// ...calcula as vagas e dá as informações ao usuário.
			
			System.out.print(p.trim() + " entrou no estacionamento. Vagas restantes: " + vagas + ".\n\n");
		}
	}
	
	public static void saida(String p)	// ...VAI UMA MACARRONADA?
	{
		boolean filaParaEst = false;		// Variável de controle para saber se o carro foi da fila de espera para o estacionamento.
		boolean saiu = false;				// Variável para saber se o carro foi embora do estacionamento. 
		
		if (cntEst < 0)						// Verifica se o estacionamento está vazio.
		{
			System.out.print("O estacionamento está vazio!\n\n");
		}
		else 								// Se não estiver...
		{
			for (int i = 0; i < cntEst; i++)				// ...lê o vetor da posição inicial até o último elemento da fila.
			{
				if (v1[i].getPlaca().equals(p))				// Se a placa que estamos procurando for encontrada...
				{	
					Carro car = new Carro();			// ...instanciamos um novo registro de carro. 
					car = v1[i];						// O registro recebe o carro estacionado no índice i.
					car.setManob();						// Incrementa o número de manobras feitas pelo carro. 

					for (int j = 0; j < i; j++)			// Mas o carro acima pode não ser o primeiro da fila, ou seja, 
					{									// vamos ter que manobrar os carros que estão na frente para poder
						Carro carx = new Carro();		// tirá-lo do estacionamento. 
						carx = v1[j];					// Fazemos isso tirando o primeiro carro da fila, incrementando o 
						carx.setManob();				// número de manobras dele e colocando o carro na pilha. 
						p1.empilha(carx);				// Repetimos isso até chegar ao índice do carro que queremos retirar. 
					}
					System.out.print(car.getPlaca().trim() + " SAIU do estacionamento. Manobras realizadas: " + car.getManob() + ".\n\n");
					
					cntEst--;							// Decrementa o contador do estacionamento
					saiu = true;						// Marca o identificador de saída como verdadeiro. 
					
					for (int k = (i - 1); k >= 0; k--)				// Note que o contador desse laço é DECRESCENTE. Isso é porque precisamos devolver
					{												// os carros que foram manobrados para o pátio às suas posições originais no estacionamento.
						v1[k] = (Carro) p1.desempilha();			// Tiramos cada carro da pilha e colocamos de volta no estacionamento. 
					}
					
					for (int m = i; m < (v1.length - 1); m++)		// Em seguida, precisamos avançar os carros que estavam atrás daquele que foi retirado.
					{												// Iniciamos o contador no índice do carro removido e contamos a partir daí, até o penúltimo
						v1[m] = v1[m+1];							// elemento, reduzindo o índice de todos os elementos em 1. Isso faz com que as vagas
					}												// abertas pelos carros que partiram fiquem sempre na parte sul (entrada) do estacionamento.
					
					// Como um carro acabou de sair, isso significa que há pelo menos uma vaga aberta! 
					
					if (cntFila > 0)								// Por isso, verificamos se alguém está esperando na fila antes de aceitar outro carro qualquer. 
					{												// 
						Carro cara = new Carro();					// Instanciamos um novo registro de carro...
						cara = f1[0];								// ...anotamos a placa, avisamos o usuário que o carro vai sair da fila e entrar no estacionamento...
						
						System.out.print(cara.getPlaca().trim() + " foi chamado na fila de espera!\n\n");
						
						entrada(cara.getPlaca());					// ...e processamos a entrada desse carro. 
						
						for (int b = 0; b < (f1.length - 1); b++)	// Em seguida...  
						{
							f1[b] = f1[b + 1];						// ...avançamos toda a fila de espera em uma posição...
						}
						cntFila--;					// ...reduzimos o contador da fila, pois acabamos de tirar um carro dela...
						filaParaEst = true;			// ...e indicamos que o carro veio da fila para o estacionamento. 
					}
					else							// Mas se ninguém estiver esperando na fila...
					{
						v1[v1.length - 1] = null;		// ...a última vaga do estacionamento está livre. 
					}
				}
			}
			if ((cntFila > 0) && !saiu && !filaParaEst)		// Se o carro que precisa ir embora não está no estacionamento, nem esteve lá e já saiu...
			{
				for (int n = 0; n < cntFila; n++)			// ...então deve estar na fila de espera. 
				{
					if (f1[n].getPlaca().equals(p))			// Procuramos a placa do carro desejado...
					{
						Carro carz = new Carro();			// ...criamos um novo registro...
						carz = f1[n];						// ...que vai receber os dados do carro, e informamos sua partida ao usuário.
						
						System.out.print(carz.getPlaca().trim() + " estava na fila de espera, mas teve que partir. Manobras: " + carz.getManob() + "\n\n");
						
						cntFila--;									// Reduzimos o tamanho da fila...
						
						for (int o = n; o < f1.length - 1; o++)		
						{
							f1[o] = f1[o + 1];						// ...e avançamos a fila inteira uma posição. 
						}
					}
				}
			}
		}	
	}
}	// ================================= // FIM DO PROGRAMA!
