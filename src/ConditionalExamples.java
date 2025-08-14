import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ConditionalExamples {
    //psvm más enter
    public static void main(String[] args) {
        //
         //Shift + enter va hacia la siguiente línea de código
        System.out.println("Ejemplos usando condicionales");
        System.out.println("=============================");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota:");
        int nota = sc.nextInt();

        //Verificar el estado de mi nota, si mi nota esta entre 0-10=Desaprobado, 11-13=Aprobado, 13-16= Muy bien, 16-20=Excelente

        if (nota >= 16){
            System.out.println("Estas aprobado con AD");
        } else if (nota >= 13) {
            System.out.println("Esas muy bien con A");
        } else if (nota >= 11) {
            System.out.println("Aprobado con B");
        }else {
            System.out.println("Desaprobado con C");
        }

        //Operador ternario
        //Comprobar que alguien es mayor de edad,
        System.out.println("===================================");
        System.out.println("Ejemplo para comprobar edad");
        int edad = sc.nextInt();

        //Operador ternario rresultado ) (condicion) ? expresion1: expresion2;
        String esMayorDeEdad = edad >= 18 ? "Es mayor de edad" : "Es menor de edad";
        System.out.println("El resultado: " + esMayorDeEdad);

        //Ejemplo con el switch
        //Comprobar el dia de la semana
        System.out.println("===========================================");
        System.out.println("Ejemplo para comprobar el día de la semana");
        System.out.println("Ingrese el número de día de la semana");
        int dia = sc.nextInt();

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día invalido");
                break;

        }

        //Calduladora de descuento con evaluación de cliente
        //Calcula el precio final con descuento.
        //Determina si el cliente es VIP o Normal usando ternario
        //Muestra menjsajes diferentes segun el precio final usando if-else
        //Si es vip el descuento debe ser del 20% si es descuento normal deber ser el 5%
        //Mostrar el precio final con el descuento aplicado

        //Como lo hace el profesor
        System.out.println("===============");
        System.out.println("=============================");
        System.out.println("Calculadora de descuento");
        System.out.println("=============================");

        System.out.println("Ingrese el precio original");
        double precioOriginal = sc.nextDouble();
        System.out.println("Es VIP?");
        boolean esVip = sc.nextBoolean();
        int descuentoVip = 20;
        int descuentoNormal = 5;

        // Usar el operador ternario para elegir cual descuento vamos a usar
        int descuentoAplicado = esVip ? descuentoVip : descuentoNormal;

        // Calcular el precio original
        double precioFinal = precioOriginal - (precioOriginal * descuentoAplicado / 100);

        // Mostrar si el cliente es vip o es normal
        String tipoCliente = esVip ? "Cliente VIP" : "Cliente NORMAL";

        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Descuento aplicado: " + descuentoAplicado + "%");
        System.out.println("Precio final: $" + precioFinal);

        // Si el precio final es mayor a 100 muestrame un mensaje, 50 otro mensaje y el default solo un mensaje de bienvenida
        if (precioFinal >= 100) {
            System.out.println("Compra grande: !Gracias por su compra!");
        } else if (precioFinal >= 50) {
            System.out.println("!Gracias por su compra");
        } else {
            System.out.println("!Esperemos verte pronto!");
        }

        // El scanner siempre se debe cerrar al final de todo
        sc.close();
    }
}
