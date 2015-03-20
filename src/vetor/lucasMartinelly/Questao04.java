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
public class Questao04 {

	static int t;
	
	public static void preencher(String vnome[], String vprof[], int vidade[]) {
		t = vnome.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite o " + (i + 1) + "° nome");
			vnome[i] = leia.next();
			System.out.println("Digite a profissão do " + (i + 1) + " nome");
			vprof[i] = leia.next();
			System.out.println("Digite a idade do " + (i + 1) + " nome");
			vidade[i] = leia.nextInt();
		}
		leia.close();
	}

	public static void imprimir(String nome[], String prof[], int idade[]) {
		t = nome.length;
		System.out.println("NOME \t\t PROFISSÃO \t\t IDADE");
		for (int i = 0; i < t; i++) {
			System.out.println(nome[i] + "\t\t" + prof[i] + "\t\t\t" + idade[i]);
		}
	}

	public static void main(String args[]) {
		t = 10;
		String vnome[] = new String[t];
		String vprof[] = new String[t];
		int vidade[] = new int[t];
		preencher(vnome, vprof, vidade);
		imprimir(vnome, vprof, vidade);
	}
}
