package vetores;

public class q1 {
    public static void main(String[] args) {
        // a) cria o vetor A ja com os valores pedidos
        int []A = {1, 0, 5, -2, -5, 7};

        // b) soma das posicoes 0, 1 e 5 guardada em uma variavel simples
        int soma = A[0] + A[1] + A[5];
        System.out.println("Soma = " + soma);

        // c) modifica a posicao 4
        A[4] = 100;

        // d) mostra cada valor do vetor, um em cada linha
        for(int i = 0; i < 6; i++){
            System.out.println(A[i]);
        }
    }
}
