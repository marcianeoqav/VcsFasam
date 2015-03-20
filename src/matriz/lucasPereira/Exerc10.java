/*
 10 Uma empresa tem quatro equipes de vendas (1 a 4) que vendem cinco produtos
    diferentes. 
    * Uma vez por dia, cada vendedor passa uma nota de cada tipo de produto diferente vendido. 
    * Cada nota contém o seguinte: 
        * a) O número do vendedor, 
        * b) O número do produto e 
        * c) O valor total em reais desse produto vendido nesse dia.
   * Portanto cada vendedor passa entre 0 e 5 notas de venda por dia. 
   * Assuma que as informações a partir de todas as notas durante o último mês estão disponíveis. 
   * Escreva um aplicativo que leia todas estas informações sobre as vendas do último mês e resuma as vendas 
     totais por vendedor e por produto. 
   * Todos os totais devem ser armazenados na matriz vendas. Depois de processar
    todas as informações do último mês, exiba os resultados em formato tabular, com cada
    coluna representando um vendedor particular e cada linha representando um produto
    particular. Some cada linha para obter o total das vendas de cada produto no último mês.
   * Some cada coluna para obter o total de vendas por vendedor no último mês. Sua saída
    tabular deve incluir esses totais cruzados à direita das linhas totalizadas e na parte inferior
    das colunas totalizadas.
10.1 Instruções para implementação:
10.1.1 O programa deverá ser implementado na linguagem de programação java, contendo apenas uma classe com os seguintes métodos:
10.1.1.1 Um método para o preenchimento dos dados da matriz. 
         * Este método deverá receber como parâmetro a matriz e suas dimensões, mas não precisará retornar nada;
10.1.1.2 Um método para totalizar as linhas e colunas da matriz. 
         * Este método receberá a matriz[m][n], totalizará cada linha e cada coluna e retornará a
           matriz[m+1][n+1] com a linha e coluna adicionais onde constam as totalizações;
10.1.1.3 Um método para imprimir esta matriz na forma tabular. 
         * Este método recebe como parâmetro a matriz a ser impressa, mas não retorna nada.
10.1.1.4 Um método main para coordenar todo o trabalho da classe.
 */
package matriz.lucasPereira;

import java.util.Scanner;

/**
 *
 * @author lucas.pereira
 */
public class Exerc10 {
        static Scanner input = new Scanner( System.in );
        //variavél global
        static int vendedor = 1, produto = 0;
        //declaração dos vetores
        static double[][] vendas = new double[4][5];
        static double[] totalVendedor = new double[4];
        static double[] totalProdutos = new double[5];
        
        public static void inputDados(double[][] mat){
		
            while ( vendedor >= 1 && vendedor <= 4){
	
			System.out.print( "Nro. do Vendedor: [1-4] " );
			vendedor = input.nextInt();
			if( vendedor >= 1 && vendedor <= 5 ){
			
				System.out.print( "Produto: [1-5] " );
				produto = input.nextInt();
				
				System.out.print( "Total de venda em reais: " );
				vendas[vendedor-1][produto-1] = input.nextDouble();
			}else{
                            System.out.println();
                        }
		}
            
        }
        
        public static void imprimiVendedor(double[][] mat){
            //impressão tabulada da saida dos produtos com melhor vendedor
		System.out.println( "         Produtos" );
		for( int i = 0; i < 4; i ++ ){
		
			if( i == 0 ){
				System.out.print( "Vendedor |" );
                        }else{
                            System.out.print("         |");
                        }
                        //estrutura para imprimir a vendas e total de vendas dos produtos e dos vendedores
			for( int j = 0; j < 5; j++ ){
			
				System.out.print( vendas[i][j] + "|" );
				totalProdutos[j] += vendas[i][j];
				totalVendedor[i] += vendas[i][j];
			}
			
			// Imprime ultimas duas colunas, total por vendedor
			System.out.println( "|" + totalVendedor[i] );
		}
            
        }
        
        //metdos para imprimir total dos produtos em apenas 2 linhas
	public static void imprimiTotalProdutos(double[] produtos)	{
            
		// Imprime ultimas duas linhas, total por produto
		System.out.print( "         " );
		for (int i = 0; i < 20; i++)
		{
			System.out.print( "-" );
		}
		System.out.println();
		System.out.print( "         |" );
		for( int j = 0; j < 5; j++ )
		{
			System.out.print(totalProdutos[j] + "|");
		}
        
        }
    	public static void main(String[] args)
	{
            //variavel local
            int op;
            //Estrutura para inicializar a matriz vendas zerada.
		for( int i = 1; i < 4; i ++ )
			for( int j = 0; j < 5; j++ )
				vendas[i][j] = 0.0;
		
                do{
                    System.out.println("Informe o que deseja fazer");
                    System.out.println("1 - Entrada dados vendas de produtos por vendedor");
                    System.out.println("2 - Impressão dos dados das vendas e produtos");
                    System.out.println("3 - Impressão do tatal de vendas dos produtos");
                    System.out.println("0 - Sair");
                    op = input.nextInt();
                    
                    switch(op){
                        case 1:
                            inputDados(vendas);
                            break;
                        case 2:
                            imprimiVendedor(vendas);
                            break;
                        case 3:
                            imprimiTotalProdutos(totalProdutos);
                            break;
                        default:
                            System.out.println("*** Opção Invalida ****");
                            break;
                    }
                }while(op !=0);
		
	}
}
