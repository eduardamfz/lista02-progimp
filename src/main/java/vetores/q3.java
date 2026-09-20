package vetores;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []v = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.print("Digite o valor " + (i+1) + ": ");
            v[i] = s.nextInt();
        }

        // imprime so os elementos cujo CONTEUDO e par
        System.out.println("\n====== conteudo par ========");
        for(int i = 0; i < 10; i++){
            if(v[i] % 2 == 0)
                System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
