package vetor.gilmar;

import java.util.Scanner;

public class ProcessualN201Gilmar {
	
	static Scanner leia = new Scanner(System.in);//objeto para leitura de comandos digitados pelo usuário
	static int tamanhoVetor; //armazenará o tamanho de qualquer vetor utilizado nos exercícios
	static int vetor[]; //vários exercícios utilizam um vetor genérico;
	static int vetorA[];//utilizado nos exercícios 6 e 7;
	static int vetorB[];//utilizado nos exercícios 6 e 7;
	static int vetorC[];//utilizado nos exercícios 6 e 7;
	static char vetorChar[];//utilizado nos exercícios 8 e 9;
	static String palavra;//utilizado nos exercícios 8 e 9;
	
	//método utilizado pelo exercício 07
	public static void desmembraVetores(int vetorA[], int vetorB[], int vetorC[], int t){
		int indiceB = 0;
		int indiceC = 0;
		for (int i = 0; i < t; i++) {
			if(vetorA[i] % 2 == 0){
				vetorB[indiceB] = vetorA[i]/2;
				indiceB++;
			}else{
				vetorC[indiceC] = vetorA[i] * 3;
				indiceC++;
			}
		}
	}
	
	//utilizado por todos os exercícios;
	public static void imprimeVetorInt(int vetor[], int t){
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	
	//utilizado pelo exercício 04
	public static void imprimeVetorString(String vetor[], int t){
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	
	//utilizado pelos exercícios 08 e 09;
	public static void imprimeVetorChar(char vetor[], int t){
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	
	//utilizado pelo exercício 04;
	public static void imprimeVetorFormatoRelatorio(String nome[], String profissao[], int idade[], int t){
		System.out.println("NOME\tPROFISSÃO\tIDADE");
		for (int i = 0; i < t; i++) {
			System.out.println(nome[i]+"\t"+profissao[i]+"\t"+idade[i]);
		}
	}
	
	//utilizado pelo exercício 06
	public static int[] intercalar(int vetorA[], int vetorB[], int t){
		int vetorC[] = new int[t*2];
		int j = 0;
		for (int i = 0; i < t; i++) {
			vetorC[j] = vetorA[i];
			j++;
			vetorC[j] = vetorB[i];
			j++;
		}
		return vetorC;
	}
	
	//utilizado pelo exercício 09
	public static void inverteVetorChar(char[] vetor, int t) {
		char aux;
		if (t % 2 == 0) {
			for (int i = 0; i < (t / 2); i++) {
				aux = vetor[i];
				vetor[i] = vetor[(t - 1) - i];
				vetor[(t - 1) - i] = aux;
			}
		} else {
			for (int i = 0; i < ((t - 1) / 2); i++) {
				aux = vetor[i];
				vetor[i] = vetor[(t - 1) - i];
				vetor[(t - 1) - i] = aux;
			}
		}
	}

	//utilizado pelo exercício 10
	public static void inverteVetorAoQuadrado(int vetor[], int t) {
		int aux;
		for (int i = 0; i < (t / 2); i++) {
			aux = vetor[i] * vetor[i];
			vetor[i] = vetor[(t - 1) - i] * vetor[(t - 1) - i];
			vetor[(t - 1) - i] = aux;
		}
	}
	
	//utilizado pelo exercício 02;
	public static void ordenarCrescente(int vetor[], int t){
		int aux;
		for (int i = 0; i < t-1; i++) {
			for(int j = i + 1; j< t; j++){
				if(vetor[i] > vetor[j]){
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	}
	
	//utilizado pelo exercício 03;
	//observe que para inverter a ordem é só alterar o sinal > para < no if;
	public static void ordenarDecrescente(int vetor[], int t){
		int aux;
		for (int i = 0; i < t-1; i++) {
			for(int j = i + 1; j< t; j++){
				if(vetor[i] < vetor[j]){
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	}
	
	//utilizado pelo exercício 05
	public static int pesquisaVetor(int vetor[], int t, int x){
		int resultado = -1;
		for (int i = 0; i < t; i++) {
			if(vetor[i] == x){
				resultado = i;
				return resultado;
			}
		}
		return resultado;
	}
	
	//utilizado por vários exercícios
	public static void preencheVetorInt(int vetor[], int t) {
		for (int i = 0; i < t; i++) {
			System.out.println(Mensagem.valorInteiro + (i + 1) + Mensagem.posicaoVetor);
			vetor[i] = leia.nextInt();
		}
	}

	//utilizado pelo exercício 04.
	public static void preencheVetorString(String vetor[], int t) {
		for (int i = 0; i < t; i++) {
			System.out.println(Mensagem.valorTexto + (i + 1) + Mensagem.posicaoVetor);
			vetor[i] = leia.next();
		}
	}

	//utilizado pelos exercícios 08 e 09
	public static void preencheVetorPalavra(String palavra, char vetor[]) {
		int t = palavra.length();
		for (int i = 0; i < t; i++) {
			vetor[i] = palavra.charAt(i);
		}
	}

	//utilizado pelo exercício 07
	public static void preencheVetorNumerosParesImpares(int vetor[], int t) {
		for (int i = 0; i < t; i++) {
			if (i % 2 == 0) {
				System.out.println(Mensagem.valorPar + (i + 1) + Mensagem.posicaoVetor);
				int valorPar = leia.nextInt();
				// validar se de fato o valor é par
				while (valorPar % 2 != 0) {
					System.out.println(Mensagem.valorParInvalido + (i+1) + Mensagem.posicaoVetor);
					valorPar = leia.nextInt();
				}
				vetor[i] = valorPar;
			} else {
				System.out.println(Mensagem.valorImpar + (i+1) + Mensagem.posicaoVetor);
				int valorImpar = leia.nextInt();
				// validar se de fato o valor é impar
				while (valorImpar % 2 == 0) {
					System.out.println(Mensagem.valorImparInvalido + (i+1) + Mensagem.posicaoVetor);
					valorImpar = leia.nextInt();
				}
				vetor[i] = valorImpar;
			}
		}
	}
	
}
