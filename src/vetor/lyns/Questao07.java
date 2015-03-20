package vetor.lyns;

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
		System.out.println("Vetor A");
		x.imprimir(vetorA);
		System.out.println("\nVetor B");
		x.imprimir(vetorB);
		System.out.println("\nVetor C");
		x.imprimir(vetorC);
	}

	public void preencherVetor(int vetor[]) {

		System.out.println("Informe 20 Valores");
		for (int i = 0; i < 20; i++) {
			vetor[i] = leia.nextInt();
		}
	}

	public void preencherAB(int vetor[], int b[], int c[]) {
		t = vetor.length;
		int indiceB = 0;
		int indiceC = 0;
		for (int i = 0; i < t; i++) {
			if(vetor[i] % 2 == 0){
				b[indiceB] = vetor[i]/2;
				indiceB++;
			}else{
				c[indiceC] = vetor[i]*3;
				indiceC++;
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
