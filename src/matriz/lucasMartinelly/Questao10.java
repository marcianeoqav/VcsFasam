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
public class Questao10 {
    
    static Scanner leia = new Scanner (System.in);
    static int vendas[][] = new int [1][1];
    
    public static void Preencher (int [][] vendas){
        
        for (int i=0; i<1; i++){
            for (int j=0; j<1; j++){
                System.out.println("Digite o numero do vendedor:");
                vendas[i][j] = leia.nextInt();
                System.out.println("Digite o numero do produto:");
                vendas[i][j] = leia.nextInt();
                System.out.println("Digite o total vendido do broduto:");
                vendas[i][j] = leia.nextInt();
            }
        }
    }
    
    public static void Imprime (int[][] vendas){
        
        System.out.println("Impressão Matriz");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|");
                System.out.print(vendas[i][j] + "\t");
            }
            System.out.println("|" + "\n");
        }
    }
    
   public static void main (String args[]){
       Preencher(vendas);
       Imprime(vendas);
   }
}
