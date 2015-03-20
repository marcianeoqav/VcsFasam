


package matriz.vinicius;

public class Ex01{

	int matriz[][];  
	
	public static void main(String[] args){

	Ex01 objeto = new Ex01();		
	objeto.matriz = new int[10][10];	
	preenche(objeto.matriz);			
	imprime(objeto.matriz);				
	objeto.matriz = geraTransposta(objeto.matriz);	
	imprime(objeto.matriz);				 
	}
	
	public static void preenche(int[][] m){

		int cont = 0;
		for(int i = 0; i < m.length; i++){

			for(int j = 0; j < m[0].length; j++){

				m[i][j] = cont;				
				cont++;								
			}
		}
	}	 
	
	
	public static void imprime(int[][] m){
								 
		for (int a = 0; a < m.length; a++){

			for(int b = 0; b < m[0].length; b++){

				System.out.print(m[a][b] + "\t");	
			}
			System.out.print("\n");	
		}
		System.out.print("\n\n");
	} 
	
	
	public static int[][] geraTransposta(int[][] m){

		int x = m.length;
		int y = m[0].length;		 
		int transposta[][] = new int[y][x];	
		
		for(int c = 0; c < x; c++){

			for(int d = 0; d < y; d++){

				transposta[d][c] = m[c][d];		
			}
		}
		return transposta; 
	} 
}
