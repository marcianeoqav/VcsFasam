package vetor.danielBatista;

import java.util.Scanner;

public class Exercicio06 {

	static int t;
	static Scanner leia;
    
    public static void main(String args[]) {
    	t = 5;
    	int vetor1[] = new int[t];
        int vetor2[] = new int[t];  
        preencherVetor(vetor1);
        preencherVetor(vetor2);
        int c[] = intercalarVetores(vetor1, vetor2, vetor1.length, vetor2.length);
        System.out.println("Impressão do vetor 1");
        imprimeVetor(vetor1);
        System.out.println("\nImpressão do vetor 2");
        imprimeVetor(vetor2);
        System.out.println("\nImpressão do vetor Intercalado");
        imprimeVetor(c);
    }
    
    public static void preencherVetor(int vetor[]) {
        leia = new Scanner(System.in);
        t = vetor.length;
        for (int i = 0; i < t; i++) {
            System.out.println("Digite o valor para a posição: " + i + " do vetor ");
            vetor[i] = leia.nextInt();
        }
    }
  
    public static int[] intercalarVetores(int va[], int vb[], int a, int b) {
        int c[] = new int[a+b];
        t = va.length;
        int j = 0;
        for (int i = 0; i < t; i++) {
            c[j] = va[i];
            j++;
            c[j] = vb[i];
            j++;
        }
        return c;
    }
    
    public static void imprimeVetor(int vetor[]){
    	t = vetor.length;
    	for (int i = 0; i < t; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
  } 
