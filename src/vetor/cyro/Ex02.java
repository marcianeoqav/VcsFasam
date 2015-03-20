/* Exerc�cio 2 da lista de vetores para N2.
 * Com base no exerc�cio n�mero 1, acrescente um m�todo para
 * ordenar o vetor na ordem crescente.*/

package vetor.cyro;

public class Ex02 {

	int vetor[] = new int[10];

	public static void main(String[] args) {
		Ex02 objeto = new Ex02();
		objeto.preenche();
		objeto.ordena();
		objeto.imprime();

	}

	public void preenche() {
		for (int i = 0; i < this.vetor.length; i++) {
			int p = (int) (Math.random() * 50);
			this.vetor[i] = p;
		}
	}

	public void ordena() {
		int p = this.vetor.length;
		int temp = 0;
		for (int s = 0; s < p; s++) {
			for (int t = s + 1; t < p; t++) {
				if (vetor[s] > vetor[t]) {
					temp = vetor[t];
					vetor[t] = vetor[s];
					vetor[s] = temp;
				}
			}
		}
	}

	public void imprime() {
		for (int j = 0; j < this.vetor.length; j++) {
			System.out.print(this.vetor[j] + "\t");
		}
	}

}
