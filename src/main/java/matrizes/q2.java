package matrizes;

public class q2 {
    public static void main(String[] args) {
        int[][] m = new int[5][5];

        // diagonal principal (i == j) recebe 1, o resto recebe 0
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i == j)
                    m[i][j] = 1;
                else
                    m[i][j] = 0;
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
