package Ex4;

import java.util.Scanner;
import PilhaFila.EstruturaFila;

public class Principal {

	static int x;

	public static void main(String[] args) throws Exception {

		Scanner leia = new Scanner(System.in);

		EstruturaFila EF1 = new EstruturaFila(10);
		EstruturaFila EF2 = new EstruturaFila(10);
		EstruturaFila EF3 = new EstruturaFila(20);
		Principal principal = new Principal();

		for (int i = 0; i < EF1.item.length; i++) {
			System.out.println("Digite um valor para o 1° vetor = ");
			x = leia.nextInt();
			EF1.enfileirar(x);
		}
		for (int i = 0; i < EF2.item.length; i++) {
			System.out.println("Digite um valor para o 2° vetor = ");
			x = leia.nextInt();
			EF2.enfileirar(x);
		}
		principal.intercala(EF1.item, EF2.item, EF3.item);
	}

	public void intercala(Object[] A, Object[] B, Object[] C) {

		int auxa = 0;
		int auxb = 1;
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j< A.length; j++){
			C[i+auxa] = A[j];
			auxa = auxa + 1;
			C[i+auxb] = B[j];
			auxb = auxb + 1;
			}
		}
		for (int i = 0; i < C.length; i++) {
			System.out.println("Vetor Intercalado!" + C[i]);
		}
	
		}
}