//teste teste

package filaPilha.arianeErleySamuelWenderson;

import java.util.Scanner;

public class Aviao {
	
	public void modelo(String[] x){
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite os modelos de cada avião: ");
		for(int i = 0; i < 20; i++){
			x[i] = leia.next();
		}
	}
}
