package vetor.erley;

import java.util.Scanner;

//Quest�o 1

public class Questao01 {

	Scanner leia;
	static int t;
	
	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];
		Questao01 x = new Questao01();
		System.out.println("Preenchendo o vetor");
		x.preencher(vetor);
		System.out.println("Imprimindo o vetor");
		x.imprime(vetor);
	}

	public void preencher(int vetor[]) {
		t = vetor.length;
		leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite um valor para a posição: " + i + " do vetor");
			vetor[i] = leia.nextInt();
		}
	}

	public void imprime(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
