package main.kiosk;

import main.domain.menu.client.ClientMenuView;

public class ClientKioskController {
    // 메뉴판 인스턴스
    private static final MenuBoard menuBoard = MenuBoard.getInstance();

    public void runProgram() {
        ClientMenuView.printAllMenus(menuBoard);
    }
}
