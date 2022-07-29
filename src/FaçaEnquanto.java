// uso do laço de repetição Do While (faça enquanto)
// mesmo que a condição seja invalida, ira executar pelo menos uma vez.

import java.util.Random;

public class FaçaEnquanto {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            //executando ate que alguem atenda 
            System.out.println("Telefone tocando");
        } 
        while (tocando());
            System.out.println("Alo !!!");

    }    
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);

        return atendeu;
    }
}
