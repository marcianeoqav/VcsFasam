package vetor.denny;
import java.util.Scanner;
public class Vetor02 {

	static int t;
	
	public static void main(String[] args) {
		t = 10;
		int v[] = new int [t];
		 Vetor02 x = new Vetor02();
		 System.out.println("Preenchendo o vetor");
	     x.preencher(v);
	     System.out.println("\nVetor original");
	     x.imprimir(v);
	     x.ordenar(v);
	     System.out.println("\nVetor ordenado");
	     x.imprimir(v);
	}

	public void preencher (int v[]){
		t = v.length;
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < t ; i++){
			System.out.println("Informe o valor para a posição " + i + " do vetor"); 
			v[i] = leia.nextInt();
		}
		leia.close();
	}
	
	public void ordenar (int v[]){
		t = v.length;
		int ord = 0;
		for(int i=0;i<t-1;i++){
			for(int j=i+1;j<t;j++){
				if (v[i] > v[j]){
					ord = v[j];
					v[j] = v[i];
					v[i] = ord;
				}
			}
		}
		
	}
	public void imprimir (int v[]){
		for (int i=0;i<10;i++){
			System.out.print(v[i] + "\t");
		}
	}
}
