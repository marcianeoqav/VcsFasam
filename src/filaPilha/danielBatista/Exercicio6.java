package ListaPilhaFila3;

import ListaPilhaFila3.Fila2;
import ListaPilhaFila3.Pilha1;

public class Exercicio6 {

	public static void main(String[] args){			
		Fila2 f1 = new Fila2(10);			

		while (!f1.cheia()){
			f1.enfileirar(((int) (Math.random() * 20) + 1));	
		}													

		System.out.print("Fila:");
		f1.imprimeTodos();							

		Fila2 f2 = inverter(f1);						

		System.out.print("Fila invertida:");
		f2.imprimeTodos();							
	}
	public static Fila2 inverter(Fila2 a){
		Pilha1 p1 = new Pilha1(10);			

		while (!a.vazia()){
			if (!p1.cheia()){
				try{
					p1.empilhar(a.desenfileirar());	
				} 
				catch (Exception e){
					e.printStackTrace();
				}
			}
		}
		Fila2 f = new Fila2(10);		

		while (!p1.vazia()){
			if (!f.cheia()){
				try {
					f.enfileirar(p1.desempilhar());	
				} 
				catch (Exception e){
					e.printStackTrace();
				}
			}
		}
		return f;			
	}
}