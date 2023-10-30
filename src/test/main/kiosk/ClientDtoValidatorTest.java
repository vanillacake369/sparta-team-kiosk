package main.kiosk;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import main.kiosk.dto.ClientDto;
import main.kiosk.dto.ClientDtoValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClientDtoValidatorTest {
    @Test
    @DisplayName("숫자가 아닌 입력에 대해 예외처리합니다.")
    void validateDtoOfNotNumber() {
        // GIVEN
        String userOption = "asldkj^!@)";
        ClientDto clientDto = new ClientDto(userOption);

        // WHEN
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            ClientDtoValidator.validateDto(clientDto);
        });

        // THEN
        assertEquals("숫자만 입력해주세요", thrown.getMessage());
    }

    @Test
    @DisplayName("숫자인 입력은 예외처리하지 않습니다.")
    void validateDtoOfNumber() {
        // GIVEN
        String userOption = "1234";
        ClientDto clientDto = new ClientDto(userOption);

        // WHEN
        // THEN
        assertDoesNotThrow(() -> ClientDtoValidator.validateDto(clientDto));
    }
}