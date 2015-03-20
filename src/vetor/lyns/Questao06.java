package vetor.lyns;

//Implemente na linguagem de programa��o Java, a quest�o discursiva 01 da avalia��o N1.
//não se utiliza acentuacao ou caracteres especiais em nome de classe ou metodos em java.
import java.util.Scanner;

public class Questao06 {
	Scanner leia = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vA[] = new int[t];
		int vB[] = new int[t];
		Questao06 x = new Questao06();

		x.preencherVetor(vA, vB);
		System.out.println("Vetor A");
		x.imprimir(vA);
		System.out.println("\nVetor B");
		x.imprimir(vB);
		int vC[] = x.intercalacao(vA, vB);
		System.out.println("\nVetor C");
		x.imprimir(vC);
	}

	public void preencherVetor(int v1[], int v2[]) {

		System.out.println("Informe 10 Valores Para o 1º Vetor");
		for (int i = 0; i < 10; i++) {
			v1[i] = leia.nextInt();
		}

		System.out.println("Informe 10 Valores Para o 2º Vetor");
		for (int i = 0; i < 10; i++) {
			v2[i] = leia.nextInt();
		}

	}

	// nome alterado, utilizando de acentuacao
	public int[] intercalacao(int v1[], int v2[]) {
		t = v1.length;
		int v_intercalado[] = new int[t * 2];
		int j = 0;
		for (int i = 0; i < t; i++) {
			v_intercalado[j] = v1[i];
			j++;
			v_intercalado[j] = v2[i];
			j++;
		}
		return v_intercalado;
	}
	
	public void imprimir(int vetor[]){
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
