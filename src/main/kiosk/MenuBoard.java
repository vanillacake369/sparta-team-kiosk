package main.kiosk;

import java.util.ArrayList;
import java.util.List;
import main.domain.menu.entity.Menu;
import main.domain.product.entity.Product;

public class MenuBoard {
    private static MenuBoard menuBOard;
    private final List<Menu> menus = new ArrayList<>();

    private MenuBoard() {
    }

    public static MenuBoard getInstance() {
        if (menuBOard == null) {
            menuBOard = new MenuBoard();
        }
        menuBOard.initMenuBoard();
        return menuBOard;
    }

    // 메뉴 상태 초기화
    final void initMenuBoard() {
        // 메뉴 생성
        Menu burger = createBurgerMenu();

        //메뉴들 <- 메뉴
        menus.add(burger);
    }

    Menu createBurgerMenu() {
        // 제품 리스트
        List<Product> burgers = new ArrayList<>();

        // 제품 생성부
        Product bulgogi = Product.createProduct("불고기버거", 6.5, "불고기로 만든 햄버거");
        Product cheese = Product.createProduct("치즈버거", 6.5, "불고기로 만든 햄버거");
        Product mac = Product.createProduct("맥", 6.5, "불고기로 만든 햄버거");
        burgers.add(bulgogi);
        burgers.add(cheese);
        burgers.add(mac);

        // 메뉴 반환
        Menu burgerMenu = Menu.createMenu("버거메뉴", "햄버거에 대한 메뉴입니다.", burgers);
        return burgerMenu;
    }

    public List<Menu> getMenus() {
        return menus;
    }
}
