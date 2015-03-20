package vetor.lyns;

/* Implemente um programa na linguagem de programa��o Java para ler e imprimir o
 conte�do de tr�s vetores. Da seguinte forma: Todos os vetores dever�o ter 10 posi��es e
 dever�o armazenar o nome, a profiss�o e a idade de 10 pessoas, considerando que todas
 possuem idades distintas. 
 */
import java.util.Scanner;

public class Questao04 {

	Scanner leia = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		String nome[] = new String[t];
		String profissao[] = new String[t];
		int idade[] = new int[t];

		Questao04 x = new Questao04();

		x.preencherVetor(nome, profissao, idade);
		x.imprimirVetor(nome, profissao, idade);
	}

	public void preencherVetor(String nome[], String profissao[], int idade[]) {
		t = nome.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Infome o nome para a " + (i + 1)
					+ " posição do vetor");
			nome[i] = leia.next();
			System.out.println("Infome a profissão para a " + (i + 1)
					+ " posição do vetor");
			profissao[i] = leia.next();
			System.out.println("Infome a idade para a " + (i + 1)
					+ " posição do vetor");
			idade[i] = leia.nextInt();
		}
	}

	public void imprimirVetor(String nome[], String profissao[], int idade[]) {
		t = nome.length;
		System.out.println("NOME\tPROFISSÃO\tIDADE");
		for (int i = 0; i < t; i++) {
			System.out.println(nome[i] + "\t" + profissao[i] + "\t" + idade[i]);
		}
	}
}
