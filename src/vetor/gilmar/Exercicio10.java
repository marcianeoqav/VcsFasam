package vetor.gilmar;

public class Exercicio10 extends ProcessualN201Gilmar{

	public static void main(String[] args) {
		System.out.println(Mensagem.comentarioTamanhoVetor);
		System.out.println(Mensagem.tamanhoVetor);
		tamanhoVetor = leia.nextInt();
		vetor = new int[tamanhoVetor];
		preencheVetorInt(vetor, tamanhoVetor);
		System.out.println(Mensagem.impressaoAntesInversao);
		imprimeVetorInt(vetor, tamanhoVetor);
		inverteVetorAoQuadrado(vetor, tamanhoVetor);
		System.out.println("\n"+Mensagem.impressaoAposInversao);
		imprimeVetorInt(vetor, tamanhoVetor);
	}
}
