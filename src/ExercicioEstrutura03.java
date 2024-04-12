import java.util.Scanner;

public class ExercicioEstrutura03 {
    public static void main(String[] args) {
        /* 
        Faça um programa que solicita ao usuário a temperatura em graus Celsius e converte
        para Fahrenheit, seguindo a fórmula: F = (C * 9/5) + 32. Certifique-se de que o
        programa imprime uma mensagem de alerta caso a temperatura em Celsius seja menor
        que -273.15 (zero absoluto).        
    
        */
        
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Informe a temperatura em graus C");
        double C = scanner.nextDouble();
 
        double F = (C * 9/5) + 32;
 
        double X = -275.15;
 
        if (C == X) {
            System.out.printf("ALERTA DE TEMPERATURA EM ZERO ABSOLUTO %.2f", F);
        } else {
            System.out.printf("A temperatura atual em Fahrenheit é %.2f ", F);
        }
 
        scanner.close();
        
    }
    
}
