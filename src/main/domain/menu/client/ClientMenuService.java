package main.domain.menu.client;

import main.domain.menu.entity.Menu;
import main.kiosk.MenuBoard;

public class ClientMenuService {

    public Menu findById(MenuBoard menuBoard, int id) throws Exception {
        return menuBoard.getMenus().stream()
                .filter(menu -> menu.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
