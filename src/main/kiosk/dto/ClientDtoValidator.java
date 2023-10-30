package main.kiosk.dto;

public class ClientDtoValidator {
    public static void validateDto(ClientDto clientDto) throws IllegalArgumentException {
        if (clientDto.getUserOption().matches("^([^0-9]*)$")) {
            throw new IllegalArgumentException("숫자만 입력해주세요");
        }
    }
}
