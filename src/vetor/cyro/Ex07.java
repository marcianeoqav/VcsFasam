/* Exerc�cio 7 da lista de vetores para N2.
 * Implemente um programa em Java para ler um vetor A de 20 posi��es, preenchido com 10 valores �mpares e 10 pares.
 * Em seguida, preencher outros dois vetores B e C de 10 posi��es cada. B deve conter todos os valores constantes 
 * pares de A, divididos por 2. 
 * O vetor C deve conter todos os valores �mpares de A, multiplicados por 3.
 * Uma classe;
 * M�todo void para preencher A;
 * M�todo void para preencher B e C. Recebe A, B, e C;
 * M�todo void para imprimir os vetores. Recebe um vetor.
 * M�todo main. */

package vetor.cyro;

public class Ex07 {
	public static int vA[] = new int[20];
	public static int vB[] = new int[10];
	public static int vC[] = new int[10];

	public static void main(String[] args) {
		Ex07 objeto = new Ex07();
		objeto.preencheA();
		objeto.imprime(vA);
		objeto.preencheBC();
		objeto.imprime(vB);
		objeto.imprime(vC);
	}

	public void preencheA() {
		for (int i = 0; i < vA.length; i++) {
			if ((i % 2 == 0) || (i == 0)) {
				while ((vA[i] % 2 != 0) || (vA[i] == 0)) {
					vA[i] = (int) (Math.random() * 100);
				}
			} else {
				while (vA[i] % 2 == 0) {
					vA[i] = (int) (Math.random() * 100);
				}
			}
		}
	}

	public void preencheBC() {
		int auxB = 0;
		int auxC = 0;
		for (int a = 0; a < vA.length; a++) {
			if (vA[a] % 2 == 0) {
				vB[auxB] = vA[a];
				auxB++;
			} else {
				vC[auxC] = vA[a];
				auxC++;
			}
		}
	}

	public void imprime(int x[]) {
		for (int z = 0; z < x.length; z++) {
			System.out.print(x[z] + "\t");
		}
		System.out.print("\n\n");
	}
}
