package vetor.gilmar;

import java.util.Scanner;

public class Exercicio03 extends ProcessualN201Gilmar{
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]){
		System.out.println(Mensagem.tamanhoVetor);
		tamanhoVetor = leia.nextInt();
		vetor = new int[tamanhoVetor];
		preencheVetorInt(vetor, tamanhoVetor);
		System.out.println(Mensagem.impressaoAntesOrdenacao);
		imprimeVetorInt(vetor, tamanhoVetor);
		ordenarDecrescente(vetor, tamanhoVetor);
		System.out.println("\n"+Mensagem.impressaoAposOrdenacao);
		imprimeVetorInt(vetor, tamanhoVetor);
	}
}
