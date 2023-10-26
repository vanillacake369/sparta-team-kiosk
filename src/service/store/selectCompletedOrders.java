package service.store;


import domain.completedOrder.CompletedOrder;

import java.util.ArrayList;
import java.util.List;

public class selectCompletedOrders {
    List<CompletedOrder> completedOrders = new ArrayList<>();
    public selectCompletedOrders () {
        completedOrders.forEach(completedOrder -> {
            System.out.println("주문 번호 : "+completedOrder.getWaitingNumber() +
                    "주문 상품 : "+ completedOrder.getCart().getProducts() +
                    "주문 수량 : "+ completedOrder.getCart().getProductCount() +
                    "주문 금액 : "+ completedOrder.getCart().getTotalPrice() +
                    "요청 사항 : "+ completedOrder.getRequestMessage() +
                    "주문 시간 : "+ completedOrder.getCompletedOrderDateTime());
        });
    }

}
