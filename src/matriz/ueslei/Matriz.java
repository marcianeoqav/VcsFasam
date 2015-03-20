package matriz.ueslei;

import javax.swing.JOptionPane;

public class Matriz {
	private String print = "";
	private int q;
	private double supe;
	private double inf;
	private int linha;
	private int coluna;
	private float[][] matriz;

	public Matriz(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		this.matriz = new float[linha][coluna];

	}

	public void preencheMatriz() {

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {

				matriz[i][j] = Float.parseFloat(JOptionPane
						.showInputDialog("Digite um número para linha: "
								+ (i + 1) + " coluna: " + (j + 1)));
			}
		}
	}

	// Mostra a matriz e sua ordem

	public String imprimeMatriz() {
		String saida = "";

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {

				saida = saida + " [" + matriz[i][j] + "] ";
			}
			saida = saida + "\n";

		}
		// print += "Ordem da MAtriz é:  " + linha + " x " + coluna + "\n\n";
		print += "Matriz :\n" + saida + "\n";
		print += "A ordem da Matriz é:  " + linha + " x " + coluna + "\n";
		return saida;
	}

	// Mostra a diagonal principal

	public String diagonalPrincipal() {
		String princ = "";
		for (int l = 0; l < linha; l++) {
			for (int c = 0; c < coluna; c++) {

				if (l == c) {

					princ = princ + " [" + matriz[l][c] + "] ";
				}

			}
		}
		print += "\n" + "Diagonal Principal: \n" + princ + "\n";
		return princ;
	}

	// Testa se é quadrada

	public void testaQuadrada() {
		String quad = "";
		if (linha == coluna) {

			quad = "É uma Matriz Quadrada. \n ";
			q = 1;

		} else {

			quad = "Não é uma Matriz Quadrada. \n";
			q = 0;
		}

		print += "\n" + quad + "\n";
	}

	// Imprime diagonal secundária

	public void diagonalSecundaria() {
		String sec = "";
		if (q == 1) {

			for (int l = 0; l < linha; l++) {
				for (int c = 0; c < coluna; c++) {

					if ((l + c + 1) == linha) {

						sec = sec + " [" + matriz[l][c] + " ]";
					}
				}
			}

			print += "Diagonal Secundária: \n" + sec + "\n";

		} else {

			print += "Não tem Diagonal Secundária. \n";
		}

	}

	// Testa se é triangular superior

	public void triangularSuperior() {
		String superi = "";
		if (q == 1) {
			for (int i = 0; i < linha; i++) {
				for (int j = 0; j < coluna; j++) {
					if (i > j) {
						supe = supe + matriz[i][j];
					}
				}
			}
			if (supe == 0) {

				superi = "É uma Matriz triangular superior. \n";
				print += "\n" + superi;
			} else {

				superi = "Não é uma Matriz triangular superior. \n";
				print += "\n" + superi;
			}

		}
	}

	// Testa se é triangular inferior

	public void triangularInferior() {
		String infe = "";

		if (q == 1) {
			for (int i = 0; i < linha; i++) {
				for (int j = 0; j < coluna; j++) {
					if (i < j) {
						inf = inf + matriz[i][j];
					}
				}
			}
			if (inf == 0) {

				infe = "É uma Matriz triangular inferior. \n";
				print += "\n" + infe;
			} else {

				infe = "Não é uma Matriz triangular inferior. \n";
				print += "\n" + infe;
			}
		}
	}

	// Testa Simetría

	public void simetria() {
		String sim = "";
		if (linha == coluna) {
			int simetria = 1;
			for (int i = 0; i < linha; i++) {
				for (int j = 0; j < coluna; j++) {
					if (matriz[i][j] != matriz[j][i]) {
						simetria = 0;
					}
				}
			}
			if (simetria == 1) {

				sim = "É uma Matriz simétrica. \n";
				print += "\n" + sim;
			} else {

				sim = "Não é Matriz simétrica. \n";
				print += "\n" + sim;
			}
		}
	}

	public void determinante() {
		float soma = 0;
		float soma2 = 0;
		String det = "";
		if (q==1) {
			
			if ((linha == 2) && (coluna == 2)) {

				soma = matriz[0][0] * matriz[1][1];
				soma2 = matriz[0][1] * matriz[1][0];
				det = "Determinante:  " + "[ " + (soma - soma2) + " ]";
			}
			if ((linha==3)&&(coluna==3)){
				soma = (matriz[0][0]*matriz[1][1]*matriz[2][2])-(matriz[0][0]*matriz[1][2]*matriz[2][1])+(matriz[0][1]*
						matriz[1][2]*matriz[2][1])-(matriz[0][1]*matriz[1][0]*matriz[2][2])+(matriz[0][2]*matriz[1][0]*matriz[2][1])-
						(matriz[0][2]*matriz[1][1]*matriz[2][0]);
				det = "Determinante:  " + "[ " + (soma ) + " ]";
			}

			print += "\n" + det;
		}else{
			print +="\n"+ "Matriz não quadrada não possui determinante";
		}
	}

	public void mostraTudo() {
		JOptionPane.showMessageDialog(null, print);
	}

}
