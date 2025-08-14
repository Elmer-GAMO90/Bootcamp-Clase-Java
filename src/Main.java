import feature.Car;
import feature.Sucursales;

import java.util.Scanner;

// This is the main class. Esto es un comentario
// I am a single-line comment./* I am a multi-line comment. */
public class Main {

    // This is the main driver method.
    //Todo lo que esta en el main el compilador lo ejecuta, main es palabra reservada, es el punto de entrada de la aplicación
    //public static-Los métodos estáticos no requieren que se llamen objetos. Se pueden ejecutar utilizando el operador de puntos con el nombre de la clase.
    //void- No devuelve ningún valor. Es un vacío vacío
    //main()- Nombre del método. El método del punto de entrada es donde JVM ejecuta el programa.
    //(String[ ] args)- Estos se utilizan como argumentos de línea de comandos y se pasan como cadenas.
    //System.out.println- Este comando imprime el contenido proporcionado dentro de la declaración de impresión.
    public static void main(String[] args) {
// This is the standard print statement
        System.out.println("Welcome to Código Tecsup");

        //Este objeta es una instancia de la clase Car
        Car lamborghini = new Car();
        lamborghini.acelerate();
        lamborghini.stop();

        Car nissan = new Car("Negro", "Nisaan", "Wingroud");
        nissan.acelerate();
        nissan.stop();

        Sucursales america = new Sucursales();
        america.origenSucursal();
        america.nombreGerente();

        //Datos primitivos (ya definidos)
        int numero = 1500;
        int numero2 = 200;
        double numerodecimal = 200.50;

        boolean esMayorDeEdad = false;
        char variableChar = 'A';

        double result = numero2 + numerodecimal;

        //Datos no primitivos (su tamaño no esta definido)
        String name = "Andrew";
        String[] arreglo = new String[5];
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Lamborghini"};


        //Casting
        //Declaracion de variable
        String s = "1000";

        //Convertir a int usando integer.parseInt
        int i = Integer.parseInt(s);
        long l = Long.parseLong(s);

        //Imprimir valor de i
        System.out.println(i);

        //Calculadora
        Scanner scanner = new Scanner(System.in); //Solo se define una sola vez

        /*System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");*/

        //Calculadora
        System.out.println("Ingresa el primer número");
        int primerNumero = scanner.nextInt();

        System.out.println("Ingresa el segundo número");
        int segundoNumero = scanner.nextInt();

        int sumar = primerNumero + segundoNumero;
        int restar = primerNumero - segundoNumero;
        int multiplicar = primerNumero * segundoNumero;
        double dividir = (double)primerNumero / (double)segundoNumero;
        System.out.println("La suma de: " + primerNumero + " + " + segundoNumero + " es " + sumar);
        System.out.println("La resta de: " + primerNumero + " - " + segundoNumero + " es " + restar);
        System.out.println("La multiplicación de: " + primerNumero + " * " + segundoNumero + " es " + multiplicar);
        System.out.println("La división de: " + primerNumero + " / " + segundoNumero + " es " + dividir);


        //1. Pide al usuario dos números y una operación (`+`, , , `/`).
        //2. Usa un **`switch`** para decidir qué operación realizar.
        //3. Antes de dividir, usa un **`if-else`** para verificar que el divisor no sea 0.
        //4. Usa el **operador ternario** para mostrar si el resultado es positivo o negativo.
        //5. No utilizar bucles (IMPORTANTE)
        int number1 = 10;
        int number2 = 5;
        int operacion = 3;
        double resultado;
        switch (operacion){
            case 1:
                resultado = number1 + number2;
                System.out.println(resultado);
                break;
            case 2:
                resultado = number1 - number2;
                System.out.println(resultado);
                break;
            case 3:
                if (number2 == 0){
                    System.out.println("No puede dividor entre 0");
                }else {
                    resultado = number1 / number2;
                    System.out.println(resultado);
                }
                break;
            case 4:
                resultado = number1 * number2;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Datos invalidos");


        }
        scanner.close(); // Es importante cerrar el scanner





        



    }
}

