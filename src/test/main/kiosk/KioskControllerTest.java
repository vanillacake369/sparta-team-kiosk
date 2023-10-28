package main.kiosk;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KioskControllerTest {
    private static KioskController kioskController;

    @BeforeAll
    static void setUp() {
        kioskController = new KioskController();
    }

    @Test
    @DisplayName("관리자인지 확인합니다.")
    void isManager() {
        // GIVEN
        String rightPassword = "1234qwer";

        // WHEN
        boolean result = kioskController.isManager(rightPassword);

        // THEN
        assertTrue(result);
    }
}