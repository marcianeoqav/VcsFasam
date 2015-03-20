package matriz.rogerioNeres;

import java.util.Scanner;
public class Exercicio02{
	
	int matriz[][] = new int [10][10];
	String diagonal = "";
	
	void preencheLista(){
		for(int linha = 0; linha <= 9; linha++){
			for(int coluna = 0; coluna <= 9; coluna++){
				System.out.print("Insira os valores: ");
				Scanner valor = new Scanner(System.in);
				matriz[linha][coluna] = valor.nextInt();
					
				if(linha == coluna){
					diagonal = diagonal +"|"+matriz[linha][coluna]+"|";
				}
				if(linha != coluna){
					diagonal = diagonal +"|-|";
				}
				if(coluna == 9){
					diagonal = diagonal+"\n";
				}
			}
		}
	}
	void imprime(){		
			System.out.println("Os valores da diagonal principal �: \n"+diagonal+".");		
	}
	public static void main(String[] args){
		Exercicio02 nova = new Exercicio02();
		nova.preencheLista();
		nova.imprime();
	}
	
}
