package matrizes;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[4][4];
        int cont = 0;   // quantos valores maiores que 10

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                m[i][j] = s.nextInt();
                if(m[i][j] > 10)
                    cont++;
            }
        }

        System.out.println("\nValores maiores que 10: " + cont);
    }
}
