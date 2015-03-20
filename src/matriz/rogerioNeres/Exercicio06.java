package matriz.rogerioNeres;

import java.util.Scanner;
public class Exercicio06 {

	int matriz[][] = new int [10][10];
	String diagonalSecundaria = "";
	
	void preencheLista(){
		for(int linha = 0; linha <= 9; linha++){
			for(int coluna = 0; coluna <= 9; coluna++){
				System.out.print("Insira os valores: ");
				Scanner valor = new Scanner(System.in);
				matriz[linha][coluna] = valor.nextInt();
				
				if(linha+coluna == 9){
					diagonalSecundaria = diagonalSecundaria +"|"+matriz[linha][coluna]+"|";
				}
				if(linha+coluna != 9){
					diagonalSecundaria = diagonalSecundaria +"|-|";
				}
				if(coluna == 9){
					diagonalSecundaria = diagonalSecundaria+"\n";
				}
			}
		}
	}
	void imprime(){		
			System.out.println("Os valores da diagonal principal �: \n"+diagonalSecundaria);		
	}
	public static void main(String[] args){
		Exercicio06 nova = new Exercicio06();
		nova.preencheLista();
		nova.imprime();
	}
}
