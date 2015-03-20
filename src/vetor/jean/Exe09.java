package vetor.jean;

import java.util.Scanner;

/**
 *
 * @author JeanPaulo
 */
public class Exe09 {

    static Scanner in = new Scanner(System.in);
    static int t;
    
    public static void preencher(char V[], String x) {
    	t = V.length;
        x = x.toUpperCase();
        for (int i = 0; i < t; i++) {
            V[i] = x.charAt(i);
        }
    }

    public static void imprimir(char V[]) {
    	t = V.length;
        System.out.println("Vetor digitado:");
        for (int i = 0; i < t; i++) {
            System.out.print(V[i] + " ");
        }
        System.out.println("");
    }

    public static void inverte(char V[]) {
        char aux;
        t = V.length;
        if (t % 2 == 0) {
            for (int i = 0; i < (t / 2); i++) {
                aux = V[i];
                V[i] = V[(t - 1) - i];
                V[(t - 1) - i] = aux;
            }
        } else {
            for (int i = 0; i < t - 1 / 2; i++) {
                aux = V[i];
                V[i] = V[(t - 1) - i];
                V[(t - 1) - i] = aux;
            }
        }
    }

    public static void main(String[] args) {

        String x;
        System.out.println("Digite a palavra:");
        x = in.next();
        t = x.length();
        char V[] = new char[t];
        preencher(V, x);
        imprimir(V);
        System.out.println("Palavra invertida:");
        inverte(V);
        imprimir(V);

    }
}


/*9 Altere o programa anterior (8) adicionando um método para a inversão do vetor.
9.1 Instrução para solução:
9.1.1 Adicionar um método para inversão do vetor. Este método recebe um vetor
como parâmetro e não precisa retornar nada. Dica, levar em consideração se o
tamanho do vetor é par ou impar, a implementação é diferente em cada uma das
situações. No caso do vetor em questão é impar. Mas o programa deve ser capaz de
trabalhar também com vetores de tamanho par.
9.1.2 No método main, chamar a impressão do vetor antes e depois da inversão.
*/