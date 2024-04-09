import java.util.Scanner;
import java.util.stream.IntStream.IntMapMultiConsumer;

public class CalculoImc {
    public static void main(String[] args) {
        //ENTRADA 
        Scanner scanner = new Scanner(System.in);


        //1- pedir para o ususario o seu peso
        System.out.println("Informe o seu peso em quilogramas: ");
        double peso = scanner.nextDouble();


        //2- pedir para o usuario a sua altura em metros 
        System.out.println("Informe sua altura em metros: ");
        double altura = scanner.nextDouble();
        

        //PROCESSAMENTO
        //3- calcular o IMC
        double imc = peso / (altura * altura);


        //SAÍDA
        //4- imprime o resultado do IMC
        System.out.println("Seu imc é: "+ imc);
        
        scanner.close();

        
    }
}
