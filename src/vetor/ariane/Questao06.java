/*Primeira observacao: vou redigir tudo sem acentuacao e sem caracteres especiais para nao ter problema entre windows e linux
 * 1 - não se usa qualquer tipo de acentuação ou caractere especial na nomeação de classes Java
 */

// QUESTAO 6
package vetor.ariane;

import java.util.Scanner;

//classe renomeada de Intercalacao para Questao06
public class Questao06 {

	Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int Vetor1[] = new int[10];
		int Vetor2[] = new int[10];
		
		Questao06 x = new Questao06();

		x.preencher_vetor(Vetor1, Vetor2);

		int[] id = x.intercalacao(Vetor1, Vetor2);
		for (int i = 0; i < 20; i++) {
			System.out.println(id[i]);
		}
	}

	public void preencher_vetor(int ve1[], int ve2[]) {
		System.out.println("Informe 10 Valores Para o Vetor 1");
		for (int i = 0; i < 10; i++) {
			ve1[i] = entrada.nextInt();
		}
		System.out.println("Informe 10 Valores Para o Vetor 2");
		for (int i = 0; i < 10; i++) {
			ve2[i] = entrada.nextInt();
		}
	}

	public int[] intercalacao(int ve1[], int ve2[]) {

		int intercalado[] = new int[(ve1.length) * 2];

		int aux = 0;
		if (ve1.length == ve2.length) {
			for (int i = 0; i < 10; i++) {
				intercalado[aux] = ve1[i];
				aux = aux + 1;
				intercalado[aux] = ve2[i];
				aux = aux + 1;

			}
			return intercalado;
		}
		return intercalado;
	}
}
