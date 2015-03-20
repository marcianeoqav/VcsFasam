//QUESTAO 7
package vetor.ariane;

import java.util.Scanner;

//classe renomeada de Vetor_par_impar para Questao07
public class Questao07 {

	public static void main(String[] args) {
		int VetorA[] = new int[20];
		int VetorB[] = new int[10];
		int VetorC[] = new int[10];

		Questao07 T = new Questao07();

		T.preencherA(VetorA);
		T.preencherBC(VetorA, VetorB, VetorC);
		T.imprime(VetorA, VetorB, VetorC);

	}

	public void preencherA(int vetorA[]) {
		// mudado o nome de entreda para entrada
		Scanner entrada = new Scanner(System.in);
		int aux = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor par: ");
			int valorP = entrada.nextInt();
			System.out.println("Digite um valor impar: ");
			int valorI = entrada.nextInt();

			vetorA[aux] = valorP;
			aux = aux + 1;

			vetorA[aux] = valorI;
			aux = aux + 1;
		}
		entrada.close(); // adicionada esta linha.
	}

	public void preencherBC(int vetorA[], int vetorB[], int vetorC[]) {
		int aux = 0;
		int auxb = 0;
		for (int i = 0; i < 20; i++) {
			if ((vetorA[i] % 2) == 0) {
				vetorB[aux] = vetorA[i] / 2;
				aux = aux + 1;
			} else {
				vetorC[auxb] = vetorA[i] * 3;
				auxb = auxb + 1;
			}
		}
	}

	public void imprime(int vetorA[], int vetorB[], int vetorC[]) {
		System.out.println("Vetor A: ");
		for (int i = 0; i < 20; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("\nVetor B: ");
		for (int j = 0; j < 10; j++) {
			System.out.print(vetorB[j] + " ");
		}
		System.out.println("\nVetor C: ");
		for (int x = 0; x < 10; x++) {
			System.out.print(vetorC[x] + " ");
		}
	}

}
