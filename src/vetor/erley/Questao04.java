package vetor.erley;

import java.util.Scanner;

//Quest�o 4
public class Questao04 {

	Scanner leia = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		String name[] = new String[t];
		String profissao[] = new String[t];
		int idade[] = new int[t];

		Questao04 x = new Questao04();

		x.preencher(name, profissao, idade);
		x.imprime(name, profissao, idade);

	}

	public void preencher(String name[], String profissao[], int idade[]) {
		t = name.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Digite o nome para a posição : " + i + " do vetor name");
			name[i] = leia.next();
			System.out.println("\nDidgite sua profissão para a posição: " + i + " do vetor profissão");
			profissao[i] = leia.next();
			System.out.println("\nDigite a idade para a posição : " + i + " do vetor idade");
			idade[i] = leia.nextInt();
		}
	}

	public void imprime(String name[], String profissao[], int idade[]) {
		t = name.length;
		System.out.println("Nome\tProfissão\tIdade");
		for (int i = 0; i < t; i++) {
			System.out.println(name[i] + "\t" + profissao[i] + "\t"
					+ idade[i]);
		}
	}
}
