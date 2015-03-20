package vetor.jean;

import java.util.Scanner;

/**
 *
 * @author JeanPaulo
 */
public class Exe07 {

    static Scanner in = new Scanner(System.in);
    static int t;
    public static void preencher(int A[]) {
    	t = A.length;
        int x;
        int p = 0;
        int i = 0;
        int y;
        System.out.println("Digite o vetor A com 10 valores pares e 10 impares:");

        for (int j = 0; j < t; j++) {
            do {
                System.out.println("Digite um valor:");
                x = in.nextInt();
                if (x % 2 == 0) {
                    if (p < t/2) {
                        p++;
                        A[j] = x;
                        y = 0;
                    } else {
                        y = 99;
                        System.out.println("O vetor já contem 10 valores pares, digite um impar.");
                    }
                } else {
                    if (i < t/2) {
                        i++;
                        A[j] = x;
                        y = 0;
                    } else {
                        y = 99;
                        System.out.println("O vetor já contem 10 valores impares, digite um par.");
                    }

                }
            } while (y == 99);
        }
    }

    public static void separa(int A[], int B[], int C[]) {
    	t = A.length;
        int j = 0;
        int k = 0;
        for (int i = 0; i < t; i++) {
            if ((A[i] % 2 )== 0) {
                B[j] = (A[i]/2);
                j++;
            } else {
                C[k] = A[i] * 3;
                k++;
            }
        }
    }

    public static void imprimir(int V[]) {
    	t = V.length;
        for (int i = 0; i < V.length; i++) {
            System.out.print(V[i] + " ");
        }
    }

    public static void main(String[] args) {
    	t = 20;
        int A[] = new int[t];
        int B[] = new int[t/2];
        int C[] = new int[t/2];

        preencher(A);
        separa(A, B, C);
        System.out.println("\nVetor A");
        imprimir(A);
        System.out.println("\nVetor B");
        imprimir(B);
        System.out.println("\nVetor C");
        imprimir(C);
    }
}
