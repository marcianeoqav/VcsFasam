package vetor.gilmar;


public class Exercicio02 extends ProcessualN201Gilmar{
	
	public static void main(String args[]){
		System.out.println(Mensagem.comentarioTamanhoVetor);
		System.out.println(Mensagem.tamanhoVetor);
		tamanhoVetor = leia.nextInt();
		vetor = new int[tamanhoVetor];
		preencheVetorInt(vetor, tamanhoVetor);
		System.out.println(Mensagem.impressaoAntesOrdenacao);
		imprimeVetorInt(vetor, tamanhoVetor);
		ordenarCrescente(vetor, tamanhoVetor);
		System.out.println("\n"+Mensagem.impressaoAposOrdenacao);
		imprimeVetorInt(vetor, tamanhoVetor);
	}
}
