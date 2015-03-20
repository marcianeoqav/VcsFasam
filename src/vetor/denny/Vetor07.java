package vetor.denny;

import java.util.Scanner;

public class Vetor07 {
	static int t;
	public static void main(String[] args) {
		t = 10;
		int vetorA[] = new int[t*2];
		int vetorB[] = new int[t];
		int vetorC[] = new int[t];

		Vetor07 p = new Vetor07();

		p.preencherA(vetorA);
		System.out.println("Vetor A");
		p.imprime(vetorA);
		p.preencherBC(vetorA, vetorB, vetorC);
		System.out.println("\nVetor B");
		p.imprime(vetorB);
		System.out.println("\nVetor C");
		p.imprime(vetorC);
	}

	public void preencherA(int vetorA[]) {
		t = vetorA.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			if(i % 2 == 0){
				System.out.println("Digite um valor par para a posição: " + i + " do vetorA");
			}else{
				System.out.println("Digite um valor impar para a posição: " + i + " do vetorA");
			}
			vetorA[i] = leia.nextInt();
		}
		leia.close();
	}

	public void preencherBC(int vetorA[], int vetorB[], int vetorC[]) {
		t = vetorA.length;
		int aux = 0;
		int auxb = 0;
		for (int i = 0; i < 20; i++) {
			if ((vetorA[i] % 2) == 0) {
				vetorB[aux] = vetorA[i] / 2;
				aux++;
			} else {
				vetorC[auxb] = vetorA[i] * 3;
				auxb++;
			}
		}
	}

	public void imprime(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

}
