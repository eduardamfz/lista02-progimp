package matrizes;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();   // quantidade de alunos

        String []nomes = new String[n];
        char [][]presenca = new char[n][30];   // uma linha por aluno, 30 dias de aula

        for(int i = 0; i < n; i++){
            nomes[i] = s.next();
            for(int d = 0; d < 30; d++){
                // le "P" ou "F" e guarda so o primeiro caractere
                presenca[i][d] = s.next().charAt(0);
            }
        }

        for(int i = 0; i < n; i++){
            int faltas = 0;
            for(int d = 0; d < 30; d++){
                if(presenca[i][d] == 'F')
                    faltas++;
            }

            // reprovado por falta: mais de 10 faltas
            if(faltas > 10){
                System.out.print(nomes[i] + " - dias: ");
                for(int d = 0; d < 30; d++){
                    if(presenca[i][d] == 'F')
                        System.out.print((d + 1) + " ");   // dia = posicao + 1
                }
                System.out.println();
            }
        }
    }
}
