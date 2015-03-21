package filaPilha.jean;

import java.util.Scanner;

public class Exe14 {

	static Scanner in = new Scanner(System.in);

	static int t;
	
	public static void main(String[] args) {
		t = 5;
		Fila filaN = new Fila(t);
		Pilha pilhaN = new Pilha(t);
		preencherFila(filaN);
		preencherPilha(pilhaN);
		imprimirIntercessaoFilaPilha(filaN, pilhaN);
		imprimirElementosSomenteNaFila(filaN, pilhaN);
		imprimirElementosSomenteNaPilha(filaN, pilhaN);
	}

	public static void preencherFila(Fila f){
		t = f.getItem().length;
		System.out.println("Digite os nomes da Fila:");
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + " : ");
			f.enfileira(in.next());
		}
	}
	
	public static void preencherPilha(Pilha p){
		t = p.getItem().length;
		System.out.println("Digite os nomes da Pilha:");
		for (int i = 0; i < t; i++) {
			System.out.print((i + 1) + " : ");
			p.empilha(in.next());
		}
	}
	
	public static void imprimirIntercessaoFilaPilha(Fila f, Pilha p){
		t = f.getItem().length; //tanto faz pegar o tamanho de f ou de p, são do mesmo tamanho.
		System.out.println("\nNomes presentes na fila e na pilha:");	
		for(int i = 0; i < t; i++){
			for(int j = 0; j < t; j++){
				if(f.getItem()[i].equals(p.getItem()[j])){//esta comparação é para objetos do tipo String
					System.out.print(f.getItem()[i].toString() + " ");
				}
			}
		}
	}
	
	public static void imprimirElementosSomenteNaFila(Fila f, Pilha p) {
		t = f.getItem().length;
		t = f.getItem().length;
		System.out.println("\nNomes presentes somente na fila:");
		for(int i = 0; i < t; i++){
			boolean existeNaPilha = false;
			for(int j = 0; j < t; j++){
				if(f.getItem()[i].equals(p.getItem()[j])){
					existeNaPilha = true;
				}
			}
			if(!existeNaPilha){
				System.out.print(f.getItem()[i].toString() + " ");
			}
		}
	}

	public static void imprimirElementosSomenteNaPilha(Fila f, Pilha p) {
		t = f.getItem().length;
		System.out.println("\nNomes presentes somente na pilha:");
		for(int i = 0; i < t; i++){
			boolean existeNaLista = false;
			for(int j = 0; j < t; j++){
				if(p.getItem()[i].equals(f.getItem()[j])){
					existeNaLista = true;
				}
			}
			if(!existeNaLista){
				System.out.print(p.getItem()[i].toString() + " ");
			}
		}
	}
}
