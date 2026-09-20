package vetores;

import java.util.Locale;
import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);   // aceita numero decimal com ponto (2.5)
        int n = 10;
        double []v = new double[n];
        double soma = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite o valor " + (i+1) + ": ");
            v[i] = s.nextDouble();
            soma += v[i];
        }

        // m = media do vetor
        double m = soma / n;

        // soma dos quadrados das diferencas: (v[i] - m)^2
        double somaQuadrados = 0;
        for(int i = 0; i < n; i++){
            somaQuadrados += Math.pow(v[i] - m, 2);
        }

        // desvio = raiz de ( 1/(n-1) * soma dos quadrados )
        double desvio = Math.sqrt(somaQuadrados / (n - 1));

        System.out.println("\nMedia: " + m);
        System.out.println("Desvio padrao: " + desvio);
    }
}
