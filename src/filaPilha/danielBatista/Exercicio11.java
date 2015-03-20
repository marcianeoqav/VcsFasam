package ListaPilhaFila3;

import ListaPilhaFila3.Fila2;
import ListaPilhaFila3.Pilha1;

public class Exercicio11 {

	public static void main(String[] args){
		Pilha1 p1 = new Pilha1(8);				
		Fila2 f1 = new Fila2(5);					

		p1.empilhar("P");						
		p1.empilhar("E");						
		p1.empilhar("R");						
		p1.empilhar("T");						
		p1.empilhar("O");						

		f1.enfileirar(p1.desempilhar());			
		f1.enfileirar(p1.desempilhar());			

		p1.empilhar("S");						
		p1.empilhar("O");						
		p1.empilhar("L");						

		f1.enfileirar(p1.desempilhar());				
		f1.enfileirar(p1.desempilhar());			
		f1.enfileirar(p1.desempilhar());			

		for (int i = 0; i < f1.tamanho(); i++){
			try{
				System.out.print(f1.desenfileirar() + "\t");			
			} 
			catch(Exception e){
				e.printStackTrace();
			}
		}	
	}
}