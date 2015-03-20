//Escrever um programa na linguagem de programação Java para instanciar, preencher e 
//imprimir um vetor de 10 posições, cujo conteúdo são números inteiros;
//1.1 instruções para solução:
//1.1.1 Implementar somente uma classe Java contendo três métodos, descritos a
//seguir:
//1.1.1.1 um método para preencher o vetor. Este método não deverá retornar nada
//(void);
//1.1.1.2 um método para imprimir o vetor. Este método não deverá retornar nada
//(void);
//1.1.1.3 um método main para instanciar o vetor e chamar os outros dois métodos.


package vetor.lucasPereira;
//declaraçcao do imports
import javax.swing.JOptionPane;
/**
 *
 * @author lucas.pereira
 */
public class Exerc01 {

    int qtdElementos; //quantidade de elementos para que o usuario informe quantas vezes ele deseja executar
    int vetor[];//declaração do vetor sem quantidade pois o usuario deverá informar e a variavel anterior será usada para definir
    
    public  void preencheVetor(){ //metodo para preencher o vetor
        
       qtdElementos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de elementos: ")); //recebe a quantidade de elementos que o usuario deseja executar
       
       vetor = new int[qtdElementos];//agora passamos para o vetor a quantidade de posições o usuario deseja fazer a inserção
       
       for(int i=0; i < qtdElementos; i++){ //estrutura de repetição para exibir o vetor
           
           vetor[i]= Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do "+ (i+1) +" elemento:"));//exibe os elementos
           
       } //fim do para         
    }//fim do metodo para preencher o vetor
    
    public void imprimeVetor(){//metodo para fazer a impressão do vetor
        
        for(int i=0; i< qtdElementos; i++){//estrutura de repetição para percorrer o vetor
            JOptionPane.showMessageDialog(null, "Elemento "+ (i+1) +" com valor: "+ vetor[i]);//exibe o elemento
        } //fim do para que faz a impressão do vetor
        
     }//fim do metodo
    
    public static void main(String[] args){//metodo principal
       
        //Scanner leia = new Scanner(System.in); // scanner par aler a opção do switch
        
        Exerc01 vet = new Exerc01(); //instaciando os elementos de registro e metodos
        
        int op; //variavel para ler a opção
        
        do{// selecionar a opção que deseja realizar
            op = Integer.parseInt(JOptionPane.showInputDialog("----------Informe o que deseja fazer--------\n"
                                                              + "1 - Preencher o Vetor\n"
                                                              + "2 - Imprimir os elementos do Vetor\n"
                                                              + "99 - Sair\n"));
            
                switch(op){
                    case 1:
                       vet.preencheVetor();
                        break;
                    case 2:
                        vet.imprimeVetor();
                        break;
                    default:
                        break;
                }
        }while(op != 99);         
    }
}
