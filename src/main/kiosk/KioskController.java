package main.kiosk;


import main.utils.ConsoleInput;

public class KioskController {


    private ClientKioskController clientKioskController;
    private StoreKioskController storeKioskController;

    public KioskController(ClientKioskController clientKioskController, StoreKioskController storeKioskController) {
        this.clientKioskController = clientKioskController;
        this.storeKioskController = storeKioskController;
    }

    public static KioskController createKioskController(ClientKioskController clientKioskController,
                                                        StoreKioskController storeKioskController) {
        return new KioskController(clientKioskController, storeKioskController);
    }

    // (DB에 담겨있어야할) 비밀번호 값
    private static final String password = "1234qwer";

    public void runKiosk() {
        // 관리자 여부 묻기 뷰
        KioskView.askIfManager();

        // 패스워드 입력
        String passwordInput = ConsoleInput.readNextLine();

        // if(isManger) => do storeKiosk
        if (isManager(passwordInput)) {
            storeKioskController.runProgram();
        }
        // else => do clientKiosk
        clientKioskController.runProgram();
    }

    // 패스워드 확인 메서드
    public boolean isManager(String passwordInput) {
        if (passwordInput.equals(password)) {
            return true;
        }
        return false;
    }
}
