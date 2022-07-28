// estrutura condicional composta

public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        int nota = 7;

        if (nota >= 7) //se a nota for maior ou igual a 7, o bloco abaixo ira executar 
            System.out.println("APROVADO");

        else if (nota >= 5 && nota < 7) // se não se a nota for menor ou igual a 5 e menor que 7, o bloco abaixo ira executar
            System.out.println("RECUPERAÇÃO");
            
        else // se não é maior ou igual a 7, o bloco abaixo ira executar
            System.out.println("REPROVADO");
         
        
    }
}