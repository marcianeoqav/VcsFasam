package ListaPilhaFila3;

import ListaPilhaFila3.Fila2;

public class Exercicio10 {

	public static void main(String[] args){
		Fila2 f1 = new Fila2(10);						
		preencher(f1, f1.tamanho());					
	
		System.out.print("Fila: ");		
		f1.imprimeTodos();
		
		int v1[] = new int[f1.tamanho()];			
		
		for (int i = 0; i < v1.length; i++){
			try{
				v1[i] = (int) f1.desenfileirar();	
			} 
			catch (Exception e){
			
			}
		}
		int top = getMaior(v1);											
		System.out.print("Maior Valor: " + top + "\n\n");		

		int bottom = getMenor(v1);										
		System.out.print("Menor Valor: " + bottom + "\n\n");		
		
		int media = getMedia(v1);																		
		System.out.print("Média : " + media + "\n");	
	}
	public static void preencher(Fila2 a, int x){
		for (int i = 0; i < x; i++){
			a.enfileirar(((int) (Math.random() * 20) + 1));	
		}													
	}
	public static int getMaior(int[] a){
		int maior = 0;								
			
		for (int i = 0; i < a.length; i++){
			if (a[i] > maior){
				maior = a[i];						
			}
		}
		return maior;										
	}
	public static int getMenor(int[] a){
		int menor = 20;									
															
		for (int z = 0; z < a.length; z++){
			if (a[z] < menor){
				menor = a[z];						
			}
		}
		return menor;								
	}
	public static int getMedia(int[] a){
		int med = 0;								
		
		for (int f = 0; f < a.length; f++){
			med = (med + a[f]);					
		}
		med = (med / a.length);					 
		
		return med;								
	}
}