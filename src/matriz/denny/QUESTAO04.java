package matriz.denny;
import javax.swing.JOptionPane;
public class QUESTAO04 {
 
	public static void main(String[] args) {
	
		int m[][] = new int[10][10];
		
		QUESTAO04 M = new QUESTAO04();
		M.preencher(m);
		M.imprimir(m);
		M.ImpAcimaDP(m);
	
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
	public void ImpAcimaDP (int m[][]){
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				if (i<j){
					System.out.print(m[i][j] + "\t");
				}
			}System.out.print("\n");
		}System.out.print("\n\n");
	}

}
