package filaPilha.arianeErleySamuelWenderson;

import java.util.Scanner;

public class PrincipalQ15 {
	Scanner entrada = new Scanner(System.in);

	static Principal EP = new Principal(10);

	public static void main(String[] args) throws Exception {

		EP.esquolha(EP.item);
	}

	public void esquolha(int[] ep) throws Exception {

		int escolha = 0;
		int x = 0;
		System.out
				.println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
		escolha = entrada.nextInt();

		while (escolha != 4) {
			if (escolha == 1) {
				System.out
						.println("Infome o numero que deseja ser cadastrado = ");
				x = entrada.nextInt();
				EP.empilhar(x);

				System.out
						.println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
				escolha = entrada.nextInt();
			}

			if (escolha == 2) {
				for (int i = 0; i < EP.item.length; i++) {
					if ((ep[i] % 2) == 0) {
						System.out.println(ep[i]);
					}
				}
				System.out
						.println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
				escolha = entrada.nextInt();
			}

			if (escolha == 3) {
				EP.desempilhar();
				System.out
						.println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
				escolha = entrada.nextInt();

			}

			if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4) {
				System.out
						.println("ERRO- Escolha invalida, por favor fa�a uma nova escolha");
				System.out
						.println("Digite 1 - Cadastrar numero, 2 - Mostrar n�meros pares entre o primeiro e o �ltimo n�mero cadastrado, 3 - Excluir numero ou 4 - Sair");
				escolha = entrada.nextInt();
			}
		}

		if (escolha == 4) {
			System.out.println("OBRIGADO, volte sempre !");
		}

	}

	
}