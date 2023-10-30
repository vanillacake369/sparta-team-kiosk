package main.domain.product;

import java.util.List;
import java.util.Scanner;

public class CreateProductService {
    public static void createProduct(Scanner scanner, List<Product> products, int nextProductId) {
        System.out.print("상품 이름: ");
        String name = scanner.next();

        double price = 0.0;
        boolean validPrice = false;
        while (!validPrice) {
            System.out.print("가격: ");
            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                validPrice = true;
            } else {
                System.out.println("올바른 가격이 아닙니다. 숫자만 입력하세요.");
                scanner.next(); // 이전 입력 처리
            }
        }

//        StoreProducts product = new StoreProducts(nextProductId, name, price);
        Product product = Product.createProduct(name, price, "상품 설명");
        products.add(product);
        System.out.println("상품 생성 완료. 상품 ID: " + nextProductId);
    }
}
