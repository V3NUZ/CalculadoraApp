import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        while (true) {

            System.out.println("**** Aplicacion Calculadora ****");
            //Mostrar el menu
            mostrarMenu();

            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Operaciones
                if (operacion >= 1 && operacion <= 4) {
                    // Ejecutar la operacion
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) { // salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("OPERACION no valida: " + operacion);
                }
                //Imprimimos salto antes de repetir
                System.out.println();
            } // Fin Try
            catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            } // Fin Catch
        } // Fin While
    } // Fin Main

    private static void mostrarMenu() {
        System.out.println("""
                1 - Suma
                2 - Resta
                3 - Multiplicacion
                4 - Division
                5 - Salir
                """);
        System.out.print("Operacion a realizar: ");

    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.print("Proporciona el primero valor: ");
        double operando1 = Double.parseDouble(consola.nextLine());

        System.out.print("Proporciona el segundo valor: ");
        double operando2 = Double.parseDouble(consola.nextLine());

       double resultado = 0;

        switch (operacion) {
            case 1: { // Suma
                resultado = operando1 + operando2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            }
            case 2: { // Resta
                resultado = operando1 - operando2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            }
            case 3: { // Multiplicacion
                resultado = operando1 * operando2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            }
            case 4: { // Division
                resultado = operando1 / operando2;
                System.out.println("El resultado de la division es: " + resultado);
                break;
            }
        }
    }

} //Fin Class



