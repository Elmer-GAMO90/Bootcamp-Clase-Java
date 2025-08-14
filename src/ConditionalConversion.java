import java.util.Scanner;

public class ConditionalConversion {

    public static void main(String[] args) {

        //1. Pide al usuario un monto en dólares.
        //2. Muestra un menú con las opciones de conversión:
        //1` → Euros
                // `2` → Pesos Mexicanos
        // `3` → Yenes Japoneses
        //. Usa **`switch`** para aplicar la tasa de conversión correspondiente.
        //. Usa **`if-else`** para validar que el monto sea positivo.
        //. Usa **operador ternario** para clasificar el monto convertido como “Bajo” (menos de 1000 en la moneda destino) o “Alto” (1000 o más).

        Scanner sc = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("Ejercicio 2");
        System.out.println("=============================");

        // Paso 1: pedir el monto
        System.out.println("Ingrese el monto en dolares");
        double monto = sc.nextDouble();

        // Paso 2: validar el monto positivo
        if (monto <= 0) {
            System.out.println("Error: El monto debe ser mayor que cero.");
        } else {
            // Paso 3: mostrar el menu
            System.out.println("Selecciona la moneda a convertir: ");
            System.out.println("1. Euros"); //0.86
            System.out.println("2. Pesos Mexicanos"); //18.58
            System.out.println("3. Soles"); //3.54
            int opcion = sc.nextInt();

            double montoConvertido = 0;
            boolean opcionValida = true;

            // Paso 4 Usar el switch de conversion
            switch (opcion) {
                case 1:
                    montoConvertido = monto * 0.92;
                    break;
                case 2:
                    montoConvertido = monto * 17.0;
                    break;
                case 3:
                    montoConvertido = monto * 3.55;
                    break;
                default:
                    System.out.println("Error: Opcion invalida.");
                    opcionValida = false;
            }

            if (opcionValida) {
                String clasificacion = (montoConvertido < 1000) ? "Bajo" : "Alto";
                System.out.println("Monto Convertido: " + montoConvertido + " (" + clasificacion + ")");
            }

        }

        sc.close();





    }
}
