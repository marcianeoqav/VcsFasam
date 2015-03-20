// QUESTAO 2
package vetor.ariane;

import java.util.Scanner;

//classe renomeada de Vetor_crescente_ordenado para Questao02
public class Questao02 {

	Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int Vetor[] = new int[10];

		Questao02 x = new Questao02();
		x.preencher(Vetor);
		System.out.println("Valores do vetor antes da ordenacao:");
		x.imprimir(Vetor);
		x.ordenar(Vetor);
		System.out.println("Valores do vetor depois da ordenacao:");
		x.imprimir(Vetor);
	}

	public void preencher(int vetor[]) {
		for (int i = 0; i < 10; i++) {
			int number = leia.nextInt();
			vetor[i] = number;
		}
	}

	public void imprimir(int vetor[]) {
		System.out.print("{");
		for (int i = 0; i < 10; i++) {
			if (i == 9) {
				System.out.print(vetor[i]);
			} else {
				System.out.print(vetor[i] + ", ");
			}
		}
		System.out.println("}");
	}

	public void ordenar(int vetor[]) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (vetor[i] < vetor[j]) {
					int aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	}

}
