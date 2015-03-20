//10 Implementar um programa na linguagem de programação Java, com as seguintes
//funcionalidades: O programa deverá instanciar preencher, imprimir e inverter um vetor de
//inteiros com 10 posições, atendendo às seguintes instruções:
//10.1 Implementar somente um classe Java contendo os seguintes métodos:
//10.1.1 Um método para preencher os dados do vetor. Este método recebe o vetor
//como parâmetro, mas não precisa retornar nada.
//10.1.2 Um método para a inversão do vetor. Sendo que o vetor invertido deverá
//conter não os valores originais do vetor mas sim o seu quadrado, ou seja, o conteúdo
//constante da posição 0 do vetor deverá ser um valor correspondente ao quadrado do
//valor constante da última posição e assim sucessivamente;
//10.1.3 Um método para a impressão do vetor;
//10.1.4 Um método main para instanciar o vetor e chamar as funcionalidades dos
//dois métodos. O método main deverá solicitar a impressão do vetor antes e depois da
//inversão.
package vetor.lucasPereira;

import java.util.Scanner;

/**
 *
 * @author lucas.pereira
 */
public class Exerc10 {
    Scanner leia = new Scanner(System.in);
    
    //Metodo para preencher o vetor de Elementos
    public void PreencherVetor(int v[]){
        for(int i=0; i < v.length; i++){
            System.out.println("Digite o valor do "+(i+1)+" Elemento do vetor: ");
            v[i] = leia.nextInt();
        }
    }
    
    //metodo para1 inverter o vetor 
    
    public static void InverteVetor(int V[]){
        
        int aux; //variavél auxiliar
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
    
    //metodo para imprimir o vetor
    public void Imprimir(int V[]){
        for(int i=0; i < V.length; i++){
            System.out.println("Os elementos do vetor é: "+V[i]);
        } 
    }
        
    //metodo principal
    public static void main(String args[]){
        
        Exerc10 p = new Exerc10();//instanciando os objetos
        
        int vet[] = new int[5];
        
        p.PreencherVetor(vet);
        p.Imprimir(vet);
        p.InverteVetor(vet);
        p.Imprimir(vet);
    }
    
}
