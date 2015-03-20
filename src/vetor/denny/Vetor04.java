package vetor.denny;
import java.util.Scanner;
public class Vetor04 {

	static int t;

	public static void main(String[] args) {
		t = 10;
		String n[] = new String [t];
		String p[] = new String [t];
		int i[] = new int [t];
		Vetor04 x = new Vetor04();
		x.preencher(n, p, i);
        x.impressao(n, p, i);
	}

	public void preencher (String n[], String p[], int i[]){
		t = n.length;
		Scanner leia = new Scanner(System.in);
		for (int j = 0; j < t; j++){
			System.out.println("Informe o nome para a posição " + j + " do vetor n"); 
			n[j] = leia.next();
			System.out.println("Informe a profissão para a posição " + j + " do vetor p");
			p[j] = leia.next();
			System.out.println("Informa e idade para a posição " + j + " do vetor i");
			i[j] = leia.nextInt();
		}
		leia.close();
	}
	
	public void impressao (String n[], String p[], int i[]){
		t = n.length;
		System.out.println("Nome\tProfissão\tIdade");
		for (int j = 0; j < t; j++){
			System.out.println(n[j] + "\t" + p[j] + "\t" + i[j]); 
		}
		
	}
}
