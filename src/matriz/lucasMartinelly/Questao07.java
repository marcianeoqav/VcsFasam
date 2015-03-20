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
public class Questao07 {
    static Scanner leia = new Scanner(System.in);
    static int matriz[][] = new int[10][10];

    public static void MATRIZler(int mztriz[][]) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Digite o valor da linha:" + (i + 1) + "  coluna " + (j + 1));
                matriz[i][j] = leia.nextInt();
            }
        }
    }

    public static void Diagonal(int matriz[][]) {

        System.out.println("Impressão Matriz");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("|");
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("|" + "\n");
        }

        System.out.println("Matriz sem a diagonal secundaria é");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j == 10 - 1) {
                    System.out.print("|--\t");
                } else {
                    System.out.print("|");
                    System.out.print(matriz[i][j] + "\t");

                }
                
            }
            System.out.println("|" + "\n");
        }
    }

    public static void main(String args[]) {
        MATRIZler(matriz);
        Diagonal(matriz);
    }
}
