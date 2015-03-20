package Ex12;

import java.util.Scanner;

public class Avião {
	
	public void modelo(String[] x){
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite os modelos de cada avião: ");
		for(int i = 0; i < 20; i++){
			x[i] = leia.next();
		}
		
	}
  
}
