package main.domain.menu;

import java.util.List;
import java.util.stream.Collectors;
import main.domain.cart.Cart;
import main.domain.product.Product;
import main.kiosk.MenuBoard;

public class ClientMenuView {
    public static void printAllMenus(MenuBoard menuBoard) {
        List<Menu> menus = menuBoard.getMenus();
        String menuIntro = "============    MENU    ============\n";
        String menuOutro = "====================================\n";
        String menuBoardState = menus.stream()
                .map(menu -> String.format("%s. %s. %s\n",
                        menu.getId(),
                        menu.getName(),
                        menu.getDescription())
                ).collect(Collectors.joining());
        System.out.println(menuIntro + menuBoardState + menuOutro);
    }

    public static void printProductsOf(Menu menu) {
        System.out.println(menu.printAllProducts());
    }

    public static void askAddCart(Product product, Cart cart) {
        // 담으려는 아이템
        System.out.println("========       Product     ========");
        System.out.println(product.toString());
        System.out.println("===================================");
        // 장바구니 상태
        System.out.println("========       Cart     ========");
        System.out.println(cart.toString());
        System.out.println("===================================");

        // 출력여부
        System.out.println("해당 상품을 장바구니에 담으시겠습니까?");
    }

    public static void doneAddCart() {
        System.out.println("장바구니 담기가 완료되었습니다.");
    }

    public static void abortAddCart() {
        System.out.println("장바구니 담기가 취소되었습니다.");
    }
}
