package vetores;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []v = new int[6];

        // le os 6 valores
        for(int i = 0; i < 6; i++){
            System.out.print("Digite o valor " + (i+1) + ": ");
            v[i] = s.nextInt();
        }

        // mostra os valores lidos
        System.out.println("\n====== valores lidos ========");
        for(int i = 0; i < 6; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
