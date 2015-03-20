package TAD;

public class Exerc04 {
    public static void preencheVetores(Fila a, int x) throws Exception{
        for(int i = 0; i < x; i++){
            a.Enfileira(((int) (Math.random() * 20) + 1));
        }
    }
    
    public static Fila intercala(Fila a, Fila b){
        int t = (a.Tamanho() + b.Tamanho());
        Fila aux = new Fila(t);
        
        for(int j=0; j < (aux.Tamanho() /2); j++){
            try{
                
                aux.Enfileira(a.Desenfileira());
                aux.Enfileira(b.Desenfileira());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return aux;
    }
    
    public static void main(String[] args) throws Exception{
        Fila fila1 = new Fila(5);
        preencheVetores(fila1, fila1.Tamanho());
        
        Fila fila2 = new Fila(5);
        preencheVetores(fila2, fila2.Tamanho());
        
        System.out.println("Fila 1 : \n");
        fila1.ImprimirTodosElementos();
        
        System.out.println("Fila 2: \n");
        fila2.ImprimirTodosElementos();
        
        Fila fila3 = intercala(fila1, fila2);
        
        System.out.println("Fila intercalada : \n");
        fila2.ImprimirTodosElementos();
        
    }
}