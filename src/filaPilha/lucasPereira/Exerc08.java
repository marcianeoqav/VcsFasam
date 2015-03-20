package TAD;

public class Exerc08 {
    
    public static void preenche(Fila a, int x) throws Exception{
        for(int i=0; i < x; i++){
            a.Enfileira(((int) (Math.random() * 20) + 1));
        }
    }
    
    public static void main(String[] args)throws Exception{
        Fila f1 = new Fila(10);
        preenche(f1, f1.Tamanho());
        
        System.out.println("Fila Original:\n");
        f1.ImprimirTodosElementos();
        
        Fila f2 = ordena(f1, f1.Tamanho());
        
        System.out.println("Fila na ordem Crescente:\n");
        f2.ImprimirTodosElementos();
        
    }
    public static Fila ordena(Fila a, int x  ) throws Exception{
        
        int aux;
        int v1[] = new int[x];
        
        for(int i=0; i < x; i++){
            try{
                v1[i]=(int) a.Desenfileira();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        for(int j=0; j < x; j++){
            for(int i = (j+1); i < v1.length; i++){
                if(v1[j]>v1[i]){
                    aux = v1[j];
                    v1[j]=v1[i];
                    v1[i]=aux;
                }
            }
        }
        
        Fila f = new Fila(x);
        
        for(int k=0; k < x; k++){
            f.Enfileira(v1[k]);
        }
        return f;
    }
    
}
