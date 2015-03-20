package vetor.gilmar;


public class Exercicio05 extends ProcessualN201Gilmar{

	public static void main(String[] args) {
		System.out.println(Mensagem.comentarioTamanhoVetor);
		System.out.println(Mensagem.tamanhoVetor);
		tamanhoVetor = leia.nextInt();
		vetor = new int[tamanhoVetor];
		preencheVetorInt(vetor, tamanhoVetor);
		System.out.println(Mensagem.valorPesquisa);
		int x = leia.nextInt();
		int posicao = pesquisaVetor(vetor, tamanhoVetor, x);
		if(posicao != -1){
			System.out.println("O valor " + x + " está na posição " + posicao + " do vetor");
		}else{
			System.out.println("O valor " + x + " não foi encontrado no vetor");
		}
	}
}
