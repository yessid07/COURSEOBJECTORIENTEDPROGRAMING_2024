package Class_four_30sep24;

public class Cuenta {
    
    private String nrocuenta;
    private String tipoCuenta;

    
    public Cuenta(String nrocuenta, String tipoCuenta) {
        this.nrocuenta = nrocuenta;
        this.tipoCuenta = tipoCuenta;
    }


    public String getNrocuenta() {
        return nrocuenta;
    }


    public void setNrocuenta(String nrocuenta) {
        this.nrocuenta = nrocuenta;
    }


    public String getTipoCuenta() {
        return tipoCuenta;
    }


    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }


    @Override
    public String toString() {
        return "Cuenta [nrocuenta=" + nrocuenta + ", tipoCuenta=" + tipoCuenta + "]";
    }


 
    

    







}
