package vetor.gilmar;

public class Exercicio07 extends ProcessualN201Gilmar{

	public static void main(String[] args) {
		System.out.println(Mensagem.comentarioTamanhoVetor);
		System.out.println(Mensagem.vetorPar);
		System.out.println(Mensagem.tamanhoVetorPar);
		tamanhoVetor = leia.nextInt();
		//valida se de fato é um valor par
		while (tamanhoVetor % 2 != 0) {
			System.out.println(Mensagem.valorInvalido);
			tamanhoVetor = leia.nextInt();
		}
		vetorA = new int[tamanhoVetor];
		vetorB = new int[tamanhoVetor/2];
		vetorC = new int[tamanhoVetor/2];
		preencheVetorNumerosParesImpares(vetorA, tamanhoVetor);
		desmembraVetores(vetorA, vetorB, vetorC, tamanhoVetor);
		System.out.println(Mensagem.vetorA);
		imprimeVetorInt(vetorA, tamanhoVetor);
		System.out.println("\n"+Mensagem.vetorB);
		imprimeVetorInt(vetorB, vetorB.length);
		System.out.println("\n"+Mensagem.vetorC);
		imprimeVetorInt(vetorC, vetorC.length);
	}

}
