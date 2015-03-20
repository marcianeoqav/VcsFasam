/*
 * Voce criou no seu pacote de arquivos uma classe chamada String. Isto nao e necessario. O Java ja tem esta classe no 
 * pacote java.lang
 */
// QUESTAO 9
package vetor.ariane;

import java.util.Scanner;

//classe renomeada de InvertePalavra para Questao09
public class Questao0809 {

	Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		String palavra = "Inconstitucionalidade";
		char vetor[] = new char[21];

		Questao0809 x = new Questao0809();

		x.preencher(vetor, palavra);
		x.imprimir(vetor);
		System.out.println();
		x.inverso(vetor);
		x.imprimir(vetor);
	}

	public void preencher(char vetor[], String a) {
		for (int i = 0; i < 21; i++) {
			vetor[i] = a.charAt(i);
		}
	}

	public void imprimir(char vetor[]) {
		for (int i = 0; i < 21; i++) {
			System.out.print(vetor[i]);
		}
	}

	public void inverso(char vetor[]) {
		char aux;
		for (int i = 0; i < 10; i++) {
			aux = vetor[i];
			vetor[i] = vetor[20 - i];
			vetor[20 - i] = aux;
		}
//		System.out.print("Palavra invertida: ");
//		for (int i = 0; i < 21; i++) {
//			System.out.print(vetor[i]);
//		}
	}
}
