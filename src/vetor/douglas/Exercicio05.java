package vetor.douglas;

import java.util.*;

public class Exercicio05 {

	static Scanner leia;
	static int t;
	
    public static void preencherVetor(int[] vetorInteiros) {
    	t = vetorInteiros.length;
    	leia = new Scanner(System.in);
        for (int i = 0; i < t; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor.");
            vetorInteiros[i] = leia.nextInt();
        }
    }

    public static int pesquisarVetor(int[] vetorInteiros, int valorX) {
        t = vetorInteiros.length;
        int resultadoPesquisa = -1;

        for (int i = 0; i < t; i++) {
            if (valorX == vetorInteiros[i]) {
                resultadoPesquisa = i;
            }
        }
        return resultadoPesquisa;
    }

    public static void main(String[] args) {
    	t = 10;
        int valorX;
        int[] vetorInteiros = new int[t];
        int resultadoPesquisa;
        
        leia = new Scanner(System.in);
        
        preencherVetor(vetorInteiros);
        
        System.out.println("Digite o valor a ser pesquisado.");
        valorX = leia.nextInt();
        
        resultadoPesquisa = pesquisarVetor(vetorInteiros, valorX);
        
        if(resultadoPesquisa == -1){
            System.out.println("Valor não encontrado.");
        }
        else{
           System.out.println("Valor encontrado na posição. "+resultadoPesquisa ); 
        }
    }
    
}
