package vetor.jean;

import java.util.Scanner;

/**
 *
 * @author JeanPaulo
 */
public class Exe06 {

    static Scanner in = new Scanner(System.in);
    private static int t;

    public static int[] intercalarVetores(int A[], int B[]) {
    	t = A.length;
        int C[] = new int[t * 2];
        int j = 0;
        for (int i = 0; i < t; i++) {
            C[j] = A[i];
            j++;
            C[j] = B[i];
            j++;
        }
        return C;
    }

    public static void preencher(int vetor[]) {
    	t = vetor.length;
        for (int i = 0; i < t; i++) {
            System.out.println("Informe o valor para a posição " + i + " do vetor");
            vetor[i] = in.nextInt();
        }
    }

    public static void imprime(int vetor[]){
    	t = vetor.length;
    	for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
    }
    
    public static void main(String[] args) {
        
        System.out.println("Digite tamanho dos vetores:");
        do {
            t = in.nextInt();
            if (t < 5) {
                System.out.println("Tamanho não deve ser menor que 5.\nDigite novamente:");
            }
        } while (t < 5);

        int A[] = new int[t];
        int B[] = new int[t];
        int C[] = new int[t + t];
        
        preencher(A);
        preencher(B);
        System.out.println("Vetor A");
        imprime(A);
        System.out.println("\nVetor B");
        imprime(B);
        C = intercalarVetores(A, B);
        System.out.println("\nVetor C");
        imprime(C);
    }
}
