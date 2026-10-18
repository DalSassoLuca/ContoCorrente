package org.example;

public class ContoBancario {
    double saldo;

    public ContoBancario(double saldo) {
        this.saldo = saldo;
    }

    public void preleva(double importo) throws SaldoInsufficienteException {
        if (importo <= 0) {
            throw new ImportoNonValidoException();
        }

        if (importo > saldo) {
            throw new SaldoInsufficienteException(saldo, importo);
        }

        saldo = saldo - importo;
        System.out.println("Prelievo effettuato!");
    }
}