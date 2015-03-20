package filaPilha.arianeErleySamuelWenderson;

import java.util.Scanner;

public class PrincipalQ09 {


	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int tamMax = 20;
		EstruturaPilha p = new EstruturaPilha(tamMax);
		System.out.println("Didige vinte valores: ");
		for (int i = 0; i < tamMax; i++) {
			try {
				p.empilhar(leia.nextInt());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		int maior = 0;
		int menor = 10000;
		int media = 0;
		for (int i = 0; i < tamMax; i++) {
			if ((int) p.item[i] > maior) {
				maior = (int) p.item[i];
			}
			if ((int) p.item[i] < menor) {
				menor = (int) p.item[i];
			}
			media = media + (int) p.item[i];
		}
		System.out.println("A média aritmética da pilha é: " + media);
		System.out.println();
		System.out.println("O maior valor da pilha é: " + maior);
		System.out.println();
		System.out.println("O menor valor da pilha é: " + menor);
		leia.close();
	}

}
