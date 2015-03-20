/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz.lucasPereira;
import javax.swing.*; 
/**
 *
 * @author lucas.pereira
 */
public class Exerc01 {
  
    //metodo para fazer a entrada de alimentação da matriz.
    public static void preencheMatriz(int mat[][]){
        
        for(int l = 0; l < mat.length; l++){
            for(int c = 0; c < mat[0].length; c++){
                mat[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o elemento da Linha " + (l+1) + " e coluna " + (c+1), "Matriz", JOptionPane.QUESTION_MESSAGE));
            }
        }
    }
    
    //metodo que ira retornar a matriz transposta
    public static int[][] retornaMatrizTransposta(int mat[][]){
        
        int trans[][] = new int [mat[0].length][mat.length];
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++ ){
                trans[j][i]= mat[i][j];
            }
        }
        
        return trans;
    }
    
    //metodo para fazer a impressão da matriz transposta
    public static void imprimeMatrizTransposta(int mat[][]){
        
        for(int l = 0; l < mat.length; l++){
               System.out.println("");
            for(int c = 0; c < mat[0].length; c++){
                System.out.print(mat[l][c] + "\t");;
            }
        }
        
    }
    
    public static void main (String args[]){
        //declaração de variaveis
        int nLinhas, nColunas;
        int op;
        //declaração de matriz
        int matriz[][];
        int transposta[][] = null;
        
        //fazendo a entrada do tamanho da matriz de linhas e colunas
        nLinhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidades de Linhas", "Matriz", JOptionPane.QUESTION_MESSAGE));
        nColunas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas colunas?", "Matriz", JOptionPane.QUESTION_MESSAGE));
        
        //instanciando o tamanho da matriz
        matriz = new int[nLinhas][nColunas];
        
        do{
          op = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha o que deseja fazer:\n" 
                                                            + "1 - Preencher o Matriz\n"
                                                            + "2 - Imprimir Matriz\n"
                                                            + "3 - Realizar a Transposta da Matriz\n" 
                                                            + "4 - Imprimir Matriz Transposa\n" 
                                                            + "0 - Encerrar"));
          switch(op){
              case 1:
                    //metodo de preenchimento da matriz
                    preencheMatriz(matriz);
                    break;
              case 2:
                    //imprime a matriz antes de fazer transposta.
                    imprimeMatrizTransposta(matriz);
                    break;
              case 3:
                    //metodo de retorno da matriz transposta
                    transposta = retornaMatrizTransposta(matriz);
                    break;
              case 4:
                    //metodo para imprimir a matriz transposta
                    imprimeMatrizTransposta(transposta);
                    break;
             default:
                    //System.out.println("***Opção inválida.***");
                    JOptionPane.showMessageDialog(null, "***Opção inválida.***");
                    break;
          }
        }while(op != 0);

    }
    
    
}

