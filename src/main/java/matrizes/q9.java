package matrizes;

import java.util.Random;

public class q9 {

    // devolve true se o numero ja esta em alguma posicao da cartela
    public static boolean existe(int[][] m, int num){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] == num)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[][] cartela = new int[5][5];

        // -1 marca posicao vazia (0 nao serve, pois 0 e um numero valido no bingo)
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                cartela[i][j] = -1;
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                int num;
                // sorteia de 0 a 99 ate sair um numero que ainda nao esta na cartela
                do{
                    num = r.nextInt(100);
                }while(existe(cartela, num));
                cartela[i][j] = num;
            }
        }

        System.out.println("====== cartela de bingo ========");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf("%4d", cartela[i][j]);
            }
            System.out.println();
        }
    }
}
