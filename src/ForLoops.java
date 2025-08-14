import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {


        System.out.println("Ejemple 1");
        System.out.println("=============================");

        //Imprimir los numeros del 1 al 10
        //Depurar código, ir al logo de la araña clic,
        for (int i = 1; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("Ejemplo 2");
        System.out.println("=============================");
        //Tabla de multiplicar
        //Tabla del 12

        Scanner sc = new Scanner(System.in);
        int tablaMultiplicar = sc.nextInt();
        System.out.println("Tabla de multiplicar del: " + tablaMultiplicar);
        for (int l=1; l<=12; l++){
            System.out.println(tablaMultiplicar + " x" + l + " = " + (tablaMultiplicar*l));
        }


        System.out.println("========================");
        System.out.println("Ejemplo 3");
        //Cuenta regresiva del 30 números de 5 a 1.
        for (int k=5; k>=1; k--){
            System.out.println(k);
        }

        //Tablas de multiplicar apiladas
        //No pueden declarar la misma variable
        // \t es una tabulación una serie de espacios

        //Esto es algo opcional, pero no se deberia hacer porque la tabla si varia no calcularia
        System.out.println("Ejemplo 4");
        for (int j=1; j<=5; j++){
            System.out.print("Tabla " + j + "\t");
        }
        System.out.println();


        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=5; j++){
                System.out.print(i + "x" + j + "=" + (i*j) + "\t");
            }
            System.out.println("|");
        }
    }
}
