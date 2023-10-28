package main.kiosk;

import main.domain.menu.client.ClientMenuService;
import main.domain.menu.client.ClientMenuView;
import main.domain.menu.entity.Menu;

public class ClientKioskController {
    // 메뉴판 인스턴스
    private static final MenuBoard menuBoard = MenuBoard.getInstance();

    private static final ClientMenuService clientMenuService = new ClientMenuService();

    public void runProgram() throws Exception {
        // 메뉴
        ClientMenuView.printAllMenus(menuBoard);

        // 메뉴 선택
        int id = 1;

        // 해당 메뉴 찾기
        Menu menu = clientMenuService.findById(menuBoard, id);
        // 해당 메뉴의 상품들 출력
        ClientMenuView.printProductsOf(menu);


    }
}
