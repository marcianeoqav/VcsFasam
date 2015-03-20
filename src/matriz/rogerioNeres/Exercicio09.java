package matriz.rogerioNeres;

import java.util.Scanner;
public class Exercicio09{

	int matriz[][] = new int [10][10];
	String acimaDaDiagonalSecundaria = "";
	
	void preencheLista(){
		for(int linha = 0; linha <= 9; linha++){
			for(int coluna = 0; coluna <= 9; coluna++){
				System.out.print("Insira os valores: ");
				Scanner valor = new Scanner(System.in);
				matriz[linha][coluna] = valor.nextInt();
				
				if(linha+coluna == 10){
					acimaDaDiagonalSecundaria = acimaDaDiagonalSecundaria +"|"+matriz[linha][coluna]+"|";
				}
				if(linha+coluna != 10){
					acimaDaDiagonalSecundaria = acimaDaDiagonalSecundaria +"|-|";
				}
				if(coluna == 9){
					acimaDaDiagonalSecundaria = acimaDaDiagonalSecundaria+"\n";
				}
			}
		}
	}
	void imprime(){		
			System.out.println("Os valores da diagonal principal �: \n"+acimaDaDiagonalSecundaria);		
	}
	public static void main(String[] args){
		Exercicio09 nova = new Exercicio09();
		nova.preencheLista();
		nova.imprime();
	}
}