//5 Implemente um programa na linguagem de programação java para ler um vetor de inteiros
//com 10 posições e um dado valor inteiro x (informado pelo usuário). O programa deverá
//pesquisar a existência de x no vetor. Se encontrar devolver a posição em que se encontra,
//caso contrário devolver -1.
//5.1 Implementar apenas uma classe Java contendo os seguintes métodos:
//5.1.1 Um método para preencher os valores do vetor. Este método receberá o vetor
//como parâmetro, mas não precisa retornar nada;
//5.1.2 Um método para a pesquisa da existência ou não de x no vetor. Este método
//recebe como parâmetro o vetor e o valor x. Deve retornar a posição onde x se
//enconta no vetor ou -1, caso o valor não conste do vetor;
//5.1.3 Um método main para instanciar o vetor e o valor de x. Chamar o método de
//pesquisa. E apresentar ao usuário um mensagem informando o valor pesquisado e a
//posição onde se encontra no vetor, em caso de sucesso. E uma mensagem
//informando que o valor não foi encontrado.
package vetor.lucasPereira;

import java.util.Scanner;

public class Exerc05 {
   Scanner leia = new Scanner(System.in);
   //Variavél estatica para determinar a quantidade de elementos do vetor
   static int qtdElementos = 10;
   //Variavel para descoberta do elemento
   static int x;
     
     //Metodo para preencher o vetor
    public void PreencherVetor(int[] v){               
        for(int i=0; i < v.length; i++){
            System.out.println("Informe o valor do "+(i+1)+" Elemento: ");
            v[i]=leia.nextInt();
        }
    }
    
    //metodo para pesquisar dentro do vetor
    public void PesquisarValor(int[] v, int x){
        //Entrada do Elemento que se deseja procurar.
        System.out.println("Informe o valor para pesquisa da posição: ");
        x = leia.nextInt();
               
        for(int i=0; i < qtdElementos; i++){
            if(x == v[i]){
                //pos = i++;
                System.out.println("O elemento procura "+x+" está na posição: " + i);
            }
        }
//        
//        
    }
    //metodo principal
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Exerc05 v = new Exerc05();//Instanciando os objetos da classe dentro do main
        
        // declaração do vetor que será utilizado para preencher o vetor
       int vetor[] = new int[qtdElementos];     
       //declaração da variavél para controle da opção do que deseja fazer.
       int op;
       
               
        //Opção da escolha que desejam fazer dentro do vetor 
        do{
            System.out.println("Informe o que deseja fazer.");
            System.out.println("1 - Preencher o vetor");
            System.out.println("2 - Pesquisar em qual posiçao o Elemento está o vetor.");
            System.out.println("0 - Sair");
            op = leia.nextInt();
            
            switch(op){
                case 1:
                    v.PreencherVetor(vetor);
                    break;
                    
                case 2:
                    v.PesquisarValor(vetor, x);
                    break;
                    
                default:
                    break;
            }
        }while(op != 0);

    }

}
