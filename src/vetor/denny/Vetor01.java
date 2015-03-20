package vetor.denny;

import java.util.Scanner;

public class Vetor01 {

	static int t;
	
	public static void main(String[] args) {
		t = 10;
		int v[] = new int[t];
		Vetor01 x = new Vetor01();
		x.preencher(v);
		x.imprimir(v);
	}

	public void preencher(int v[]) {
		System.out.println("Preenchendo o vetor");
		t =  v.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("informe o valor para a posição " + i + " do vetor");
			v[i] = leia.nextInt();
		}
		leia.close();
	}

	public void imprimir(int v[]) {
		System.out.println("Imprimindo o vetor");
		t = v.length;
		for (int i = 0; i < t; i++) {
			System.out.print(v[i] + "\t");
		}
	}
}
