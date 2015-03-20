package vetor.gilmar;

import java.util.Scanner;

public class Exercicio09 extends ProcessualN201Gilmar{
	
	static Scanner leitor = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(Mensagem.palavra);
		palavra = leitor.next();
		tamanhoVetor = palavra.length();
		vetorChar = new char[tamanhoVetor];
		preencheVetorPalavra(palavra, vetorChar);
		System.out.println(Mensagem.impressaoAntesInversao);
		imprimeVetorChar(vetorChar, tamanhoVetor);
		inverteVetorChar(vetorChar, tamanhoVetor);
		System.out.println("\n"+Mensagem.impressaoAposInversao);
		imprimeVetorChar(vetorChar, tamanhoVetor);
	}
}
