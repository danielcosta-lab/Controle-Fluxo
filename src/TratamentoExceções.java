import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoExceções {
    public static void main(String[] args) {
      try { //estou definindo o bloco a ser testado para manipular algum erro

        //criando o objeto scanner
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      
      System.out.println("Digite seu nome: ");
      String nome = scanner.nextLine();

      System.out.println("Digite seu sobrenome: ");
      String sobrenome = scanner.nextLine();

      System.out.println("Digite sua idade: ");
      int idade = scanner.nextInt();

      System.out.println("Digite sua altura: ");
      double altura = scanner.nextDouble();
    

      //imprimindo os dados obtidos pelo usuario
      System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
      System.out.println("Tenho " + idade + " anos");
      System.out.println("Minha altura é " + altura + " cm ");

      scanner.close();

        }
        catch (InputMismatchException e){
            System.out.println("Idade precisa ser numerico");
        }
    }
}
