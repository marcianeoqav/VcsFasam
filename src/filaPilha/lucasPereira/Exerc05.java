package TAD;


public class Exerc05 {
  
    public static void main(String[] args) throws Exception{
                
        Fila fila1 = new Fila(10);
        preencheVetores(fila1, fila1.Tamanho());
        
        System.out.println("Fila Inicial: \n");
        fila1.ImprimirTodosElementos();
        
       // Fila fila2 = new inverte(fila1);
                
        System.out.println("Fila invertida");
        //fila2.ImprimirTodosElementos();
        
    }
    
    public static void preencheVetores(Fila a, int x) throws Exception{
        for(int i = 0; i < x; i++){
            a.Enfileira(((int) (Math.random() * 20) + 1));
        }
    }    
    
    public static Fila inverte(Fila f){
        
        Pilha pilha1 = new Pilha(f.Tamanho());
        
        for(int i = 0; i < pilha1.Tamanho(); i++){
            try{
                pilha1.Empilha(f.Desenfileira());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
         Fila aux = new Fila(f.Tamanho());
         
         for(int j = 0; j < pilha1.Tamanho(); j++){
             try{
                 aux.Enfileira(pilha1.Desempilha());
             }catch(Exception e){
                 e.printStackTrace();
             }
         }
        return aux;
    }
}
