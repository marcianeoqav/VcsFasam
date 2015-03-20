package vetor.erley;

import java.util.Scanner;
//Quest�o 5
public class Questao05 {
	
	static Scanner leia;
	static int t;
	
	public static void main(String[] args) {
		leia = new Scanner(System.in);
		t = 10;
		int Vetor[] = new int[t];

		Questao05 prin = new Questao05();

		prin.preencher(Vetor);
		System.out.println("Digite um valor para x: ");
		int valorx = leia.nextInt();
		
		int indice = prin.pesquisa(valorx, Vetor);

		if (indice == -1) {
			System.out.println("Nada foi encontrado");
		} else {
			System.out.println("O número foi encontrado na posição: " + indice);
		}
	}

	public void preencher(int vetor[]) {
		t = vetor.length;
		leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite um valor para a posição " + i + " do vetor");
			vetor[i] = leia.nextInt();
		}
	}

	public int pesquisa(int x, int vetor[]) {
		int posicao = -1;
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			if (x == vetor[i]) {
				posicao = i;
				return posicao;
			}
		}
		return posicao;
	}
}
