package Xprent;

import java.util.List;

public class Impression extends Product {
    private String color;
    private List<Photo> fotos;

    public Impression(int numero, String color, List<Photo> fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Photo> getFotos() {
        return fotos;
    }

    public void setFotos(List<Photo> fotos) {
        this.fotos = fotos;
    }
}
    

