package matriz.leopoldo;

//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exe10 {

	int matriz[][];

	public class Nota {
		int numeroDoVendedor;
		int numeroDoProduto;
		float totalVendido;
	}

	public class Vendedor {
		int numeroDoVendedor;
		String nome;
	}

	public class Produto {
		int numeroDoProduto;
		String nome;
	}

	public static void preencheMatriz(int[][] matriz) {
		// Scanner imput = new Scanner(System.in);
		int l, id, valor;

		// System.out.println("Informe o numero do vendedor: ");
		// id = imput.nextInt();
		id = 1;
		while (id != 0) {
			id = Integer.parseInt(JOptionPane
					.showInputDialog("\nInforme o numero do vendedor: "
							+ "\n1 - Para  o vendedor Mateus: "
							+ "\n2 - Para  o vendedor J�ao  : "
							+ "\n3 - Para  o vendedor Marcos:"
							+ "\n4 - Para  o vendedor Bruno :"
							+ "\n0 - Para             Sair  : "));

			switch (id) {
			case 1:
				l = Integer.parseInt(JOptionPane
						.showInputDialog("Informe o numero do produto: "));
				valor = Integer.parseInt(JOptionPane
						.showInputDialog("Informe o valor  da venda  : "));
				// System.out.println("Informe o numero do produto: ");
				// l = imput.nextInt();
				// System.out.println("Informe o valor da venda: ");
				// valor = imput.nextInt();
				matriz[l][1] = valor;
				break;

			case 2:
				l = Integer.parseInt(JOptionPane
						.showInputDialog("Informe o numero do produto: "));
				valor = Integer.parseInt(JOptionPane
						.showInputDialog("Informe o valor  da venda  : "));
				matriz[l][2] = valor;
				break;

			case 3:
				l = Integer.parseInt(JOptionPane
						.showInputDialog("Informe o numero do produto: "));
				valor = Integer.parseInt(JOptionPane
						.showInputDialog("Informe o valor  da venda  : "));
				matriz[l][3] = valor;
				break;

			case 4:
				l = Integer.parseInt(JOptionPane
						.showInputDialog("Informe o numero do produto: "));
				valor = Integer.parseInt(JOptionPane
						.showInputDialog("Informe o valor  da venda  : "));
				matriz[l][4] = valor;
				break;
			default:

			}
		}
	}

	public static void imprimeMatriz(int[][] tamanho) {
		int l, c;
		for (l = 0; l < tamanho.length; l++) {
			for (c = 0; c < tamanho[0].length; c++) {
				JOptionPane.showMessageDialog(null, tamanho[l][c]);
			}
			JOptionPane.showMessageDialog(null,"");
		}
		JOptionPane.showMessageDialog(null,"\n");
	}

	public static void main(String[] args) {
		// Scanner imput = new Scanner(System.in);

		Exe10 Matriz = new Exe10();
		Matriz.matriz = new int[5][4];

		JOptionPane.showMessageDialog(null, "Sistema de Vendas\n");
		// System.out.println("\t\t\t\tSistema de Vendas\n");
		int op = Integer.parseInt(JOptionPane
				.showInputDialog("Digite 1 para cadastrar nova venda: "));
		// System.out.println("Digite 1 para cadastrar nova venda: ");
		// int op = imput.nextInt();
		if (op == 1) {
			preencheMatriz(Matriz.matriz);
		}
		imprimeMatriz(Matriz.matriz);
	}
}
