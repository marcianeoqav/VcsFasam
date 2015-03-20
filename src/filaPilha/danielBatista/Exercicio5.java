package ListaPilhaFila3;

import ListaPilhaFila3.Fila2;
import ListaPilhaFila3.Pilha1;

public class Exercicio5 {

	public static void main(String[] args){
		Fila2 f1 = new Fila2(10);						
		preencher(f1, f1.tamanho());					
	
		System.out.print("Fila:");
		f1.imprimeTodos();							
		
		Fila2 f2 = inverter(f1);						
		System.out.print("Pilha:");		
		f2.imprimeTodos();		
	}
	
	public static void preencher(Fila2 a, int x){
		for (int i = 0; i < x; i++){
			a.enfileirar(((int) (Math.random() * 10) + 1));	
		}													
	}
	
	public static Fila2 inverter(Fila2 a){
		Pilha1 p1 = new Pilha1(a.tamanho());			
		
		for (int i = 0; i < p1.tamanho(); i++){
			try{
				p1.empilhar(a.desenfileirar());		 
			} 
			catch (Exception e){
				e.printStackTrace();
			}
		}
		Fila2 f = new Fila2(a.tamanho());				
		
		for (int j = 0; j < p1.tamanho(); j++){
			try {
				f.enfileirar(p1.desempilhar());		
			} 
			catch (Exception e){
				e.printStackTrace();
			}
		}
		return f;								
	}
}  
