package vetores;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String []nomes = new String[20];
        int []idades = new int[20];
        int soma = 0;

        // le nome e idade de cada pessoa (nome sem espacos) e ja vai somando as idades
        for(int i = 0; i < 20; i++){
            System.out.print("Digite o nome e a idade da pessoa " + (i+1) + ": ");
            nomes[i] = s.next();
            idades[i] = s.nextInt();
            soma += idades[i];
        }

        // (double) evita que a divisao de inteiros jogue fora as casas decimais
        double media = (double) soma / 20;
        System.out.println("\nIdade media do grupo: " + media);

        System.out.println("====== acima da media ========");
        for(int i = 0; i < 20; i++){
            if(idades[i] > media)
                System.out.println(nomes[i]);
        }
    }
}
