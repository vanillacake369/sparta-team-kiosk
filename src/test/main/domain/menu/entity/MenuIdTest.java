package main.domain.menu.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MenuIdTest {

    @Test
    @DisplayName("증가된 id값을 반환합니다.")
    void getIncrementedId() {
        assertEquals(MenuId.getIncrementedId(), 1);
    }
}