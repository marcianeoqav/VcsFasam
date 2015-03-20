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
public class Questao05 {

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

    public static void DTI(int[][] matriz) {
        
        System.out.println("Matriz informada");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("|");
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("|" + "\n");
        }
        System.out.println("Impressão dos valores inferior a diagonal principal:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i <= j) {
                    System.out.print("|--\t");
                } else {

                    System.out.print("|");
                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println("|\n");
        }
    }

    public static void main(String args[]) {
        MATRIZler(matriz);
        DTI(matriz);
    }
}