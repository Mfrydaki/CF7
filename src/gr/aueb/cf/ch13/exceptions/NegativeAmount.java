package gr.aueb.cf.ch13.exceptions;

public class NegativeAmount extends Exception {
    public NegativeAmount(double amount) {
        super("Amount "+ amount + " is sufficient. ");
    }
}
