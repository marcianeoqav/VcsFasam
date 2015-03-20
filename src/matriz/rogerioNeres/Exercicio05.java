package matriz.rogerioNeres;

import java.util.Scanner;
public class Exercicio05 {

	int matriz[][] = new int [10][10];
	String diagonal = "";
	String abaixoDaDiagonal = "";
	
	void preencheLista(){
		for(int linha = 0; linha <= 9; linha++){
			for(int coluna = 0; coluna <= 9; coluna++){
				System.out.print("Insira os valores: ");
				Scanner valor = new Scanner(System.in);
				matriz[linha][coluna] = valor.nextInt();
				
				if(linha == coluna){
					abaixoDaDiagonal = abaixoDaDiagonal +"|di|";
				}
				if(linha-1 == coluna){
					abaixoDaDiagonal = abaixoDaDiagonal +"|"+matriz[linha][coluna]+"|";
				}
				if(linha-1 != coluna && linha != coluna){
					abaixoDaDiagonal = abaixoDaDiagonal +"|-|";
				}
				if(coluna == 9){
					abaixoDaDiagonal = abaixoDaDiagonal+"\n";
				}
			}
		}
	}
	void imprime(){		
			System.out.println("Os valores da diagonal principal �: \n"+abaixoDaDiagonal);		
	}
	public static void main(String[] args){
		Exercicio05 nova = new Exercicio05();
		nova.preencheLista();
		nova.imprime();
	}
}
