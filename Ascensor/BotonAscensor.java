// Esta es el funcionamiento del boton de destino del ascensor

public class BotonAscensor extends Boton {
    private int pisoDestino;

    public BotonAscensor(int pisoDestino) {
        super();
        this.pisoDestino = pisoDestino;
    }

    public int getPisoDestino() {
        return pisoDestino;
    }
}
