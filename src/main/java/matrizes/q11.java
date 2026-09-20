package matrizes;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 5 alunos (linhas) x 4 informacoes (colunas):
        // coluna 0 = matricula | 1 = media das provas | 2 = media dos trabalhos | 3 = nota final
        int[][] alunos = new int[5][4];

        for(int i = 0; i < 5; i++){
            System.out.println("Aluno " + (i+1));
            System.out.print("Matricula: ");
            alunos[i][0] = s.nextInt();
            System.out.print("Media das provas: ");
            alunos[i][1] = s.nextInt();
            System.out.print("Media dos trabalhos: ");
            alunos[i][2] = s.nextInt();

            // nota final = media das provas + media dos trabalhos
            alunos[i][3] = alunos[i][1] + alunos[i][2];
        }

        int posMaior = 0;     // linha do aluno com a maior nota final
        int somaNotas = 0;
        for(int i = 0; i < 5; i++){
            if(alunos[i][3] > alunos[posMaior][3])
                posMaior = i;
            somaNotas += alunos[i][3];
        }

        double media = (double) somaNotas / 5;

        System.out.println("\nMatricula do aluno com maior nota final: " + alunos[posMaior][0]);
        System.out.println("Media aritmetica das notas finais: " + media);
    }
}
