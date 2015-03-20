/*
7 Implementar na linguagem de programação Java, uma classe que leia uma matriz de inteiros
    de dimensões 10 x 10 e imprima os elementos da diagonal principal desta matriz;
    7.1 A implementação deverá conter apenas uma classe java com os seguintes métodos:
    7.2 Um método para o preenchimento dos dados da matriz. Este método recebe a
        matriz como parâmetro, mas não retorna nada;
    7.3 Um método para a impressão de todos elementos, exceto os da diagonal
        secundária. Este método recebe a matriz como parâmetro, mas não retorna nada;
    7.4 Um método main, para coordenar os trabalhos da classe, chamando os serviços
        disponibilizados pelos dois métodos descritos anteriormente;    
 */
package matriz.lucasPereira;

/**
 *
 * @author lucas.pereira
 */
public class Exerc07 {
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
    public static void imprimeMatriz(int[][] m){	// Método de impressão. Recebe a matriz do objeto como parâmetro. 
											
		for (int l = 0; l < m.length; l++){//estrutura que percorre a linha		
			for (int c = 0; c < m[0].length; c++){	//estrutura que percorre a coluna
				System.out.print(m[l][c] + "\t");//impressão do metodo
			}
			System.out.print("\n");	// Separador de linhas dentro da matriz.
		}
		System.out.print("\n\n");	// Separador de linhas entre as matrizes. 
	} 
    
    //metodo para impressão da matriz sem diagonal secundaria
   public static void imprimiMatrizSemDiagonalSecundaria(int[][] mat){
    for (int i = 0; i < mat.length; i++){		// Repete pelo número de linhas da matriz ...
           for (int b = 0; b < mat[0].length; b++){
                    if( b == ((mat.length - i) - 1)){
			}else{
				System.out.print(mat[i][b] + "\t");// Imprime o valor na posição.
                    }
            }
           System.out.print("\n");
    }
    System.out.print("\n\n");
   }
      
       public static void main(String args[]){
               
        Exerc07 Obj = new Exerc07();//instacia os objetos dentro da classe principal
        Obj.matriz = new int[10][10]; //instanciando o tamanho da matriz que será passada como parametros para os metodos
       
        
        preencherMatriz(Obj.matriz);//preecher a matriz
        imprimeMatriz(Obj.matriz);//imprime ela como está
        imprimiMatrizSemDiagonalSecundaria(Obj.matriz);//imprime os elementos da matriz sem diagonal secundaria
        
        
    } 
}
