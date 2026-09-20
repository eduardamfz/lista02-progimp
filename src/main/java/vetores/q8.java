package vetores;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []A = new int[10];
        int []B = new int[10];
        int []C = new int[10];

        System.out.println("Vetor A:");
        for(int i = 0; i < 10; i++){
            A[i] = s.nextInt();
        }
        System.out.println("Vetor B:");
        for(int i = 0; i < 10; i++){
            B[i] = s.nextInt();
        }

        // posicao par pega do primeiro vetor, posicao impar pega do segundo
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0)
                C[i] = A[i];
            else
                C[i] = B[i];
        }

        System.out.println("\n====== vetor resultante ========");
        for(int i = 0; i < 10; i++){
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}
