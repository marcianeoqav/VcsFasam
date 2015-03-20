package vetor.jean;

import java.util.Scanner;

/**
 * 
 * @author JeanPaulo
 */
public class Exe10 {
	static int t;

	public static void preencher(int vet[]) {
		t = vet.length;
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor:");
			vet[i] = in.nextInt();
		}
		in.close();
	}

	public static void inverte(int vet[]) {
		int aux;
		t = vet.length;
		for (int i = 0; i < (t / 2); i++) {
			aux = (int) Math.pow(vet[i], 2);
			vet[i] = (int) Math.pow(vet[(t - 1) - i], 2);
			vet[(t - 1) - i] = aux;
		}
	}

	public static void imprimir(int vet[]) {
		t = vet.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vet[i] + " ");
		}
	}

	public static void main(String[] args) {
		t = 10;
		int vet[] = new int[t];
		preencher(vet);
		System.out.println("vetor original:");
		imprimir(vet);
		System.out.println("vetor invertido ao quadrado:");
		inverte(vet);
		imprimir(vet);
	}
}

/*
 * 10 Implementar um programa na linguagem de programação Java, com as seguintes
 * funcionalidades: O programa deverá instanciar preencher, imprimir e inverter
 * um vetor de inteiros com 10 posições, atendendo às seguintes instruções: 10.1
 * Implementar somente um classe Java contendo os seguintes métodos: 10.1.1 Um
 * método para preencher os dados do vetor. Este método recebe o vetor como
 * parâmetro, mas não precisa retornar nada. 10.1.2 Um método para a inversão do
 * vetor. Sendo que o vetor invertido deverá conter não os valores originais do
 * vetor mas sim o seu quadrado, ou seja, o conteúdo constante da posição 0 do
 * vetor deverá ser um valor correspondente ao quadrado do valor constante da
 * última posição e assim sucessivamente; 10.1.3 Um método para a impressão do
 * vetor; 10.1.4 Um método main para instanciar o vetor e chamar as
 * funcionalidades dos dois métodos. O método main deverá solicitar a impressão
 * do vetor antes e depois da inversão.
 */