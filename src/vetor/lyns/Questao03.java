package vetor.lyns;
/*
 3 Altere o exerc�cio anterior (2), alterando a forma de ordena��o do vetor. Mudando a ordem
de crescente para decrescente.
 */
import java.util.Scanner;

public class Questao03 {
	Scanner leia = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t]; // alterado o nome
		Questao03 x = new Questao03();
		x.preencherVetor(vetor); // alterado o nome do método
		System.out.println("Impressão do vetor antes da ordenação");
		x.imprimirVetor(vetor); // alterado o nome do método
		x.ordenarVetor(vetor); // alterado o nome do método
		System.out.println("\nImpressão do vetor depois da ordenação");
		x.imprimirVetor(vetor);
	}

	public void preencherVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.println("Informe o valor para a " + (i + 1)
					+ "ª posição do vetor");
			vetor[i] = leia.nextInt();
		}
	}

	public void imprimirVetor(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	public void ordenarVetor(int vetor[]) {
		t = vetor.length;
		int aux;
		for (int i = 0; i < t-1; i++) {
			for(int j = i + 1; j< t; j++){
				if(vetor[i] < vetor[j]){
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	}
}