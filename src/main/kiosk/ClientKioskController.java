package main.kiosk;

import main.domain.menu.client.ClientMenuView;

public class ClientKioskController {
    // 메뉴판 인스턴스
    private static final MenuBoard menuBoard = MenuBoard.getInstance();

    private static final

    public void runProgram() {
        // 메뉴
        ClientMenuView.printAllMenus(menuBoard);

        // 메뉴 선택

        // 해당 메뉴의 상품들 출력
    }
}
