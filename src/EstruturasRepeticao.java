// laços ou repetições, representados por:
// for (para)
// while (enquanto)
// do while (faça enquanto)

public class EstruturasRepeticao {
    //estrutura for
    // for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
    //comando que será executado ate que a expressão de validação se torna falsa
    

   // public static void main(String[] args) throws Exception {
     //   for (int carneirinhos =1; carneirinhos <= 20; carneirinhos ++){
      //      System.out.println("Contando carneirinhos " + carneirinhos);
      //  }
    

    // for usado em arrays (vetores e matrizes)
    // vetores = variavel que armazena varias variaveis do mesmo tipo
    // metriz = vetor de vetores (conjunto de vetores)

    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        // em arrays o indice de elementos inicia em ZERO.
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
    }

    /* 
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (String aluno : alunos) { //usando de forma abreviada o for
            System.out.println("O nome do aluno é = " + aluno);
        }
    }
     */
}
