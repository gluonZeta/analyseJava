package gluon.projects.trading.myexceptions;

public class CryptoInfoFileNotFoundException extends RuntimeException {

    public CryptoInfoFileNotFoundException() {}

    public CryptoInfoFileNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
