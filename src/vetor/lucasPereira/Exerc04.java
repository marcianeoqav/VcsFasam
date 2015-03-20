//Implemente um programa na linguagem de programação Java para ler e imprimir o
//conteúdo de três vetores. Da seguinte forma: Todos os vetores deverão ter 10 posições e
//deverão armazenar o nome, a profissão e a idade de 10 pessoas, considerando que todas
//possuem idades distintas.
//4.1 Implementar apenas uma classe java contendo os seguintes métodos:
//4.1.1 Um método para o preenchimento dos valores de cada um dos vetores. Este
//método recebe o vetor como parâmetro, mas não precisa retornar nada;
//4.1.2 Um método para a impressão dos vetores. Este método deverá receber os três
//vetores como parâmetro e imprimir um relatório contendo o seguinte cabeçalho:
//NOME - PROFISSÃO - IDADE
//4.1.3 Um método main para instanciar os vetores e chamar as funcionalidades dos
//demais métodos.
package vetor.lucasPereira;

import java.util.Scanner;

/**
 *
 * @author lucas.pereira
 */
public class Exerc04 {
    Scanner leia = new Scanner(System.in);
    int qtdElementos = 3;
    
    public void PreencherVetor(String[] nome, String[] profissao, int[] idade ){
              
        for(int i=0; i < qtdElementos; i++ ){
            
            System.out.println("Informe o Nome: ");
            nome[i] = leia.next();
            System.out.println("Informe a Profissão: ");
            profissao[i]=leia.next();
            System.out.println("Informe a Idade: ");
            idade[i]=leia.nextInt();
            
        }
    }
    
    public void ImprimirVetor(String nome[], String profissao[], int idade[]){
        System.out.println("NOME\t"+"-\t"+"PROFISSAO\t"+"-\t"+"IDADE\t");
        for(int j=0; j < qtdElementos; j++){
            
            System.out.println(nome[j]+"\t"+"\t"+profissao[j]+"\t"+"\t"+"\t"+idade[j]);
        }
        
    }
    
    public static void main(String[] args){
        Exerc04 v = new Exerc04();
        
        String nome[] = new String[10];
        String profissao[] = new String[10];
        int idade[] = new int[10];        
        
        v.PreencherVetor(nome, profissao, idade);
        v.ImprimirVetor(nome, profissao, idade);
        
    }
}
