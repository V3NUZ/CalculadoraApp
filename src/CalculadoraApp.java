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
        System.out.printf("Operacion a realizar: ");
        var operacion = Integer.parseInt(consola.nextLine());

        //Operaciones
        if (operacion >= 1 && operacion <= 4) {
            System.out.print("Proporciona el primero valor: ");
            var operando1 = Integer.parseInt(consola.nextLine());

            System.out.print("Proporciona el segundo valor: ");
            var operando2 = Integer.parseInt(consola.nextLine());

            int resultado;
            switch (operacion){
                case 1:
                    resultado = operando1 + operando2;
                    System.out.println("El resultado de la suma es: " + resultado);
                case 2:
                    resultado = operando1 - operando2;
                    System.out.println("El resultado de la resta es: " + resultado);
                case 3:
                    resultado = operando1 * operando2;
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                case 4:
                    resultado = operando1 / operando2;
                    System.out.println("El resultado de la division es: " + resultado);
            }
        }
    }
}
