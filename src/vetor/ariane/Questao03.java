//QUESTAO 3
package vetor.ariane;

import java.util.Scanner;

//classe renomeada de Vetor_decrescente_ordenadp para Questao03
public class Questao03 {

	Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int Vetor[] = new int[10];

		Questao03 x = new Questao03();
		x.preencher(Vetor);
		x.imprimir(Vetor);
		x.ordenar(Vetor);
		x.imprimir(Vetor);
	}

	public void preencher(int vetor[]) {
		System.out.println("Digite Um Valor: ");
		for (int i = 0; i < 10; i++) {
			int number = leia.nextInt();
			vetor[i] = number;
		}
	}

	public void imprimir(int vetor[]) {
		System.out.println("Valores do Vetor");
		for (int i = 0; i < 10; i++) {
			System.out.println(vetor[i]);
		}
	}

	public void ordenar(int vetor[]) {
		int aux;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - 1; j++) {
				if (vetor[j] < vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
	}
}
