package domain.order.client;

import domain.cart.Cart;
import domain.order.Order;
import domain.product.Product;

import java.util.Scanner;

public class OrderService {

    private static Product product;
    private static Cart cart;
    private static Order order;

    // 주문 현황 서비스
    private static void currentOders() {
        // 1. 상품 화면에서 상품 선택 시 출력되는 화면
        //    상품 | 가격 | 설명
        //    위 메뉴를 장바구니에 추가하시겠습니까?
        product.toString(); // [상품 | 가격 | 설명] 이 화면을 출력하고 싶은데 맞는지 의문?
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 추가                 2. 취소");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 1) {

            cart.getProducts(); // 징바구니에 추가되는 메서드인지 의문?
            System.out.println("장바구니에 추가되었습니다.");

            // mainMenuService() 불러오기

        } else if (input == 2) {

            // mainMenuService() 불러오기

        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            currentOders();
        }
    }

    // 주문 화면 서비스
    private static void orderProduct() {
        // 2. 주문 화면에서 주문 선택 시 출력되는 화면
        //    아래와 같이 주문 하시겠습니까?
        //    상품 | 가격 | 설명
        //    [ Total] W 0.0
        //    요청사항 입력
        System.out.println("아래와 같이 주문 하시겠습니까?");
        cart.getProducts();
        System.out.println("[ Total ]");
        cart.getTotalPrice();
        System.out.println("1. 주문           2. 취소");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 1) {
            System.out.println("요구사항을 입력해주세요.");
            Scanner sc2 = new Scanner(System.in);
            String message = sc2.nextLine();
            order.inputRequestMessage(message);

            makeOrder(); // List 형태로 받는 방법 찾아보는 중

        } else if (input == 2) {
            cancelOrder();

        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");

            orderProduct();

        }
        // mainMenuService() 불러오기
    }

    // 주문 완료 화면 서비스
    private static void makeOrder() {
        System.out.println("주문이 완료 되었습니다.");
        System.out.println("대기번호는 [ " + order.issueWaitingNumber() + " ] 번 입니다.");
        cart.clear();
        System.out.println("3초 후 메뉴판으로 돌아갑니다.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // mainMenuService() 불러오기
    }

    // 주문 취소 화면 서비스
    private static void cancelOrder() {
        System.out.println("주문을 취소하셨습니다.");
        // mainMenuService() 불러오기
    }
}
