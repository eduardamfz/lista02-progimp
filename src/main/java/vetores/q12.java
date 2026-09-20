package vetores;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []v = new int[10];

        for(int i = 0; i < 10; i++){
            int num;
            boolean repetido;

            // repete ate o usuario digitar um numero que ainda nao esta no vetor
            do{
                System.out.print("Digite o numero " + (i+1) + ": ");
                num = s.nextInt();

                // procura o numero so entre os que ja foram guardados (0 ate i-1)
                repetido = false;
                for(int j = 0; j < i; j++){
                    if(v[j] == num)
                        repetido = true;
                }

                if(repetido)
                    System.out.println("Numero repetido! Digite outro.");
            }while(repetido);

            v[i] = num;
        }

        System.out.println("\n====== vetor final ========");
        for(int i = 0; i < 10; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
