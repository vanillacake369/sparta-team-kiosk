package main.kiosk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import main.domain.menu.entity.Menu;
import main.domain.menu.entity.MenuId;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MenuBoardTest {

    private static MenuBoard instance;

    @BeforeEach
    void setUpTest() {
        instance = MenuBoard.getInstance();
    }

    @AfterEach
    void tearDown() {
        instance = null;
    }

    @Test
    @DisplayName("동일한 메뉴판 인스턴스를 반환합니다.")
    void getInstance() {
        // GIVEN
        // WHEN
        MenuBoard instance1 = MenuBoard.getInstance();
        MenuBoard instance2 = MenuBoard.getInstance();

        // THEN
        assertEquals(instance1, instance2);
    }

    @Test
    @DisplayName("초기화 시, 메뉴판이 생성됩니다.")
    void setUp() {
        // GIVEN
        // WHEN
        instance.initMenuBoard();

        // THEN
        List<Menu> menus = instance.getMenus();
        assertTrue(menus.size() > 0);
    }

    @Test
    @DisplayName("메뉴판을 생성합니다.")
    void makeBurgerMenu() {
        // GIVEN
        // WHEN
        Menu burgerMenu = instance.createBurgerMenu();

        // THEN
        assertEquals(MenuId.currentId(), burgerMenu.getId());
    }
}