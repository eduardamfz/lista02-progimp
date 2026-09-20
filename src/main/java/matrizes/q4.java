package matrizes;

import java.util.Scanner;

public class q4 {

    // imprime a matriz
    public static void imprime(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.printf("%5d", m[i][j]);
            }
            System.out.println();
        }
    }

    // devolve a posicao do maior valor: pos[0] = linha e pos[1] = coluna
    public static int[] localizaMaior(int[][] m){
        int maior = m[0][0];
        int linha = 0;
        int coluna = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] > maior){
                    maior = m[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        int[] pos = {linha, coluna};
        return pos;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                m[i][j] = s.nextInt();
            }
        }

        System.out.println("\n====== matriz ========");
        imprime(m);

        int[] pos = localizaMaior(m);
        // soma 1 para mostrar do jeito humano (linha 1 = primeira linha)
        System.out.println("\nMaior valor: " + m[pos[0]][pos[1]]);
        System.out.println("Localizacao: linha " + (pos[0] + 1) + ", coluna " + (pos[1] + 1));
    }
}
