package matriz.kelly;

import java.util.Scanner;

public class Questao07 {
	/**
	 * Implementar na linguagem de programa��o Java, uma classe que leia uma
	 * matriz de inteiros de dimens�es 10 x 10 e imprima os elementos da
	 * diagonal principal desta matriz; 7.1 A implementa��o dever� conter apenas
	 * uma classe java com os seguintes m�todos: 7.2 Um m�todo para o
	 * preenchimento dos dados da matriz. Este m�todo recebe a matriz como
	 * par�metro, mas n�o retorna nada; 7.3 Um m�todo para a impress�o de todos
	 * elementos, exceto os da diagonal secund�ria. Este m�todo recebe a matriz
	 * como par�metro, mas n�o retorna nada; 7.4 Um m�todo main, para coordenar
	 * os trabalhos da classe, chamando os servi�os disponibilizados pelos dois
	 * m�todos descritos anteriormente;
	 */

	// matAux(Matriz a ser preenchida) maxI(Valor max de coluna) maxJ(Valor max
	// de linha)
	// 7.2

	private static void preencherMatriz(int[][] matAux, int maxI, int maxJ) {
		Scanner ler = new Scanner(System.in);
		int i, j; // Linhas e colunas recebem valores inteiros

		for (i = 0; i < maxI; i++) {
			System.out.printf("Informe os elementos %da. linha:\n", (i + 1));

			for (j = 0; j < maxJ; j++) {
				System.out.printf("m[%d][%d] = ", i, j);
				matAux[i][j] = ler.nextInt();
			}
			System.out.printf("/n");
		}
	}

	// M�todo que vai realizar a impress�o dos elementos da matriz exceto da
	// diagonal secund�ria.
	// 7.3
	private static void exibirExcetoDaDiagonalSecundariaMatriz(int matAux[][],
			int maxI, int maxJ) {
		int i, j;
		System.out.printf("\n");
		System.out
				.printf("Elementos da matriz, exceto os elementos da diagonal secund�ria s�o: \n");
		for (i = 0; i < maxI; i++) {
			for (j = 0; j < maxJ; j++) {
				if ((i + j) != 2) {// soma dos i+j != (diferente ) maxI -1
					System.out.printf("%d ", matAux[i][j]);
				}
			}
		}
	}

	// 7.4 - M�todo main
	public static void main(String args[]) {

		int dI, dJ;// Estabelece o tamanho da matriz a ser preenchida
		dI = 3;// Quantidade de colunas
		dJ = 3;// Quantidade de linhas
		int matriz[][] = new int[dI][dJ];

		Questao07.preencherMatriz(matriz, dI, dJ);

		Questao07.exibirExcetoDaDiagonalSecundariaMatriz(matriz, dI, dJ);
	}
}
