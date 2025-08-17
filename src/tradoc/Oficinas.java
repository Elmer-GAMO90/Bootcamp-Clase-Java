package tradoc;

public class Oficinas {

    //Crear variables
    private String nombreOfic;
    private String jefeOfic;

    //Constructor
    public Oficinas(){
    }

    public Oficinas(String nombreOfic, String jefeOfic) {
        this.nombreOfic = nombreOfic;
        this.jefeOfic = jefeOfic;
    }

    //Getters and Setters

    public String getNombreOfic() {
        return nombreOfic;
    }

    public void setNombreOfic(String nombreOfic) {
        this.nombreOfic = nombreOfic;
    }

    public String getJefeOfic() {
        return jefeOfic;
    }

    public void setJefeOfic(String jefeOfic) {
        this.jefeOfic = jefeOfic;
    }
}
