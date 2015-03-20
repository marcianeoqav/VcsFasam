package Questão17;
 
import PilhaFila.EstruturaPilha;
import PilhaFila.EstruturaFila;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);

		EstruturaPilha EP = new EstruturaPilha(10);
		EstruturaFila EF1 = new EstruturaFila(5);
		EstruturaFila EF2 = new EstruturaFila(5);
		int x = 1;
		for (int i = 0; i < EP.item.length; i++) {
			while (x > 0) {
				System.out.println("Digite valores para ser empilhados");
				x = entrada.nextInt();
				EP.item[i] = x;

				if (x % 2 == 0) {
					EF1.enfileirar(x);
				} else {
					EF2.enfileirar(x);
				}
			}
		}

		System.out.println("FILA- par");
		EF1.imprimir();

		System.out.println("FILA- impar");
		EF2.imprimir();

	}

}
