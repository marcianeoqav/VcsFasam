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
public class Questao10 {

	static int t;

	public static void preencher(int v[]) {
		t = v.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor:");
			v[i] = leia.nextInt();
		}
		leia.close();
	}

	public static void inverter(int v[]) {
		t = v.length;
		int aux;
		for (int i = 0; i < t/2; i++) {
			aux = (v[i] * v[i]);
			v[i] = v[(t-1)-i] * v[(t-1)-i];
			v[(t-1)-i] = aux;
		}
	}
	
	public static void imprimir(int v[]){
		t = v.length;
		for (int i = 0; i < t; i++) {
			System.out.print(v[i] + " ");
		}
	}
	
	public static void main(String args[]){
		t = 10;
		int v[] = new int[t];
		preencher(v);
		System.out.println("Vetor original");
		imprimir(v);
		inverter(v);
		System.out.println("\nVetor invertido");
		imprimir(v);
	}
}
