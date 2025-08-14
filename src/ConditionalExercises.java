import java.util.Scanner;

public class ConditionalExercises {

    public static void main(String[] args) {

        //### **Ejercicio 1: Calculadora simple con validación de división**
        //
        //### **Instrucciones (10:08pm)**
        //
        //1. Pide al usuario dos números y una operación (`+`, , , `/`).
        //2. Usa un **`switch`** para decidir qué operación realizar.
        //3. Antes de dividir, usa un **`if-else`** para verificar que el divisor no sea 0.
        //4. No utilizar bucles (IMPORTANTE)

        System.out.println("=============================");
        System.out.println("Ejercicio 1");
        System.out.println("=============================");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble(); // -1

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble(); // 2

        System.out.print("Ingrese operación (+, -, *, /): ");
        char operacion = sc.next().charAt(0); // (-) Obtiene el primer carácter de lo que escribió el usuario con .charAt(0)

        double resultado = 0;
        boolean operacionValida = true; // flag para saber si una operacion es valida -1 - 2 = -3

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2; // -3
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) { // if-else para validar
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                operacionValida = false;
        }

        // if (true)
        if (operacionValida) {
            // -3
            String tipoResultado = (resultado >= 0) ? "Positivo" : "Negativo"; // ternario
            // String = Negativo
            System.out.println("Resultado: " + resultado + " (" + tipoResultado + ")");
        }

    }
}
