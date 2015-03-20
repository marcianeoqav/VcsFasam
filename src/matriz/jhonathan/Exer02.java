package matriz.jhonathan;

import java.util.Scanner;

public class Exer02 {

    int quadro[][] = new int[10][10];
    String diag = "";

    void preencheLista() {
        for (int linha = 0; linha <= 9; linha++) {
            for (int coluna = 0; coluna <= 9; coluna++) {
                System.out.print("Coloque os valor:");
                Scanner valor = new Scanner(System.in);
                quadro[linha][coluna] = valor.nextInt();

                if (linha == coluna) {
                    diag = diag + "|" + quadro[linha][coluna] + "|";
                }
                if (linha != coluna) {
                    diag = diag + "|-|";
                }
                if (coluna == 9) {
                    diag = diag + "\n";
                }
            }
        }
    }

    void imprime() {
        System.out.println("Os valores da diagonal é �: \n" + diag + ".");
    }

    public static void main(String[] args) {
        Exer02 nova = new Exer02();
        nova.preencheLista();
        nova.imprime();
    }
}
