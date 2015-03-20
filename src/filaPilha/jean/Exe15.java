package filaPilha.jean;

import java.util.Scanner;

public class Exe15 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Pilha pilha = new Pilha(100);
		int op, x;
		do {
			System.out.println("\nOp��es");
			System.out.println("1 - Cadastrar n�mero");
			System.out.println("2 - Mostrar n�meors pares");
			System.out.println("3 - Excluir n�mero");
			System.out.println("0 - Sair");
			op = in.nextInt();
			switch (op) {
			case 1:
				System.out.print("Digite um numero inteiro:");
				x = in.nextInt();
				pilha.empilha(x);
				break;
			case 2:
				Pilha tem = pilha;
				mostrarPares(tem);
				break;
			case 3:
				System.out.print("Qual valor quer excluir:");
				int n = in.nextInt();
				pilha = excluir(pilha, n);
				
				break;
			case 0:
				System.out.println("Fim");
				break;
			default:
				System.out.println("Opcao invalida.");
				break;
			}
		} while (op != 0);
	}
	
	public static void mostrarPares(Pilha pares){
		int n;
		System.out.print("Valores pares: ");
		do{
			n = (int)pares.desempilha();
			if((n % 2) == 0){
			System.out.print("\t" + n);
			}
		}while(!pares.vazia());
	}
	
	public static Pilha excluir(Pilha nova, int n){
		Fila temp = new Fila(100);
		int z;
		do{
			z = (int)nova.desempilha();
			if(z != n){
			temp.enfileira(z);
			}
		}while(!nova.vazia());
		do{
			nova.empilha(temp.desenfileira());
		}while(!temp.vazia());
		
		return nova;
	}

}
