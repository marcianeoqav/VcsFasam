//QUESTAO 4
package vetor.ariane;

import java.util.Scanner;

//classe renomeada de Vetor_ler para Questao04 
public class Questao04 {

	Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		String nome[] = new String[10];
		String profissao[] = new String[10];
		int idade[] = new int[10];

		Questao04 x = new Questao04();

		x.preencher_vetor(nome, profissao, idade);
		x.imprimir_vetor(nome, profissao, idade);
	}

	public void preencher_vetor(String nome[], String profissao[], int idade[]) {

		for (int i = 0; i < 10; i++) {

			System.out.println("Infome o Nome : ");
			nome[i] = entrada.next();
			
			System.out.println("Infome a Profiss�o : ");
			profissao[i] = entrada.next();

			System.out.println("Infome a Idade : ");
			idade[i] = entrada.nextInt();

		}

	}

	public void imprimir_vetor(String nome[], String profissao[], int idade[]) {
		System.out.println("NOME        -    Profissao    -       Idade");
		for (int i = 0; i < 10; i++) {
			System.out.println(nome[i] + "           " + profissao[i]
					+ "             " + idade[i]);
		}
	}

}
