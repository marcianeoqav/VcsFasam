/*
 * 
 * 
 */
package matriz.lucasPereira;

/**
 *
 * @author lucas.pereira
 */
public class Exerc02 {
    int matriz[][];//matriz que será utilizada para passagem de parametros
    
    //metodo para preencher a Matriz
    public static void preencherMatriz(int[][] mat){
        
        for(int i = 0; i < mat.length; i++){ //estrutura para percorrer as linhas do vetor
            for(int j = 0; j < mat[0].length; j++){ //estrutura para precorrer as colunas
                mat[i][j] = (int)(Math.random()*100); //preencher a mtraiz de 0 a 20
            }
        }
    }
    
    //metodo para imprimir a matriz
     
    public static void imprimeMatriz(int[][] m)	// Método de impressão. Recebe a matriz do objeto como parâmetro. 
	{										
		for (int l = 0; l < m.length; l++){//estrutura que percorre a linha		
			for (int c = 0; c < m[0].length; c++){	//estrutura que percorre a coluna
				System.out.print(m[l][c] + "\t");//impressão do metodo
			}
			System.out.print("\n");	// Separador de linhas dentro da matriz.
		}
		System.out.print("\n\n");	// Separador de linhas entre as matrizes. 
	} // Fim do método de impressão. 
    
    //metodo para impressão da diagonal principal da matriz
    public static void imprimeDiagonalPrincipal(int[][] mat){
        
        for (int i = 0; i < mat.length; i++){//estrutura que percorre as linhas
            for (int j = 0; j < mat[0].length; j++){//estrutura que percorre as colunas
		if (i == j){//compra a linha com a coluna para verificar se elas são iguais
                    System.out.print(mat[i][j] + "\t");	// Imprime posição de [i][j] se elas forem iguais assim encontramos a posição
		}
            }
        }
	System.out.print("\n\n");//separa as matrizes
    }
    
    public static void main(String args[]){
               
        Exerc02 Obj = new Exerc02();//instacia os objetos dentro da classe principal
        Obj.matriz = new int[10][10]; //instanciando o tamanho da matriz que será passada como parametros para os metodos
       
        
        preencherMatriz(Obj.matriz);//preecher a matriz
        imprimeMatriz(Obj.matriz);//imprime ela como está
        imprimeDiagonalPrincipal(Obj.matriz);//imprime as principais
       
    }
}
