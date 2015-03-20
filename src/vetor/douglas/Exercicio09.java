package vetor.douglas;

import java.util.Scanner;


public class Exercicio09 {

public static void preencherVetor(String palavra,char[] vetorPalavra){
        for(int i=0;i<palavra.length();i++){
            vetorPalavra[i] = palavra.charAt(i);
        }
    }

    public static char[] inverterVetor(String palavra,char[] vetorPalavra){
        int aux = palavra.length()-1;
        char[] vetorAux = new char[vetorPalavra.length];
        
        for(int i=0;i<palavra.length();i++){
            vetorAux[aux] = vetorPalavra[i];
            aux--;
        }
        
        //vetorPalavra = vetorAux;
        return vetorAux;
    }
    
    public static void imprimirVetor(char[] vetorPalavra){
        
        System.out.print("|");
        for(int i=0;i<vetorPalavra.length;i++){
            System.out.print(vetorPalavra[i]+"|");
       } 
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma palavra.");
        palavra = leia.next();
        
        char[] vetorPalavra = new char[palavra.length()];
        
        preencherVetor(palavra, vetorPalavra);
        imprimirVetor(vetorPalavra);
        vetorPalavra = inverterVetor(palavra, vetorPalavra);
        imprimirVetor(vetorPalavra);
        leia.close();
    }
}
