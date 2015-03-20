package vetor.samuelDavid;

import java.util.Scanner;

//Quet�o 9

public class Questao09 {


	Scanner entrada = new Scanner(System.in);
	static int t;
	
	public static void main(String[] args) {
		String palavra = "Inconstitucionalidade";
		t = palavra.length();
		char vetor[] = new char[t];

		Questao09 x = new Questao09();

		x.preencher(vetor, palavra);
		x.imprimir(vetor);
		System.out.println();
		x.inverter(vetor);
		System.out.println("\nPalavra invertida:");
		x.imprimir(vetor);
	}

	public void preencher(char vetor[], String a) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			vetor[i] = a.charAt(i);
		}
	}

	public void imprimir(char vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	public void inverter(char vetor[]){
		t = vetor.length;
		char aux;
		for(int i = 0; i< (t/2); i++){
			aux = vetor[i];
			vetor[i] = vetor[(t-1)-i];
			vetor[(t-1)-i] = aux;
		}
	}
}
