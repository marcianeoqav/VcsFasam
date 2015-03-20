package vetor.samuelDavid;

//Quest�o 5
import java.util.Scanner;

public class Questao05 {

	static Scanner entrada = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];
		int valorPesquisar;

		Questao05 x = new Questao05();

		x.preencherVetor(vetor);

		System.out.print("Infome o Valor desejado para a Pesquisa no Vetor");
		valorPesquisar = entrada.nextInt();

		int cont = x.pesquisarValor(vetor, valorPesquisar);
		if (cont != -1) {
			System.out.print("O valor pesquisado " + valorPesquisar + " está na posição " + cont + " do vetor");
		} else {
			System.out.print("Não foi encontrado o Valor Pesquisado! ");
		}
	}

	public void preencherVetor(int vetor[]) {
		t = vetor.length;
		System.out.println("Informe " + t + " Valores");
		for (int i = 0; i < t; i++) {
			vetor[i] = entrada.nextInt();
		}
	}

	public int pesquisarValor(int vetor[], int x) {
		t = vetor.length;
		int cont = -1;
		for (int i = 0; i < t; i++) {
			if (vetor[i] == x) {
				cont = i;
				return cont;
			}
		}
		return cont;
	}
}