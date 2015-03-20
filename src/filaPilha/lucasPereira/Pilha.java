/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TAD;

/**
 *
 * @author Lucas
 */
public class Pilha {
    private Object item[];//vetor que ira receber os elementos
    private int topo;//variavel de controle do indicce do topo
    
public Pilha(int maxterm){//metodo construturo da pilha

    this.item = new Object[maxterm]; //para para vetoro o tamanho da pilha
    this.topo = 0;//variavel para saber qual a psoição atual do topo
}
/**************************metodos principais de empilhar e desempilhar***************************************************/    

public void Empilha(Object x)throws Exception{//metodo empilhar 

    if(Cheia()){ //testa para saber se a pilha está cheia
        throw new Exception("Erro; Está Pilha está Cheia!");
    }else{
        this.item[this.topo++] = x;//impilha elemento e incrimenta a posição do indice para o proximo
    }
}


public Object Desempilha() throws Exception{//metodo desempilhar

    if(this.Vazia()){//testa para saber se está vazia
        throw new Exception("Erro: A Pilha está vazia!");
    }else{
        return  this.item[--this.topo]; //desempilha o elemento na ultima posição da pilha
    }
}

/************************metodos para realização de testes dentro das funçoes principais empilha e desempilha*************/

public boolean Vazia(){//metodo para verificar se a pilha está vazia
    return this.topo == 0;
}

public boolean Cheia(){//metodo que verifica se a pilha está cheia
    return this.topo == this.item.length -1;
    
}

public int Tamanho(){ //metodo para saber o tamanho da pilha
    return this.topo;
}

/***************************metodos de impressçao do elementos*************************************************************/

public void ImprimirTodosElementos(){//metodo que imprime todos os elemento da pilha do topo para o ultimo da pilha
    if(Vazia()){
       System.out.print("ERRO: Não é possível imprimir pilha vazia!");
    }else{
        for(int e = this.topo; e>=0; e--){ //estrutura que vai decrementando iniciando ela pelo tamanho total da pilha
            System.out.println(this.item[e].toString()+ "\t");
        }
        System.out.println("\n\n");
    }
}

public void ImprimePosAtual(int p){
    if(Vazia()){ //verifica se não está vazia a pilha
         System.out.print("ERRO: Não é possível imprimir pilha vazia!");
    }else{
        System.out.println(this.item[p].toString()+ "\n");//imprime na posição atual da pilha
    }
}

}