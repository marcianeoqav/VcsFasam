package ListaPilhaFila3;

import ListaPilhaFila3.Pilha1;

public class Exercicio9 {

	public static void main(String[] args){
	Pilha1 p1 = new Pilha1(10);					
	preencher(p1, p1.tamanho());					 
	
	System.out.print("Pilha ");		
	p1.imprimeTudo();
	
	int top = getMaior(p1);											
	System.out.print("O maior valor é: " + top + "\n\n");		

	int bottom = getMenor(p1);										
	System.out.print("O menor valor é: " + bottom + "\n\n");		
	
	int media = getMedia(p1);																		
	System.out.print("Média é: " + media + "\n");	
	
	}

	public static void preencher(Pilha1 a, int x){
		for (int i = 0; i < x; i++){
			a.empilhar(((int) (Math.random() * 10) + 1));	
		}													
	}
	
	public static int getMaior(Pilha1 a){
		int maior = 0;								
		int vetor[] = new int[a.tamanho()];			
		
		for (int p = 0; p < a.tamanho(); p++){
			vetor[p] = (int) a.desempilhar();			
		}		
		for (int i = 0; i < vetor.length; i++){
			a.empilhar(vetor[(vetor.length - 1) - i]);		
			if (vetor[i] > maior){
				maior = vetor[i];						
			}
		}
		return maior;								
	}
	public static int getMenor(Pilha1 a)				
	{
		int menor = 10;								
		int vetor[] = new int[a.tamanho()];			
		
		for (int p = 0; p < a.tamanho(); p++)
		{
			vetor[p] = (int) a.desempilhar();			
		}		
		for (int i = 0; i < vetor.length; i++)
		{
			a.empilhar(vetor[(vetor.length - 1) - i]);		
			if (vetor[i] < menor)
			{
				menor = vetor[i];						
			}
		}
		return menor;								
	}

	public static int getMedia(Pilha1 a)				
	{
		int media = 0;								
		int vetor[] = new int[a.tamanho()];			
		
		for (int j = 0; j < a.tamanho(); j++)
		{
			vetor[j] = (int) a.desempilhar();			
		}
		
		for (int f = 0; f < a.tamanho(); f++)
		{
			media = (media + vetor[f]);					
		}
		media = (media / a.tamanho());					
		
		return media;							
	}

}