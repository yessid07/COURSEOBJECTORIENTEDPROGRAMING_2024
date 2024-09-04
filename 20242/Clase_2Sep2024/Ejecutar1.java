package Clase_2Sep2024;

public class Ejecutar1 {
  
        // Método main para probar la clase
        public static void main(String[] args) {
            // Crear una instancia de CuentaBancaria
            Ejecutarcuentabancaria  cuenta1 = new Ejecutarcuentabancaria(1234567890, 1000.0,"Juan Pérez");
    
            // Consultar el saldo inicial
            cuenta1.consultarSaldo();
    
            // Realizar un depósito
            cuenta1.depositar(500.00);
    
            // Realizar un retiro
            cuenta1.retirar(200.00);
    
            // Consultar el saldo después de las operaciones
            cuenta1.consultarSaldo();
        }
    

}
