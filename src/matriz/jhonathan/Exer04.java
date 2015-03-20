package matriz.jhonathan;

import java.util.Scanner;

public class Exer04 {

    int quadro[][] = new int[10][10];
    String acimaDiag = "";

    void preencheLista() {
        for (int linha = 0; linha <= 9; linha++) {
            for (int coluna = 0; coluna <= 9; coluna++) {
                System.out.print("Coloque os valores: ");
                Scanner valor = new Scanner(System.in);
                quadro[linha][coluna] = valor.nextInt();

                if (linha + 1 == coluna) {
                    acimaDiag = acimaDiag + "|" + quadro[linha][coluna] + "|";
                }
                if (linha + 1 != coluna) {
                    acimaDiag = acimaDiag + "|-|";
                }
                if (coluna == 9) {
                    acimaDiag = acimaDiag + "\n";
                }
            }
        }
    }

    void imprime() {
        System.out.println("Os valores da diagonal principal �: \n" + acimaDiag);
    }

    public static void main(String[] args) {
        Exer04 nova = new Exer04();
        nova.preencheLista();
        nova.imprime();
    }
}
