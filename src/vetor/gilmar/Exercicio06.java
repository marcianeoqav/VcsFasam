package vetor.gilmar;

public class Exercicio06 extends ProcessualN201Gilmar{
	public static void main(String args[]){
		System.out.println(Mensagem.comentarioTamanhoVetor);
		System.out.println(Mensagem.tamanhoVetor);
		tamanhoVetor = leia.nextInt();
		vetorA = new int[tamanhoVetor];
		vetorB = new int[tamanhoVetor];
		preencheVetorInt(vetorA, tamanhoVetor);
		preencheVetorInt(vetorB, tamanhoVetor);
		vetorC = intercalar(vetorA, vetorB, tamanhoVetor);
		System.out.println(Mensagem.vetorA);
		imprimeVetorInt(vetorA, tamanhoVetor);
		System.out.println("\n"+Mensagem.vetorB);
		imprimeVetorInt(vetorB, tamanhoVetor);
		System.out.println("\n"+Mensagem.vetorC);
		imprimeVetorInt(vetorC, vetorC.length);
	}
}
