package main.domain.order;

public class CheckInputMessage extends Exception {

    public CheckInputMessage(String message) {
        super(message);
    }
} // 예외처리 관련 메세지