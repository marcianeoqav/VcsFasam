package vetor.samuelDavid;

//Quest�o 4
import java.util.Scanner;

public class Questao04 {

	Scanner entrada = new Scanner(System.in);
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
					+ " posição do vetor nome");
			nome[i] = entrada.next();
			System.out.println("Infome a profissão para a " + (i + 1)
					+ " posição do vetor profissão");
			profissao[i] = entrada.next();
			System.out.println("Infome a idade para a " + (i + 1)
					+ " posição do vetor idade");
			idade[i] = entrada.nextInt();
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
