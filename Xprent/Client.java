package Xprent;

public class Client {

    private String cedula;
    private String nombre;

    public Client(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}