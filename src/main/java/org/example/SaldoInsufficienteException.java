package org.example;

public class SaldoInsufficienteException extends Exception {
    double saldo;
    double importo;

    public SaldoInsufficienteException(double saldo, double importo) {
        this.saldo = saldo;
        this.importo = importo;
    }
}
