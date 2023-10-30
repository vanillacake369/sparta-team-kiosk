package main.domain.order;

public class CheckInputMessage extends Exception {

    public CheckInputMessage(String message) {
        super(message);
    }
}