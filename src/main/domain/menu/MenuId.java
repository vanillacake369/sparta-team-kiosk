package main.domain.menu;

public class MenuId {
    private static int id = 0;

    // auto increment
    public static int getIncrementedId() {
        return ++id;
    }

    public static int currentId() {
        return id;
    }
}
