package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class q12 {

    public static void imprime(double[][] m){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.printf("%8.2f", m[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);   // aceita numero decimal com ponto (2.5)
        double[][] A = new double[2][2];
        double[][] B = new double[2][2];

        System.out.println("Matriz A:");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                A[i][j] = s.nextDouble();
            }
        }
        System.out.println("Matriz B:");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                B[i][j] = s.nextDouble();
            }
        }

        int opcao;
        do{
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Somar as matrizes");
            System.out.println("2 - Subtrair a primeira matriz da segunda (B - A)");
            System.out.println("3 - Adicionar uma constante as duas matrizes");
            System.out.println("4 - Imprimir as matrizes");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = s.nextInt();

            if(opcao == 1){
                // cria uma terceira matriz 2x2 para guardar o resultado
                double[][] C = new double[2][2];
                for(int i = 0; i < 2; i++){
                    for(int j = 0; j < 2; j++){
                        C[i][j] = A[i][j] + B[i][j];
                    }
                }
                System.out.println("\nA + B:");
                imprime(C);
            } else if(opcao == 2){
                double[][] C = new double[2][2];
                for(int i = 0; i < 2; i++){
                    for(int j = 0; j < 2; j++){
                        C[i][j] = B[i][j] - A[i][j];
                    }
                }
                System.out.println("\nB - A:");
                imprime(C);
            } else if(opcao == 3){
                System.out.print("Digite a constante: ");
                double k = s.nextDouble();
                // o resultado fica guardado na propria matriz
                for(int i = 0; i < 2; i++){
                    for(int j = 0; j < 2; j++){
                        A[i][j] += k;
                        B[i][j] += k;
                    }
                }
                System.out.println("Constante adicionada!");
            } else if(opcao == 4){
                System.out.println("\nMatriz A:");
                imprime(A);
                System.out.println("\nMatriz B:");
                imprime(B);
            } else if(opcao != 0){
                System.out.println("Opcao invalida!");
            }
        }while(opcao != 0);
    }
}
