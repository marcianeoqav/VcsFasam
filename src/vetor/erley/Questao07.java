package vetor.erley;

import java.util.Scanner;

//Quest�o 7
public class Questao07 {

	static int t;

	public static void main(String[] args) {
		t = 20;
		int vetorA[] = new int[t];
		int vetorB[] = new int[t / 2];
		int vetorC[] = new int[t / 2];

		Questao07 p = new Questao07();
		System.out.println("Preenchendo o vetor A:");
		p.preencherA(vetorA);
		System.out.println("\nGerando os vetores A e B:");
		p.preencherBC(vetorA, vetorB, vetorC);
		System.out.println("\nvetor A:");
		p.imprime(vetorA);
		System.out.println("\nvetor B:");
		p.imprime(vetorB);
		System.out.println("\nvetor C:");
		p.imprime(vetorC);

	}

	public void preencherA(int vetorA[]) {
		Scanner leia = new Scanner(System.in);
		t = vetorA.length;
		for (int i = 0; i < t; i++) {
			if (i % 2 == 0) {
				System.out.println("Digite um valor par para a posição " + i
						+ " do vetor");
				int valorP = leia.nextInt();
				// validar se de fato o valor é par
				while (valorP % 2 != 0) {
					System.out
							.println("Valor inválido, Você deve digitar um valor par para a posição "
									+ i + " do vetor");
					valorP = leia.nextInt();
				}
				vetorA[i] = valorP;
			} else {
				System.out.println("Digite um valor impar para a posição " + i
						+ " do vetor");
				int valorI = leia.nextInt();
				// validar se de fato o valor é impar
				while (valorI % 2 == 0) {
					System.out
							.println("Valor inválido, Você deve digitar um valor impar para a posição "
									+ i + " do vetor");
					valorI = leia.nextInt();
				}
				vetorA[i] = valorI;
			}
		}
		leia.close();
	}

	public void preencherBC(int vetorA[], int vetorB[], int vetorC[]) {
		t = vetorA.length;
		int aux = 0;
		int auxb = 0;
		for (int i = 0; i < t; i++) {
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
