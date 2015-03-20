package vetor.samuelDavid;
//Quest�o 1

import java.util.Scanner;

public class Questao01 {
	Scanner entrada = new Scanner(System.in);
	static int t;
	public static void main(String[] args){
		t = 10;
		int vetor[] = new int [t];
		Questao01 x = new Questao01();
		
		x.preencherVetor(vetor);
		x.imprimirVetor(vetor);
	}
	

	public void preencherVetor(int vetor[]){
		t = vetor.length;
		System.out.println("Informe " + t + " Valores");
		for (int i = 0; i < t; i++){
			vetor[i]=entrada.nextInt();	
		}
	}
	
	public void imprimirVetor(int vetor[]){
		t = vetor.length;
		for (int i = 0; i < t; i++){
			System.out.print(vetor[i] + " ");
		}
	}
}
