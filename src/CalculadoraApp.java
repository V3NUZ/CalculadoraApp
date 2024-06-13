import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        while (true) {

            System.out.println("**** Aplicacion Calculadora ****");
            //Mostrar el menu
            System.out.println("""
                    1 - Suma
                    2 - Resta
                    3 - Multiplicacion
                    4 - Division
                    5 - Salir
                    """);
            System.out.print("Operacion a realizar: ");

            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Operaciones
                if (operacion >= 1 && operacion <= 4) {
                    System.out.print("Proporciona el primero valor: ");
                    var operando1 = Integer.parseInt(consola.nextLine());

                    System.out.print("Proporciona el segundo valor: ");
                    var operando2 = Integer.parseInt(consola.nextLine());

                    int resultado = 0;

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
} //Fin Class



