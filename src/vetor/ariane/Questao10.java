//QUESTAO 10
package vetor.ariane;

import java.util.Scanner;

//nome da classe renomeada de Vetores para Questao10
public class Questao10 {

	public static void main(String[] args) {
		int Vetor[] = new int[10];

		Questao10 p = new Questao10();

		p.preencher(Vetor);
		System.out.println();
		p.inverter(Vetor);

	}

	public void preencher(int vetor[]) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		for (int i = 0; i < 10; i++) {
			int number = leia.nextInt();
			vetor[i] = number;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor[i] + "  ");
		}
		leia.close(); 
	}

	public void inverter(int vetor[]) {
		int aux;
		for (int i = 0; i < 5; i++) {
			aux = vetor[i] * vetor[i];
			vetor[i] = vetor[9 - i] * vetor[9 - i];
			vetor[9 - i] = aux;

		}
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor[i] + "  ");
		}
	}

}
