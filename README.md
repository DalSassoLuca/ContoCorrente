Esercizio 1: Conto Corrente (Checked vs Unchecked)
Gestire prelievi bancari usando due eccezioni custom diverse.
SaldoInsufficienteException (Checked): estende Exception. Viene lanciata se il prelievo supera il saldo. Deve memorizzare saldo attuale e importo richiesto.
ImportoNonValidoException (Unchecked): estende RuntimeException. Viene lanciata se l'importo è minore o uguale a zero.
Classe ContoBancario: contiene il saldo e il metodo preleva(double). Dichiara la checked exception nella firma del metodo con throws.
Classe Main: testa tre scenari distinti:
Prelievo eccessivo: cattura la checked exception, stampa il deficit di denaro e usa un blocco finally.
Prelievo negativo: cattura la unchecked exception.
Prelievo valido: operazione completata con successo.