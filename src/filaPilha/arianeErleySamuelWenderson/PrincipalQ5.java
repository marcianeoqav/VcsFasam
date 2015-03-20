package Questão5;

import java.util.Scanner;
import PilhaFila.EstruturaFila;
import PilhaFila.EstruturaPilha;

public class Principal {

	static int x = 0;
	
	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		
		
		EstruturaFila EF = new EstruturaFila(10);
		EstruturaPilha EP = new EstruturaPilha(10);
		EstruturaFila EF1 = new EstruturaFila(10);
		
		int p =EF.item.length -1;	
		for (int i = 0; i < EF.item.length; i++) {
			System.out.println("Digite um valor = ");
			x = entrada.nextInt();
			EF.enfileirar(x);
		}

		for (int i = 0; i < EP.item.length; i++) {
			EP.empilhar(EF.item[i]);
		}

		for (int i = 0; i < EP.item.length; i++) {
			EF1.item[i] = EP.item[p];
			p--;
		}
		System.out.println("LISTA INVERTIDA ");
		for (int i = 0; i < EF1.item.length; i++) {
			System.out.println( EF1.item[i]);
		}
	}
}