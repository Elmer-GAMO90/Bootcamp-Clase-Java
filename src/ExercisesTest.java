import java.util.Scanner;

public class ExercisesTest {

    public static void main(String[] args) {

        //### **Ejercicio 1: Calculadora simple con validación de división**
        //1. Pide al usuario dos números y una operación (`+`, , , `/`).
        //2. Usa un **`switch`** para decidir qué operación realizar.
        //3. Antes de dividir, usa un **`if-else`** para verificar que el divisor no sea 0.
        //4. No utilizar bucles (IMPORTANTE)
        //5. Validar si el resultado es positivo o negativo

        System.out.println("EJERCICIO: Hacer una calculadora");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número...");
        double number1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número...");
        double number2 = sc.nextDouble();

        System.out.print("Ingrese la operacion (+, -, *, /, )...");
        char operacion = sc.next().charAt(0); //Obtiene el primer carácter de lo que escribió el usuario con .charAt(0)

        double resultado = 0;
        //Validar la operación
        boolean validarOperacion = true; //flag para saber si una operacion es valida

        switch (operacion) {
            case '+':
                resultado = number1 + number2;
                break;
            case '-':
                resultado = number1 - number2;
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Error: División entre cero no permitida: ");
                    validarOperacion = false;
                } else {
                    resultado = number1 / number2;
                }
                break;
            case '*':
                resultado = number1 * number2;
                break;
            default:
                System.out.println("Operación invalida");
                validarOperacion = false;
                break;
        }
        //Validad la operación
        if (validarOperacion) {
            String tipoResultado = (resultado >= 0) ? "Positivo" : "Negativo";
            System.out.println("Resultado: " + resultado + " (" + tipoResultado + ")");
        }

        // Calculadora de descuento con evaluacion de cliente
        // Calcula el precio final con descuento.
        // - Determina si el cliente es VIP o Normal usando ternario.
        // - Muestra mensajes diferentes según el precio final usando if-else.
        // Si es Vip el descuento debe ser del 20% si es descuento normal debe ser 5%
        // Mostrar el precio final con el descuento aplicado

        System.out.println("=============================");
        System.out.println("Calculadora de descuento con evaluación de cliente");

        System.out.println("Usted es cliente VIP (true / false):");
        boolean esVip = sc.nextBoolean();

        System.out.println("Ingrese precio original:");
        double precioOriginal = sc.nextDouble();

        int dsctoVip = 20;
        int dsctoNormal = 5;

        // Usar el operador ternario para elegir cual descuento vamos a usar
        int dsctoAplicado = esVip ? dsctoVip : dsctoNormal;

        // Calcular el precio original
        double precioFinal = precioOriginal - (precioOriginal * dsctoAplicado / 100);

        // Mostrar si el cliente es vip o es normal
        String tipoCliente = esVip ? "Cliente VIP" : "Cliente Normal";

        System.out.println("Tipo de Cliente; " + tipoCliente);
        System.out.println("Precio original $: " + precioOriginal);
        System.out.println("Descuento aplicado: " + dsctoAplicado + "%");
        System.out.println("Precio final: $" + precioFinal);

        // Si el precio final es mayor a 100 muestrame un mensaje, 50 otro mensaje y el default solo un mensaje de bienvenida
        if (precioFinal >= 100) {
            System.out.println("Gracias por la gran compra");
        } else if (precioFinal >= 50) {
            System.out.println("Gracias por su compra");
        } else {
            System.out.println("Bienvenido...");
        }


        //1. Pide al usuario un monto en dólares.
        //2. Muestra un menú con las opciones de conversión:
        //    - `1` → Euros
        //    - `2` → Pesos Mexicanos
        //    - `3` → Yenes Japoneses
        //3. Usa **`switch`** para aplicar la tasa de conversión correspondiente.
        //4. Usa **`if-else`** para validar que el monto sea positivo.
        //5. Usa **operador ternario** para clasificar el monto convertido como “Bajo” (menos de 1000 en la moneda destino) o “Alto” (1000 o más).

        System.out.println("============================");
        System.out.println("Conversor de monedas:");

        System.out.println("Ingrese monto en Dolares");
        double montoDolares = sc.nextDouble();

        int opcionTipoMoneda;
        if (montoDolares == 0) {
            System.out.println("El monto debe ser mayor a cero");
        } else {
            System.out.println("Selecciona el tipo de moneda a convertir");
            System.out.println("1 = Euros"); //0.86
            System.out.println("2 = Pesos mexicanos"); //18.58
            System.out.println("3 = Soles"); //3.54
            opcionTipoMoneda = sc.nextInt();

            double montoConvertido = 0;
            boolean opcionValida = true;

            switch (opcionTipoMoneda){
                case 1:
                    montoConvertido = montoDolares * 0.86;
                    break;
                case 2:
                    montoConvertido = montoDolares * 18.58;
                    break;
                case 3:
                    montoConvertido = montoDolares * 3.54;
                    break;
                default:
                    System.out.println("Opción inválida");;
                    opcionValida = false;
                    break;
            }

            if (opcionValida){
                String clasificarMontoConvertido = (montoConvertido >= 1000 ? "Alto" : "Bajo");
                System.out.println("Total monto: " + montoConvertido + " (" + clasificarMontoConvertido + ")");
            }
        }
    }
}
