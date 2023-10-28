package main.domain.menu.client;

import java.util.List;
import java.util.stream.Collectors;
import main.domain.menu.entity.Menu;
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
}
