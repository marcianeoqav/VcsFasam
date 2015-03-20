/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor.lucasMartinelly;

import java.util.*;

public class Questao08 {

	static Scanner leia = new Scanner(System.in);
	static int t;

	public static void preencher(char v[], String palavra) {
		t = v.length;
		palavra = palavra.toUpperCase();
		for (int i = 0; i < v.length; i++) {
			v[i] = palavra.charAt(i);
		}

	}

	public static void imprimir(char v[]) {
		t = v.length;
		System.out.println("Vetor digitado:");
		for (int i = 0; i < t; i++) {
			System.out.print(v[i] + " ");
		}
	}

	public static void main(String[] args) {
		String palavra;
		System.out.println("Digite a palavra:");
		palavra = leia.next();
		t = palavra.length();
		char v[] = new char[t];
		preencher(v, palavra);
		imprimir(v);
	}
}