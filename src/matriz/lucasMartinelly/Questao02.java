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
public class Questao02 {

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
        System.out.println("A matriz informada é:");
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("|");
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("|" + "\n");
        }
        
            System.out.println("A diagonal principal da matriz é:");
            for (int i = 0; i < 10; i++) {
                if (i != 10 - 1) {
                    System.out.print(matriz[i][i] + ", ");
                } else {
                    System.out.print(matriz[i][i]);
                }
            }
        
    }
    
    public static void main (String args []){
        MATRIZler(matriz);
        Diagonal(matriz);
    }
    
}
