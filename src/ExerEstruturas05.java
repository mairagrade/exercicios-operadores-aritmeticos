import java.util.Scanner;

public class ExerEstruturas05 {
    public static void main(String[] args) {
         //5. Escreva um programa que recebe três números do usuário e imprime o maior deles.
 
      Scanner scanner   =  new Scanner(System.in);
 
      System.out.println("Informe um número: ");
      double primeiroNumero = scanner.nextDouble();
  
      System.out.println("Informe outro número: ");
      double segundoNumero  = scanner.nextDouble();

      System.out.println("Informe outro número: ");
      double terceiroNumero  = scanner.nextDouble();
  
  
     // se o primeiro numero é maior que o segundo e maior que o terceiro
     if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
       System.out.println("O primeiro número é o maior");
     } else {
       if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
         System.out.println("O segudno número é o maior");
       } else {
         if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
           System.out.println("O terceiro número é o maior");
         }
       }
     }
    
    
     // se o segundo numero é maior que o primeiro e o terceiro
     // se o terceiro numero é maior que o primeiro e o segundo
    }
    
}
