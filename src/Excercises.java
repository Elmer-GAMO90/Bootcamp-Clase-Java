import java.util.Scanner;

public class Excercises {
    public static void main(String[] args) {
        //**Conversor de monedas**
        //1. El conversor de monedas debe tener 4 opciones para transformar soles a dólares, euros, yenes y rublos
        //2. Tienen que validar que la opción sea un numero (Importante) (Investigación)
        //3. Tienen que tomar en cuenta los decimales
        //4. Tener un buen formato
        //5. El menu debe ser interactivo
        //6. El menu debe tener una calculadora incorporada como opción extra., tomar en cuenta los decimales
        //EL menu debe tener una calculadora incorporada
        //Dentro del menú debe haber otro submenu,
        //Tomar en cuenta arreglos, switch, condicionales, while loops y todo lo que hemos visto

        System.out.println("=====BIENVENIDO=====");

        Scanner sc = new Scanner(System.in);

        boolean opcionValida = true;
        double montoIngresado;
        double totalConvertido = 0;
        double number1;
        double number2;
        char operacionArit;

        while (opcionValida){
            int opcionModulo = leerEntero(sc, """
                    Elija el módulo a usar
                    1.- Conversor de monedas
                    2.- Calculadora:
                    3.- Salir del módulo: """);

            if (opcionModulo == 1){
                int tipoMoneda = leerEntero(sc, """
                        Convertir dólares a:
                        1.- Moneda en Soles: (3.56)
                        2.- Moneda en Euros: (0.85)
                        3.- Moneda en Yenes: (147.20)
                        4.- Moneda en Rublos: (79.45)
                        """);

                montoIngresado = leerDouble(sc, "Ingrese el monto:");

                switch (tipoMoneda){
                    case 1:
                        totalConvertido = montoIngresado * 3.56;
                        break;
                    case 2:
                        totalConvertido = montoIngresado * 0.85;
                        break;
                    case 3:
                        totalConvertido = montoIngresado * 147.20;
                        break;
                    case 4:
                        totalConvertido = montoIngresado * 79.45;
                        break;
                    default:
                        System.out.println("Opción invalida");
                        break;
                }
                System.out.println("Total convertido: " + totalConvertido);
            } else if (opcionModulo == 2) {
                System.out.print("Ingrese el primer número:");
                number1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número:");
                number2 = sc.nextDouble();
                System.out.println("Elija la operación (+, -, *, /)");
                operacionArit = sc.next().charAt(0);
                switch (operacionArit){
                    case '+':
                        totalConvertido = number1 + number2;
                        break;
                    case '-':
                        totalConvertido = number1 - number2;
                        break;
                    case '*':
                        totalConvertido = number1 * number2;
                        break;
                    case '/':
                        totalConvertido = number1 / number2;
                        break;
                    default:
                        System.out.println("Opción invalida");;
                        break;
                }
                System.out.println("El resultado es: " + totalConvertido);
            } else if (opcionModulo == 3) {
                System.out.println("Gracias, hasta pronto....");
                opcionValida = false;
            }
        }
    }
    // Método para validar enteros
    public static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("⚠️ Error: ingrese un número entero válido.");
                sc.next();
            }
        }
    }

    public static double leerDouble(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println("⚠️ Error: ingrese un número válido.");
                sc.next();
            }
        }
    }
}
