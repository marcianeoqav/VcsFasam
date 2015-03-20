package vetor.lucasMartinelly;

import java.util.Scanner;

/**
 * 
 * @author Lucas Martinelly
 */
public class Questao01 {

	static int t;

	public void preencher(int vetor[]) {
		t = vetor.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor:");
			vetor[i] = leia.nextInt();
		}
		leia.close();
	}

	public void imprimir(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	public static void main(String[] args) {
		t = 10;
		int v[] = new int[10];
		Questao01 q = new Questao01();
		q.preencher(v);
		q.imprimir(v);
	}
}
