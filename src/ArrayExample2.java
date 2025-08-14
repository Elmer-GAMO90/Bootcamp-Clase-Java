import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo");


        //Nuevo ejemplo, el numero mayor de un array
        int[] numeros = {20, 54, 99, 21, 41};
        int max = numeros[0];

        //Recorremos el array para encontrar el mayor
        for (int numero : numeros) {
            if (numero > max) {
                max = numero;
            }
        }
        System.out.println("El número mayor es: " + max);
    }
}
