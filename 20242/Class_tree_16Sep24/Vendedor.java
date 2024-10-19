package Class_tree_16sep24;
public class Vendedor extends Trabajador{

  public final double VENTA = 120000.0; //constante
  private double comision;

  public Vendedor(int Id, String Nombre, String Area, double comision){
        super(Id, Nombre, Area);
        this.comision = comision;
    }

    public double comision(){
        return comision;
    }

    public double salario(){
      return (VENTA * (comision/100)) + VENTA;

    }
}