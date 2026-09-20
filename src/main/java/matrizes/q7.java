package matrizes;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                m[i][j] = s.nextInt();
            }
        }

        int acima = 0;
        int abaixo = 0;
        int principal = 0;
        int secundaria = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i < j)
                    acima += m[i][j];        // acima da diagonal principal
                if(i > j)
                    abaixo += m[i][j];       // abaixo da diagonal principal
                if(i == j)
                    principal += m[i][j];    // diagonal principal
                if(i + j == 2)               // 2 = n - 1, com n = 3
                    secundaria += m[i][j];   // diagonal secundaria
            }
        }

        System.out.println("\nSoma acima da diagonal principal: " + acima);
        System.out.println("Soma abaixo da diagonal principal: " + abaixo);
        System.out.println("Soma da diagonal principal: " + principal);
        System.out.println("Soma da diagonal secundaria: " + secundaria);
    }
}
