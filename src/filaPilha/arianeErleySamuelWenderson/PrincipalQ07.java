package filaPilha.arianeErleySamuelWenderson;

import java.util.Scanner;

public class PrincipalQ07 {

	private int item[];
	private int topo;

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int tamMax = 20;
		int aux[] = new int[tamMax];
		EstruturaPilha p = new EstruturaPilha(tamMax);
		for (int i = 0; i < tamMax; i++) {
			System.out.println("Digite um valor: ");
			int valor = leia.nextInt();
			try {
				p.empilhar(valor);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				aux[i] = (int) p.desempilhar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for(int i = 0; i < tamMax; i++){
			for(int j = 0; j < tamMax; j++){
				if(aux[i] < aux[j]){
					int aux1 = aux[i];
					aux[i] = aux[j];
					aux[j] = aux1;
				}
			}	
		}
		
		for(int k = 0; k < tamMax; k++){
			p.item[k] = aux[k];
			System.out.println(p.item[k]);
		}
	}

}
