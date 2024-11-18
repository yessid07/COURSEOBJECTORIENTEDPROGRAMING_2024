// Aqui esta el correcto funcionamiento de las puertas del ascensor
public class Puerta {
    private boolean abierta;

    public Puerta() {
        this.abierta = false;
    }

    public void abrir() {
        this.abierta = true;
        System.out.println("Puertas abiertas.");
    }

    public void cerrar() {
        this.abierta = false;
        System.out.println("Puertas cerradas.");
    }

    public boolean isAbierta() {
        return abierta;
    }
}
