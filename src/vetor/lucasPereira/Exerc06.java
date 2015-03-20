//6 Implemente na linguagem de programação Java, a questão discursiva 01 da avaliação N1.
//6.1 Instruções para solução:
//6.1.1 Não criar vetor com tamanho inferior a cinco posições;
//6.1.2 Implementar apenas uma classe Java contendo três métodos, descritos a
//seguir:
//6.1.2.1 Método para o preenchimento dos valores de cada um dos vetores que
//serão intercalados;
//6.1.2.2 Método para a intercalação dos vetores.
//6.1.2.2.1 Este método deverá receber somente os vetores (do mesmo tamanho)
//como parâmetro. Para descobrir o tamanho dos vetores, use a função length.
//6.1.2.2.2 Este método deverá retornar o vetor resultante da intercalação dos
//dois vetores recebidos como parâmetro;
//6.1.2.3 Método main para instanciar os vetores e para chamar os outros dois
//métodos;
package vetor.lucasPereira;

import java.util.Scanner;

/**
 *
 * @author lucas.pereira
 */
public class Exerc06 {
    Scanner leia = new Scanner(System.in); //scanner para fazer as entradas
    
    static int vetorA[] = new int[5]; //vetor do tipo statico
    static int vetorB[] = new int[5]; //veotr do tipo statico
  
    public void Preencher(int vetA[], int vetB[]) { //Metodo para preencher o vetor
  
        for (int i = 0; i < 5; i++) { //estrutura para alimentar os 2 vetores que seram intercalados
            System.out.println("Digite o " + (i + 1) + " valor do vetor 1:"); 
            vetA[i] = leia.nextInt(); 
            System.out.println("Digite o " + (i + 1) + " valor do vetor 2:"); 
            vetB[i] = leia.nextInt(); 
        } 
    } 
  
    public int[] Vetores(int vetA[], int vetB[], int a, int b) { //metodo para fazer a intercalação do vertor
        int vetC[] = new int[10]; //vetor que ira armazenar a intercalação com dobro do tamanho
        int j = 0; //variavel de incremento para posicionar a alocação do elemento dentro do vetor C
        for (int i = 0; i < 5; i++) { 
            vetC[j] = vetA[i]; 
            j++; 
            vetC[j] = vetB[i]; 
            j++; 
        } 
        return vetC; 
    } 
  
    public static void main(String args[]) { //metodo principal
  
        Exerc06 v = new Exerc06(); //fazendo a instanciação dos objetos que iram ser utilizados
        
        int a[] = vetorA; //vetor a que ira receber o 
        int b[] = vetorB; 
        
        v.Preencher(vetorA, vetorB); //metodo de preenchimento chamado para alimentar o vetor
        
        int vetorC[] = v.Vetores(vetorA, vetorB, a.length, b.length); //chamada do metodo que ira fazer a intercalação
        
        for (int i = 0; i < vetorC.length; i++) { // para que ira fazer a impressão do vetor já intercalado
            System.out.println(vetorC[i]); 
        } 
    } 
}
