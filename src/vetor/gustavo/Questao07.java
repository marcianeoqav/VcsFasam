package vetor.gustavo;

import java.util.Scanner;

public class Questao07 {
	Scanner leia = new Scanner(System.in);
	static int t;
	public static void main(String[] args) {
		t = 20;
		int vetorA[] = new int[t];
		int vetorB[] = new int[t/2];
		int vetorC[] = new int[t/2];

		Questao07 x = new Questao07();
		x.preencherVetor(vetorA);
		x.preencherAB(vetorA, vetorB, vetorC);
		System.out.println("Valores do vetor A:");
		x.imprimir(vetorA);
		System.out.println("\nValores do vetor B:");
		x.imprimir(vetorB);
		System.out.println("\nValores do vetor C:");
		x.imprimir(vetorC);
	}

	public void preencherVetor(int vetorA[]) {
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

	public void preencherAB(int vetorA[], int vetorB[], int vetorC[]) {
		t = vetorA.length;
		int aux = 0;
		int auxb = 0;
		for (int i = 0; i < t; i++) {
			if(vetorA[i] % 2 == 0){
				vetorB[aux] = vetorA[i]/2;
				aux++;
			}else{
				vetorC[auxb] = vetorA[i]*3;
				auxb++;
			}
		}
	}

	public void imprimir(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
