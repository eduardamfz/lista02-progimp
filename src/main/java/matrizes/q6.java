package matrizes;

public class q6 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(i < j)
                    A[i][j] = 2*i + 7*j - 2;
                else if(i == j)
                    A[i][j] = 3*i*i - 1;
                else   // i > j
                    A[i][j] = 4*i*i*i - 5*j*j + 1;
            }
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.printf("%6d", A[i][j]);
            }
            System.out.println();
        }
    }
}
