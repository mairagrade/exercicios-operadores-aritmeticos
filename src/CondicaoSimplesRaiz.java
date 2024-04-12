import java.util.Scanner;

public class CondicaoSimplesRaiz {
    public static void main(String[] args) {
           //
    /*
     * impossível extrair “raiz quadrada de número negativo”.
     * 
     * Ler um valor numérico real qualquer (variável N).
     * Verificar se o valor fornecido é não negativo e
     * proceder da seguinte forma:
     * Apresentar o resultado do cálculo da raiz (variável R).
     * Encerrar o programa.
     */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe um número");
    double numero = scanner.nextDouble();

    // SE O VALOR DA VARIAVEL NUMERO É MAIOR MAIOR QUE 0
    if (numero > 0) {
      // sqrt = square root ou raíz quadrada
      double resultado = Math.sqrt(numero);
      System.out.println("A raíz quadrada de " + numero + " é: " + resultado);
    }

    scanner.close();
    }
    
}
