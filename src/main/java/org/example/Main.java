package org.example;

public class Main {
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario(500);

        // Prelievo eccessivo
        try {
            conto.preleva(150);
        } catch (SaldoInsufficienteException e) {
            System.out.println("Saldo insufficiente!");
            System.out.println("Deficit: " + (e.importo - e.saldo));
        } finally {
            System.out.println("Operazione terminata.");
        }

        // Prelievo negativo
        try {
            conto.preleva(-20);
        } catch (ImportoNonValidoException | SaldoInsufficienteException e) {
            System.out.println(e.getMessage());
        }

        // Prelievo valido
        try {
            conto.preleva(50);
        } catch (SaldoInsufficienteException e) {
            System.out.println("Saldo insufficiente!");
        }
    }
}
