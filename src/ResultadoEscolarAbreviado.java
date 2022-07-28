public class ResultadoEscolarAbreviado {
    public static void main(String[] args) throws Exception {
        int nota = 7;

        String resultado = nota >= 7 ? "APROVADO" : nota >=5 && nota < 7 ? "RECUPERAÇÃO" : "REPROVADO";
            // usamos uma variavel string com a condição ? (se) e : (senão), abreviando o if e else
        System.out.println(resultado);
    }
    
}