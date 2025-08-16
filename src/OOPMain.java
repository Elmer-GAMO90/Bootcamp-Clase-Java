import models.Transaction;

import java.time.LocalDateTime;
import java.util.Scanner;

public class OOPMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crear un objeto de mi clase transactrion

        Transaction transaction1 = new Transaction();
        //Cambiar valores con el set
        transaction1.setNombre("Transacción codigo");

        //Crear un segundo objeto
        Transaction transaction2 = new Transaction(
                2,
                "Transaccion dos",
                25.20,
                LocalDateTime.now(),
                "Yape",
                "Comida",
                "Chinawoik");

        //Mostrar el valor
        System.out.println(transaction1.getNombre());
        //Acceder a la fecha
        System.out.println(transaction2.getFechaCreacion());
        System.out.println(transaction2.getCategoria());

        //Para modelar los datos

    }
}
