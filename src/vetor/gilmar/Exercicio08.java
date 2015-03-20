package vetor.gilmar;


public class Exercicio08 extends ProcessualN201Gilmar{
		
	public static void main(String[] args) {
		System.out.println(Mensagem.palavra);
		palavra = leia.next();
		tamanhoVetor = palavra.length();
		vetorChar = new char[tamanhoVetor];
		preencheVetorPalavra(palavra, vetorChar);
		imprimeVetorChar(vetorChar, tamanhoVetor);
	}
}
