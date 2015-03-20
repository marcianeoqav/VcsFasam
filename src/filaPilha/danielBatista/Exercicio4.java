package ListaPilhaFila3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args){
		Fila2 f1 = new Fila2(5);				
		preencher(f1, f1.tamanho());			

		Fila2 f2 = new Fila2(5);				
		preencher(f2, f2.tamanho());			

		System.out.print("Fila 1: \n");
		f1.imprimeTodos();					

		System.out.print("Fila 2: \n");
		f2.imprimeTodos();					

		Fila2 f3 = intercalar(f1, f2);		


		System.out.print("Fila intercalada: \n");
		f3.imprimeTodos();						
	}


	public static void preencher(Fila2 a, int x){
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < x; i++){
			a.enfileirar(((int) (Math.random() * 20) + 1));	
		}													
	}

	public static Fila2 intercalar(Fila2 a, Fila2 b){
		int comp = (a.tamanho() + b.tamanho());		
		Fila2 aux = new Fila2(comp);					

		for (int j = 0; j < (aux.tamanho() / 2); j++){
			try{
				aux.enfileirar(a.desenfileirar());		
				aux.enfileirar(b.desenfileirar());		
			} 
			catch (Exception e){
				e.printStackTrace();
			}
		}
		return aux;				
	}

}	
