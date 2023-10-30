package main.domain.product;

import java.util.List;
import java.util.Scanner;

public class RemoveProductService {
    public static void removeProduct(Scanner scanner, List<Product> products) {
        System.out.print("삭제할 상품 ID: ");
        int productId = scanner.nextInt();

        for (Product product : products) {
            if (product.getId() == productId) {
                products.remove(product);
                System.out.println("상품 삭제 완료.");
                return;
            }
        }

        System.out.println("상품을 찾을 수 없습니다.");
    }
}
