package vetor.jean;

import java.util.Scanner;

/**
 *
 * @author JeanPaulo
 */
public class Exe04 {

    Scanner in = new Scanner(System.in);
    static int t;

    public void leNome(String nome[], int i) {
        System.out.println("Digite o nome:");
        nome[i] = in.next();
    }

    public void leIdade(int idade[], int i) {
        int x = 1;
        while (x != 0) {
            System.out.println("Digite a idade:");
            idade[i] = in.nextInt();
            for (int j = 0; j < i; j++) {
                if (idade[i] == idade[j]) {
                    System.out.println("Idade tem que ser diferente das demais!");
                    break;
                }
            }
            x = 0;
        }
    }

    public void leProfissao(String profissao[], int i) {
        System.out.println("Digite a profissão:");
        profissao[i] = in.next();
    }

    public static void imprime(String nome[], String profissao[], int idade[]) {
    	t = nome.length;
    	System.out.println("Nome\tProfissão\tIdade");
        for (int i = 0; i < t; i++) {
            System.out.println(nome[i] + "\t" + profissao[i] + "\t" + idade[i]);
        }
    }

    public static void main(String[] args) {
    	t = 10;
        Exe04 exe = new Exe04();
        String nome[] = new String[t];
        int idade[] = new int[t];
        String profissao[] = new String[t];
        for (int i = 0; i < t; i++) {
            exe.leNome(nome, i);
            exe.leProfissao(profissao, i);
            exe.leIdade(idade, i);
        }
        imprime(nome, profissao, idade);
    }
}
