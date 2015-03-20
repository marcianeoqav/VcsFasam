package vetor.samuelDavid;

//Quest�o 10
import java.util.Scanner;

public class Questao10 {

	Scanner entrada = new Scanner(System.in);
	static int t;

	public static void main(String[] args) {
		t = 10;
		int vetor[] = new int[t];
		Questao10 x = new Questao10();
		x.preencherVetor(vetor);
		System.out.println("Impressão antes da inversão");
		x.imprimir(vetor);
		x.inverter(vetor);
		System.out.println("\nImpressão depois da inversão");
		x.imprimir(vetor);
	}

	public void preencherVetor(int vetor[]) {
		t = vetor.length;
		System.out.println("Informe " + t + " valores");
		for (int i = 0; i < t; i++) {
			vetor[i] = entrada.nextInt();
		}
	}

	public void imprimir(int vetor[]) {
		t = vetor.length;
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	public void inverter(int vetor[]) {
		t = vetor.length;
		int aux;
		for (int i = 0; i < t/2; i++) {
			aux = vetor[i] * vetor[i];
			vetor[i] = vetor[(t-1) - i] * vetor[(t-1) - i];
			vetor[(t-1) - i] = aux;
		}
	}
}
