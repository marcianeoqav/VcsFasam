package vetor.denny;

import java.util.Scanner;

public class Vetor05 {

	static int t;

	public static void main(String[] args) {
		t = 10;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um valor para x: ");
		int valorx = leia.nextInt();
		int Vetor[] = new int[t];

		Vetor05 prin = new Vetor05();

		prin.preencher(Vetor);
		int indice = prin.pesquisa(valorx, Vetor);

		if (indice == -1) {
			System.out.println("Nada foi encontrado");
		} else {
			System.out.println("O número foi encontrado na posição: " + indice);
		}
		leia.close();
	}

	public void preencher(int vetor[]) {
		t = vetor.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite um valor para a posição: " + i + " do vetor");
			vetor[i] = leia.nextInt();
		}
		leia.close();
	}

	public int pesquisa(int x, int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			if (x == vetor[i]) {
				return i;
			}
		}
		return -1;
	}
}
