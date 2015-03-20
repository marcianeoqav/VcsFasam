package vetor.douglas;
import java.util.Scanner;

public class Exercicio08 {

    public static void preencherVetor(String palavra,char[] vetorPalavra){
        for(int i=0;i<palavra.length();i++){
            vetorPalavra[i] = palavra.charAt(i);
        }
    }
    
    public static void imprimirVetor(char[] vetorPalavra){
        
        System.out.print
                ("|");
        for(int i=0;i<vetorPalavra.length;i++){
            System.out.print(vetorPalavra[i]+"|");
       } 
    }
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma palavra.");
        palavra = leia.next();
        
        char[] vetorPalavra = new char[palavra.length()];
        
        preencherVetor(palavra, vetorPalavra);
        imprimirVetor(vetorPalavra);
        leia.close();
    }
}
 