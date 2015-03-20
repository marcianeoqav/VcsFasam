/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor.lucasMartinelly;

import java.util.Scanner;

/**
 * 
 * @author Lucas Martinelly
 */
public class Questao07 {

	static int t;

	public static void preencher(int a[]) {
		t = a.length;
		int x;
		int p = 0;
		int i = 0;
		int y;
		System.out
				.println("Digite o vetor A com 10 valores pares e 10 impares:");
		Scanner leia = new Scanner(System.in);
		for (int j = 0; j < t; j++) {
			do {
				y = 0;
				System.out.println("Digite um valor:");
				x = leia.nextInt();
				if (x % 2 == 0) {
					if (p < t / 2) {
						p++;
						a[j] = x;
						y = 0;
					} else {
						y = 99;
						System.out
								.println("O vetor já contem 10 valores pares, digite um impar.");
					}
				} else {
					if (i < t / 2) {
						i++;
						a[j] = x;
						y = 0;
					} else {
						y = 99;
						System.out
								.println("O vetor já contem 10 valores impares, digite um par.");
					}
				}
			} while (y == 99);
		}
		leia.close();
	}

	public static void desmembrarVetor(int a[], int b[], int c[]) {
		t = a.length;
		int j = 0;
		int k = 0;
		for (int i = 0; i < t; i++) {
			if (a[i] % 2 == 0) {
				b[j] = a[i] / 2;
				j++;
			} else {
				c[k] = a[i] * 3;
				k++;
			}
		}
	}

	public static void imprimir(int a[]) {
		t = a.length;
		for (int i = 0; i < t; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String args[]) {
		t = 20;
		int a[] = new int[t];
		int b[] = new int[t/2];
		int c[] = new int[t/2];
		preencher(a);
		desmembrarVetor(a, b, c);
		System.out.println("Vetor A");
		imprimir(a);
		System.out.println("\nVetor B");
		imprimir(b);
		System.out.println("\nVetor C");
		imprimir(c);
	}
}
