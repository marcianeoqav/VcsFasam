package vetor.samuelDavid;

//Quest�o 7
import java.util.Scanner;

public class Questao07 {
	
	Scanner entrada = new Scanner(System.in);
	static int t;
	
	public static void main(String[] args) {
		t = 20;
		int vetorA[] = new int[t];
		int vetorB[] = new int[t/2];
		int vetorC[] = new int[t/2];

		Questao07 x = new Questao07();
		
		x.preencherVetor(vetorA);
		System.out.println("Vetor A");
		x.imprimir(vetorA);
		x.preencherAB(vetorA, vetorB, vetorC);
		System.out.println("\nVetor B");
		x.imprimir(vetorB);
		System.out.println("\nVetor C");
		x.imprimir(vetorC);
	}

	public void preencherVetor(int vetor[]) {
		t = vetor.length;
		System.out.println("Informe " + t + " valores");
		for (int i = 0; i < t; i++) {
			vetor[i] = entrada.nextInt();
		}
	}

	public void preencherAB(int vetor[], int b[], int c[]) {
		t = vetor.length;
		int aux = 0;
		int auxb = 0;
		for (int i = 0; i < t; i++) {
			if ((vetor[i] % 2) == 0) {
				b[aux] = vetor[i] / 2;
				aux++;
			} else {
				c[auxb] = vetor[i] * 3;
				auxb++;
			}
		}
	}

	public void imprimir(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
