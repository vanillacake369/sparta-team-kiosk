package main.domain.menu.service;

import main.domain.menu.Menu;
import main.domain.product.Product;
import main.kiosk.MenuBoard;

public class ClientMenuService {

    public Menu findMenuById(MenuBoard menuBoard, int menuId) throws IllegalArgumentException {
        return menuBoard.getMenus().stream()
                .filter(menu -> menu.getId() == menuId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("찾고자 하시는 메뉴가 없습니다."));
    }

    public Product findProductById(Menu menu, int productId) throws IllegalArgumentException {
        return menu.getProducts().stream()
                .filter(product -> product.getId() == productId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("찾고자 하시는 상품이 없습니다."));
    }
}
