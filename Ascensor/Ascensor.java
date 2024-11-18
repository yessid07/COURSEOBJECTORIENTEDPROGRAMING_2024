import java.util.ArrayList;
import java.util.Collections;

class Ascensor {
    private int pisos;
    private int pisoActual;
    private boolean puertasAbiertas;
    private ArrayList<Integer> solicitudes;
    private ArrayList<Integer> botonesRotos;

    // El ascensor empiezá en el piso 1
    public Ascensor(int pisos) {
        this.pisos = pisos;
        this.pisoActual = 1;  
        this.puertasAbiertas = false;
        this.solicitudes = new ArrayList<>();
        this.botonesRotos = new ArrayList<>();
    }

    public void solicitarAscensor(int piso, String direccion) {
        if (piso < 1 || piso > pisos) {
            System.out.println("Error: Piso fuera de rango.");
            return;
        }
        if (direccion.equals("subida")) {
            solicitudes.add(piso);
        } else {
            solicitudes.add(piso);
        }
        System.out.println("Ascensor solicitado desde el piso " + piso + " hacia " + direccion);
    }

    public void seleccionarPiso(int piso) {
        if (piso < 1 || piso > pisos) {
            System.out.println("Piso no válido.");
            return;
        }
        solicitudes.add(piso);
        System.out.println("Piso " + piso + " seleccionado dentro del ascensor.");
    }

    public void moverAscensor() {
        if (solicitudes.isEmpty()) {
            System.out.println("No hay solicitudes para mover el ascensor.");
            return;
        }

        // Aqui se ordenan las solicitudes para mover el ascensor entre los pisos del edificio
        Collections.sort(solicitudes);
        for (int pisoDestino : solicitudes) {
            if (pisoActual != pisoDestino) {
                System.out.println("Moviendo ascensor desde el piso " + pisoActual + " hasta el piso " + pisoDestino);
                pisoActual = pisoDestino;
                abrirPuertas();
                cerrarPuertas();
            }
        }
        solicitudes.clear();  // Esta linea limpia solicitudes después de mover el ascensor
    }

    public void abrirPuertas() {
        if (puertasAbiertas) {
            System.out.println("Las puertas ya están abiertas.");
        } else {
            puertasAbiertas = true;
            System.out.println("Puertas abiertas en el piso " + pisoActual);
        }
    }

    public void cerrarPuertas() {
        if (!puertasAbiertas) {
            System.out.println("Las puertas ya están cerradas.");
        } else {
            puertasAbiertas = false;
            System.out.println("Puertas cerradas en el piso " + pisoActual);
        }
    }

    public void reporteFallaBoton(int piso) {
        if (piso < 1 || piso > pisos) {
            System.out.println("Piso no válido.");
            return;
        }
        if (!botonesRotos.contains(piso)) {
            botonesRotos.add(piso);
            System.out.println("Botón del piso " + piso + " reportado como roto.");
        } else {
            System.out.println("El botón del piso " + piso + " ya está roto.");
        }
    }

    @Override
    public String toString() {
        return "Ascensor en el piso " + pisoActual + ", puertas " + (puertasAbiertas ? "abiertas" : "cerradas") +
               ", solicitudes: " + solicitudes.toString() + ", botones rotos: " + botonesRotos.toString();
    }
}
