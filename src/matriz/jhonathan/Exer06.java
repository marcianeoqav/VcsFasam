package matriz.jhonathan;

import java.util.Scanner;

public class Exer06 {

    int quadro[][] = new int[10][10];
    String diagSecun = "";

    void preencheLista() {
        for (int linha = 0; linha <= 9; linha++) {
            for (int coluna = 0; coluna <= 9; coluna++) {
                System.out.print("Coloque os valores: ");
                Scanner valor = new Scanner(System.in);
                quadro[linha][coluna] = valor.nextInt();

                if (linha + coluna == 9) {
                    diagSecun = diagSecun + "|" + quadro[linha][coluna] + "|";
                }
                if (linha + coluna != 9) {
                    diagSecun = diagSecun + "|-|";
                }
                if (coluna == 9) {
                    diagSecun = diagSecun + "\n";
                }
            }
        }
    }

    void imprime() {
        System.out.println("Os valores da diagonal principal �: \n" + diagSecun);
    }

    public static void main(String[] args) {
        Exer06 nova = new Exer06();
        nova.preencheLista();
        nova.imprime();
    }
}
