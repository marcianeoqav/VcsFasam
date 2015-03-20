//3 Altere o exercício anterior (2), alterando a forma de ordenação do vetor. Mudando a ordem de crescente para decrescente.
//3.1 Instruções para solução:
//3.1.1 Altere somente o método de ordenação. Mantenha os demais iguais ao exercício anterior;

package vetor.lucasPereira;

import java.util.Scanner;
import javax.swing.JOptionPane; 

public class Exerc03 {
int qtdElementos; //quantidade de elementos para que o usuario informe quantas vezes ele deseja executar
    int vetor[];//declaração do vetor sem quantidade pois o usuario deverá informar e a variavel anterior será usada para definir
    
    public  void PreencheVetor(){ //metodo para preencher o vetor
        
       qtdElementos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de elementos: ")); //recebe a quantidade de elementos que o usuario deseja executar
       
       vetor = new int[qtdElementos];//agora passamos para o vetor a quantidade de posições o usuario deseja fazer a inserção
       
       for(int i=0; i < qtdElementos; i++){ //estrutura de repetição para exibir o vetor
           
           vetor[i]= Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do "+ (i+1) +" elemento:"));//exibe os elementos
           
       } //fim do para         
    }//fim do metodo para preencher o vetor
    
    public void ImprimeVetor(){//metodo para fazer a impressão do vetor
        
        for(int i=0; i< qtdElementos; i++){//estrutura de repetição para percorrer o vetor
            JOptionPane.showMessageDialog(null, "Elemento "+ (i+1) +" com valor: "+ vetor[i]);//exibe o elemento
        } //fim do para que faz a impressão do vetor
        
     }//fim do metodo
    
    public void OrdenarVetor(int vetor[]){ //metodo para ordenadaçao do vetor
        
        int temp; //variavel de controle
        
        for(int i=0; i<qtdElementos; i++){
            for(int j=0; j > qtdElementos; j++){ //alterado de crescente para descrecente conforme solicitado pelo exercicio
                if (vetor[i]<vetor[j]){
                    temp = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){//metodo principal
       
        Scanner leia = new Scanner(System.in); // scanner par aler a opção do switch
        
        Exerc03 vet = new Exerc03(); //instaciando os elementos de registro e metodos
        
        int op; //variavel para ler a opção
        
        do{// selecionar a opção que deseja realizar
            op = Integer.parseInt(JOptionPane.showInputDialog("----------Informe o que deseja fazer--------\n"
                                                              + "1 - Preencher o Vetor\n"
                                                              + "2 - Imprimir os elementos do Vetor na forma Decrecente\n"
                                                              + "3 - Ordenar o Vetor\n"
                                                              + "99 - Sair\n"));
            
                switch(op){
                    case 1:
                       vet.PreencheVetor();
                        break;
                    case 2:
                        vet.ImprimeVetor();
                        break;
                    case 3:
                        vet.ImprimeVetor();
                        vet.OrdenarVetor(vet.vetor);
                        vet.ImprimeVetor();
                    default:
                        break;
                }
          
        }while(op != 99);
                 
    }        
}
