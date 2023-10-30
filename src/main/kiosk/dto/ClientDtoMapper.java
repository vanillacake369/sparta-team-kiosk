package main.kiosk.dto;

public class ClientDtoMapper {
    public static int mapClientDto(ClientDto clientDto) {
        return Integer.parseInt(clientDto.getUserOption());
    }
}
