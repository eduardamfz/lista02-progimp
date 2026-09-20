package vetores;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []A = new int[20];
        int []B = new int[20];
        int []C = new int[40];   // o terceiro vetor tem 20 + 20 = 40 posicoes

        System.out.println("Vetor A:");
        for(int i = 0; i < 20; i++){
            A[i] = s.nextInt();
        }
        System.out.println("Vetor B:");
        for(int i = 0; i < 20; i++){
            B[i] = s.nextInt();
        }

        // intercala: A[0], B[0], A[1], B[1], ...
        for(int i = 0; i < 20; i++){
            C[2*i] = A[i];       // posicoes pares recebem A
            C[2*i + 1] = B[i];   // posicoes impares recebem B
        }

        System.out.println("\n====== vetor intercalado ========");
        for(int i = 0; i < 40; i++){
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}
