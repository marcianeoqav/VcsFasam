package matriz.jean;
import java.util.Scanner;

public class Exe10 {

	static Scanner in = new Scanner(System.in);

	public static void Preencher(Object[][] vendas, int l, int c) {
		/*for (int i = 0; i < c; i++) {
			for (int j = 0; j < l-1; j++) {
				vendas[j][i] = 0;
			}
		}*/
		
		vendas[0][0] = "\t";
		for (int i = 1; i < c; i++) {
			vendas[0][i] = "Vendedor " + (i);
		}
		for (int i = 1; i < l-1; i++) {
			vendas[i][0] = "Produto " + (i);
		}
		for (int i = 1; i < c-1; i++) {
			System.out.println("Digite as qtd do " + vendas[0][i]);
			for (int j = 1; j < l-1; j++) {
				System.out.print(vendas[j][0] + ":");
				vendas[j][i] = in.next();
			}
		}
		vendas[l-1][0] = "Total:\t";
		vendas[0][c-1] = "Total";
	}

	public static Object[][] Totalizar(Object[][] vendas, int l, int c) {
		//Object[][] total = new Object[l + 1][c + 1];
		/*for (int i = 1; i < c; i++) {
			vendas[l-1][i] = 0;
		}
		for (int i = 1; i < l; i++) {
			vendas[i][c-1] = 0;
		}*/
		
		int totalp[] = new int[l];
		int totalv[] = new int [c];
		for (int i = 0; i < c; i++) {
			totalv[i] = 0;
		}
		for(int i = 0; i < l;i++){
			totalp[i] = 0;
		}
		
		int x;
		for (int i = 1; i < c-1; i++) {								//soma de produto - Linhas
			for (int j = 1; j < l-1; j++) {
				x = Integer.parseInt(vendas[j][i].toString());
				totalp[j] = totalp[j] + x;
			}
		}
		for (int i = 1; i < l-1; i++) {								//soma de vendedor - Colunas
			for (int j = 1; j < c-1; j++) {
				x = Integer.parseInt(vendas[i][j].toString());
				totalv[j] = totalv[j] + x;
			}
		}
		for (int i = 1; i < c; i++) {
			vendas[l-1][i] = totalv [i];
		}
		for (int i = 1; i < l; i++) {
			vendas[i][c-1] = totalp [i];
		}
		
		
		for (int i = 1; i < c; i++) {
			vendas[i][c-1] = totalp[i];
			vendas[l-1][i] = totalv[i];
		}
		vendas[l-1][c-1] = "";

		return vendas;
	}

	public static void Imprimir(Object[][] total, int l, int c){
		for(int i = 0; i < l; i++){
			System.out.println();
			for(int j = 0; j < c;j++){
				System.out.print(total[i][j] + "\t");
				if(i != 0 && j != 0){
					System.out.print("\t");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int c = 6;
		int l = 7;
		Object[][] vendas = new Object[l][c];
		Preencher(vendas, l, c);
		//Imprimir(vendas, l, c);
		vendas = Totalizar(vendas, l, c);
		Imprimir(vendas, l, c);

	}
}

/*
 * Uma empresa tem quatro equipes de vendas (1 a 4) que vendem cinco produtos
 * diferentes. Uma vez por dia, cada vendedor passa uma nota de cada tipo de
 * produto diferente vendido. Cada nota cont�m o seguinte: a) O n�mero do
 * vendedor, b) O n�mero do produto e c) O valor total em reais desse produto
 * vendido nesse dia. Portanto cada vendedor passa entre 0 e 5 notas de venda
 * por dia. Assuma que as informa��es a partir de todas as notas durante o
 * �ltimo m�s est�o dispon�veis. Escreva um aplicativo que leia todas estas
 * informa��es sobre as vendas do �ltimo m�s e resuma as vendas totais por
 * vendedor e por produto. Todos os totais devem ser armazenados na matriz
 * vendas. Depois de processar todas as informa��es do �ltimo m�s, exiba os
 * resultados em formato tabular, com cada coluna representando um vendedor
 * particular e cada linha representando um produto particular. Some cada linha
 * para obter o total das vendas de cada produto no �ltimo m�s. Some cada coluna
 * para obter o total de vendas por vendedor no �ltimo m�s. Sua sa�da tabular
 * deve incluir esses totais cruzados � direita das linhas totalizadas e na
 * parte inferior das colunas totalizadas. 
 * 10.1 Instru��es para implementa��o:
 * 10.1.1 O programa dever� ser implementado na linguagem de programa��o java,
 * contendo apenas uma classe com os seguintes m�todos: 
 * 10.1.1.1 Um m�todo para
 * o preenchimento dos dados da matriz. Este m�todo dever� receber como
 * par�metro a matriz e suas dimens�es, mas n�o precisar� retornar nada;
 * 10.1.1.2 Um m�todo para totalizar as linhas e colunas da matriz. Este m�todo
 * receber� a matriz[m][n], totalizar� cada linha e cada coluna e retornar� a
 * matriz[m+1][n+1] com a linha e coluna adicionais onde constam as
 * totaliza��es;
 * 10.1.1.3 Um m�todo para imprimir esta matriz na forma tabular.
 * Este m�todo recebe como par�metro a matriz a ser impressa, mas n�o retorna
 * nada. 
 * 10.1.1.4 Um m�todo main para coordenar todo o trabalho da classe.
 */