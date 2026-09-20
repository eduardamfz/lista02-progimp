package matrizes;

import java.util.Random;

public class q8 {

    public static void imprime(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.printf("%4d", m[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[][] m = new int[4][4];

        // nextInt(20) sorteia de 0 a 19, entao soma 1 para ficar de 1 a 20
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                m[i][j] = r.nextInt(20) + 1;
            }
        }

        System.out.println("====== matriz original ========");
        imprime(m);

        // triangular inferior: zera tudo que esta ACIMA da diagonal principal (i < j)
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i < j)
                    m[i][j] = 0;
            }
        }

        System.out.println("\n====== matriz triangular inferior ========");
        imprime(m);
    }
}
