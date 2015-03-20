package vetor.denny;

import java.util.Scanner;

public class Vetor10 {

	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];

		Vetor10 p = new Vetor10();

		p.preencher(vetor);
		System.out.println("Vetor original:");
		p.imprimir(vetor);
		p.inverter(vetor);
		System.out.println("\nVetor invertido:");
		p.imprimir(vetor);
	}

	public void preencher(int vetor[]) {
		t = vetor.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite um valor para a posição: " + i
					+ " do vetor");
			vetor[i] = leia.nextInt();
		}
		leia.close();
	}

	public void inverter(int vetor[]) {
		t = vetor.length;
		int aux;
		for (int i = 0; i < t/2; i++) {
			aux = vetor[i] * vetor[i];
			vetor[i] = vetor[(t-1) - i] * vetor[(t-1) - i];
			vetor[(t-1) - i] = aux;
		}
	}
	
	public void imprimir(int vetor[]){
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
