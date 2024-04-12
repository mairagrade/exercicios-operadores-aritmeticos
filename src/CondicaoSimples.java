import java.util.Scanner;

public class CondicaoSimples {
    public static void main(String[] args) {
     // Elaborar um programa de computador que leia
    // dois valores numéricos reais desconhecidos.
    // Em seguida, o programa deve efetuar a adição dos dois valores lidos
    // e apresentar o resultado somente se o mesmo for maior que 10.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe um número: ");
    double primeiroNumero = scanner.nextDouble();

    System.out.println("Informe outro número: ");
    double segundoNumero = scanner.nextDouble();

    double resultado = primeiroNumero + segundoNumero;

    // SE condicao(o resultado for maior que 10) 
    // Imprima o resultado
    if (resultado > 10) {
      System.out.println("O resultado é: " + resultado);
    }

    scanner.close();

    }
    
}
