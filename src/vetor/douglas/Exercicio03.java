package vetor.douglas;

import java.util.Scanner;

public class Exercicio03 {

    static int t;

    public static void preencherVetor(int vetor[]) {
    	t = vetor.length;
        Scanner leia = new Scanner(System.in);
        for (int i = 0; i < t; i++) {
            System.out.println("Digite o valor da posição " + (i + 1));
            vetor[i] = leia.nextInt();
        }
        leia.close();
    }

    public static void imprimirVetor(int vetor[]) {
    	t = vetor.length;
        System.out.print("|");
        for (int i = 0; i < t; i++) {
            System.out.print(vetor[i] + "|");
        }
        System.out.println();
    }

    public static void ordenarVetor(int vetor[]) {
    	t = vetor.length;
        int aux;
        for (int i = 0; i < t-1; i++) {
            for (int j = i+1; j < t; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
    	t = 10;
    	int[] vetor = new int[t];
        preencherVetor(vetor);
        imprimirVetor(vetor);
        ordenarVetor(vetor);
        imprimirVetor(vetor);
    }
}
