package matrizes;

import java.util.Scanner;

public class q5 {

    // procura x na matriz e devolve {linha, coluna} da primeira vez que achar.
    // se nao achar, devolve {-1, -1}
    public static int[] busca(int[][] m, int x){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] == x){
                    int[] pos = {i, j};
                    return pos;   // achou: sai da funcao na hora
                }
            }
        }
        int[] naoAchou = {-1, -1};
        return naoAchou;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[5][5];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                m[i][j] = s.nextInt();
            }
        }

        System.out.print("\nQual valor deseja procurar? ");
        int x = s.nextInt();

        int[] pos = busca(m, x);
        if(pos[0] == -1)
            System.out.println("Valor nao encontrado");
        else
            System.out.println("Encontrado na linha " + (pos[0] + 1) + ", coluna " + (pos[1] + 1));
    }
}
