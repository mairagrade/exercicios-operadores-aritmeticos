import java.util.Scanner;

public class ExercicioEstrutura02 {
    public static void main(String[] args) {
      //2. Crie um programa que recebe a idade de uma pessoa e verifica se ela é menor de idade (menor que 18 anos) ou maior de idade.
        
     Scanner scanner = new Scanner (System.in);
     int anoAtual = 2024;
    
    
     System.out.println("Informe sua idade: ");
     double idade = scanner.nextDouble() ;
      
    
     if (idade < 18 ) {
      System.out.println("você é MENOR de idade");
     }  else { 
      System.out.println("você é MAIOR de idade");

      scanner.close();
      

    }

    }
    
}
