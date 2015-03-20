/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor.lucasPereira;

import java.util.Scanner;

/**
 *
 * @author lucas.pereira
 */
public class Exerc08 {
    static Scanner in = new Scanner(System.in);

    //metodo para preencher o vetor
    public static void PreencherVetor(char V[], String x) {

        x = x.toUpperCase();//deixar a entrada toda em maiusculo
        for (int i = 0; i < V.length; i++) {
            V[i] = x.charAt(i);
        }

    }

    public static void ImprimirVetor(char V[]) {
        System.out.println("Elementos do Vetor digitado:");
        for (int i = 0; i < V.length; i++) {
            System.out.print(V[i] + "\t");
        }
        System.out.println("");
    }

    //metodo principal
    public static void main(String[] args) {

        String x; //variavél
        System.out.println("Digite a palavra desejada:");
        x = in.next();//entrada da palavra deseja na variavél
        char V[] = new char[x.length()]; //vetor de caracte do tamanho da palavra digitada
        PreencherVetor(V, x); //chamada do metodo para preencher o vetor
        ImprimirVetor(V);//chamada do metodo para imprimir o vetor

    }
}
