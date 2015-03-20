
package matriz.vinicius;



public class Ex02{

	int matriz[][];
	
	public static void main(String[] args){

		Ex02 objeto = new Ex02();		
		objeto.matriz = new int[10][10];	
		preenche(objeto.matriz);
		imprime(objeto.matriz);
		imprimeDP(objeto.matriz);
	}
	
	public static void preenche(int[][] m){	
				
		for(int i = 0; i < m.length; i++){

			for(int j = 0; j < m[0].length; j++){
				m[i][j] = (int) (Math.random() * 100); 
			}
		}
	}	 
	
	
	
	public static void imprime(int[][] m){	
											
		for(int a = 0; a < m.length;){

			for(int b = 0; b < m[0].length; b++){

				System.out.print(m[a][b] + "\t");	
			}
			System.out.print("\n");	
		}
		System.out.print("\n\n");	
	} 
	
	public static void imprimeDP(int[][] m){
	
		System.out.print("Elementos da diagonal principal:\n");

		for(int a = 0; a < m.length; a++){

			for(int b = 0; b < m[0].length; b++){

				if (a == b){

				System.out.print(m[a][b] + "\t");
				}
			}
		}
		System.out.print("\n\n");
	} 

}
