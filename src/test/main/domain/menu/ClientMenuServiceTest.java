package main.domain.menu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import main.domain.product.Product;
import main.kiosk.MenuBoard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientMenuServiceTest {
    private static ClientMenuService clientMenuService;

    @BeforeEach
    void setUp() {
        clientMenuService = new ClientMenuService();
    }

    @Test
    void findById() throws Exception {
        // GIVEN
        int menuId = 1;
        MenuBoard menuBoard = MenuBoard.getInstance();

        // WHEN
        Menu menu = clientMenuService.findMenuById(menuBoard, menuId);

        // THEN
        assertEquals(menuId, menu.getId());
    }

    @Test
    void findProductById() {
        // GIVEN
        List<Product> products = new ArrayList<>();
        Product product1 = Product.createProduct("product1", 1.1, "describe product1");
        Product product2 = Product.createProduct("product2", 2.2, "describe product2");
        Product product3 = Product.createProduct("product3", 3.3, "describe product3");
        products.add(product1);
        products.add(product2);
        products.add(product3);

        Menu menu = Menu.createMenu("menu", "describe menu", products);

        int productId = product1.getId();

        // WHEN
        Product productById = clientMenuService.findProductById(menu, productId);

        // THEN
        assertEquals(product1, productById);
    }
}