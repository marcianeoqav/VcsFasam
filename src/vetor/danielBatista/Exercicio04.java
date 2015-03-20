package vetor.danielBatista;

import java.util.Scanner;

public class Exercicio04 {
	static int t;
	public static void main(String args[]) {
		t = 10;
		String vetorNome[] = new String[t];
		String vetorProfissao[] = new String[t];
		int vetorIdade[] = new int[t];
		Exercicio04 vet = new Exercicio04();
		vet.preencheVetor(vetorNome, vetorProfissao, vetorIdade);
		vet.ImprimeVetor(vetorNome, vetorProfissao, vetorIdade);
	}

	public void preencheVetor(String vetorNome[], String vetorProfissao[],
			int vetorIdade[]) {
		Scanner leia = new Scanner(System.in);
		t = vetorNome.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Digite o Nome do: " + i);
			vetorNome[i] = leia.next();
			System.out.println("Digite a Profissao: " + i);
			vetorProfissao[i] = leia.next();
			System.out.println("Digite a idade: " + i);
			vetorIdade[i] = leia.nextInt();
		}
		leia.close();
	}

	public void ImprimeVetor(String vetorNome[], String vetorProfissao[],
			int vetorIdade[]) {
		t = vetorNome.length;
		System.out.println("Nome \t Profissão \t Idade ");
		for (int i = 0; i < t; i++) {
			System.out.println(vetorNome[i] + "\t" + vetorProfissao[i] + "\t"
					+ vetorIdade[i]);
		}
	}
}
