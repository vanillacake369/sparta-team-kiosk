package domain.order;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Order {
    //============================================필드
    private double totalPrice;              // 1총가격
//    private  double totalPrice = getTotalPrice(cart);   //총 가격구하기 기능 구현 ver.2
    private Cart cart;                      // 2 장바구니(=주문 상품 목록)
    private String requestMessage;          // 3 요청사항
    private Instant orderDateTime;          // 4 주문 일시
    private int waitingNumber =0;           // 5 대기번호
    
// ==============================================getter 구역
    public double getTotalPrice() {
        return totalPrice;
    }                                       // 1 총가격
//    private double getTotalPrice(Cart cart) {
//        List<Priduct> products = cart.getProducts();
//        double sum = 0;
//        for (Product : products) {
//            sum += products.getPrice();
//        }
//        return sum;
//    }                                       // 총 가격구하기 기능 구현 ver.2
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
//    public Order (Cart cart) {
//        this.totalPrice = cart.getTotalPrice();
//        this.cart = cart;
//    }                                       // 총 가격구하기 기능 구현 ver.1


}
