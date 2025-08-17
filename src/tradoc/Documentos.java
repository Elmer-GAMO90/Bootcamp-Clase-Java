package tradoc;

import java.time.LocalDateTime;

public class Documentos {
    //crear variables
    private int nroDoc;
    private String tipoDoc;
    private String asuntoDoc;
    private LocalDateTime fechaDoc;

    //Constructor
    public Documentos(){
    }

    //Constructor alt + ins
    public Documentos(int nroDoc, String tipoDoc, String asuntoDoc, LocalDateTime fechaDoc) {
        this.nroDoc = nroDoc;
        this.tipoDoc = tipoDoc;
        this.asuntoDoc = asuntoDoc;
        this.fechaDoc = fechaDoc;
    }

    //Getters and Setters
    public int getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(int nroDoc) {
        this.nroDoc = nroDoc;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getAsuntoDoc() {
        return asuntoDoc;
    }

    public void setAsuntoDoc(String asuntoDoc) {
        this.asuntoDoc = asuntoDoc;
    }

    public LocalDateTime getFechaDoc() {
        return fechaDoc;
    }

    public void setFechaDoc(LocalDateTime fechaDoc) {
        this.fechaDoc = fechaDoc;
    }
}
