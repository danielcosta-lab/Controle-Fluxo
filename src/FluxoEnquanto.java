// controle de fluxo usando while (enquanto)
// testa a condição antes que o codigo seja executado.

// estrutura do while

// while (expressão booleana de validação) {
    // comando que será executado ate que a validação se torne falsa.}

import java.util.concurrent.ThreadLocalRandom;

public class FluxoEnquanto {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio(); // indico que o valorDoce é pego aleatoriamente maior que 0.
            if (valorDoce > mesada)
                valorDoce = mesada; // especifico que quando o valorDoce for maior que a mesada, o mesmo tem que se igualar a mesada.
            
            System.out.println("Doce do valor = " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Gastou toda a mesada em doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
