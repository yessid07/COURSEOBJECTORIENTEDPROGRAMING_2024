public class Main {
    public static void main(String[] args) {
        // Crear una instancia del ascensor con 10 pisos
        Ascensor ascensor = new Ascensor(10); 
        
        // Solicitud desde el piso 3 hacia arriba
        System.out.println("Solicitando ascensor desde el piso 3 hacia arriba.");
        ascensor.solicitarAscensor(3, "subida");
        
        // Selección de destino en el ascensor
        System.out.println("Seleccionando el piso 7 dentro del ascensor.");
        ascensor.seleccionarPiso(7);

        // Movimiento del ascensor
        System.out.println("Moviendo el ascensor.");
        ascensor.moverAscensor();

        // Boton que solicita la apertura de las puertas
        System.out.println("Abriendo las puertas en el piso actual.");
        ascensor.abrirPuertas();

        System.out.println("Cerrando las puertas en el piso actual.");
        ascensor.cerrarPuertas();

        System.out.println("piso 5 seleccionado dentro del ascensor.");
        // Aqui se simula el error en un botón
        System.out.println("falla en el botón del piso 5.");
        ascensor.reporteFallaBoton(5);

        // Aqui se Verifica el estado del ascensor
        System.out.println("Estado del ascensor:");
        System.out.println(ascensor);

        // lógica de detenerse en todos los pisos solicitados
        System.out.println("Solicitando pisos 2, 4 y 8.");
        ascensor.solicitarAscensor(2, "subida");
        ascensor.solicitarAscensor(4, "subida");
        ascensor.solicitarAscensor(8, "subida");
        
        // Movimiento del ascensor para atender las solicitudes
        System.out.println("Moviendo el ascensor para atender solicitudes.");
        ascensor.moverAscensor();

        // Finalización
        System.out.println("Pruebas completas.");
    }
}
