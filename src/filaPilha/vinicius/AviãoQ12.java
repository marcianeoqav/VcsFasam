package Ex12;

import java.util.Scanner;

public class Avi�o {
	
	public void modelo(String[] x){
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite os modelos de cada avi�o: ");
		for(int i = 0; i < 20; i++){
			x[i] = leia.next();
		}
		
	}
  
}
