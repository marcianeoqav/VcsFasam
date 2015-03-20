package ListaPilhaFila3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio3{

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args){		
		Fila2 fila = new Fila2(10);									

		for(int i = 0; i < fila.tamanho(); i++){
			System.out.println("Digite o valor para:" + i);
			fila.enfileirar(leia.nextInt());		
		}
		System.out.print("Valores gerados aleatorios: \n");	
		fila.imprimeTodos();

		System.out.println("Digite o número que deseja pesquisar:");
		Object getX = leia.nextInt(); 

		Object res[] = new Object[fila.tamanho()];	
		for (int j = 0; j < res.length; j++){
			try{
				res[j] = fila.desenfileirar();			
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}

		Object result = pesquisa(res, getX);		
		if (result.equals(-1)){
			System.out.print("Número nao encontrado .\n"); 
		}
		else{
			int show = (int) (result);
			System.out.print("O número " + getX + " foi encontrado na posição " + (show + 1));	
		}
	}
	public static Object pesquisa(Object v1[], Object x){
		Object aux = -1;						
		for (int j = 0; j < v1.length; j++){
			if (v1[j] == x){
				aux = j;						
				break;
			}
		}
		return aux;					
	}
}	