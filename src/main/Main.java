package main;

import main.kiosk.controller.ClientKioskController;
import main.kiosk.controller.KioskController;
import main.kiosk.controller.StoreKioskController;

public class Main {
    public static void main(String[] args) {
        KioskController kioskController = new KioskController(new ClientKioskController(), new StoreKioskController());
        kioskController.runKiosk();
    }
}