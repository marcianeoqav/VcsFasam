package vetor.douglas;

import java.util.Scanner;

public class Exercicio01 {

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
        System.out.print("Imprimindo vetor: |");
        for (int i = 0; i < t; i++) {
            System.out.print(vetor[i] + "|");
        }
    }

    public static void main(String[] args) {
    	t = 10;
    	int[] vetor = new int[t];
        preencherVetor(vetor);
        imprimirVetor(vetor);          
    }
}
        
