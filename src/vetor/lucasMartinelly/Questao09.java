/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor.lucasMartinelly;

import java.util.*;

public class Questao09 {

    static Scanner leia = new Scanner(System.in);
    static int t;

    public static void preencher(char v[], String palavra) {
    	t = v.length;
        palavra = palavra.toUpperCase();
        for (int i = 0; i < t; i++) {
            v[i] = palavra.charAt(i);
        }
    }

    public static void imprimir(char v[]) {
    	t = v.length;
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

    public static void inverter(char v[]) {
        char aux;
        int t = v.length;
        if (t % 2 == 0) {
            for (int i = 0; i < (t / 2); i++) {
                aux = v[i];
                v[i] = v[(t - 1) - i];
                v[(t - 1) - i] = aux;
            }
        } else {
            for (int i = 0; i < (t-1) / 2; i++) {
                aux = v[i];
                v[i] = v[(t-1) - i];
                v[(t-1) - i] = aux;
            }
        }
    }

    public static void main(String[] args) {
        String palavra;
        System.out.println("Digite a palavra:");
        palavra = leia.next();
        t = palavra.length();
        char v[] = new char[t];
        preencher(v, palavra);
        System.out.println("Palavra digitada:");
        imprimir(v);
        inverter(v);
        System.out.println("\nPalavra invertida:");
        imprimir(v);
    }
}