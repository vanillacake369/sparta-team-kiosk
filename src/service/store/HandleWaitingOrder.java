package service.store;

import domain.order.Order;
import domain.product.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HandleWaitingOrder {
    List<Order> orders = new ArrayList<>();

    public HandleWaitingOrder() {
        orders.forEach(bill -> {
            System.out.println("주문 번호 : " + bill.getWaitingNumber() +
                    "주문 상품 : " + bill.getCart().getProducts()
                                    .stream().map(Product::getName)
                                    .collect(Collectors.joining(", ")) +
                    "주문 수량 : " + bill.getCart().getProductCount() +
                    "주문 금액 : " + bill.getCart().getTotalPrice() +
                    "요청 사항 : " + bill.getRequestMessage() +
                    "주문 시간 : " + bill.getOrderDateTime());
        });
        if (orders.size() > 0) {
        Scanner sc = new Scanner(System.in);
        int handleNumber = sc.nextInt(); // 주문 번호 입력 받는다.

            System.out.println(orders.get(handleNumber - 1).getWaitingNumber() +
                    "번 주문을 완료하시겠습니까?" +
                    "\n1. 예     2. 아니오");
            int ~~~ =
            if () {

            }
        }
    }
}
