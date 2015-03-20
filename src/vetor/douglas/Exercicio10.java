package vetor.douglas;

import java.util.Scanner;

public class Exercicio10 {

	static int t;
	
    public static void preencherVetor(int vetor[]) {
    	t = vetor.length;
        Scanner leia = new Scanner(System.in);
        for (int i = 0; i < t; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor .");
            vetor[i] = leia.nextInt();
        }
        leia.close();
    }

    public static void inverterVetor(int[] vetor) {
        t = vetor.length; 	
        int aux;
        for (int i = 0; i < t/2; i++) {
        	aux = vetor[i] * vetor[i];
            vetor[i] = vetor[(t-1)-i] * vetor[(t-1)-i]; 
            vetor[(t-1)-i] = aux;
        }
    }

    public static void imprimirVetor(int[] vetor) {
    	t = vetor.length;
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < t; i++) {
            System.out.print(vetor[i] + "|");
        }

    }

    public static void main(String[] args) {
    	t = 10;
        int[] vetor = new int[t];
        preencherVetor(vetor);
        imprimirVetor(vetor);
        inverterVetor(vetor);
        imprimirVetor(vetor);
    }
}
