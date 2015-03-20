package matriz.ueslei;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		// ler as dimens�es da matriz (linha e coluna)
		
		int linha = Integer.parseInt (JOptionPane.showInputDialog("Defina a quantidade de linhas da Matriz:"));
		int coluna = Integer.parseInt (JOptionPane.showInputDialog("Defina a quantidade de Colunas da Matriz:"));

		// criar objeto matriz conforme dimensoes informadas pelo usuario

		Matriz nova = new Matriz(linha, coluna);
			
		// entrar com os dados da matriz

		nova.preencheMatriz();
		nova.imprimeMatriz();
		

		// responder �s perguntas sobre a matriz

		nova.diagonalPrincipal();
		nova.testaQuadrada();
		nova.diagonalSecundaria();
		nova.triangularInferior();
		nova.triangularSuperior();
		nova.simetria();
		nova.determinante();
		nova.mostraTudo();

	}
	
	
}
