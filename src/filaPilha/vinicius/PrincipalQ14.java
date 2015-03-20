package Ex14;

import java.util.Scanner;

import PilhaFila.EstruturaPilha;
import PilhaFila.EstruturaFila;

public class Principal {
	
	public static void main(String [] args){

		Scanner leia = new Scanner(System.in);
		int tamMax = 5;
		EstruturaPilha p = new EstruturaPilha(tamMax);
		EstruturaFila f = new EstruturaFila(tamMax);
		for(int i = 0; i < 5; i++){
			System.out.println("Digite um nome para a fila: ");
			String fila = leia.next();
			try {
				f.enfileirar(fila);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 5; i++){
			System.out.println("Digite um nome para a pilha: ");
			String pilha = leia.next();
			try {
				p.empilhar(pilha);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 5; i++){
			System.out.println("Os nomes da fila são: " + f.item[i]);
		}
		System.out.println();
		for(int i = 0; i < 5; i++){
			System.out.println("Os nomes da pilha são: " + p.item[i]);
		}
		System.out.println();
		for(int i = 0; i < 5; i++){
			System.out.printf("Nome na fila: %s e Nome na pilha: %s\n", f.item[i], p.item[i]);
		}
		
	}

}
