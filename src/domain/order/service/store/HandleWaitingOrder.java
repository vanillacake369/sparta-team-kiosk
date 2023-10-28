package domain.order.service.store;

import domain.completedOrder.CompletedOrder;
import domain.order.Order;
import domain.product.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HandleWaitingOrder {
    List<Order> orders = new ArrayList<>();
    List<CompletedOrder> completedOrders = new ArrayList<>(); // 56번에 사용할 CompletedOrder 리스트
    private static Scanner sc = new Scanner(System.in); // 34번, 48번 번호 입력 받기
    private static final String NUMBER_REG = "^[0-9]*$"; // 36번줄 정규 표현식 => 주문 번호 입력

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

            String handleNumber = sc.nextLine();// 16번 줄을 이용하여 주문 번호 입력 받는다.

            if (!Pattern.matches(NUMBER_REG, handleNumber)) {
                System.out.println("숫자를 입력해주세요.");
                continue;
            }                                           // 입력값이 숫자가 아니면 재시작

            if (handleNumber.equals("0")) { // 주문 번호가 0번 이면 while문 종료
                break;
            } else if (!handleNumber.equals("0")) {     // 주문 번호 0번을 입력하지 않았을 때
                System.out.println(orders.get(Integer.parseInt(handleNumber) - 1).getWaitingNumber() +
                        "번 주문을 완료하시겠습니까?" +  // 입력받은 번호의 주문을 출력한다
                        "\n1. 예     2. 아니오");

                String doneItNumber = sc.nextLine(); // 주문의 완료 여부를 결정한다.

                if (!Pattern.matches(NUMBER_REG, doneItNumber)) {   // 입력값이 숫자가 아니면 재시작
                    System.out.println("숫자를 입력해주세요.");
                    continue;
                }
                switch (Integer.parseInt(doneItNumber)) {
                    case 1:
                        completedOrders.add((CompletedOrder) orders.get(Integer.parseInt(handleNumber) - 1));
                        // CompletedOrder에 주문을 추가한다.
                        orders.remove(Integer.parseInt(handleNumber) - 1);
                        // 완료 처리한 주문은 대기 주문 목록에서 삭제한다.
                        System.out.println("주문이 완료되었습니다.");
                        break;

                    case 2:
                        System.out.println("주문이 완료되지 않았습니다.");
                        break;
                }
            }
        }
        if (orders.size() <= 0) {  // 대기 주문이 없는 경우
            System.out.println("대기 주문이 없습니다.");
        }
    }
}

