//QUESTAO 1

package vetor.ariane;

import java.util.Scanner;

//Classe renomeada de Vetor_preencher_imprimir para Questao01
public class Questao01 {

	Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int Vetor[] = new int[10];
		Questao01 x = new Questao01();

		x.preencher(Vetor);
		x.imprimir_vetor(Vetor);
	}

	public void preencher(int vetor[]) {

		System.out.println("Digite 10 Valores : ");
		for (int i = 0; i < 10; i++) {

			vetor[i] = entrada.nextInt();
		}

	}

	// confira as alteracoes efetuadas neste metodo
	// somente para melhorar a forma de imprimir
	//para seguir a padronização de código java este nome deve ser imprimirVetor
	public void imprimir_vetor(int vetor[]) {
		System.out.print("os Valores do vetor Sao : \n{");
		for (int i = 0; i < 10; i++) {
			if (i == 9) {
				System.out.print(vetor[i]);
			} else {
				System.out.print(vetor[i] + ", ");
			}
		}
		System.out.println("}");
	}
}
