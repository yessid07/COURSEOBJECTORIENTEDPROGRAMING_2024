package Xprent;

public class Photo {

    private String fichero;

    public Photo(String fichero) {
        this.fichero = fichero;
    }

    // Método print
    public void print() {
        System.out.println("Printing photo: " + fichero);
    }

    // Getters y Setters
    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }
}