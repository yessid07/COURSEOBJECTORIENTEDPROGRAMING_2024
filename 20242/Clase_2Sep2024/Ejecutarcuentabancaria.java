package Clase_2Sep2024;

public class Ejecutarcuentabancaria {
        // Atributos de la clase
        private int NumeroCuenta;
        private double saldo;
        private String titular;
    
        // Constructor para inicializar la cuenta
        public Ejecutarcuentabancaria(String String, double saldo, String titular) {
            this.NumeroCuenta = String;
            this.titular = titular;
            this.saldo = saldo;
        }
    
        // Método para depositar dinero
        public void depositar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                System.out.println("Depósito realizado: " + cantidad);
            } else {
                System.out.println("La cantidad a depositar debe ser positiva.");
            }
        }
    
        // Método para retirar dinero
        public void retirar(double cantidad) {
            if (cantidad > 0) {
                if (cantidad <= saldo) {
                    saldo -= cantidad;
                    System.out.println("Retiro realizado: " + cantidad);
                } else {
                    System.out.println("Saldo insuficiente para realizar el retiro.");
                }
            } else {
                System.out.println("La cantidad a retirar debe ser positiva.");
            }
        }
    
        // Método para consultar el saldo
        public void consultarSaldo() {
            System.out.println("Saldo actual: " + saldo);
        }
    
        // Métodos getter para los atributos
        public int getNumeroCuenta() {
            return NumeroCuenta;
        }
    
        public String getTitular() {
            return titular;
        }
    
    
}

