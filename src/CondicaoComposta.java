import java.util.Scanner;

public class CondicaoComposta {
    public static void main(String[] args) {
        /**
     * Elaborar um programa de computador que
     * leia dois valores numéricos reais desconhecidos.
     * Depois, o programa deve efetuar a adição dos
     * dois valores lidos e, caso seja o resultado da soma
     * obtido maior ou igual a 10, deve ser, em seguida,
     * somado ao resultado obtido o valor 5, obtendo-se novo resultado.
     * Caso contrário, o valor do resultado
     * obtido deve ser subtraído com 7, gerando-se, assim, um novo resultado.
     * Após a obtenção de um dos novos resultados,
     * o novo resultado deve ser apresentado.
     */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe um número: ");
    double primeiroNumero = scanner.nextDouble();

    System.out.println("Informe outro número: ");
    double segundoNumero = scanner.nextDouble();

    double resultado = primeiroNumero + segundoNumero;

    // Se o resultado for maior ou igual a 10 deve somar 5 ao resultado
    // Senão deve ser subtraido 7 do resultado
    // Imprimir o resultado
    // resultado > 10 || resultado == 10
    if (resultado >= 10) {
      resultado = resultado + 5;
    } else {// senão
      resultado = resultado - 7;
    }

    System.out.println("O resultado é: " + resultado);
    scanner.close();
    
        
    }
    
}
