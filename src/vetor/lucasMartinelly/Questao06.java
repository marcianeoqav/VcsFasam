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
public class Questao06 {

	static int t;

	public void preencher(int va[], int vb[]) {
		t = va.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor 1:");
			va[i] = leia.nextInt();
			System.out.println("Digite o " + (i + 1) + "° valor do vetor 2:");
			vb[i] = leia.nextInt();
		}
		leia.close();
	}

	public int[] intercalarVetores(int va[], int vb[], int a, int b) {
		int c[] = new int[a + b];
		int j = 0;
		for (int i = 0; i < a; i++) {
			c[j] = va[i];
			j++;
			c[j] = vb[i];
			j++;
		}
		return c;
	}

	public void imprimir(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	public static void main(String args[]) {
		t = 5;
		int va[] = new int[t];
		int vb[] = new int[t];

		Questao06 q = new Questao06();

		q.preencher(va, vb);
		System.out.println("Vetor A");
		q.imprimir(va);
		System.out.println("\nVetor B");
		q.imprimir(vb);
		int vc[] = q.intercalarVetores(va, vb, va.length, vb.length);
		System.out.println("\nVetor C");
		q.imprimir(vc);
	}
}
