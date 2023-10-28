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
                .map(menu -> menuIntro
                        + String.format("%s. %s. %s.\n",
                        menu.getId(),
                        menu.getName(),
                        menu.getDescription())
                        + menuOutro + menu.printAllProducts()
                ).collect(Collectors.joining());
        System.out.println(menuBoardState);
    }
}
