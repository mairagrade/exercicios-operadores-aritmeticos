import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
      //Declare e inicialize uma variável do tipo String chamada name com seu próprio nome
     String name = "Maira";

      //Em seguida, imprima uma mensagem que diga "Olá, meu nome é [nome]"
     System.out.println("Olá, meu nome é " + name );
    
      //sequência declare outra variável, e através do da Classe Scanner, peço ao usuário para informar o sobrenome
     Scanner scanner = new Scanner(System.in);

     System.out.print("\nInforme seu sobrenome: ");
     String sobrenome = scanner.nextLine();  

      // e por fim imprima o nome completo.
     System.out.println(" Seu nome completo é: " + name + " "+ sobrenome );

     scanner.close();
     
}
    
}