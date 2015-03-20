package TAD;

public class Exerc06 {
    
    public static void main(String[] args) throws Exception{
        Fila f = new Fila(10);
        
        while(!f.Cheia()){
            f.Enfileira(((int) (Math.random() * 20) + 1));
        }
        
        System.out.println("Fila Inicial: \t");
        f.ImprimirTodosElementos();
        
        Fila f2 = inverte(f);
        
        System.out.println("Fila invertida; \n");
        f2.ImprimirTodosElementos();
    }
    
    
    public static Fila inverte(Fila f){
        Pilha p = new Pilha(10);
        
        while(!f.Vazia()){
            if(!p.Cheia()){
                try{
                    p.Empilha(f.Desenfileira());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        
        Fila faux = new Fila(10);
        
        while(!p.Vazia()){
            if(faux.Cheia()){
                try{
                    faux.Enfileira(p.Desempilha());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        return faux;
    }
}
