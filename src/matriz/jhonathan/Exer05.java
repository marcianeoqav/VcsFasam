package matriz.jhonathan;

import java.util.Scanner;

public class Exer05 {

    int quadro[][] = new int[10][10];
    String diagonal = "";
    String abaixoDiag = "";

    void preencheLista() {
        for (int linha = 0; linha <= 9; linha++) {
            for (int coluna = 0; coluna <= 9; coluna++) {
                System.out.print("Coloque os valores: ");
                Scanner valor = new Scanner(System.in);
                quadro[linha][coluna] = valor.nextInt();

                if (linha == coluna) {
                    abaixoDiag = abaixoDiag + "|di|";
                }
                if (linha - 1 == coluna) {
                    abaixoDiag = abaixoDiag + "|" + quadro[linha][coluna] + "|";
                }
                if (linha - 1 != coluna && linha != coluna) {
                    abaixoDiag = abaixoDiag + "|-|";
                }
                if (coluna == 9) {
                    abaixoDiag = abaixoDiag + "\n";
                }
            }
        }
    }

    void imprime() {
        System.out.println("Os valores da diagonal principal �: \n" + abaixoDiag);
    }

    public static void main(String[] args) {
        Exer05 nova = new Exer05();
        nova.preencheLista();
        nova.imprime();
    }
}
