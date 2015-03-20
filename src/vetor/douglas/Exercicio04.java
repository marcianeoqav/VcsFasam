package vetor.douglas;

import java.util.*;

public class Exercicio04 {

	static int t;
	
    public static void preencherVetores(String[] nome, String[] profissao, int[] idade) {
    	t = nome.length;
        Scanner leia = new Scanner(System.in);
        for (int i = 0; i < t; i++) {
            System.out.println("Digite o Nome:");
            nome[i] = leia.next();
            System.out.println("Digite a Profissão:");
            profissao[i] = leia.next();
            System.out.println("Digite a Idade:");
            idade[i] = leia.nextInt();
        }
        leia.close();
    }

    public static void imprimirVetores(String[] nome, String[] profissao, int[] idade) {
    	t = nome.length;
        System.out.print("Nome \t");
        System.out.print("Profissão \t");
        System.out.println("Idade \t");

        for (int i = 0; i < t; i++) {
            System.out.print(nome[i] + "\t");
            System.out.print(profissao[i] + "\t");
            System.out.println(idade[i]);
        }
    }

    public static void main(String[] args) {
    	t = 10;
        String[] nome = new String[t];
        String[] profissao = new String[t];
        int[] idade = new int[t];

        preencherVetores(nome, profissao, idade);
        imprimirVetores(nome, profissao, idade);
    }
}
