package Xprent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Client cliente = new Client("1006017582", "Jhon Sneider");

        // Crear fotos
        Photo foto1 = new Photo("foto");
        
        // Crear una lista de fotos
        List<Photo> fotos = new ArrayList<>();
        fotos.add(foto1);
        

        // Crear un producto tipo Impresion
        Impression Impression = new Impression(1, "Blue", fotos);

        // Crear un producto tipo Camara
        Camera camera = new Camera(1, "sony", "3000");

        // Crear una lista de productos
        List<Product> productos = new ArrayList<>();
        productos.add(Impression);
        productos.add(camera);

        // Crear un pedido
        Order pedido = new Order(cliente, productos, new Date(), 987654321);

        // Mostrar la información del pedido
        System.out.println("Customer: " + pedido.getCliente().getNombre());
        System.out.println("ID card: " + pedido.getCliente().getCedula());
        System.out.println("Order date: " + pedido.getFecha());
        System.out.println("Card number: " + pedido.getNumeroTarjetaCredito());

        System.out.println("Order Products:");
        for (Product producto : pedido.getProductos()) {
            if (producto instanceof Impression) {
                Impression imp = (Impression) producto;
                System.out.println("- Impression (number: " + imp.getNumero() + ", color: " + imp.getColor() + ")");
                for (Photo foto : imp.getFotos()) {
                    foto.print();
                }
            } else if (producto instanceof Camera) {
                Camera cam = (Camera) producto;
                System.out.println("- Cámera (amount: " + cam.getNumero() + ", trademark: " + cam.getMarca() + ", model: " + cam.getModelo() + ")");
            }
        }
    }
}