package main.kiosk;

public class ClientDtoMapper {
    public static int mapClientDto(ClientDto clientDto) {
        return Integer.parseInt(clientDto.getUserOption());
    }
}
