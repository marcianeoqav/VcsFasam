/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TAD;

/**
 *
 * @author Lucas.Alyne
 */
public class Exerc09 {

    public static void main(String[] args) throws Exception{
        
        Pilha p1 = new Pilha(10);
        preenche(p1, p1.Tamanho());
        
        System.out.println("Pilha original:");
        p1.ImprimirTodosElementos();
    }
    
    public static void preenche(Pilha a, int x) throws Exception{
        for(int i=0; i < x; i++){
            a.Empilha(((int) (Math.random() * 20) + 1));
        }
    }
}
