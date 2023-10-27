package domain.order.service.store;

import domain.completedOrder.CompletedOrder;
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
                                .stream().map(Product::getName).collect(Collectors.joining(", ")) +
                                "주문 수량 : " + bill.getCart().getProductCount() +
                                "주문 금액 : " + bill.getCart().getTotalPrice() +
                                "요청 사항 : " + bill.getRequestMessage() +
                                "주문 시간 : " + bill.getOrderDateTime());
        });

        while (orders.size() > 0) {  // 대기 주문이 있는 경우
            System.out.println("완료시킬 주문 번호를 입력해주세요." +
                                "\n뒤로 가고 싶다면 0번을 입력해주세요");
            Scanner sc = new Scanner(System.in);
            int handleNumber = sc.nextInt(); // 주문 번호 입력 받는다.

            if (handleNumber == 0) { // 주문 번호가 0번 이면 while문 종료
                break;
            } else if (handleNumber != 0) {     // 주문 번호 0번을 입력하지 않았을 때
                System.out.println(orders.get(handleNumber - 1).getWaitingNumber() +  // 입력받은 번호의 주문을 출력한다
                        "번 주문을 완료하시겠습니까?" +
                        "\n1. 예     2. 아니오");
                int doneItNumber = sc.nextInt(); // 주문의 완료 여부를 결정한다.
                switch (doneItNumber) {
                    case 1:
                        // orders.get(handleNumber - 1); 를 완료 주문으로 보낸다. 어디로 보내야하지??
                        orders.remove(handleNumber-1); // 완료 처리한 주문은 대기 주문 목록에서 삭제한다.
                        System.out.println("주문이 완료되었습니다.");
                        break;
                    case 2:
                        System.out.println("주문이 완료되지 않았습니다.");
                        break;
                    default:
                        System.out.println("올바른 번호를 입력해주세요.");
                }
            }
        }
        if (orders.size() <= 0) {  // 대기 주문이 없는 경우
            System.out.println("대기 주문이 없습니다.");
        }
    }
}

