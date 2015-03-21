package matriz.denny;
import javax.swing.JOptionPane;
public class QUESTAO01 {

	
	
	public static void main(String[] args) {
		
		int m[][] = new int[10][10];
		
		
		QUESTAO01 M = new QUESTAO01();
		M.preencher(m);
		M.imprime(m);
		m=QUESTAO01.transposta(m);
	    M.imprime(m);

	}
    public void preencher (int m[][]){
    	for (int i=0; i<10; i++){
			for (int j=0; j<10; j++){
				m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("CrazyNumber"+ i +"Colunas"+j));
			
				
			}
		}
    
    }
    public void imprime (int m[][]){
    	
    	for (int i=0;i<10;i++){
    		for (int j=0;j<10;j++){
    			System.out.print(m[i][j] + "\t");
    		}
    		System.out.print("\n");
    	}
    	System.out.print("\n\n");
    }
    public static int[][] transposta (int m[][]){
    	int t[][] = new int [10][10];
    	for (int i=0;i<10;i++){
    		for(int j=0;j<10;j++){
    			t[j][i] = m[i][j];
    			
    		}
    	
    	}
    	return t;
    
    }
}
