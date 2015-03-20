//QUESTAO 5
package vetor.ariane;

import java.util.Scanner;

//classe renomeada de Vetor para Questao05
public class Questao05 {

	Scanner entrada = new Scanner(System.in);

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		int[] vetor = new int[10];
		int B = 0;

		Questao05 x = new Questao05();
		x.preencher(vetor);

		System.out.println("Digite o valor que deseja pesquisar");
		B = entrada.nextInt();

		int i = x.pesquisa(vetor, B);
		if(i > 0){
			System.out.println("O valor " + B + " encontra-se na posição: " + i);
		}else{
			System.out.println("O valor " + B + " não foi encontrado ");
		}
		entrada.close(); // adicionada esta linha
	}

	public void preencher(int vetor[]) {

		System.out.println("Digite os valores para o vetor");

		for (int i = 0; i < 10; i++) {
			vetor[i] = entrada.nextInt();

		}
	}

	public int pesquisa(int vetor[], int x) {
		int auxiliar = -1;
		for (int i = 0; i < 10; i++) {
			if (x == vetor[i]) {
				auxiliar = i;
				return auxiliar;
			}
		}
		return auxiliar;
	}
}
