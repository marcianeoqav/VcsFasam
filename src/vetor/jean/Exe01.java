package vetor.jean;

import java.util.Scanner;

/**
 * 
 * @author JeanPaulo
 */
public class Exe01 {
	
	static int t;

	public static void gravar(int vet[]) {
		t = vet.length;
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor:");
			vet[i] = in.nextInt();
		}
		in.close();
	}

	public static void imprimir(int vet[]) {
		t = vet.length;
		System.out.print("\nVetor completo: ");
		for (int i = 0; i < t; i++) {
			System.out.print(vet[i] + " ");
		}
	}

	public static void main(String[] args) {
		t = 10;
		System.out.println("Vetor inteiro de 10 posições.");
		int vet[] = new int[t];
		gravar(vet);
		imprimir(vet);
	}
}
