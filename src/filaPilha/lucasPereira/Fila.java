/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TAD;

/**
 *
 * @author Lucas
 */
public class Fila {
    private Object item[];//vetor de elementos
    private int primeiro, ultimo; //variavel para saber o primeiro e ultimo da fila
    private int totalDeObjetos = 0;
    
    public Fila(int maxterm){//metodo construtor
        
        this.item = new Object[maxterm]; //vetor descobre seu tamanho agora
        this.primeiro = 0; //posiçção inicial da fila
        this.ultimo = this.primeiro; //posição inicial do ultimo da fila é mesmo que do primeiro já que ainda não executou
    }
//************************************metodo de enfileirar e desemfileirar******************************************************/    
    public void Enfileira(Object x) throws Exception {
        
        if(Cheia()){//testa para ver se está cheio
            throw new Exception("Erro: A Fila está cheia!");
        }else{
            this.item[this.ultimo] = x; //enfileira o elemento na ultima posição

            this.ultimo = (this.ultimo + 1);// % this.item.length; //incrementa a posição do ultimo
            this.totalDeObjetos++;
        }
    }
    
    public Object Desenfileira() throws Exception{
        
        if(this.Vazia()){//testa para saber se está vazio
            throw new Exception("Erro:A Fila está vazia!");
        }else{
        
            Object item = this.item[this.primeiro];

            this.primeiro =(this.primeiro+1)%this.item.length;//incrementa a prosição do primeiro
            this.totalDeObjetos--;
        }
        return item;        
    }
    
/***********************************metodos de teste para a funções principais enfileirar e desemfileirar************************/
public boolean Vazia(){
    return(this.primeiro == this.ultimo);
}

public boolean Cheia(){
    return (this.ultimo == this.item.length);
}

/***********************************metodos de impressão da fila****************************************************************/
public void ImprimirTodosElementos(){
    if(this.Vazia()){//testa para saber se não está vazio novamente
        System.out.print("ERRO: Não há objetos a exibir. A fila está vazia.\n");
    }else{
        for(int i=0; i < ultimo; i++){ //estrutura que percorre a fila(vetor) e imprime seus elementos
            System.out.println(this.item[i] + "\t");
        }
        System.out.println("\n\n");
    }
}

public void ImprimePrimeiro(){
    if(this.Vazia()){
        System.out.print("ERRO: Não há objetos a exibir. A fila está vazia.\n");
    }else{
        System.out.println("O primeiro da fila é: " + this.item[primeiro]+ "\n");
    }
}

public void ImprimeUltimo(){
    if(this.Vazia()){
        System.out.print("ERRO: Não há objetos a exibir. A fila está vazia.\n");
    }else{
        System.out.println("O ultimo da fila é: " + this.item[ultimo]+ "\n");
    }
}

public int Tamanho(){
    return this.item.length;
}

//pesquisa se exite o valor pesquisado e retorna um valor verdadeiro ou falso
public boolean contem(Object x){
        //implementacao
        for(int i = 0; i < this.item.length; i++){
            if(item.equals(this.item[i])){
                return true;
            }
        }
        return false;
    }

//metodo para saber se a posição está ocupada
private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalDeObjetos;
    }
}
