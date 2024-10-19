package Class_tree_16sep24;
public class Operario extends Trabajador {
  
    public final double VALOR_HORA = 12000-0;
    private double Horas;

    public Operario (int Id, String Nombre, String Area, double Horas){
      super(Id, Nombre, Area);
      this.Horas = Horas;
    }
    
    public double getHoras(){
        return Horas;
    }

    public double Salario(){
      return VALOR_HORA * Horas;
    }
}