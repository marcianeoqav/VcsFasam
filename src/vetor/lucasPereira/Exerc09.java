//9 Altere o programa anterior (8) adicionando um método para a inversão do vetor.
//9.1 Instrução para solução:
//9.1.1 Adicionar um método para inversão do vetor. Este método recebe um vetor
//como parâmetro e não precisa retornar nada. Dica, levar em consideração se o
//tamanho do vetor é par ou impar, a implementação é diferente em cada uma das
//situações. No caso do vetor em questão é impar. Mas o programa deve ser capaz de
//trabalhar também com vetores de tamanho par.
//9.1.2 No método main, chamar a impressão do vetor antes e depois da inversão.
package vetor.lucasPereira;

import java.util.Scanner;

/**
 *
 * @author lucas.pereira
 */
public class Exerc09 {
       static Scanner in = new Scanner(System.in);

    //metodo para preencher o vetor
    public static void PreencherVetor(char V[], String x) {

        x = x.toUpperCase();//deixar a entrada toda em maiusculo
        for (int i = 0; i < V.length; i++) {
            V[i] = x.charAt(i);//metodo para pegar a posição da palavra e alocar no vetor
        }

    }
    
    //metodo para inverter o vetor
    public static void InverteVetor(char V[]){
        
        char aux; //variavél auxiliar
        int t = V.length; //tamanho do vetor
        
        if(t % 2 == 0){ //checar se o tamanho do vetor parasso para variavél é par
            for(int i = 0; i < (t/2); i++){//estrutura para inverter as posições
               aux = V[i];//variavél auxiliar 
               V[i] = V[(t-1) - i];
               V[(t-1) - i] = aux;
            }
        } else{//se não for par é impar e deve fazer este calculo abaixo para inverter
            for(int i = 0; i < (t -1) /2; i++){
               aux = V[i];
               V[i] = V[(t-1) - i];
               V[(t - 1) - i] = aux;
            }
            
        }
        
    }

    //metodo para fazer a impressão do vetor de caracteres
    public static void ImprimirVetor(char V[]) {
        System.out.println("Elementos do Vetor digitado:");
        for (int i = 0; i < V.length; i++) {
            System.out.print(V[i] + "\t");
        }
        System.out.println("");
    }

    //metodo principal
    public static void main(String[] args) {

        String x; //variavél
        System.out.println("Digite a palavra desejada:");
        x = in.next();//entrada da palavra deseja na variavél
        char V[] = new char[x.length()]; //vetor de caracte do tamanho da palavra digitada
        PreencherVetor(V, x); //chamada do metodo para preencher o vetor
        ImprimirVetor(V);//chamada do metodo para imprimir o vetor
        InverteVetor(V);//chamada do metodo para inverter o vetor
        ImprimirVetor(V);//chamada do metodo para imprimir o vetor depois de invertido.
    }
    
}



