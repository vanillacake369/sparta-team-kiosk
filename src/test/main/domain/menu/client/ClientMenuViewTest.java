package main.domain.menu.client;

import java.util.ArrayList;
import java.util.List;
import main.domain.menu.entity.Menu;
import main.domain.product.entity.Product;
import main.kiosk.MenuBoard;
import org.junit.jupiter.api.Test;

class ClientMenuViewTest {

    @Test
    void printAllMenus() {
        // GIVEN
        // WHEN
        MenuBoard instance = MenuBoard.getInstance();

        // THEN
        ClientMenuView.printAllMenus(instance);
    }

    @Test
    void printProductsOf() {
        // GIVEN
        // WHEN
        List<Product> products = new ArrayList<>();
        products.add(Product.createProduct("더미프로덕트1", 0.0, "더미프로덕트설명1"));
        products.add(Product.createProduct("더미프로덕트2", 1.1, "더미프로덕트설명2"));
        products.add(Product.createProduct("더미프로덕트3", 2.2, "더미프로덕트설명3"));
        Menu menu = Menu.createMenu("메뉴명", "메뉴설명", products);

        // THEN
        ClientMenuView.printProductsOf(menu);
    }
}