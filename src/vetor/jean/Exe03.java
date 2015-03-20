package vetor.jean;

import java.util.Scanner;

/**
 * 
 * @author JeanPaulo
 */
public class Exe03 {
	
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
		for (int i = 0; i < t; i++) {
			System.out.print(vet[i] + " ");
		}
	}

	public static void ordenar(int vet[]) {
		t = vet.length;
		int aux;
		for (int i = 0; i < t-1; i++) {
			for (int j = i+1; j < t; j++) {
				if (vet[i] < vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
	}

	public static void main(String[] args) {
		t = 10;
		int vet[] = new int[t];
		System.out.println("Vetor inteiro de 10 posições.");
		gravar(vet);
		System.out.print("\nVetor completo:");
		imprimir(vet);
		ordenar(vet);
		System.out.print("\nVetor ordenado:");
		imprimir(vet);
	}
}