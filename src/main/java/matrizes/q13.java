package matrizes;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[10][10];

        // -1 = poltrona vazia
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                m[i][j] = -1;
            }
        }

        int n = s.nextInt();   // numero de tentativas de compra
        for(int k = 0; k < n; k++){
            int fila = s.nextInt();
            int poltrona = s.nextInt();

            // fila e poltrona comecam em 1, mas a matriz comeca em 0: usa -1
            if(m[fila-1][poltrona-1] == -1)
                m[fila-1][poltrona-1] = 1;
            else
                System.out.println("Poltrona ja foi vendida");
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
