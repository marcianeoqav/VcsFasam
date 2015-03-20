package matriz.jhonathan;

import java.util.Scanner;

public class Exer03 {

    int quadro[][] = new int[10][10];
    String naoDiag = "";

    void preencheLista() {
        for (int linha = 0; linha <= 9; linha++) {
            for (int coluna = 0; coluna <= 9; coluna++) {
                System.out.print("Insira os valores: ");
                Scanner valor = new Scanner(System.in);
                quadro[linha][coluna] = valor.nextInt();

                if (linha == coluna) {
                    naoDiag = naoDiag + "|di|";
                }
                if (linha != coluna) {
                    naoDiag = naoDiag + "|" + quadro[linha][coluna] + "|";
                }
                if (coluna == 9) {
                    naoDiag = naoDiag + "\n";
                }
            }
        }
    }

    void imprime() {
        System.out.println("Os valores que N�O s�o da diagonal principal s�o: \n" + naoDiag);
    }

    public static void main(String[] args) {
        Exer03 nova = new Exer03();
        nova.preencheLista();
        nova.imprime();
    }
}
