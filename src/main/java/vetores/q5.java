package vetores;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []v = new int[20];

        for(int i = 0; i < 20; i++){
            System.out.print("Digite o numero " + (i+1) + ": ");
            v[i] = s.nextInt();
        }

        // primeiro: elementos cujo CONTEUDO e impar
        // (usa != 0 porque o resto de um impar negativo e -1, nao 1)
        System.out.println("\n====== conteudo impar ========");
        for(int i = 0; i < 20; i++){
            if(v[i] % 2 != 0)
                System.out.print(v[i] + " ");
        }

        // depois: elementos que estao em POSICOES pares (0, 2, 4...)
        System.out.println("\n======= posicao par ========");
        for(int i = 0; i < 20; i++){
            if(i % 2 == 0)
                System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
