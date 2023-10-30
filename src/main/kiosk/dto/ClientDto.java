package main.kiosk.dto;

public class ClientDto {
    private final String userOption;

    public ClientDto(String userOption) {
        this.userOption = userOption;
    }

    public String getUserOption() {
        return userOption;
    }
}
