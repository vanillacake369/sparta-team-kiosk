package main.domain.menu.client;

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
}