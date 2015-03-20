package Ex3;

import PilhaFila.EstruturaFila;

import java.util.Scanner;

public class Principal {

	Scanner leia = new Scanner(System.in);
	int pesquisa = 0;
	int[] aux = new int[10];
	boolean estado = false;

	public static void main(String[] args) throws Exception {

		Scanner leia = new Scanner(System.in);
		int x = 0;

		EstruturaFila EF = new EstruturaFila(10);
		for (int i = 0; i < EF.item.length; i++) {
			System.out.println("Digite um número = ");
			x = leia.nextInt();
			EF.enfileirar(x);
		}

		Principal p = new Principal();
		p.pesquisa(EF.item);

	}

	public void pesquisa(Object[] item) {

		System.out.println("Informe o número desejado para pesquisa :");
		pesquisa = leia.nextInt();

		for (int i = 0; i < item.length; i++) {
			aux[i] = (Integer) item[i];
		}
		for (int i = 0; i < item.length; i++) {
			if (aux[i] == pesquisa) {

				System.out.println("O numero " + pesquisa
						+ " está alocado na posição = " + i);
				estado = true;
			}
		}

		if (estado == false) {
			System.out.println(" -1 ERRO-Número não encontrado ");

		}
	}
}
