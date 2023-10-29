package main.domain.menu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StoreMenuViewTest {

    @Test
    @DisplayName("상품의 메인메뉴에서의 옵션들을 출력합니다.")
    void printAllKioskOptions() {
        StoreMenuView.printAllKioskOptions();
    }
}