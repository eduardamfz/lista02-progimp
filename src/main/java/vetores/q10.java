package vetores;

import java.util.Scanner;

public class q10 {

    // devolve true se o valor existe nas primeiras "tam" posicoes do vetor
    public static boolean existe(int[] v, int tam, int valor){
        for(int i = 0; i < tam; i++){
            if(v[i] == valor)
                return true;
        }
        return false;
    }

    // imprime so as primeiras "tam" posicoes (o resto do vetor e lixo/zeros)
    public static void imprime(String titulo, int[] v, int tam){
        System.out.print(titulo);
        for(int i = 0; i < tam; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []x = new int[5];
        int []y = new int[5];

        System.out.println("Vetor x:");
        for(int i = 0; i < 5; i++){
            x[i] = s.nextInt();
        }
        System.out.println("Vetor y:");
        for(int i = 0; i < 5; i++){
            y[i] = s.nextInt();
        }
        System.out.println();

        // a) soma e b) produto: mesma posicao de x e y
        int []soma = new int[5];
        int []produto = new int[5];
        for(int i = 0; i < 5; i++){
            soma[i] = x[i] + y[i];
            produto[i] = x[i] * y[i];
        }
        imprime("Soma: ", soma, 5);
        imprime("Produto: ", produto, 5);

        // c) diferenca: elementos de x que NAO existem em y
        int []dif = new int[5];
        int qtdDif = 0;
        for(int i = 0; i < 5; i++){
            if(!existe(y, 5, x[i])){
                dif[qtdDif] = x[i];
                qtdDif++;
            }
        }
        imprime("Diferenca: ", dif, qtdDif);

        // d) intersecao: elementos de x que TAMBEM existem em y
        int []inter = new int[5];
        int qtdInter = 0;
        for(int i = 0; i < 5; i++){
            if(existe(y, 5, x[i])){
                inter[qtdInter] = x[i];
                qtdInter++;
            }
        }
        imprime("Intersecao: ", inter, qtdInter);

        // e) uniao: todos de x + os de y que nao estao em x (maximo 10 posicoes)
        int []uniao = new int[10];
        int qtdUniao = 0;
        for(int i = 0; i < 5; i++){
            uniao[qtdUniao] = x[i];
            qtdUniao++;
        }
        for(int i = 0; i < 5; i++){
            if(!existe(x, 5, y[i])){
                uniao[qtdUniao] = y[i];
                qtdUniao++;
            }
        }
        imprime("Uniao: ", uniao, qtdUniao);
    }
}
