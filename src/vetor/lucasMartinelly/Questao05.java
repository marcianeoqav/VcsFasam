/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor.lucasMartinelly;

import java.util.Scanner;

/**
 *
 * @author Lucas Martinelly
 */
public class Questao05 {

    static int t;
    static Scanner leia = new Scanner(System.in);
    
    public static void preencher(int v[]) {
    	t = v.length; 
        for (int i = 0; i < t; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor:");
            v[i] = leia.nextInt();
        }
    }

    public static int pesquisar(int v[], int x) {
        t = v.length;
        int pos = -1;
        for (int i = 0; i < t; i++) {
            if (v[i] == x) {
                pos = i;
                return pos;
            } 
        }
        return pos;
    }

    public static void main(String args[]) {
    	t = 10;
    	int v[] = new int[t];
        int x;
        preencher(v);
        System.out.println("Digite um valor a ser pesquisado no vetor informado anteriormente");
        x = leia.nextInt();
        int posicao = pesquisar(v, x);
        if(posicao != -1){
        	System.out.println("O valor " + x + " está na posição " + posicao);
        }else{
        	System.out.println("Valor não encontrado");
        }
    }
}
