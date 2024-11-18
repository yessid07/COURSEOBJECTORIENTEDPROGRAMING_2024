//Este es el funcionamiento del boton que solicita la direcion del ascensor si sube o baja
public class BotonPiso extends Boton {
    private String direccion; // subir o bajar

    public BotonPiso(String direccion) {
        super();
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
}