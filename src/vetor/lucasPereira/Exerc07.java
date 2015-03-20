//7 Implemente um programa em Java, cuja lógica é inversa à do exercício anterior (6). Este
//programa deverá ler um vetor de 20 posições (preenchido com 10 valores ímpares e 10
//valores pares) e preencher outros dois de 10 posições cada um, conforme especificado a
//seguir: Sejam int A[20], int[10] e int[10] três vetores de inteiros contendo os tamanhos 20,
//10 e 10 respectivamente. O vetor B deverá receber todos os valores pares constantes de A,
//divididos por 2 (verificar divisão por 0). O vetor C deverá conter todos os valores ímpares
//constantes de A, multiplicados por 3.
//7.1 Instruções para solução:
//7.1.1 Implementar somente uma classe Java contendo os métodos descritos a
//seguir:
//7.1.1.1 Um método para preencher o conteúdo do vetor A. Este método deverá
//receber o vetor como parâmetro, mas não precisa retornar nada (void).
//7.1.1.2 Um método para o preenchimento dos vetores B e C. Este método deverá
//receber como parâmetro os vetores A, B e C, mas não precisará retornar nada
//(void);
//7.1.1.3 Um método para a impressão dos vetores. Recebendo como parâmetro
//um vetor. Não precisa retornar nada;
//7.1.1.4 Um método main para instanciar os vetores e chamar as funcionalidades
//dos demais métodos.
package vetor.lucasPereira;

import java.util.Scanner;

/**
 *
 * @author lucas.pereira
 */
public class Exerc07 {

    static Scanner leia = new Scanner(System.in);
    //variaveis para definir o tamanho do vetor
    static int par = 0, impar = 0;

    //metodo para preencher o vetor de 20 posições
    public static void preencherVetor(int A[]) {
       /* for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o valor do " + (i + 1) + " Elemento do vetor: ");
            a[i] = leia.nextInt();
            //conta as quantidades de valores impares e pares
            if (a[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
    }*/  
        int x;
        int p = 0;
        int i = 0;
        int y;
        System.out.println("Digite o vetor A com 10 valores pares e 10 impares:");

        for (int j = 0; j < 20; j++) {
            do {
                y = 0;
                System.out.println("Digite um valor:");
                x = leia.nextInt();
                if (x % 2 == 0) {
                    if (p < 10) {
                        p++;
                        A[j] = x;
                        y = 0;
                    } else {
                        y = 99;
                        System.out.println("O vetor já contem 10 valores pares, digite um impar.");
                    }
                } else {
                    if (i < 10) {
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

    //metodo para alimentar os vetores B e C vindos de A
    public static void separaVetores(int a[], int b[], int c[]) {
        int j = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                j++;
            } else {
                c[k] = a[i] * 3;
                k++;
            }
        }
    }

    //metodo para imprimir o vetor
    public static void imprimeVetores(int[] A, int[] B, int[] C) {

        System.out.println("Vetor Digitado :");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

        System.out.println("Vetor par :");
        for (int j = 0; j < B.length; j++) {
            System.out.println(B[j]);
        }

        System.out.println("Vetor par :");
        for (int x = 0; x < C.length; x++) {
            System.out.println(C[x]);
        }
    }

    //metod principal
    public static void main(String[] args) {

        //declaração de vetores
        int A[] = new int[20];//vetor com todo os elementos
        int B[] = new int[10];//vetor que recebera apenas os elementos pares
        int C[] = new int[10];//vetor que receberá apenas os elemento impares


        preencherVetor(A);
        separaVetores(A, B, C);
        imprimeVetores(A, B, C);
        System.out.println();
        System.out.println();
    }
}
