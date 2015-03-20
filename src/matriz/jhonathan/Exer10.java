package matriz.jhonathan;

import java.util.Scanner;

public class Exer10 {

    int quadro[][] = new int[6][5];
    String produtoDoVendedor = "";
    int aux;
    int somaL = 0;
    int somaC = 0;
    String totalC;
    int i = 0;

    void preenche() {
        for (int linha = 0; linha <= 4; linha++) {
            for (int coluna = 0; coluna <= 3; coluna++) {
                System.out.print("Qunato o vendendor " + (coluna + 1) + " vendeu do produto " + (linha + 1) + "? R$");
                Scanner valor = new Scanner(System.in);
                aux = valor.nextInt();
                quadro[linha][coluna] = aux;
                produtoDoVendedor = produtoDoVendedor + " " + quadro[linha][coluna];
                somaL = somaL + aux;

                if (coluna == 3) {
                    produtoDoVendedor = produtoDoVendedor + " " + somaL;
                    produtoDoVendedor = produtoDoVendedor + "\n";
                    somaL = 0;
                }
                if (linha == 4 && coluna == i) {
                    somaC = somaC + aux;
                    totalC = somaC + " " + somaC;
                    somaC = 0;
                }
            }
            i++;
            /*if(linha == 5){
            somaColuna = matriz[5][coluna];
            }*/
        }
    }

    void imprime() {
        System.out.println("Total vendido: \n" + produtoDoVendedor + "\n" + totalC);
    }

    public static void main(String[] args) {
        Exer10 nova = new Exer10();
        nova.preenche();
        nova.imprime();
    }
}
