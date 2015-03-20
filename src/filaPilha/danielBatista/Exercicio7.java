package ListaPilhaFila3;

import ListaPilhaFila3.Pilha1;

public class Exercicio7 {

	public static void main(String[] args){
		Pilha1 p1 = new Pilha1(10);				
		preencher(p1, p1.tamanho());				

		System.out.print("Pilha: ");		
		p1.imprimeTudo();

		Pilha1 p2 = ordenar(p1, p1.tamanho());				

		System.out.print("Pilha com valores Crescente: ");
		p2.imprimeTudo();							
	}
	public static void preencher(Pilha1 a, int x){
		for (int i = 0; i < x; i++){
			a.empilhar(((int) (Math.random() * 10) + 1));	
		}													
	}
	public static Pilha1 ordenar(Pilha1 a, int x){
		int aux;									
		int vetor[] = new int[x];						

		for(int i = 0; i < x; i++){
			vetor[i] = (int) a.desempilhar();		
		}
		for(int j = 0; j < x; j++){
			for (int i = (j + 1); i < vetor.length; i++){
				if (vetor[j] < vetor[i]){
					aux = vetor[j];					
					vetor[j] = vetor[i];						
					vetor[i] = aux;					
				}
			}
		}
		for(int m = 0; m < x; m++){
			a.empilhar(vetor[m]);					
		}
		return a;			
	}
}
