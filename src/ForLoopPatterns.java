public class ForLoopPatterns {
    public static void main(String[] args) {

        System.out.println("====================");
        System.out.println("Ejemplo 5");
        System.out.println("Imprimir un patron cuadrado");
        //Pendiente hacer
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=5; j++){
                System.out.print("*" + "\t");
            }
            System.out.println("|");
        }


        System.out.println("Ejemplo 6");
        System.out.println("Imprimir un patron triangulo");
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("|");
        }

        System.out.println("Ejemplo 7");
        System.out.println("Imprimir un patron triangulo invertido");
        for (int i = 5; i >=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println("|");
        }

        System.out.println("Ejemplo 8");
        System.out.println("Imprimir un patron piramide");
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




    }
}
