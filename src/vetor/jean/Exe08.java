package vetor.jean;

import java.util.Scanner;

/**
 *
 * @author JeanPaulo
 */
public class Exe08 {

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

    public static void main(String[] args) {

        String x;
        System.out.println("Digite a palavra:");
        x = in.next();
        t = x.length();
        char V[] = new char[t];
        preencher(V, x);
        imprimir(V);
    }
}


/*
8 Escrever um programa na linguagem de programação Java para instanciar um vetor,
preenchê-lo e imprimí-lo.
8.1 Instruções para a solução;
8.1.1 O programa deverá conter os seguintes métodos:
8.1.1.1 um método para preencher o vetor. Este método receberá como
parâmetro o vetor e uma String. Cada posição do vetor deverá conter um
caractere da String. Dica use o método charAt( ) da classe String. Usemos como
exemplo a palavra INCONSTITUCIONALIDADE, o vetor depois de preenchido
deverá ter o seguinte conteúdo:
I N C O N S T I T U C I O N A L I D A D E
8.1.1.2 um método para a impressão do vetor
8.1.1.3 um método main para instanciar a String, o vetor e chamar os outros dois
métodos;
 */