package Ex6;

import java.util.Scanner;
import PilhaFila.EstruturaFila;
import PilhaFila.EstruturaPilha;

public class Principal {

	static int x = 0;

	public static void main(String[] args) throws Exception {
		Scanner leia = new Scanner(System.in);

		EstruturaFila EF = new EstruturaFila(10);
		EstruturaPilha EP = new EstruturaPilha(10);

		int aux = EF.item.length - 1;

		for (int i = 0; i < EF.item.length; i++) {
			System.out.println("Digite um valor = ");
			x = leia.nextInt();
			EF.enfileirar(x);
		}

		for (int i = 0; i < EF.item.length; i++) {
			EP.item[i] = EF.item[(Integer) aux];
			aux -= 1;
		}

		for (int i = 0; i < EF.item.length; i++) {
			EF.item[i] = EP.item[i];
		}
		for (int i = 0; i < EF.item.length; i++) {
			System.out.println("Fila invertida é " +  EF.item[i] );

		}
	}
}
