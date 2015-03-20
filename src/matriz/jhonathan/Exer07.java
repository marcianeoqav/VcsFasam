package matriz.jhonathan;

import java.util.Scanner;

public class Exer07 {

    int quadro[][] = new int[10][10];
    String diagSecun = "";

    void preencheLista() {
        for (int linha = 0; linha <= 9; linha++) {
            for (int coluna = 0; coluna <= 9; coluna++) {
                System.out.print("Insira os valores: ");
                Scanner valor = new Scanner(System.in);
                quadro[linha][coluna] = valor.nextInt();

                if (linha + coluna == 9) {
                    diagSecun = diagSecun + "|-|";
                }
                if (linha + coluna != 9) {
                    diagSecun = diagSecun + "|" + quadro[linha][coluna] + "|";
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
        Exer07 nova = new Exer07();
        nova.preencheLista();
        nova.imprime();
    }
}
