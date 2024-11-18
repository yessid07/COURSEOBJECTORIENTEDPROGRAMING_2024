//Aqui esta el funcionamiento del parpadeo del boton al selecionar el piso donde ira el ascensor

public abstract class Boton {
    private boolean iluminado;

    public Boton() {
        this.iluminado = false;
    }

    public void presionar() {
        this.iluminado = true;
        System.out.println("Botón presionado. Solicitud registrada.");
    }

    public void apagarLuz() {
        this.iluminado = false;
    }

    public boolean isIluminado() {
        return iluminado;
    }
}
