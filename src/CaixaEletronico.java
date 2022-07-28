// estrutura condicional simples

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo) // se o valor solicitador for menor que o saldo o bloco abaixo sera executado
            saldo = saldo - valorSolicitado;

            // se o valor solicitador for maior que o saldo nada sera executado
            // apenas sera executado a condição que foi aplicada

        System.out.println(saldo);

    }
}
