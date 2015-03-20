package ListaPilhaFila3;

import ListaPilhaFila3.Fila2;

public class Exercicio8 {

	public static void main(String[] args){
		Fila2 f1 = new Fila2(10);
		preencher(f1, f1.tamanho());

		System.out.print("Fila: ");		
		f1.imprimeTodos();

		Fila2 f2 = ordenar(f1, f1.tamanho());				

		System.out.print("Fila com valores Crescente: ");
		f2.imprimeTodos();							

	}
	public static void preencher(Fila2 a, int x){
		for (int i = 0; i < x; i++){
			a.enfileirar(((int) (Math.random() * 10) + 1));	
		}													
	}
	public static Fila2 ordenar(Fila2 a, int x){
		int aux;									
		int vetor[] = new int[x];						

		for (int i = 0; i < x; i++){
			try{
				vetor[i] = (int) a.desenfileirar();		
			} 
			catch (Exception e){
				e.printStackTrace();
			}
		}
		for (int j = 0; j < x; j++){
			for (int k = (j+1); k < vetor.length; k++){
				if (vetor[j] > vetor[k]){
					aux = vetor[j];					
					vetor[j] = vetor[k];						
					vetor[k] = aux;					
				}
			}
		}
		Fila2 f = new Fila2(x);

		for (int i = 0; i < x; i++){
			f.enfileirar(vetor[i]);					
		}
		return f;			
	}
}