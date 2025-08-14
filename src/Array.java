public class Array {
    public static void main(String[] args) {
        //Arreglos
        //List<> permiten almacenar varios tipos de datos
        //Los arreglos, son un conjunto de listas, solo permiten un solo tipo de dato y el tamaño es fijo
        //Indices son una forma de acceder al valor de uno de los datos dentro de tu arreglo
        //
         //Crear un arreglo de numeros
        int[] numeros = new int[3];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        System.out.println("Elementos de un arreglo (array)");
        System.out.println("El tamaño de la lista es: " + numeros.length);
        for (int i = 0; i<numeros.length; i++){
            System.out.println("El índice es " + i + " y su valor es " + numeros[i]);
        }

        //Otro ejercicio
        //for each
        String[] frutas = {"Manzana", "Lucuma", "Naranja", "Pera"};
        for (String fruta : frutas){
            //fruta = frutas[i]
            System.out.println("La fruta es " + fruta);
        }

        System.out.println("=======================");
        //Buscar el promedio de una lista
        double[] listaNotasDelBootcamp = {12.5, 14, 17, 18, 20, 20, 19, 17};

        //Calcular el total de las notas
        double total = 0;
        for (double valor : listaNotasDelBootcamp){
            total += valor;
        }
        //Calcular el promedio
        double promedio = total / listaNotasDelBootcamp.length;
        System.out.println("El total de notas es: " + total);
        System.out.println("El promedio del estudiante es: " + promedio);



        //Tarea, revisar el notion
        //Entrar a git y crear una cuenta
        //Cuenta andre gallegos
        //https://github.com/Andre6-dev
        //https://github.com/

    }
}
