package vetor.gilmar;


public class Exercicio04 extends ProcessualN201Gilmar{

	public static void main(String[] args) {
		System.out.println(Mensagem.comentarioTamanhoVetor);
		System.out.println(Mensagem.tamanhoVetores);
		tamanhoVetor = leia.nextInt();
		String nome[] = new String[tamanhoVetor];
		String profissao[] = new String[tamanhoVetor];
		int idade[] = new int[tamanhoVetor];
		preencheVetorString(nome, tamanhoVetor);
		preencheVetorString(profissao, tamanhoVetor);
		preencheVetorInt(idade, tamanhoVetor);
		imprimeVetorFormatoRelatorio(nome, profissao, idade, tamanhoVetor);
	}
}
