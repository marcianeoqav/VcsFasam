package vetor.gilmar;

public class Exercicio01 extends ProcessualN201Gilmar{
	
	public static void main(String[] args) {
		System.out.println(Mensagem.comentarioTamanhoVetor);
		System.out.println(Mensagem.tamanhoVetor);
		tamanhoVetor = leia.nextInt();
		vetor = new int[tamanhoVetor];
		preencheVetorInt(vetor, tamanhoVetor);
		System.out.println(Mensagem.valoresVetor);
		imprimeVetorInt(vetor, tamanhoVetor);
	}
}
