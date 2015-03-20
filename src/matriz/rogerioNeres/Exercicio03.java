package matriz.rogerioNeres;

import java.util.Scanner;
public class Exercicio03{
	
	int matriz[][] = new int [10][10];
	String naoDiagonal = "";
	
	void preencheLista(){
		for(int linha = 0; linha <= 9; linha++){
			for(int coluna = 0; coluna <= 9; coluna++){
				System.out.print("Insira os valores: ");
				Scanner valor = new Scanner(System.in);
				matriz[linha][coluna] = valor.nextInt();
				
				if(linha == coluna){
					naoDiagonal = naoDiagonal+"|di|";
				}
				if(linha != coluna){
					naoDiagonal = naoDiagonal +"|"+matriz[linha][coluna]+"|";
				}
				if(coluna == 9){
					naoDiagonal = naoDiagonal+"\n";
				}
			}
		}
	}
	void imprime(){		
			System.out.println("Os valores que N�O s�o da diagonal principal s�o: \n"+naoDiagonal);		
	}
	public static void main(String[] args){
		Exercicio03 nova = new Exercicio03();
		nova.preencheLista();
		nova.imprime();
	}
}
