package vetor.douglas;

import java.util.Scanner;

public class Exercicio07 {
	
	static int t;
	static Scanner leia;
	
    public static void preencherVetor(int[] vetor) {
    	t = vetor.length;
        int impar = t/2;
        int par = impar;
        leia = new Scanner(System.in);
        for (int i = 0; i < t; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor A.("+impar+" impares | "+par+" pares)");
            vetor[i] = leia.nextInt();
            
            if ((vetor[i] % 2) == 0) {
                    par--;
                } else {
                    impar--;
                }
        }
    }

    public static void preencherVetorBeC(int[] vetorA, int[] vetorB, int[] vetorC) {
        int iB = 0;
        int iC = 0;
        int aux;
            for (int i = 0; i < vetorA.length; i++) {
                aux = vetorA[i];
                if ((aux % 2) == 0) {
                    vetorB[iB] = vetorA[i]/2;
                    iB++;
                } else {
                    vetorC[iC] = (vetorA[i]*3);
                    iC++;
                }
            }
    }
    
    public static void imprime(int vetor[]){
    	t = vetor.length;
    	for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
    }

    public static void main(String[] args) {
    	int t = 20;
        int[] vetorA = new int[t];
        int[] vetorB = new int[t/2];
        int[] vetorC = new int[t/2];
        preencherVetor(vetorA);
        preencherVetorBeC(vetorA, vetorB, vetorC);
        System.out.println("Valores Vetor A");
        imprime(vetorA);
        System.out.println("\nValores Vetor B");
        imprime(vetorB);
        System.out.println("Valores Vetor C");
        imprime(vetorC);
    }
}
