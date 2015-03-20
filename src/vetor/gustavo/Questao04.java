package vetor.gustavo;

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
			System.out.println("Infome o nome para a posição " + i
					+ " do vetor nome");
			nome[i] = leia.next();
			System.out.println("Infome a profissão para a posição " + i
					+ " do vetor profissão");
			profissao[i] = leia.next();
			System.out.println("Infome a idade para a posição " + i
					+ " do vetor idade");
			idade[i] = leia.nextInt();
		}
	}

	public void imprimirVetor(String nome[], String profissao[], int idade[]) {
		t = nome.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Nome\tProfissão\tIdade");
			System.out.println(nome[i] + "\t" + profissao[i] + "\t" + idade[i]);

		}
	}
}
