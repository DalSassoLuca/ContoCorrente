package org.example;

public class ImportoNonValidoException extends RuntimeException {
    public ImportoNonValidoException() {
        super("L'importo deve essere maggiore di zero");
    }
}
