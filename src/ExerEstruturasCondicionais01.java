import java.util.Scanner;

public class ExerEstruturasCondicionais01 {
    public static void main(String[] args) {
      //1. Escreva um programa que recebe o ano de nascimento de uma pessoa e verifica se é maior de idade ou não (considerando que a maioridade seja aos 18 anos).
      
      Scanner scanner = new Scanner (System.in);

      System.out.println("Informe seu ano de nascimento: ");
      double anoNascimento = scanner.nextDouble() ;
        
      int anoAtual = 2024;

      double resultado = anoAtual - anoNascimento;

      if (resultado < 18 ) {
        System.out.println("você é MENOR de idade");
      }  else { 
        System.out.println("você é MAIOR de idade");
      }

     scanner.close();
     
    }
    
}
