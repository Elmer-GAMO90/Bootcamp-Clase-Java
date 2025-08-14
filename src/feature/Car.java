package feature;

//Definir una clase
public class Car {

    //Crear atributos
    String color;
    String marca;
    String modelo;

    //definir un constructor por defecto
    public Car(){
    }

    //definir un constructor por defecto, con atajo de teclas alt + ins
    public Car(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }
    //void no vas a retornar un tipo de dato
    public void acelerate() {
        System.out.println("Acelerate");
    }

    //Método con retorno de un tipo de dato (int)
    public int calculoKilometraje(){
        return 4;
    }

    public void stop(){
        System.out.println("Stop");
    }
}
