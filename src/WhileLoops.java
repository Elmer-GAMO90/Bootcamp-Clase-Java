import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Imprimir los 10 primeros nuemos
        int valor = 1;
        while (valor <= 10){
            System.out.println(valor);
            //Updation
            valor++;
        }

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar){
            System.out.println("=====MENÚ DE PATRONES=====");
            System.out.println("==================");
            System.out.println("1.- Imprimir un triangulo equlatero");
            System.out.println("2.- Imprimir un triangulo equilatero inverso");
            System.out.println("3.- Imprimir la piramide");
            System.out.println("4.- Salir del programa");

            System.out.println("Elija el número de su elección...");
            int opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    for (int i = 1; i<=5; i++){
                        for (int j = 1; j<=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("|");
                    }
                    break;
                case 2:
                    for (int i = 5; i >=1; i--){
                        for (int j = 1; j<=i; j++){
                            System.out.print(" *");
                        }
                        System.out.println("|");
                    }
                    break;
                case 3:
                    for (int i = 1; i <=6; i++){
                        //Imprimir los espacios
                        for (int j = 1; j<=6-i; j++){
                            System.out.print(" ");
                        }
                        //Imprimir el asterisco
                        for (int k = 1; k<=i; k++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Gracias, hasta pronto...");
                    continuar = false;
                    break;
                default:
                    System.out.println("No es una opción válida");
            }

        }
        sc.close();
    }
}
