package vetor.lyns;

/*1 Escrever um programa na linguagem de programa��o Java para instanciar, preencher e
 imprimir um vetor de 10 posi��es, cujo conte�do s�o n�meros inteiros;
 1.1 instru��es para solu��o:
 1.1.1 Implementar somente uma classe Java contendo tr�s m�todos, descritos a
 seguir:
 1.1.1.1 um m�todo para preencher o vetor. Este m�todo n�o dever� retornar nada
 (void);
 1.1.1.2 um m�todo para imprimir o vetor. Este m�todo n�o dever� retornar nada
 (void);
 1.1.1.3 um m�todo main para instanciar o vetor e chamar os outros dois m�todos.
 */

import java.util.Scanner;

public class Questao01 {

	Scanner leia = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];
		Questao01 x = new Questao01();

		x.preencherVetor(vetor);
		System.out.println("Impressão do vetor");
		x.imprimirVetor(vetor);
	}

	public void preencherVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Informe o valor para a " + (i + 1)
					+ "ª posição do vetor");
			vetor[i] = leia.nextInt();
		}
	}

	public void imprimirVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");

		}
	}
}
