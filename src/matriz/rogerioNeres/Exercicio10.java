package matriz.rogerioNeres;

import java.util.Scanner;
public class Exercicio10 {
	
	int matriz[][] = new int [6][5];
	String produtoXvendedor = "";
	int aux;
	int somaLinha = 0;
	int somaColuna = 0;
	String totalColuna;
	int i = 0;
	
	void preenche(){
		for(int linha = 0; linha <= 4; linha++){
			for(int coluna = 0; coluna <= 3; coluna++){
				System.out.print("Qunato o vendendor "+(coluna+1)+" vendeu do produto "+(linha+1)+"? R$");
				Scanner valor = new Scanner(System.in);
				aux = valor.nextInt();
				matriz[linha][coluna] = aux;
				produtoXvendedor = produtoXvendedor+" "+matriz[linha][coluna];
				somaLinha = somaLinha + aux;
				
				if(coluna == 3){
					produtoXvendedor = produtoXvendedor+" "+somaLinha;
					produtoXvendedor = produtoXvendedor+"\n";
					somaLinha = 0;
				}
					if(linha == 4 && coluna == i){
		    			somaColuna = somaColuna +aux;
		    			totalColuna = somaColuna+" "+somaColuna;
						somaColuna = 0;
		    		}
		    	}i++;
				/*if(linha == 5){
					somaColuna = matriz[5][coluna];
				}*/
			}
		}
	
	void imprime(){
		System.out.println("Total vendido: \n"+produtoXvendedor+"\n"+totalColuna);
	}
	public static void main(String[] args){
		Exercicio10 nova = new Exercicio10();
		nova.preenche();
		nova.imprime();
	}
}
