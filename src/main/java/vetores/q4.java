package vetores;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String []nomes = new String[15];

        for(int i = 0; i < 15; i++){
            System.out.print("Digite o nome " + (i+1) + ": ");
            nomes[i] = s.nextLine();
        }

        // percorre de tras para frente: da posicao 14 ate a 0
        System.out.println("\n====== ordem contraria ========");
        for(int i = 14; i >= 0; i--){
            System.out.println(nomes[i]);
        }
    }
}
