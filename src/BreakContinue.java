// estrutura de repetição usando break e continue
// break =  quebrar, parar, interromper
// continue =  continua o laço interrompido

public class BreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero ++) {
            if (numero == 3)
                // break; // interrompi o fluxo, se identica que é igual a 3.
                continue; // se identifica que é igual a 3, segue o fluxo pulando o 3.

            
            System.out.println(numero);
        }
    }
    
}
