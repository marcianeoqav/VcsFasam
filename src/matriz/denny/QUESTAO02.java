package matriz.denny;
import javax.swing.JOptionPane;
public class QUESTAO02 {


	public static void main(String[] args) {
		
		int m[][] = new int [10][10];
QUESTAO02 M = new QUESTAO02();
M.preencher(m);
M.imprimir(m);
M.imprimirDP(m);
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
public void imprimirDP (int m[][]){
	for(int i=0; i<10;i++){
		for (int j=0;j<10;j++){
			if (i==j){
				System.out.println("Diagonal Principal (" + m[i][j] + ")");
			}
			
		}
		
	}
}
}
