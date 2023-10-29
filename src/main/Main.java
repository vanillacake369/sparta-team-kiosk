package main;

import main.kiosk.ClientKioskController;
import main.kiosk.KioskController;
import main.kiosk.StoreKioskController;

public class Main {
    public static void main(String[] args) {
        KioskController kioskController = new KioskController(new ClientKioskController(), new StoreKioskController());
        kioskController.runKiosk();
    }
}