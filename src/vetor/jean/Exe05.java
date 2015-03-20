package vetor.jean;

import java.util.Scanner;

/**
 * 
 * @author JeanPaulo
 */
public class Exe05 {

	static Scanner in = new Scanner(System.in);
	static int t;

	public static void criar(int vet[]) {
		t = vet.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Digite o valor posição " + (i + 1) + ":");
			vet[i] = in.nextInt();
		}
	}

	public static int Pesquisa(int vet[], int x) {
		t = vet.length;
		int posicao = -1;
		for (int i = 0; i < t; i++) {
			if (vet[i] == x) {
				posicao = i;
				return posicao;
			}
		}
		return posicao;
	}

	public static void main(String[] args) {
		t = 10;
		int vet[] = new int[t];
		criar(vet);
		System.out.println("Digite o valor para pesquisar:");
		int x = in.nextInt();
		int i = Pesquisa(vet, x);
		if (i != -1) {
			System.out.println("Valor pesquisado: " + x
					+ ", posição no vetor: " + i);
		} else {
			System.out.println("Valor não encontrado.");
		}
	}
}
