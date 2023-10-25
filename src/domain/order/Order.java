package domain.order;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Order {

    private double totalPrice;
    private Cart cart; // 이부분 확신이 없습니다.
    private String requestMessage;
    private int waitingNumber;
    private Instant orderDateTime () {
        // 현재 UTC 날짜 및 시간을 얻습니다.
        Instant now = Instant.now();

        // ISO 8601 형식으로 변환하기 위한 포맷터 생성
        DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT;

        // Instant를 ISO 8601 형식의 문자열로 변환
        String iso8601String = now.atZone(java.time.ZoneOffset.UTC).format(formatter);
        System.out.println("ISO 8601 형식: " + iso8601String);
        return now;
    }

//    private final Instant orderDateTime = Instant.parse(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mmZ")
//            .withZone(ZoneOffset.UTC)
//            .format(Instant.now())); //이거 확인 필요합니다.


    public String getRequestMessage() {
        return requestMessage;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Cart getCart() {
        return cart;
    }

    public Instant getOrderDateTime() {return orderDateTime();}

    public int getWaitingNumber() {
        return waitingNumber;
    }

    public void inputRequestMessage(String message) throws IllegalArgumentException {
        if (message.length() > 20)
            throw new IllegalArgumentException("20자 이내로 작성해주세요.");
        this.requestMessage = message;
    }

    //    - do 대기번호 발급
//⇒ issueWaitingNumber() :: int
//        public int issueWaitingNumber( ??? ) {
//        this.waitingNumber = ????
//    };
    public double getTotalPrice(double cart) {
        this.cart = cart;
    } //==========================================이부분 확신이 없습니다.
}
