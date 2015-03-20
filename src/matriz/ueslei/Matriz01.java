package matriz.ueslei;

import java.util.Scanner;

public class Matriz01 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int n = 5; 
    int i, j;
    int a[][] = new int[n][n];
    int t[][] = new int[n][n]; 


    for (i=0; i<n; i++) {
      System.out.printf("Informe os elementos da %d a. linha:\n", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("a[%d][%d] = ", i, j);
        a[i][j] = entrada.nextInt();
      }
      System.out.printf("\n");
    }

    for (i=0; i<n; i++) {
      for (j=0; j<n; j++) {
        t[j][i] = a[i][j];
      }
    }

    System.out.printf("\nMatriz Original..\n");
    for (i=0; i<n; i++) {
      System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("%d ", a[i][j]);
      }
      System.out.printf("\n");
    }

    System.out.printf("\n\nMatriz Transposta\n");
    for (i=0; i<n; i++) {
      System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("%d ", t[i][j]);
      }
      System.out.printf("\n");
    }
  }
}
