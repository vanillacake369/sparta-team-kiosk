package main.domain.menu.view;

import java.util.Arrays;
import java.util.stream.Collectors;
import main.kiosk.KioskOption;

public class StoreMenuView {
    public static void printAllKioskOptions() {
        KioskOption[] values = KioskOption.values();
        String allOptions = Arrays.stream(values)
                .map(value -> String.format("%s. %s\n", value.getSeq(), value.getText()))
                .collect(Collectors.joining());
        System.out.println(allOptions);
    }
}
