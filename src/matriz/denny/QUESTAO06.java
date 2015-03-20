package matriz.denny;
import javax.swing.JOptionPane;
public class QUESTAO06 {


	
	public static void main(String[] args) {
		
		int m[][] = new int[10][10];
		
		QUESTAO06 M = new QUESTAO06();
		M.preencher(m);
		M.imprimir(m);
		M.ImpDS(m);
	
	}
	public void preencher (int m[][]){
		for (int i=0; i<10; i++){
			for (int j=0; j<10; j++){
				m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Linha" + i + " Coluna" + j));
			}
		}
	}
	public void imprimir (int m[][]){
		for (int i=0; i<10;i++){
			for(int j=0;j<10;j++){
				System.out.print(m[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n\n");
	}
	public void ImpDS (int m[][]){
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
		        if (i+j==9){
		        	System.out.print(m[i][j] + "\t");
		        }
		        
	        }System.out.print("\n");
        }System.out.print("\n\n");
  }
}