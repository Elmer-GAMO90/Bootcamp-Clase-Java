package feature;

public class Sucursales {
    String pais;
    String ciudad;
    String gerente;

    //Constructor por defecto
    public Sucursales(){
    }

    //Constructor

    public Sucursales(String pais, String ciudad, String gerente) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.gerente = gerente;
    }

    //Creación de métodos
    public void origenSucursal(){
        System.out.println("Bienvenido a nuestra sucursal");
    }

    public void nombreGerente(){
        System.out.println("Soy el gerente");
    }
}
