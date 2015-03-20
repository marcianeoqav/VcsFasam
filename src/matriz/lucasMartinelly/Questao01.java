/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz.lucasMartinelly;

import java.util.Scanner;

/**
 *
 * @author Lucas Martinelly
 */
public class Questao01 {

    static Scanner leia = new Scanner(System.in);
    static int mat[][] = new int[10][10];
    static int matrizt[][] = new int[10][10];
    static int l;
    static int c;

    public static void Preencher(int[][] mat, int l, int c) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Digite o valor da linha:" + (i + 1) + "  coluna " + (j + 1));
                mat[i][j] = leia.nextInt();
            }
        }
    }

    public static int[][] gTranposta(int[][] mat) {
        int[][] matrizt = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizt[i][j] = mat[j][i];
            }
        }
        return matrizt;
    }

    public static void Imprime(int[][] mat) {

        Questao01 ta = new Questao01();
        int trans[][] = gTranposta(mat);
        
        System.out.println("Impressão Matriz");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("|");
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("|" + "\n");
        }
        System.out.println("Matriz Transposta");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("|");
                System.out.print(trans[i][j] + "\t");
            }
             System.out.println("|" + "\n");
        }
       
    }

    public static void main(String args[]) {
        Preencher(mat, l, c);
        gTranposta(mat);
        Imprime(mat);
    }
}
