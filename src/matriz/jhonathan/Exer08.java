package matriz.jhonathan;

import java.util.Scanner;

public class Exer08 {

    int quadro[][] = new int[10][10];
    String acimaDiagSecun = "";

    void preencheLista() {
        for (int linha = 0; linha <= 9; linha++) {
            for (int coluna = 0; coluna <= 9; coluna++) {
                System.out.print("Insira os valores: ");
                Scanner valor = new Scanner(System.in);
                quadro[linha][coluna] = valor.nextInt();

                if (linha + coluna == 8) {
                    acimaDiagSecun = acimaDiagSecun + "|" + quadro[linha][coluna] + "|";
                }
                if (linha + coluna != 8) {
                    acimaDiagSecun = acimaDiagSecun + "|-|";
                }
                if (coluna == 9) {
                    acimaDiagSecun = acimaDiagSecun + "\n";
                }
            }
        }
    }

    void imprime() {
        System.out.println("Os valores da diagonal principal �: \n" + acimaDiagSecun);
    }

    public static void main(String[] args) {
        Exer08 nova = new Exer08();
        nova.preencheLista();
        nova.imprime();
    }
}
