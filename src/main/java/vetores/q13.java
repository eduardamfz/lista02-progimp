package vetores;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Quantas linhas? ");
        int n = s.nextInt();

        // guarda a linha atual do triangulo (comeca com 1 na posicao 0)
        int []linha = new int[n];
        linha[0] = 1;

        for(int i = 0; i < n; i++){
            // cada numero = ele mesmo + o da esquerda (da linha anterior).
            // vai de tras para frente para nao sobrescrever o que ainda vai usar
            for(int j = i; j > 0; j--){
                linha[j] = linha[j] + linha[j-1];
            }

            // imprime a linha i (tem i+1 numeros)
            for(int j = 0; j <= i; j++){
                System.out.print(linha[j] + " ");
            }
            System.out.println();
        }
    }
}
