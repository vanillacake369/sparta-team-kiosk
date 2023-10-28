package main.domain.menu.entity;

public class MenuId {
    private static int id = 1;

    // auto increment
    public static int getIncrementedId() {
        return ++id;
    }
}
