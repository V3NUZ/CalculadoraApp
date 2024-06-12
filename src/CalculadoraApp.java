import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("**** Aplicacion Calculadora ****");
        //Mostrar el menu
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                """);


        System.out.print("Proporciona el primero valor: ");
        var operando1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona el segundo valor: ");
        var operando2 = Integer.parseInt(consola.nextLine());

        var resultado = operando1 + operando2;
        System.out.println("El resultado es: " + resultado);

        System.out.println();
    }
}
