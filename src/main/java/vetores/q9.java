package vetores;

public class q9 {
    public static void main(String[] args) {
        int []v = new int[100];
        int cont = 0;   // quantos numeros ja foram guardados no vetor
        int n = 1;      // proximo natural a ser testado

        // continua ate o vetor ficar cheio (100 numeros)
        while(cont < 100){
            // guarda se NAO e multiplo de 7 OU se termina com 7
            if(n % 7 != 0 || n % 10 == 7){
                v[cont] = n;
                cont++;
            }
            n++;
        }

        // imprime 10 numeros por linha
        for(int i = 0; i < 100; i++){
            System.out.print(v[i] + " ");
            if((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}
