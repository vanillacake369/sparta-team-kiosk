package main.domain.menu.client;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.domain.menu.entity.Menu;
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
        Menu menu = clientMenuService.findById(menuBoard, menuId);

        // THEN
        assertEquals(menuId, menu.getId());
    }
}