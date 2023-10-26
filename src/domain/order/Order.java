package domain.order;

import domain.cart.Cart;

import java.time.Instant;

public class Order {
    //============================================필드
    private double totalPrice;              // 1총가격
    private Cart cart;                      // 2 장바구니(=주문 상품 목록)
    private String requestMessage;          // 3 요청사항
    private Instant orderDateTime;          // 4 주문 일시
    private int waitingNumber = 0;           // 5 대기번호

    // ==============================================getter 구역
    public double getTotalPrice(Cart cart) {
        return totalPrice;
    }                                       // 1 총가격

    public Cart getCart() {
        return cart;
    }                                       // 2 장바구니

    public String getRequestMessage() {
        return requestMessage;
    }                                       // 3 요청사항

    public Instant getOrderDateTime() {
        return orderDateTime;
    }                                       //4 주문 일시

    public int getWaitingNumber() {
        return waitingNumber;
    }                                       //5 대기번호

//==================================================메서드 구역

    public void inputRequestMessage(String message) throws IllegalArgumentException {
        if (message.length() > 20)
            throw new IllegalArgumentException("20자 이내로 작성해주세요.");
        this.requestMessage = message;
    }                                       // 요청사항 메세지 입력

    public final int issueWaitingNumber() {
        this.waitingNumber += 1;
        return waitingNumber;
    }                                       // 대기번호 발급

//=======================================================생성자
    public Order() {}                       // 기본 생성자

    public Order (Cart cart, double totalPrice) {
        this.totalPrice = getTotalPrice(cart);
    }                                       // 총 가격구하기 기능 구현 ver.1

}