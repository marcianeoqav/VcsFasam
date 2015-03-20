package matriz.rogerioNeres;

import java.util.Scanner;
public class Exercicio04 {
	int matriz[][] = new int [10][10];
	String acimaDaDiagonal = "";
	
	void preencheLista(){
		for(int linha = 0; linha <= 9; linha++){
			for(int coluna = 0; coluna <= 9; coluna++){
				System.out.print("Insira os valores: ");
				Scanner valor = new Scanner(System.in);
				matriz[linha][coluna] = valor.nextInt();
					
				if(linha+1 == coluna){
					acimaDaDiagonal = acimaDaDiagonal +"|"+matriz[linha][coluna]+"|";
				}
				if(linha+1 != coluna){
					acimaDaDiagonal = acimaDaDiagonal +"|-|";
				}
				if(coluna == 9){
					acimaDaDiagonal = acimaDaDiagonal+"\n";
				}
			}
		}
	}
	void imprime(){		
			System.out.println("Os valores da diagonal principal �: \n"+acimaDaDiagonal);		
	}
	public static void main(String[] args){
		Exercicio04 nova = new Exercicio04();
		nova.preencheLista();
		nova.imprime();
	}
}
