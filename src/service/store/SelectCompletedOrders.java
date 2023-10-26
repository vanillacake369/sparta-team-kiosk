package service.store;


import domain.completedOrder.CompletedOrder;
import domain.product.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SelectCompletedOrders {
    List<CompletedOrder> completedOrders = new ArrayList<>();
    public SelectCompletedOrders() {
        completedOrders.forEach(done -> {
            System.out.println("주문 번호 : "+done.getWaitingNumber() +
                    "\n 주문 상품 : "+ done.getCart().getProducts().stream()
                                    .map(Product::getName)
                                    .collect(Collectors.joining(", ")) +
                    "\n 주문 수량 : "+ done.getCart().getProductCount() +
                    "\n 주문 금액 : "+ done.getCart().getTotalPrice() +
                    "\n 요청 사항 : "+ done.getRequestMessage() +
                    "\n 주문 시간 : "+ done.getOrderDateTime() +
                    "\n 주문 완료 시간 : "+done.getCompletedOrderDateTime());
        });
    }
}
