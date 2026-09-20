package matrizes;

public class q3 {
    public static void main(String[] args) {
        int[][] m = new int[4][4];

        // cada elemento = numero da linha * numero da coluna
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                m[i][j] = i * j;
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("%4d", m[i][j]);   // cada numero ocupa 4 espacos
            }
            System.out.println();
        }
    }
}
