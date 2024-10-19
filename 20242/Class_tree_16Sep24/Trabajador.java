package Class_tree_16sep24;
public class Trabajador {
  
  private int Id;
  private String Nombre;
  private String Area;

  public Trabajador(int Id, String Nombre, String Area) {
   this.Id = Id;
   this.Nombre = Nombre;
   this.Area = Area;

  }

  public int getId() {
    return Id;
  }

  public String getNombre() {
    return Nombre;
  }

  public String getArea() {
    return Area;
  }

  @Override
  public String toString(){
    return "Trabajador [id=" + Id +", nombre=" + Nombre + ", area=" + Area + "]";
  }

  public double salario(){
    return 0.0;

  }

}

