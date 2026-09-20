package matrizes;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[3][3];
        int []somaColunas = new int[3];   // comeca com 0 em todas as posicoes

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                m[i][j] = s.nextInt();
            }
        }

        // a coluna j soma todas as linhas i daquela coluna
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 3; i++){
                somaColunas[j] += m[i][j];
            }
        }

        System.out.println("\n====== soma de cada coluna ========");
        for(int j = 0; j < 3; j++){
            System.out.print(somaColunas[j] + " ");
        }
        System.out.println();
    }
}
