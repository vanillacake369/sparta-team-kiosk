package main.domain.product;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import main.domain.product.service.CreateProductService;
import main.domain.product.service.RemoveProductService;


public class ProductsAdmin {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        int nextProductId = 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 상품 생성");
            System.out.println("2. 상품 삭제");
            System.out.println("3. 종료");
            System.out.print("원하는 작업을 선택하세요: ");

// 예외 처리를 위해 try catch 구문 사용
            try {

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        CreateProductService.createProduct(scanner, products, nextProductId);
                        nextProductId++; // ID 증가
                        break;
                    case 2:
                        RemoveProductService.removeProduct(scanner, products);
                        break;
                    case 3:
                        System.out.println("프로그램을 종료합니다.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("문자 대신 1~3 중 한 숫자를 입력하세요.");
                scanner.nextLine(); // 잘못된 입력을 넘기고 다음 입력 대기
            }
        }
    }
}
